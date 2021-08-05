package typings.blocks

import org.scalablytyped.runtime.StringDictionary
import typings.blocks.anon.BaseUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPrototype
  extends StObject
     with /* propertyName */ StringDictionary[String | Boolean | js.Object | Validator] {
  
  /**
    * Extracts the raw(non observable) dataItem object values from the Model
    */
  var dataItem: js.UndefOr[js.Function0[js.Object]] = js.undefined
  
  /**
    * Override the init method to perform actions on creation for each Model instance
    */
  var init: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Determines whether the instance is new. If true when syncing the item will send for insertion instead of updating it.
    * The check is determined by the idAttr value specified in the options. If idAttr is not specified the item will always be considered new.
    * 
    */
  var isNew: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var options: js.UndefOr[BaseUrl] = js.undefined
  
  /**
    * Applies new properties to the Model by providing an Object
    * 
    * @param dataItem The object from which the new values will be applied
    */
  var reset: js.UndefOr[js.Function1[/* dataItem */ this.type, this.type]] = js.undefined
  
  /**
    * Validates all observable properties that have validation and returns true if all values are valid otherwise returns false
    */
  var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
}
object ModelPrototype {
  
  inline def apply(): ModelPrototype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelPrototype]
  }
  
  extension [Self <: ModelPrototype](x: Self) {
    
    inline def setDataItem(value: () => js.Object): Self = StObject.set(x, "dataItem", js.Any.fromFunction0(value))
    
    inline def setDataItemUndefined: Self = StObject.set(x, "dataItem", js.undefined)
    
    inline def setInit(value: js.Function): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setIsNew(value: () => Boolean): Self = StObject.set(x, "isNew", js.Any.fromFunction0(value))
    
    inline def setIsNewUndefined: Self = StObject.set(x, "isNew", js.undefined)
    
    inline def setOptions(value: BaseUrl): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setReset(value: ModelPrototype => ModelPrototype): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setValidate(value: () => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
