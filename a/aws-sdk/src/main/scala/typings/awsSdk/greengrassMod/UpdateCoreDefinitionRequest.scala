package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCoreDefinitionRequest extends js.Object {
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: string = js.native
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[string] = js.native
}

object UpdateCoreDefinitionRequest {
  @scala.inline
  def apply(CoreDefinitionId: string): UpdateCoreDefinitionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCoreDefinitionRequest]
  }
  @scala.inline
  implicit class UpdateCoreDefinitionRequestOps[Self <: UpdateCoreDefinitionRequest] (val x: Self) extends AnyVal {
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
    def setCoreDefinitionId(value: string): Self = this.set("CoreDefinitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

