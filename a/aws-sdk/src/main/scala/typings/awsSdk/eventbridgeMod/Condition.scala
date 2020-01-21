package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /**
    * The key for the condition. Currently, the only supported key is aws:PrincipalOrgID.
    */
  var Key: String = js.native
  /**
    * The type of condition. Currently, the only supported value is StringEquals.
    */
  var Type: String = js.native
  /**
    * The value for the key. Currently, this must be the ID of the organization.
    */
  var Value: String = js.native
}

object Condition {
  @scala.inline
  def apply(Key: String, Type: String, Value: String): Condition = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Condition]
  }
}

