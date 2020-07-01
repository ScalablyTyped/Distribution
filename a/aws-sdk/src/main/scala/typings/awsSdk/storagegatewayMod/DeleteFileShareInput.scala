package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileShareInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the file share to be deleted.
    */
  var FileShareARN: typings.awsSdk.storagegatewayMod.FileShareARN = js.native
  /**
    * If this value is set to true, the operation deletes a file share immediately and aborts all data uploads to AWS. Otherwise, the file share is not deleted until all data is uploaded to AWS. This process aborts the data upload process, and the file share enters the FORCE_DELETING status. Valid Values: true | false 
    */
  var ForceDelete: js.UndefOr[scala.Boolean] = js.native
}

object DeleteFileShareInput {
  @scala.inline
  def apply(FileShareARN: FileShareARN, ForceDelete: js.UndefOr[scala.Boolean] = js.undefined): DeleteFileShareInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN.asInstanceOf[js.Any])
    if (!js.isUndefined(ForceDelete)) __obj.updateDynamic("ForceDelete")(ForceDelete.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileShareInput]
  }
}

