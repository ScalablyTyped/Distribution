package typings.badgin

import typings.badgin.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPositiveNumberMod {
  
  @JSImport("badgin/build/isPositiveNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Value): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
}
