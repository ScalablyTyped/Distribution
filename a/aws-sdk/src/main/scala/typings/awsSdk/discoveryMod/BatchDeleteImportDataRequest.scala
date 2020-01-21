package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteImportDataRequest extends js.Object {
  /**
    * The IDs for the import tasks that you want to delete.
    */
  var importTaskIds: ToDeleteIdentifierList = js.native
}

object BatchDeleteImportDataRequest {
  @scala.inline
  def apply(importTaskIds: ToDeleteIdentifierList): BatchDeleteImportDataRequest = {
    val __obj = js.Dynamic.literal(importTaskIds = importTaskIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchDeleteImportDataRequest]
  }
}

