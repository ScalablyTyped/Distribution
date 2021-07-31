package typings.baconjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("baconjs/types/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isArray(x: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isObservable[T](x: js.Any): /* is baconjs.baconjs/types/observable.default<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(x.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/observable.default<T> */ Boolean]
  
  @scala.inline
  def nop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nop")().asInstanceOf[Unit]
}
