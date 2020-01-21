package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRegistriesRequest extends js.Object {
  var Limit: js.UndefOr[integer] = js.native
  var NextToken: js.UndefOr[string] = js.native
  var RegistryNamePrefix: js.UndefOr[string] = js.native
  var Scope: js.UndefOr[string] = js.native
}

object ListRegistriesRequest {
  @scala.inline
  def apply(
    Limit: Int | Double = null,
    NextToken: string = null,
    RegistryNamePrefix: string = null,
    Scope: string = null
  ): ListRegistriesRequest = {
    val __obj = js.Dynamic.literal()
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RegistryNamePrefix != null) __obj.updateDynamic("RegistryNamePrefix")(RegistryNamePrefix.asInstanceOf[js.Any])
    if (Scope != null) __obj.updateDynamic("Scope")(Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRegistriesRequest]
  }
}

