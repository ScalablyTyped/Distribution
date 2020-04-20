package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImportRequest extends js.Object {
  /**
    * The identifier of the import job information to return.
    */
  var importId: String = js.native
}

object GetImportRequest {
  @scala.inline
  def apply(importId: String): GetImportRequest = {
    val __obj = js.Dynamic.literal(importId = importId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportRequest]
  }
}

