package typings.baconjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHelpersMod {
  
  @JSImport("baconjs/types/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isArray(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObservable[T](x: Any): /* is baconjs.baconjs/types/observable.default<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(x.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/observable.default<T> */ Boolean]
  
  inline def nop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nop")().asInstanceOf[Unit]
}
