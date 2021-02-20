package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSMBFileSharesOutput extends StObject {
  
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
  implicit class DescribeSMBFileSharesOutputMutableBuilder[Self <: DescribeSMBFileSharesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSMBFileShareInfoList(value: SMBFileShareInfoList): Self = StObject.set(x, "SMBFileShareInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSMBFileShareInfoListUndefined: Self = StObject.set(x, "SMBFileShareInfoList", js.undefined)
    
    @scala.inline
    def setSMBFileShareInfoListVarargs(value: SMBFileShareInfo*): Self = StObject.set(x, "SMBFileShareInfoList", js.Array(value :_*))
  }
}
