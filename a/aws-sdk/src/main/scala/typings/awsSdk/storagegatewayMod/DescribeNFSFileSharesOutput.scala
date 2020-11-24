package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNFSFileSharesOutput extends js.Object {
  
  /**
    * An array containing a description for each requested file share.
    */
  var NFSFileShareInfoList: js.UndefOr[typings.awsSdk.storagegatewayMod.NFSFileShareInfoList] = js.native
}
object DescribeNFSFileSharesOutput {
  
  @scala.inline
  def apply(): DescribeNFSFileSharesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNFSFileSharesOutput]
  }
  
  @scala.inline
  implicit class DescribeNFSFileSharesOutputOps[Self <: DescribeNFSFileSharesOutput] (val x: Self) extends AnyVal {
    
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
    def setNFSFileShareInfoListVarargs(value: NFSFileShareInfo*): Self = this.set("NFSFileShareInfoList", js.Array(value :_*))
    
    @scala.inline
    def setNFSFileShareInfoList(value: NFSFileShareInfoList): Self = this.set("NFSFileShareInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNFSFileShareInfoList: Self = this.set("NFSFileShareInfoList", js.undefined)
  }
}
