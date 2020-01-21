package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSMBFileSharesOutput extends js.Object {
  /**
    * An array containing a description for each requested file share. 
    */
  var SMBFileShareInfoList: js.UndefOr[typings.awsSdk.storagegatewayMod.SMBFileShareInfoList] = js.native
}

object DescribeSMBFileSharesOutput {
  @scala.inline
  def apply(SMBFileShareInfoList: SMBFileShareInfoList = null): DescribeSMBFileSharesOutput = {
    val __obj = js.Dynamic.literal()
    if (SMBFileShareInfoList != null) __obj.updateDynamic("SMBFileShareInfoList")(SMBFileShareInfoList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSMBFileSharesOutput]
  }
}

