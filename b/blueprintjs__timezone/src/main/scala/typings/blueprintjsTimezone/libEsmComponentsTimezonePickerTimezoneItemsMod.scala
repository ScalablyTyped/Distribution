package typings.blueprintjsTimezone

import typings.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsTimezonePickerTimezoneItemsMod {
  
  @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInitialTimezoneItems(date: js.Date, includeLocalTimezone: Boolean): js.Array[TimezoneItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialTimezoneItems")(date.asInstanceOf[js.Any], includeLocalTimezone.asInstanceOf[js.Any])).asInstanceOf[js.Array[TimezoneItem]]
  
  inline def getLocalTimezoneItem(date: js.Date): js.UndefOr[TimezoneItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalTimezoneItem")(date.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TimezoneItem]]
  
  inline def getTimezoneItems(date: js.Date): js.Array[TimezoneItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezoneItems")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[TimezoneItem]]
  
  trait ITimezoneItem extends StObject {
    
    /** Optional icon for the timezone. */
    var iconName: js.UndefOr[BlueprintIcons16Id] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITimezoneItem] (val x: Self) extends AnyVal {
      
      inline def setIconName(value: BlueprintIcons16Id): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
      
      inline def setIconNameUndefined: Self = StObject.set(x, "iconName", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
  
  type TimezoneItem = ITimezoneItem
}
