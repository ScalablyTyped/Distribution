package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDRTAccessResponse extends StObject {
  
  /**
    * The list of Amazon S3 buckets accessed by the DRT.
    */
  var LogBucketList: js.UndefOr[typings.awsSdk.shieldMod.LogBucketList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the role the DRT used to access your AWS account.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.shieldMod.RoleArn] = js.native
}
object DescribeDRTAccessResponse {
  
  @scala.inline
  def apply(): DescribeDRTAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDRTAccessResponse]
  }
  
  @scala.inline
  implicit class DescribeDRTAccessResponseMutableBuilder[Self <: DescribeDRTAccessResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogBucketList(value: LogBucketList): Self = StObject.set(x, "LogBucketList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogBucketListUndefined: Self = StObject.set(x, "LogBucketList", js.undefined)
    
    @scala.inline
    def setLogBucketListVarargs(value: LogBucket*): Self = StObject.set(x, "LogBucketList", js.Array(value :_*))
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
