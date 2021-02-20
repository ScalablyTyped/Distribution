package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  
  /**
    * The date on which this distribution configuration was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  
  /**
    * The date on which this distribution configuration was last updated.
    */
  var dateUpdated: js.UndefOr[DateTime] = js.native
  
  /**
    * The description of the distribution configuration.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The distributions of the distribution configuration.
    */
  var distributions: js.UndefOr[DistributionList] = js.native
  
  /**
    * The name of the distribution configuration.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The tags of the distribution configuration.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The maximum duration in minutes for this distribution configuration.
    */
  var timeoutMinutes: DistributionTimeoutMinutes = js.native
}
object DistributionConfiguration {
  
  @scala.inline
  def apply(timeoutMinutes: DistributionTimeoutMinutes): DistributionConfiguration = {
    val __obj = js.Dynamic.literal(timeoutMinutes = timeoutMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionConfiguration]
  }
  
  @scala.inline
  implicit class DistributionConfigurationMutableBuilder[Self <: DistributionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    @scala.inline
    def setDateUpdated(value: DateTime): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDistributions(value: DistributionList): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
    
    @scala.inline
    def setDistributionsVarargs(value: Distribution*): Self = StObject.set(x, "distributions", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTimeoutMinutes(value: DistributionTimeoutMinutes): Self = StObject.set(x, "timeoutMinutes", value.asInstanceOf[js.Any])
  }
}
