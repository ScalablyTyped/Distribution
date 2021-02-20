package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiCallDetails extends StObject {
  
  /**
    * The name of the operation that was invoked most recently and produced the finding.
    */
  var api: js.UndefOr[string] = js.native
  
  /**
    * The URL of the AWS service that provides the operation, for example: s3.amazonaws.com.
    */
  var apiServiceName: js.UndefOr[string] = js.native
  
  /**
    * The first date and time, in UTC and extended ISO 8601 format, when any operation was invoked and produced the finding.
    */
  var firstSeen: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * The most recent date and time, in UTC and extended ISO 8601 format, when the specified operation (api) was invoked and produced the finding.
    */
  var lastSeen: js.UndefOr[timestampIso8601] = js.native
}
object ApiCallDetails {
  
  @scala.inline
  def apply(): ApiCallDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiCallDetails]
  }
  
  @scala.inline
  implicit class ApiCallDetailsMutableBuilder[Self <: ApiCallDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: string): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiServiceName(value: string): Self = StObject.set(x, "apiServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiServiceNameUndefined: Self = StObject.set(x, "apiServiceName", js.undefined)
    
    @scala.inline
    def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    @scala.inline
    def setFirstSeen(value: timestampIso8601): Self = StObject.set(x, "firstSeen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSeenUndefined: Self = StObject.set(x, "firstSeen", js.undefined)
    
    @scala.inline
    def setLastSeen(value: timestampIso8601): Self = StObject.set(x, "lastSeen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSeenUndefined: Self = StObject.set(x, "lastSeen", js.undefined)
  }
}
