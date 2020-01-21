package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSecurityConfigurationInput extends js.Object {
  /**
    * The name of the security configuration.
    */
  var Name: XmlString = js.native
}

object DeleteSecurityConfigurationInput {
  @scala.inline
  def apply(Name: XmlString): DeleteSecurityConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSecurityConfigurationInput]
  }
}

