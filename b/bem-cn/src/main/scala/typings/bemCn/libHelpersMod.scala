package typings.bemCn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersMod {
  
  @JSImport("bem-cn/lib/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(target: js.Object, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  inline def assign[T, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
  inline def assign[T, U, V](target: T, source1: U, source2: V): T & U & V = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[T & U & V]
}
