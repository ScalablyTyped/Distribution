package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  /**
    * User-defined criteria for sending commands that target instances that meet the criteria.
    */
  var Key: js.UndefOr[TargetKey] = js.native
  /**
    * User-defined criteria that maps to Key. For example, if you specified tag:ServerRole, you could specify value:WebServer to run a command on instances that include Amazon EC2 tags of ServerRole,WebServer. 
    */
  var Values: js.UndefOr[TargetValues] = js.native
}

object Target {
  @scala.inline
  def apply(Key: TargetKey = null, Values: TargetValues = null): Target = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

