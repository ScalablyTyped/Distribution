package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateResourceIdentifier extends StObject {
  
  /**
    * The ID of the AWS resource.
    */
  var ResourceId: typings.awsSdk.configserviceMod.ResourceId = js.native
  
  /**
    * The name of the AWS resource.
    */
  var ResourceName: js.UndefOr[typings.awsSdk.configserviceMod.ResourceName] = js.native
  
  /**
    * The type of the AWS resource.
    */
  var ResourceType: typings.awsSdk.configserviceMod.ResourceType = js.native
  
  /**
    * The 12-digit account ID of the source account.
    */
  var SourceAccountId: AccountId = js.native
  
  /**
    * The source region where data is aggregated.
    */
  var SourceRegion: AwsRegion = js.native
}
object AggregateResourceIdentifier {
  
  @scala.inline
  def apply(
    ResourceId: ResourceId,
    ResourceType: ResourceType,
    SourceAccountId: AccountId,
    SourceRegion: AwsRegion
  ): AggregateResourceIdentifier = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], SourceAccountId = SourceAccountId.asInstanceOf[js.Any], SourceRegion = SourceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateResourceIdentifier]
  }
  
  @scala.inline
  implicit class AggregateResourceIdentifierMutableBuilder[Self <: AggregateResourceIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAccountId(value: AccountId): Self = StObject.set(x, "SourceAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRegion(value: AwsRegion): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
  }
}
