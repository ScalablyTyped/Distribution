package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicalResourceIdContextKeyValuePair extends js.Object {
  /**
    * The resource context key.
    */
  var Key: typings.awsSdk.cloudformationMod.Key = js.native
  /**
    * The resource context value.
    */
  var Value: typings.awsSdk.cloudformationMod.Value = js.native
}

object PhysicalResourceIdContextKeyValuePair {
  @scala.inline
  def apply(Key: Key, Value: Value): PhysicalResourceIdContextKeyValuePair = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicalResourceIdContextKeyValuePair]
  }
}

