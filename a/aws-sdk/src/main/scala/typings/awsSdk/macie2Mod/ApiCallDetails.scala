package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiCallDetails extends js.Object {
  
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
  implicit class ApiCallDetailsOps[Self <: ApiCallDetails] (val x: Self) extends AnyVal {
    
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
    def setApi(value: string): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    
    @scala.inline
    def setApiServiceName(value: string): Self = this.set("apiServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiServiceName: Self = this.set("apiServiceName", js.undefined)
    
    @scala.inline
    def setFirstSeen(value: timestampIso8601): Self = this.set("firstSeen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstSeen: Self = this.set("firstSeen", js.undefined)
    
    @scala.inline
    def setLastSeen(value: timestampIso8601): Self = this.set("lastSeen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSeen: Self = this.set("lastSeen", js.undefined)
  }
}
