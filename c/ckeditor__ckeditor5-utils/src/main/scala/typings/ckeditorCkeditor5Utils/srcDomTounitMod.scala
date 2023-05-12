package typings.ckeditorCkeditor5Utils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDomTounitMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/dom/tounit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(unit: String): ToUnitHelper = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(unit.asInstanceOf[js.Any]).asInstanceOf[ToUnitHelper]
  
  type ToUnitHelper = js.Function1[/* value */ String | Double, String]
}
