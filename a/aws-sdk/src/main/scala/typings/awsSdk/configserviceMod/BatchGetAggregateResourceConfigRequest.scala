package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetAggregateResourceConfigRequest extends js.Object {
  
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsSdk.configserviceMod.ConfigurationAggregatorName = js.native
  
  /**
    * A list of aggregate ResourceIdentifiers objects. 
    */
  var ResourceIdentifiers: ResourceIdentifiersList = js.native
}
object BatchGetAggregateResourceConfigRequest {
  
  @scala.inline
  def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    ResourceIdentifiers: ResourceIdentifiersList
  ): BatchGetAggregateResourceConfigRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any], ResourceIdentifiers = ResourceIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAggregateResourceConfigRequest]
  }
  
  @scala.inline
  implicit class BatchGetAggregateResourceConfigRequestOps[Self <: BatchGetAggregateResourceConfigRequest] (val x: Self) extends AnyVal {
    
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
    def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = this.set("ConfigurationAggregatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifiersVarargs(value: AggregateResourceIdentifier*): Self = this.set("ResourceIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setResourceIdentifiers(value: ResourceIdentifiersList): Self = this.set("ResourceIdentifiers", value.asInstanceOf[js.Any])
  }
}
