package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationalDatabaseSnapshot extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the database snapshot.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The timestamp when the database snapshot was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * The software of the database snapshot (for example, MySQL)
    */
  var engine: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The database engine version for the database snapshot (for example, 5.7.23).
    */
  var engineVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the database from which the database snapshot was created.
    */
  var fromRelationalDatabaseArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The blueprint ID of the database from which the database snapshot was created. A blueprint describes the major engine version of a database.
    */
  var fromRelationalDatabaseBlueprintId: js.UndefOr[String] = js.native
  
  /**
    * The bundle ID of the database from which the database snapshot was created.
    */
  var fromRelationalDatabaseBundleId: js.UndefOr[String] = js.native
  
  /**
    * The name of the source database from which the database snapshot was created.
    */
  var fromRelationalDatabaseName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The Region name and Availability Zone where the database snapshot is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  
  /**
    * The name of the database snapshot.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The Lightsail resource type.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * The size of the disk in GB (for example, 32) for the database snapshot.
    */
  var sizeInGb: js.UndefOr[integer] = js.native
  
  /**
    * The state of the database snapshot.
    */
  var state: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The support code for the database snapshot. Include this code in your email to support when you have questions about a database snapshot in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object RelationalDatabaseSnapshot {
  
  @scala.inline
  def apply(): RelationalDatabaseSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseSnapshot]
  }
  
  @scala.inline
  implicit class RelationalDatabaseSnapshotOps[Self <: RelationalDatabaseSnapshot] (val x: Self) extends AnyVal {
    
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
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setEngine(value: NonEmptyString): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: NonEmptyString): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    
    @scala.inline
    def setFromRelationalDatabaseArn(value: NonEmptyString): Self = this.set("fromRelationalDatabaseArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromRelationalDatabaseArn: Self = this.set("fromRelationalDatabaseArn", js.undefined)
    
    @scala.inline
    def setFromRelationalDatabaseBlueprintId(value: String): Self = this.set("fromRelationalDatabaseBlueprintId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromRelationalDatabaseBlueprintId: Self = this.set("fromRelationalDatabaseBlueprintId", js.undefined)
    
    @scala.inline
    def setFromRelationalDatabaseBundleId(value: String): Self = this.set("fromRelationalDatabaseBundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromRelationalDatabaseBundleId: Self = this.set("fromRelationalDatabaseBundleId", js.undefined)
    
    @scala.inline
    def setFromRelationalDatabaseName(value: NonEmptyString): Self = this.set("fromRelationalDatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromRelationalDatabaseName: Self = this.set("fromRelationalDatabaseName", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setSizeInGb(value: integer): Self = this.set("sizeInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeInGb: Self = this.set("sizeInGb", js.undefined)
    
    @scala.inline
    def setState(value: NonEmptyString): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setSupportCode(value: String): Self = this.set("supportCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportCode: Self = this.set("supportCode", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
