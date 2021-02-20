package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityInfo extends StObject {
  
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
  implicit class EntityInfoMutableBuilder[Self <: EntityInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: idType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: userNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: pathType): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    @scala.inline
    def setType(value: policyOwnerEntityType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
