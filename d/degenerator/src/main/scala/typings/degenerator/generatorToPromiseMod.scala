package typings.degenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatorToPromiseMod {
  
  @JSImport("degenerator/dist/src/generator-to-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](generatorFunction: js.Any): js.Function1[/* repeated */ js.Any, js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(generatorFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Promise[T]]]
}
