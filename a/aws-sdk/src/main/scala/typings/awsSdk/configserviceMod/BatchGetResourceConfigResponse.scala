package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetResourceConfigResponse extends js.Object {
  
  /**
    * A list that contains the current configuration of one or more resources.
    */
  var baseConfigurationItems: js.UndefOr[BaseConfigurationItems] = js.native
  
  /**
    * A list of resource keys that were not processed with the current response. The unprocessesResourceKeys value is in the same form as ResourceKeys, so the value can be directly provided to a subsequent BatchGetResourceConfig operation. If there are no unprocessed resource keys, the response contains an empty unprocessedResourceKeys list. 
    */
  var unprocessedResourceKeys: js.UndefOr[ResourceKeys] = js.native
}
object BatchGetResourceConfigResponse {
  
  @scala.inline
  def apply(): BatchGetResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetResourceConfigResponse]
  }
  
  @scala.inline
  implicit class BatchGetResourceConfigResponseOps[Self <: BatchGetResourceConfigResponse] (val x: Self) extends AnyVal {
    
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
    def setBaseConfigurationItemsVarargs(value: BaseConfigurationItem*): Self = this.set("baseConfigurationItems", js.Array(value :_*))
    
    @scala.inline
    def setBaseConfigurationItems(value: BaseConfigurationItems): Self = this.set("baseConfigurationItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseConfigurationItems: Self = this.set("baseConfigurationItems", js.undefined)
    
    @scala.inline
    def setUnprocessedResourceKeysVarargs(value: ResourceKey*): Self = this.set("unprocessedResourceKeys", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedResourceKeys(value: ResourceKeys): Self = this.set("unprocessedResourceKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnprocessedResourceKeys: Self = this.set("unprocessedResourceKeys", js.undefined)
  }
}
