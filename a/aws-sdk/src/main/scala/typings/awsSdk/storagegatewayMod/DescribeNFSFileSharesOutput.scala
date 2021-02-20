package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNFSFileSharesOutput extends StObject {
  
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
  implicit class DescribeNFSFileSharesOutputMutableBuilder[Self <: DescribeNFSFileSharesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNFSFileShareInfoList(value: NFSFileShareInfoList): Self = StObject.set(x, "NFSFileShareInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNFSFileShareInfoListUndefined: Self = StObject.set(x, "NFSFileShareInfoList", js.undefined)
    
    @scala.inline
    def setNFSFileShareInfoListVarargs(value: NFSFileShareInfo*): Self = StObject.set(x, "NFSFileShareInfoList", js.Array(value :_*))
  }
}
