package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.
    */
  var RecrawlPolicy: js.UndefOr[typings.awsSdk.glueMod.RecrawlPolicy] = js.native
  
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
  def apply(): Crawler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crawler]
  }
  
  @scala.inline
  implicit class CrawlerOps[Self <: Crawler] (val x: Self) extends AnyVal {
    
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
    def setCrawlElapsedTime(value: MillisecondsCount): Self = this.set("CrawlElapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawlElapsedTime: Self = this.set("CrawlElapsedTime", js.undefined)
    
    @scala.inline
    def setCrawlerSecurityConfiguration(value: CrawlerSecurityConfiguration): Self = this.set("CrawlerSecurityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawlerSecurityConfiguration: Self = this.set("CrawlerSecurityConfiguration", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: DatabaseName): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setLastCrawl(value: LastCrawlInfo): Self = this.set("LastCrawl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastCrawl: Self = this.set("LastCrawl", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: Timestamp): Self = this.set("LastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdated: Self = this.set("LastUpdated", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setRecrawlPolicy(value: RecrawlPolicy): Self = this.set("RecrawlPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecrawlPolicy: Self = this.set("RecrawlPolicy", js.undefined)
    
    @scala.inline
    def setRole(value: Role): Self = this.set("Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
    
    @scala.inline
    def setSchedule(value: Schedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    
    @scala.inline
    def setSchemaChangePolicy(value: SchemaChangePolicy): Self = this.set("SchemaChangePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaChangePolicy: Self = this.set("SchemaChangePolicy", js.undefined)
    
    @scala.inline
    def setState(value: CrawlerState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTablePrefix(value: TablePrefix): Self = this.set("TablePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTablePrefix: Self = this.set("TablePrefix", js.undefined)
    
    @scala.inline
    def setTargets(value: CrawlerTargets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
    
    @scala.inline
    def setVersion(value: VersionId): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
