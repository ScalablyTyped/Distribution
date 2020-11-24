package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListActiveViolationsRequest extends js.Object {
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The name of the Device Defender security profile for which violations are listed.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.native
  
  /**
    * The name of the thing whose active violations are listed.
    */
  var thingName: js.UndefOr[DeviceDefenderThingName] = js.native
}
object ListActiveViolationsRequest {
  
  @scala.inline
  def apply(): ListActiveViolationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActiveViolationsRequest]
  }
  
  @scala.inline
  implicit class ListActiveViolationsRequestOps[Self <: ListActiveViolationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setSecurityProfileName(value: SecurityProfileName): Self = this.set("securityProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityProfileName: Self = this.set("securityProfileName", js.undefined)
    
    @scala.inline
    def setThingName(value: DeviceDefenderThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingName: Self = this.set("thingName", js.undefined)
  }
}
