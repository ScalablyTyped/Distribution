package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCloudFormationStackRecordsResult extends StObject {
  
  /**
    * A list of objects describing the CloudFormation stack records.
    */
  var cloudFormationStackRecords: js.UndefOr[CloudFormationStackRecordList] = js.native
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetCloudFormationStackRecords request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GetCloudFormationStackRecordsResult {
  
  @scala.inline
  def apply(): GetCloudFormationStackRecordsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCloudFormationStackRecordsResult]
  }
  
  @scala.inline
  implicit class GetCloudFormationStackRecordsResultMutableBuilder[Self <: GetCloudFormationStackRecordsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudFormationStackRecords(value: CloudFormationStackRecordList): Self = StObject.set(x, "cloudFormationStackRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudFormationStackRecordsUndefined: Self = StObject.set(x, "cloudFormationStackRecords", js.undefined)
    
    @scala.inline
    def setCloudFormationStackRecordsVarargs(value: CloudFormationStackRecord*): Self = StObject.set(x, "cloudFormationStackRecords", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
