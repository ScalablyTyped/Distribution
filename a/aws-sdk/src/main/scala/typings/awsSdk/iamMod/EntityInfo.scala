package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(Arn: arnType, Id: idType, Name: userNameType, Type: policyOwnerEntityType, Path: pathType = null): EntityInfo = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityInfo]
  }
}

