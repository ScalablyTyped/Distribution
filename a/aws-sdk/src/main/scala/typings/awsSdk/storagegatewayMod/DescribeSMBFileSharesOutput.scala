package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSMBFileSharesOutput extends js.Object {
  
  /**
    * An array containing a description for each requested file share.
    */
  var SMBFileShareInfoList: js.UndefOr[typings.awsSdk.storagegatewayMod.SMBFileShareInfoList] = js.native
}
object DescribeSMBFileSharesOutput {
  
  @scala.inline
  def apply(): DescribeSMBFileSharesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSMBFileSharesOutput]
  }
  
  @scala.inline
  implicit class DescribeSMBFileSharesOutputOps[Self <: DescribeSMBFileSharesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSMBFileShareInfoListVarargs(value: SMBFileShareInfo*): Self = this.set("SMBFileShareInfoList", js.Array(value :_*))
    
    @scala.inline
    def setSMBFileShareInfoList(value: SMBFileShareInfoList): Self = this.set("SMBFileShareInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSMBFileShareInfoList: Self = this.set("SMBFileShareInfoList", js.undefined)
  }
}
