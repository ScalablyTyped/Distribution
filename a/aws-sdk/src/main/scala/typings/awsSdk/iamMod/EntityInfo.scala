package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityInfo extends js.Object {
  
  var Arn: arnType = js.native
  
  /**
    * The identifier of the entity (user or role).
    */
  var Id: idType = js.native
  
  /**
    * The name of the entity (user or role).
    */
  var Name: userNameType = js.native
  
  /**
    * The path to the entity (user or role). For more information about paths, see IAM Identifiers in the IAM User Guide. 
    */
  var Path: js.UndefOr[pathType] = js.native
  
  /**
    * The type of entity (user or role).
    */
  var Type: policyOwnerEntityType = js.native
}
object EntityInfo {
  
  @scala.inline
  def apply(Arn: arnType, Id: idType, Name: userNameType, Type: policyOwnerEntityType): EntityInfo = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityInfo]
  }
  
  @scala.inline
  implicit class EntityInfoOps[Self <: EntityInfo] (val x: Self) extends AnyVal {
    
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
    def setArn(value: arnType): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: idType): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: userNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: policyOwnerEntityType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: pathType): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
  }
}
