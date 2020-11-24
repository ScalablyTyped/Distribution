package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetAggregateResourceConfigResponse extends js.Object {
  
  /**
    * A list that contains the current configuration of one or more resources.
    */
  var BaseConfigurationItems: js.UndefOr[typings.awsSdk.configserviceMod.BaseConfigurationItems] = js.native
  
  /**
    * A list of resource identifiers that were not processed with current scope. The list is empty if all the resources are processed.
    */
  var UnprocessedResourceIdentifiers: js.UndefOr[UnprocessedResourceIdentifierList] = js.native
}
object BatchGetAggregateResourceConfigResponse {
  
  @scala.inline
  def apply(): BatchGetAggregateResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetAggregateResourceConfigResponse]
  }
  
  @scala.inline
  implicit class BatchGetAggregateResourceConfigResponseOps[Self <: BatchGetAggregateResourceConfigResponse] (val x: Self) extends AnyVal {
    
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
    def setBaseConfigurationItemsVarargs(value: BaseConfigurationItem*): Self = this.set("BaseConfigurationItems", js.Array(value :_*))
    
    @scala.inline
    def setBaseConfigurationItems(value: BaseConfigurationItems): Self = this.set("BaseConfigurationItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseConfigurationItems: Self = this.set("BaseConfigurationItems", js.undefined)
    
    @scala.inline
    def setUnprocessedResourceIdentifiersVarargs(value: AggregateResourceIdentifier*): Self = this.set("UnprocessedResourceIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedResourceIdentifiers(value: UnprocessedResourceIdentifierList): Self = this.set("UnprocessedResourceIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnprocessedResourceIdentifiers: Self = this.set("UnprocessedResourceIdentifiers", js.undefined)
  }
}
