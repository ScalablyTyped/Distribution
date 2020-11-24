package typings.babylonjs.nodeMaterialDecoratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyDescriptionForEdition extends js.Object {
  
  /** display name of the property */
  var displayName: String = js.native
  
  /** group of the property - all properties with the same group value will be displayed in a specific section */
  var groupName: String = js.native
  
  /** options for the property */
  var options: IEditablePropertyOption = js.native
  
  /** name of the property */
  var propertyName: String = js.native
  
  /** type of the property */
  var `type`: PropertyTypeForEdition = js.native
}
object IPropertyDescriptionForEdition {
  
  @scala.inline
  def apply(
    displayName: String,
    groupName: String,
    options: IEditablePropertyOption,
    propertyName: String,
    `type`: PropertyTypeForEdition
  ): IPropertyDescriptionForEdition = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyDescriptionForEdition]
  }
  
  @scala.inline
  implicit class IPropertyDescriptionForEditionOps[Self <: IPropertyDescriptionForEdition] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: IEditablePropertyOption): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PropertyTypeForEdition): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
