package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationAggregator extends StObject {
  
  /**
    * Provides a list of source accounts and regions to be aggregated.
    */
  var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the aggregator.
    */
  var ConfigurationAggregatorArn: js.UndefOr[typings.awsSdk.configserviceMod.ConfigurationAggregatorArn] = js.native
  
  /**
    * The name of the aggregator.
    */
  var ConfigurationAggregatorName: js.UndefOr[typings.awsSdk.configserviceMod.ConfigurationAggregatorName] = js.native
  
  /**
    * AWS service that created the configuration aggregator.
    */
  var CreatedBy: js.UndefOr[StringWithCharLimit256] = js.native
  
  /**
    * The time stamp when the configuration aggregator was created.
    */
  var CreationTime: js.UndefOr[Date] = js.native
  
  /**
    * The time of the last update.
    */
  var LastUpdatedTime: js.UndefOr[Date] = js.native
  
  /**
    * Provides an organization and list of regions to be aggregated.
    */
  var OrganizationAggregationSource: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationAggregationSource] = js.native
}
object ConfigurationAggregator {
  
  @scala.inline
  def apply(): ConfigurationAggregator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationAggregator]
  }
  
  @scala.inline
  implicit class ConfigurationAggregatorMutableBuilder[Self <: ConfigurationAggregator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountAggregationSources(value: AccountAggregationSourceList): Self = StObject.set(x, "AccountAggregationSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountAggregationSourcesUndefined: Self = StObject.set(x, "AccountAggregationSources", js.undefined)
    
    @scala.inline
    def setAccountAggregationSourcesVarargs(value: AccountAggregationSource*): Self = StObject.set(x, "AccountAggregationSources", js.Array(value :_*))
    
    @scala.inline
    def setConfigurationAggregatorArn(value: ConfigurationAggregatorArn): Self = StObject.set(x, "ConfigurationAggregatorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationAggregatorArnUndefined: Self = StObject.set(x, "ConfigurationAggregatorArn", js.undefined)
    
    @scala.inline
    def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = StObject.set(x, "ConfigurationAggregatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationAggregatorNameUndefined: Self = StObject.set(x, "ConfigurationAggregatorName", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: StringWithCharLimit256): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setOrganizationAggregationSource(value: OrganizationAggregationSource): Self = StObject.set(x, "OrganizationAggregationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationAggregationSourceUndefined: Self = StObject.set(x, "OrganizationAggregationSource", js.undefined)
  }
}
