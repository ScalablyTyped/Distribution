package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crawler extends js.Object {
  /**
    * A list of UTF-8 strings that specify the custom classifiers that are associated with the crawler.
    */
  var Classifiers: js.UndefOr[ClassifierNameList] = js.native
  /**
    * Crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's behavior. For more information, see Configuring a Crawler.
    */
  var Configuration: js.UndefOr[CrawlerConfiguration] = js.native
  /**
    * If the crawler is running, contains the total time elapsed since the last crawl began.
    */
  var CrawlElapsedTime: js.UndefOr[MillisecondsCount] = js.native
  /**
    * The name of the SecurityConfiguration structure to be used by this crawler.
    */
  var CrawlerSecurityConfiguration: js.UndefOr[typings.awsSdk.glueMod.CrawlerSecurityConfiguration] = js.native
  /**
    * The time that the crawler was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the database in which the crawler's output is stored.
    */
  var DatabaseName: js.UndefOr[typings.awsSdk.glueMod.DatabaseName] = js.native
  /**
    * A description of the crawler.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The status of the last crawl, and potentially error information if an error occurred.
    */
  var LastCrawl: js.UndefOr[LastCrawlInfo] = js.native
  /**
    * The time that the crawler was last updated.
    */
  var LastUpdated: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the crawler.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * The Amazon Resource Name (ARN) of an IAM role that's used to access customer resources, such as Amazon Simple Storage Service (Amazon S3) data.
    */
  var Role: js.UndefOr[typings.awsSdk.glueMod.Role] = js.native
  /**
    * For scheduled crawlers, the schedule when the crawler runs.
    */
  var Schedule: js.UndefOr[typings.awsSdk.glueMod.Schedule] = js.native
  /**
    * The policy that specifies update and delete behaviors for the crawler.
    */
  var SchemaChangePolicy: js.UndefOr[typings.awsSdk.glueMod.SchemaChangePolicy] = js.native
  /**
    * Indicates whether the crawler is running, or whether a run is pending.
    */
  var State: js.UndefOr[CrawlerState] = js.native
  /**
    * The prefix added to the names of tables that are created.
    */
  var TablePrefix: js.UndefOr[typings.awsSdk.glueMod.TablePrefix] = js.native
  /**
    * A collection of targets to crawl.
    */
  var Targets: js.UndefOr[CrawlerTargets] = js.native
  /**
    * The version of the crawler.
    */
  var Version: js.UndefOr[VersionId] = js.native
}

object Crawler {
  @scala.inline
  def apply(
    Classifiers: ClassifierNameList = null,
    Configuration: CrawlerConfiguration = null,
    CrawlElapsedTime: Int | Double = null,
    CrawlerSecurityConfiguration: CrawlerSecurityConfiguration = null,
    CreationTime: Timestamp = null,
    DatabaseName: DatabaseName = null,
    Description: DescriptionString = null,
    LastCrawl: LastCrawlInfo = null,
    LastUpdated: Timestamp = null,
    Name: NameString = null,
    Role: Role = null,
    Schedule: Schedule = null,
    SchemaChangePolicy: SchemaChangePolicy = null,
    State: CrawlerState = null,
    TablePrefix: TablePrefix = null,
    Targets: CrawlerTargets = null,
    Version: Int | Double = null
  ): Crawler = {
    val __obj = js.Dynamic.literal()
    if (Classifiers != null) __obj.updateDynamic("Classifiers")(Classifiers.asInstanceOf[js.Any])
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration.asInstanceOf[js.Any])
    if (CrawlElapsedTime != null) __obj.updateDynamic("CrawlElapsedTime")(CrawlElapsedTime.asInstanceOf[js.Any])
    if (CrawlerSecurityConfiguration != null) __obj.updateDynamic("CrawlerSecurityConfiguration")(CrawlerSecurityConfiguration.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LastCrawl != null) __obj.updateDynamic("LastCrawl")(LastCrawl.asInstanceOf[js.Any])
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (SchemaChangePolicy != null) __obj.updateDynamic("SchemaChangePolicy")(SchemaChangePolicy.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TablePrefix != null) __obj.updateDynamic("TablePrefix")(TablePrefix.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crawler]
  }
}

