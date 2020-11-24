package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagResourcesOutput extends js.Object {
  
  /**
    * A map containing a key-value pair for each failed item that couldn't be tagged. The key is the ARN of the failed resource. The value is a FailureInfo object that contains an error code, a status code, and an error message. If there are no errors, the FailedResourcesMap is empty.
    */
  var FailedResourcesMap: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.FailedResourcesMap] = js.native
}
object TagResourcesOutput {
  
  @scala.inline
  def apply(): TagResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagResourcesOutput]
  }
  
  @scala.inline
  implicit class TagResourcesOutputOps[Self <: TagResourcesOutput] (val x: Self) extends AnyVal {
    
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
    def setFailedResourcesMap(value: FailedResourcesMap): Self = this.set("FailedResourcesMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedResourcesMap: Self = this.set("FailedResourcesMap", js.undefined)
  }
}
