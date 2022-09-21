package typings.commitlintExecuteRule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@commitlint/execute-rule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): js.Promise[ExecutedRule[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[ExecutedRule[T] | Null]]
  inline def default[T](rule: Rule[T]): js.Promise[ExecutedRule[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(rule.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ExecutedRule[T] | Null]]
  
  inline def execute[T](): js.Promise[ExecutedRule[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")().asInstanceOf[js.Promise[ExecutedRule[T] | Null]]
  inline def execute[T](rule: Rule[T]): js.Promise[ExecutedRule[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(rule.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ExecutedRule[T] | Null]]
  
  type Config[T] = T | js.Promise[T] | ExectableConfig[T]
  
  type ExectableConfig[T] = js.Function0[js.Promise[T] | T]
  
  type ExecutedRule[T] = js.Tuple2[String, T]
  
  type Rule[T] = js.Tuple2[String, Config[T]]
}
