package typings.blueprintjsTimezone

import typings.blueprintjsIcons.iconNameMod.IconName
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timezoneItemsMod {
  
  @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInitialTimezoneItems(date: Date, includeLocalTimezone: Boolean): js.Array[ITimezoneItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialTimezoneItems")(date.asInstanceOf[js.Any], includeLocalTimezone.asInstanceOf[js.Any])).asInstanceOf[js.Array[ITimezoneItem]]
  
  inline def getLocalTimezoneItem(date: Date): js.UndefOr[ITimezoneItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalTimezoneItem")(date.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ITimezoneItem]]
  
  inline def getTimezoneItems(date: Date): js.Array[ITimezoneItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezoneItems")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[ITimezoneItem]]
  
  trait ITimezoneItem extends StObject {
    
    /** Optional icon for the timezone. */
    var iconName: js.UndefOr[IconName] = js.undefined
    
    /** Key to be used as the rendered react key. */
    var key: String
    
    /** Label for the timezone. */
    var label: String
    
    /** Text for the timezone. */
    var text: String
    
    /** The actual timezone. */
    var timezone: String
  }
  object ITimezoneItem {
    
    inline def apply(key: String, label: String, text: String, timezone: String): ITimezoneItem = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimezoneItem]
    }
    
    extension [Self <: ITimezoneItem](x: Self) {
      
      inline def setIconName(value: IconName): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
      
      inline def setIconNameUndefined: Self = StObject.set(x, "iconName", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
}
