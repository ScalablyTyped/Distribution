package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceInformationStringFilter extends js.Object {
  /**
    * The filter key name to describe your instances. For example: "InstanceIds"|"AgentVersion"|"PingStatus"|"PlatformTypes"|"ActivationIds"|"IamRole"|"ResourceType"|"AssociationStatus"|"Tag Key"
    */
  var Key: InstanceInformationStringFilterKey = js.native
  /**
    * The filter values.
    */
  var Values: InstanceInformationFilterValueSet = js.native
}

object InstanceInformationStringFilter {
  @scala.inline
  def apply(Key: InstanceInformationStringFilterKey, Values: InstanceInformationFilterValueSet): InstanceInformationStringFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InstanceInformationStringFilter]
  }
}

