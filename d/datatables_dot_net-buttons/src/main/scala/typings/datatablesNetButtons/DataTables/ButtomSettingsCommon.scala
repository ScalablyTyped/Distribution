package typings.datatablesNetButtons.DataTables

import typings.datatablesNet.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtomSettingsCommon extends StObject {
  
  /**
    * Action to take when the button is activated
    */
  var action: js.UndefOr[FunctionButtonAction] = js.native
  
  /**
    * Ensure that any requirements have been satisfied before initialising a button
    */
  var available: js.UndefOr[FunctionButtonAvailable] = js.native
  
  /**
    * Set the class name for the button
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Function that is called when the button is destroyed
    */
  var destroy: js.UndefOr[FunctionButtonInit] = js.native
  
  /**
    * Set a button's initial enabled state
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Define which button type the button should be based on
    */
  var extend: js.UndefOr[String] = js.native
  
  /**
    * Initialisation function that can be used to add events specific to this button
    */
  var init: js.UndefOr[FunctionButtonInit] = js.native
  
  /**
    * Define an activation key for a button
    */
  var key: js.UndefOr[String | ButtonKey] = js.native
  
  /**
    * Set a name for each selection
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Unique namespace for every button
    */
  var namespace: js.UndefOr[String] = js.native
  
  /**
    * The text to show in the button
    */
  var text: js.UndefOr[String | FunctionButtonText] = js.native
  
  /**
    * Button 'title' attribute text
    */
  var titleAttr: js.UndefOr[String] = js.native
}
object ButtomSettingsCommon {
  
  @scala.inline
  def apply(): ButtomSettingsCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtomSettingsCommon]
  }
  
  @scala.inline
  implicit class ButtomSettingsCommonMutableBuilder[Self <: ButtomSettingsCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: (/* e */ js.Any, /* dt */ Api, /* node */ JQuery, /* config */ ButtonSettings) => Unit): Self = StObject.set(x, "action", js.Any.fromFunction4(value))
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setAvailable(value: (/* dt */ Api, /* config */ js.Any) => Boolean): Self = StObject.set(x, "available", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDestroy(value: (/* dt */ Api, /* node */ JQuery, /* config */ js.Any) => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setExtend(value: String): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setInit(value: (/* dt */ Api, /* node */ JQuery, /* config */ js.Any) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setKey(value: String | ButtonKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setText(value: String | FunctionButtonText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFunction3(value: (/* dt */ Api, /* node */ JQuery, /* config */ js.Any) => String): Self = StObject.set(x, "text", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitleAttr(value: String): Self = StObject.set(x, "titleAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleAttrUndefined: Self = StObject.set(x, "titleAttr", js.undefined)
  }
}
