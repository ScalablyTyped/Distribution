package typings.datatablesNetButtons.DataTables

import typings.datatablesNet.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtomSettingsCommon extends StObject {
  
  /**
    * Action to take when the button is activated
    */
  var action: js.UndefOr[FunctionButtonAction] = js.undefined
  
  /**
    * Ensure that any requirements have been satisfied before initialising a button
    */
  var available: js.UndefOr[FunctionButtonAvailable] = js.undefined
  
  /**
    * Set the class name for the button
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Function that is called when the button is destroyed
    */
  var destroy: js.UndefOr[FunctionButtonInit] = js.undefined
  
  /**
    * Set a button's initial enabled state
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Define which button type the button should be based on
    */
  var extend: js.UndefOr[String] = js.undefined
  
  /**
    * Initialisation function that can be used to add events specific to this button
    */
  var init: js.UndefOr[FunctionButtonInit] = js.undefined
  
  /**
    * Define an activation key for a button
    */
  var key: js.UndefOr[String | ButtonKey] = js.undefined
  
  /**
    * Set a name for each selection
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Unique namespace for every button
    */
  var namespace: js.UndefOr[String] = js.undefined
  
  /**
    * The text to show in the button
    */
  var text: js.UndefOr[String | FunctionButtonText] = js.undefined
  
  /**
    * Button 'title' attribute text
    */
  var titleAttr: js.UndefOr[String] = js.undefined
}
object ButtomSettingsCommon {
  
  inline def apply(): ButtomSettingsCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtomSettingsCommon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtomSettingsCommon] (val x: Self) extends AnyVal {
    
    inline def setAction(value: (/* e */ Any, /* dt */ Api, /* node */ JQuery, /* config */ ButtonSettings) => Unit): Self = StObject.set(x, "action", js.Any.fromFunction4(value))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAvailable(value: (/* dt */ Api, /* config */ Any) => Boolean): Self = StObject.set(x, "available", js.Any.fromFunction2(value))
    
    inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDestroy(value: (/* dt */ Api, /* node */ JQuery, /* config */ Any) => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction3(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExtend(value: String): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setInit(value: (/* dt */ Api, /* node */ JQuery, /* config */ Any) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setKey(value: String | ButtonKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setText(value: String | FunctionButtonText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextFunction3(value: (/* dt */ Api, /* node */ JQuery, /* config */ Any) => String): Self = StObject.set(x, "text", js.Any.fromFunction3(value))
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitleAttr(value: String): Self = StObject.set(x, "titleAttr", value.asInstanceOf[js.Any])
    
    inline def setTitleAttrUndefined: Self = StObject.set(x, "titleAttr", js.undefined)
  }
}
