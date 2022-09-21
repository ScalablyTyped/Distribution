package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionGraphicsSettings extends StObject {
  
  var HtmlMotionGraphicsSettings: js.UndefOr[typings.awsSdk.medialiveMod.HtmlMotionGraphicsSettings] = js.undefined
}
object MotionGraphicsSettings {
  
  inline def apply(): MotionGraphicsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionGraphicsSettings]
  }
  
  extension [Self <: MotionGraphicsSettings](x: Self) {
    
    inline def setHtmlMotionGraphicsSettings(value: HtmlMotionGraphicsSettings): Self = StObject.set(x, "HtmlMotionGraphicsSettings", value.asInstanceOf[js.Any])
    
    inline def setHtmlMotionGraphicsSettingsUndefined: Self = StObject.set(x, "HtmlMotionGraphicsSettings", js.undefined)
  }
}
