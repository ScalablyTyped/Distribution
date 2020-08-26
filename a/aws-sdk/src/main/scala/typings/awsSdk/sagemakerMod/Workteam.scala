package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workteam extends js.Object {
  /**
    * The date and time that the work team was created (timestamp).
    */
  var CreateDate: js.UndefOr[Timestamp] = js.native
  /**
    * A description of the work team.
    */
  var Description: String200 = js.native
  /**
    * The date and time that the work team was last updated (timestamp).
    */
  var LastUpdatedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon Cognito user groups that make up the work team.
    */
  var MemberDefinitions: typings.awsSdk.sagemakerMod.MemberDefinitions = js.native
  /**
    * Configures SNS notifications of available or expiring work items for work teams.
    */
  var NotificationConfiguration: js.UndefOr[typings.awsSdk.sagemakerMod.NotificationConfiguration] = js.native
  /**
    * The Amazon Marketplace identifier for a vendor's work team.
    */
  var ProductListingIds: js.UndefOr[ProductListings] = js.native
  /**
    * The URI of the labeling job's user interface. Workers open this URI to start labeling your data objects.
    */
  var SubDomain: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the workforce.
    */
  var WorkforceArn: js.UndefOr[typings.awsSdk.sagemakerMod.WorkforceArn] = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the work team.
    */
  var WorkteamArn: typings.awsSdk.sagemakerMod.WorkteamArn = js.native
  /**
    * The name of the work team.
    */
  var WorkteamName: typings.awsSdk.sagemakerMod.WorkteamName = js.native
}

object Workteam {
  @scala.inline
  def apply(
    Description: String200,
    MemberDefinitions: MemberDefinitions,
    WorkteamArn: WorkteamArn,
    WorkteamName: WorkteamName
  ): Workteam = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], MemberDefinitions = MemberDefinitions.asInstanceOf[js.Any], WorkteamArn = WorkteamArn.asInstanceOf[js.Any], WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workteam]
  }
  @scala.inline
  implicit class WorkteamOps[Self <: Workteam] (val x: Self) extends AnyVal {
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
    def setDescription(value: String200): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemberDefinitionsVarargs(value: MemberDefinition*): Self = this.set("MemberDefinitions", js.Array(value :_*))
    @scala.inline
    def setMemberDefinitions(value: MemberDefinitions): Self = this.set("MemberDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkteamArn(value: WorkteamArn): Self = this.set("WorkteamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkteamName(value: WorkteamName): Self = this.set("WorkteamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateDate(value: Timestamp): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    @scala.inline
    def setLastUpdatedDate(value: Timestamp): Self = this.set("LastUpdatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("LastUpdatedDate", js.undefined)
    @scala.inline
    def setNotificationConfiguration(value: NotificationConfiguration): Self = this.set("NotificationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationConfiguration: Self = this.set("NotificationConfiguration", js.undefined)
    @scala.inline
    def setProductListingIdsVarargs(value: String*): Self = this.set("ProductListingIds", js.Array(value :_*))
    @scala.inline
    def setProductListingIds(value: ProductListings): Self = this.set("ProductListingIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductListingIds: Self = this.set("ProductListingIds", js.undefined)
    @scala.inline
    def setSubDomain(value: String): Self = this.set("SubDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubDomain: Self = this.set("SubDomain", js.undefined)
    @scala.inline
    def setWorkforceArn(value: WorkforceArn): Self = this.set("WorkforceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkforceArn: Self = this.set("WorkforceArn", js.undefined)
  }
  
}

