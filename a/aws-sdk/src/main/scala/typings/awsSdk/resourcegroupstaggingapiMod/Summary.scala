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
  def apply(): Summary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Summary]
  }
  @scala.inline
  implicit class SummaryOps[Self <: Summary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLastUpdated(value: LastUpdated): Self = this.set("LastUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdated: Self = this.set("LastUpdated", js.undefined)
    @scala.inline
    def setNonCompliantResources(value: NonCompliantResources): Self = this.set("NonCompliantResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonCompliantResources: Self = this.set("NonCompliantResources", js.undefined)
    @scala.inline
    def setRegion(value: Region): Self = this.set("Region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    @scala.inline
    def setResourceType(value: AmazonResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    @scala.inline
    def setTargetId(value: TargetId): Self = this.set("TargetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetId: Self = this.set("TargetId", js.undefined)
    @scala.inline
    def setTargetIdType(value: TargetIdType): Self = this.set("TargetIdType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetIdType: Self = this.set("TargetIdType", js.undefined)
  }
  
}

