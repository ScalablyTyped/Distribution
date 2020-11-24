package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateResourceIdentifier extends js.Object {
  
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
  implicit class AggregateResourceIdentifierOps[Self <: AggregateResourceIdentifier] (val x: Self) extends AnyVal {
    
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
    def setResourceId(value: ResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAccountId(value: AccountId): Self = this.set("SourceAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRegion(value: AwsRegion): Self = this.set("SourceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = this.set("ResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("ResourceName", js.undefined)
  }
}
