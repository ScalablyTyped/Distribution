package typings.blueprintjsTimezone

import typings.blueprintjsIcons.iconNameMod.IconName
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timezoneItemsMod {
  
  @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneItems", "getInitialTimezoneItems")
  @js.native
  def getInitialTimezoneItems(date: Date, includeLocalTimezone: Boolean): js.Array[ITimezoneItem] = js.native
  
  @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneItems", "getLocalTimezoneItem")
  @js.native
  def getLocalTimezoneItem(date: Date): js.UndefOr[ITimezoneItem] = js.native
  
  @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneItems", "getTimezoneItems")
  @js.native
  def getTimezoneItems(date: Date): js.Array[ITimezoneItem] = js.native
  
  @js.native
  trait ITimezoneItem extends StObject {
    
    /** Optional icon for the timezone. */
    var iconName: js.UndefOr[IconName] = js.native
    
    /** Key to be used as the rendered react key. */
    var key: String = js.native
    
    /** Label for the timezone. */
    var label: String = js.native
    
    /** Text for the timezone. */
    var text: String = js.native
    
    /** The actual timezone. */
    var timezone: String = js.native
  }
  object ITimezoneItem {
    
    @scala.inline
    def apply(key: String, label: String, text: String, timezone: String): ITimezoneItem = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimezoneItem]
    }
    
    @scala.inline
    implicit class ITimezoneItemMutableBuilder[Self <: ITimezoneItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconName(value: IconName): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNameUndefined: Self = StObject.set(x, "iconName", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
}
