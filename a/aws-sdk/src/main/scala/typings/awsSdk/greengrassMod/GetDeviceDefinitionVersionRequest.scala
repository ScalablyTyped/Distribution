package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeviceDefinitionVersionRequest extends js.Object {
  
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: string = js.native
  
  /**
    * The ID of the device definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListDeviceDefinitionVersions'' requests. If the version is the last one that was associated with a device definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var DeviceDefinitionVersionId: string = js.native
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object GetDeviceDefinitionVersionRequest {
  
  @scala.inline
  def apply(DeviceDefinitionId: string, DeviceDefinitionVersionId: string): GetDeviceDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any], DeviceDefinitionVersionId = DeviceDefinitionVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceDefinitionVersionRequest]
  }
  
  @scala.inline
  implicit class GetDeviceDefinitionVersionRequestOps[Self <: GetDeviceDefinitionVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setDeviceDefinitionId(value: string): Self = this.set("DeviceDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDefinitionVersionId(value: string): Self = this.set("DeviceDefinitionVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
