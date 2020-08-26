package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetResourceConfigRequest extends js.Object {
  /**
    * A list of resource keys to be processed with the current request. Each element in the list consists of the resource type and resource ID.
    */
  var resourceKeys: ResourceKeys = js.native
}

object BatchGetResourceConfigRequest {
  @scala.inline
  def apply(resourceKeys: ResourceKeys): BatchGetResourceConfigRequest = {
    val __obj = js.Dynamic.literal(resourceKeys = resourceKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetResourceConfigRequest]
  }
  @scala.inline
  implicit class BatchGetResourceConfigRequestOps[Self <: BatchGetResourceConfigRequest] (val x: Self) extends AnyVal {
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
    def setResourceKeysVarargs(value: ResourceKey*): Self = this.set("resourceKeys", js.Array(value :_*))
    @scala.inline
    def setResourceKeys(value: ResourceKeys): Self = this.set("resourceKeys", value.asInstanceOf[js.Any])
  }
  
}

