package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetModelPropertyDefinition extends js.Object {
  
  /**
    * The data type of the property definition.
    */
  var dataType: PropertyDataType = js.native
  
  /**
    * The name of the property definition.
    */
  var name: Name = js.native
  
  /**
    * The property definition type (see PropertyType). You can only specify one type in a property definition.
    */
  var `type`: PropertyType = js.native
  
  /**
    * The unit of the property definition, such as Newtons or RPM.
    */
  var unit: js.UndefOr[PropertyUnit] = js.native
}
object AssetModelPropertyDefinition {
  
  @scala.inline
  def apply(dataType: PropertyDataType, name: Name, `type`: PropertyType): AssetModelPropertyDefinition = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelPropertyDefinition]
  }
  
  @scala.inline
  implicit class AssetModelPropertyDefinitionOps[Self <: AssetModelPropertyDefinition] (val x: Self) extends AnyVal {
    
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
    def setUnit(value: PropertyUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
