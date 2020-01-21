package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSecurityConfigurationOutput extends js.Object {
  /**
    * The date and time the security configuration was created.
    */
  var CreationDateTime: Date = js.native
  /**
    * The name of the security configuration.
    */
  var Name: XmlString = js.native
}

object CreateSecurityConfigurationOutput {
  @scala.inline
  def apply(CreationDateTime: Date, Name: XmlString): CreateSecurityConfigurationOutput = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateSecurityConfigurationOutput]
  }
}

