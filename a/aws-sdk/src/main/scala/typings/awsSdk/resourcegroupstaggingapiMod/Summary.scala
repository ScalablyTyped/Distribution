package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Summary extends js.Object {
  /**
    * The timestamp that shows when this summary was generated in this Region. 
    */
  var LastUpdated: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.LastUpdated] = js.native
  /**
    * The count of noncompliant resources.
    */
  var NonCompliantResources: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.NonCompliantResources] = js.native
  /**
    * The AWS Region that the summary applies to.
    */
  var Region: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.Region] = js.native
  /**
    * The AWS resource type.
    */
  var ResourceType: js.UndefOr[AmazonResourceType] = js.native
  /**
    * The account identifier or the root identifier of the organization. If you don't know the root ID, you can call the AWS Organizations ListRoots API.
    */
  var TargetId: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.TargetId] = js.native
  /**
    * Whether the target is an account, an OU, or the organization root.
    */
  var TargetIdType: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.TargetIdType] = js.native
}

object Summary {
  @scala.inline
  def apply(
    LastUpdated: LastUpdated = null,
    NonCompliantResources: Int | Double = null,
    Region: Region = null,
    ResourceType: AmazonResourceType = null,
    TargetId: TargetId = null,
    TargetIdType: TargetIdType = null
  ): Summary = {
    val __obj = js.Dynamic.literal()
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated.asInstanceOf[js.Any])
    if (NonCompliantResources != null) __obj.updateDynamic("NonCompliantResources")(NonCompliantResources.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (TargetId != null) __obj.updateDynamic("TargetId")(TargetId.asInstanceOf[js.Any])
    if (TargetIdType != null) __obj.updateDynamic("TargetIdType")(TargetIdType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Summary]
  }
}

