package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConformancePackRequest extends js.Object {
  /**
    * Name of the conformance pack you want to delete.
    */
  var ConformancePackName: typings.awsSdk.configserviceMod.ConformancePackName = js.native
}

object DeleteConformancePackRequest {
  @scala.inline
  def apply(ConformancePackName: ConformancePackName): DeleteConformancePackRequest = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConformancePackRequest]
  }
}

