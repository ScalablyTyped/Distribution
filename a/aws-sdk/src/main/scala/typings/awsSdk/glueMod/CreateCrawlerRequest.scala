package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCrawlerRequest extends js.Object {
  /**
    * A list of custom classifiers that the user has registered. By default, all built-in classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
    */
  var Classifiers: js.UndefOr[ClassifierNameList] = js.native
  /**
    * Crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's behavior. For more information, see Configuring a Crawler.
    */
  var Configuration: js.UndefOr[CrawlerConfiguration] = js.native
  /**
    * The name of the SecurityConfiguration structure to be used by this crawler.
    */
  var CrawlerSecurityConfiguration: js.UndefOr[typings.awsSdk.glueMod.CrawlerSecurityConfiguration] = js.native
  /**
    * The AWS Glue database where results are written, such as: arn:aws:daylight:us-east-1::database/sometable/ *.
    */
  var DatabaseName: js.UndefOr[typings.awsSdk.glueMod.DatabaseName] = js.native
  /**
    * A description of the new crawler.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * Name of the new crawler.
    */
  var Name: NameString = js.native
  /**
    * The IAM role or Amazon Resource Name (ARN) of an IAM role used by the new crawler to access customer resources.
    */
  var Role: typings.awsSdk.glueMod.Role = js.native
  /**
    * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
    */
  var Schedule: js.UndefOr[CronExpression] = js.native
  /**
    * The policy for the crawler's update and deletion behavior.
    */
  var SchemaChangePolicy: js.UndefOr[typings.awsSdk.glueMod.SchemaChangePolicy] = js.native
  /**
    * The table prefix used for catalog tables that are created.
    */
  var TablePrefix: js.UndefOr[typings.awsSdk.glueMod.TablePrefix] = js.native
  /**
    * The tags to use with this crawler request. You may use tags to limit access to the crawler. For more information about tags in AWS Glue, see AWS Tags in AWS Glue in the developer guide.
    */
  var Tags: js.UndefOr[TagsMap] = js.native
  /**
    * A list of collection of targets to crawl.
    */
  var Targets: CrawlerTargets = js.native
}

object CreateCrawlerRequest {
  @scala.inline
  def apply(Name: NameString, Role: Role, Targets: CrawlerTargets): CreateCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCrawlerRequest]
  }
  @scala.inline
  implicit class CreateCrawlerRequestOps[Self <: CreateCrawlerRequest] (val x: Self) extends AnyVal {
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
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: Role): Self = this.set("Role", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargets(value: CrawlerTargets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassifiersVarargs(value: NameString*): Self = this.set("Classifiers", js.Array(value :_*))
    @scala.inline
    def setClassifiers(value: ClassifierNameList): Self = this.set("Classifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassifiers: Self = this.set("Classifiers", js.undefined)
    @scala.inline
    def setConfiguration(value: CrawlerConfiguration): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("Configuration", js.undefined)
    @scala.inline
    def setCrawlerSecurityConfiguration(value: CrawlerSecurityConfiguration): Self = this.set("CrawlerSecurityConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrawlerSecurityConfiguration: Self = this.set("CrawlerSecurityConfiguration", js.undefined)
    @scala.inline
    def setDatabaseName(value: DatabaseName): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setSchedule(value: CronExpression): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    @scala.inline
    def setSchemaChangePolicy(value: SchemaChangePolicy): Self = this.set("SchemaChangePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaChangePolicy: Self = this.set("SchemaChangePolicy", js.undefined)
    @scala.inline
    def setTablePrefix(value: TablePrefix): Self = this.set("TablePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTablePrefix: Self = this.set("TablePrefix", js.undefined)
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

