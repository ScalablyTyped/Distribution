package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketStatisticsRequest extends StObject {
  
  /**
    * The unique identifier for the AWS account.
    */
  var accountId: js.UndefOr[string] = js.native
}
object GetBucketStatisticsRequest {
  
  @scala.inline
  def apply(): GetBucketStatisticsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketStatisticsRequest]
  }
  
  @scala.inline
  implicit class GetBucketStatisticsRequestMutableBuilder[Self <: GetBucketStatisticsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
