package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecoveryOptionType extends js.Object {
  /**
    * Specifies the recovery method for a user.
    */
  var Name: RecoveryOptionNameType = js.native
  /**
    * A positive integer specifying priority of a method with 1 being the highest priority.
    */
  var Priority: PriorityType = js.native
}

object RecoveryOptionType {
  @scala.inline
  def apply(Name: RecoveryOptionNameType, Priority: PriorityType): RecoveryOptionType = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecoveryOptionType]
  }
}

