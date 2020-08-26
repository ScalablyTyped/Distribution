package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemediationExceptionResourceKey extends js.Object {
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var ResourceId: js.UndefOr[StringWithCharLimit1024] = js.native
  /**
    * The type of a resource.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.native
}

object RemediationExceptionResourceKey {
  @scala.inline
  def apply(): RemediationExceptionResourceKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationExceptionResourceKey]
  }
  @scala.inline
  implicit class RemediationExceptionResourceKeyOps[Self <: RemediationExceptionResourceKey] (val x: Self) extends AnyVal {
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
    def setResourceId(value: StringWithCharLimit1024): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    @scala.inline
    def setResourceType(value: StringWithCharLimit256): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
  
}

