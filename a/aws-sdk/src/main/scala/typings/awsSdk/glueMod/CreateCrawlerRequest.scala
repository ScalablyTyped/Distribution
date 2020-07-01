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
  def apply(
    Name: NameString,
    Role: Role,
    Targets: CrawlerTargets,
    Classifiers: ClassifierNameList = null,
    Configuration: CrawlerConfiguration = null,
    CrawlerSecurityConfiguration: CrawlerSecurityConfiguration = null,
    DatabaseName: DatabaseName = null,
    Description: DescriptionString = null,
    Schedule: CronExpression = null,
    SchemaChangePolicy: SchemaChangePolicy = null,
    TablePrefix: TablePrefix = null,
    Tags: TagsMap = null
  ): CreateCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    if (Classifiers != null) __obj.updateDynamic("Classifiers")(Classifiers.asInstanceOf[js.Any])
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration.asInstanceOf[js.Any])
    if (CrawlerSecurityConfiguration != null) __obj.updateDynamic("CrawlerSecurityConfiguration")(CrawlerSecurityConfiguration.asInstanceOf[js.Any])
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (SchemaChangePolicy != null) __obj.updateDynamic("SchemaChangePolicy")(SchemaChangePolicy.asInstanceOf[js.Any])
    if (TablePrefix != null) __obj.updateDynamic("TablePrefix")(TablePrefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCrawlerRequest]
  }
}

