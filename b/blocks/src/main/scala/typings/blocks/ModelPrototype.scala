package typings.blocks

import org.scalablytyped.runtime.StringDictionary
import typings.blocks.anon.BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelPrototype
  extends /* propertyName */ StringDictionary[String | Boolean | js.Object | Validator] {
  
  /**
    * Extracts the raw(non observable) dataItem object values from the Model
    */
  var dataItem: js.UndefOr[js.Function0[js.Object]] = js.native
  
  /**
    * Override the init method to perform actions on creation for each Model instance
    */
  var init: js.UndefOr[js.Function] = js.native
  
  /**
    * Determines whether the instance is new. If true when syncing the item will send for insertion instead of updating it.
    * The check is determined by the idAttr value specified in the options. If idAttr is not specified the item will always be considered new.
    * 
    */
  var isNew: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var options: js.UndefOr[BaseUrl] = js.native
  
  /**
    * Applies new properties to the Model by providing an Object
    * 
    * @param dataItem The object from which the new values will be applied
    */
  var reset: js.UndefOr[js.Function1[/* dataItem */ this.type, this.type]] = js.native
  
  /**
    * Validates all observable properties that have validation and returns true if all values are valid otherwise returns false
    */
  var validate: js.UndefOr[js.Function0[Boolean]] = js.native
}
object ModelPrototype {
  
  @scala.inline
  def apply(): ModelPrototype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelPrototype]
  }
  
  @scala.inline
  implicit class ModelPrototypeOps[Self <: ModelPrototype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataItem(value: () => js.Object): Self = this.set("dataItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDataItem: Self = this.set("dataItem", js.undefined)
    
    @scala.inline
    def setInit(value: js.Function): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setIsNew(value: () => Boolean): Self = this.set("isNew", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsNew: Self = this.set("isNew", js.undefined)
    
    @scala.inline
    def setOptions(value: BaseUrl): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setReset(value: ModelPrototype => ModelPrototype): Self = this.set("reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setValidate(value: () => Boolean): Self = this.set("validate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
