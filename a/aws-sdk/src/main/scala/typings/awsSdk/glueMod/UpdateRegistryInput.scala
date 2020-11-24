package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRegistryInput extends js.Object {
  
  /**
    * A description of the registry. If description is not provided, this field will not be updated.
    */
  var Description: DescriptionString = js.native
  
  /**
    * This is a wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
    */
  var RegistryId: typings.awsSdk.glueMod.RegistryId = js.native
}
object UpdateRegistryInput {
  
  @scala.inline
  def apply(Description: DescriptionString, RegistryId: RegistryId): UpdateRegistryInput = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], RegistryId = RegistryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRegistryInput]
  }
  
  @scala.inline
  implicit class UpdateRegistryInputOps[Self <: UpdateRegistryInput] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("RegistryId", value.asInstanceOf[js.Any])
  }
}
