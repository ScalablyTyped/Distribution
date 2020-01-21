package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateDnsNameConfiguration extends js.Object {
  /**
    * The name of the record subdomain the service provider needs to create. The service provider adds the value text to the name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The verification state of the VPC endpoint service. &gt;Consumers of the endpoint service can use the private name only when the state is verified.
    */
  var State: js.UndefOr[DnsNameState] = js.native
  /**
    * The endpoint service verification type, for example TXT.
    */
  var Type: js.UndefOr[String] = js.native
  /**
    * The value the service provider adds to the private DNS name domain record before verification.
    */
  var Value: js.UndefOr[String] = js.native
}

object PrivateDnsNameConfiguration {
  @scala.inline
  def apply(Name: String = null, State: DnsNameState = null, Type: String = null, Value: String = null): PrivateDnsNameConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateDnsNameConfiguration]
  }
}

