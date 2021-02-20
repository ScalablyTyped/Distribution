package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetAggregateResourceConfigResponse extends StObject {
  
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
  implicit class BatchGetAggregateResourceConfigResponseMutableBuilder[Self <: BatchGetAggregateResourceConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseConfigurationItems(value: BaseConfigurationItems): Self = StObject.set(x, "BaseConfigurationItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseConfigurationItemsUndefined: Self = StObject.set(x, "BaseConfigurationItems", js.undefined)
    
    @scala.inline
    def setBaseConfigurationItemsVarargs(value: BaseConfigurationItem*): Self = StObject.set(x, "BaseConfigurationItems", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedResourceIdentifiers(value: UnprocessedResourceIdentifierList): Self = StObject.set(x, "UnprocessedResourceIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedResourceIdentifiersUndefined: Self = StObject.set(x, "UnprocessedResourceIdentifiers", js.undefined)
    
    @scala.inline
    def setUnprocessedResourceIdentifiersVarargs(value: AggregateResourceIdentifier*): Self = StObject.set(x, "UnprocessedResourceIdentifiers", js.Array(value :_*))
  }
}
