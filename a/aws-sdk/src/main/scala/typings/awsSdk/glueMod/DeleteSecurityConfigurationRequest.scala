package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSecurityConfigurationRequest extends js.Object {
  /**
    * The name of the security configuration to delete.
    */
  var Name: NameString = js.native
}

object DeleteSecurityConfigurationRequest {
  @scala.inline
  def apply(Name: NameString): DeleteSecurityConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSecurityConfigurationRequest]
  }
}

