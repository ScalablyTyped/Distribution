package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetModelProperty extends js.Object {
  
  /**
    * The data type of the asset model property.
    */
  var dataType: PropertyDataType = js.native
  
  /**
    * The ID of the asset model property.
    */
  var id: js.UndefOr[ID] = js.native
  
  /**
    * The name of the asset model property.
    */
  var name: Name = js.native
  
  /**
    * The property type (see PropertyType).
    */
  var `type`: PropertyType = js.native
  
  /**
    * The unit of the asset model property, such as Newtons or RPM.
    */
  var unit: js.UndefOr[PropertyUnit] = js.native
}
object AssetModelProperty {
  
  @scala.inline
  def apply(dataType: PropertyDataType, name: Name, `type`: PropertyType): AssetModelProperty = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelProperty]
  }
  
  @scala.inline
  implicit class AssetModelPropertyOps[Self <: AssetModelProperty] (val x: Self) extends AnyVal {
    
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
    def setDataType(value: PropertyDataType): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PropertyType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ID): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setUnit(value: PropertyUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
