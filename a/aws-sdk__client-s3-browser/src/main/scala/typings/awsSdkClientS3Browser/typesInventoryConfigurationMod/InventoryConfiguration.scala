package typings.awsSdkClientS3Browser.typesInventoryConfigurationMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.All
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Current
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ETag
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.EncryptionStatus
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.IsMultipartUploaded
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.LastModifiedDate
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ReplicationStatus
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Size
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.StorageClass
import typings.awsSdkClientS3Browser.typesInventoryDestinationMod.InventoryDestination
import typings.awsSdkClientS3Browser.typesInventoryFilterMod.InventoryFilter
import typings.awsSdkClientS3Browser.typesInventoryScheduleMod.InventorySchedule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryConfiguration extends js.Object {
  
  /**
    * <p>Contains information about where to publish the inventory results.</p>
    */
  var Destination: InventoryDestination = js.native
  
  /**
    * <p>Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.</p>
    */
  var Filter: js.UndefOr[InventoryFilter] = js.native
  
  /**
    * <p>The ID used to identify the inventory configuration.</p>
    */
  var Id: String = js.native
  
  /**
    * <p>Specifies which object version(s) to included in the inventory results.</p>
    */
  var IncludedObjectVersions: All | Current | String = js.native
  
  /**
    * <p>Specifies whether the inventory is enabled or disabled.</p>
    */
  var IsEnabled: Boolean = js.native
  
  /**
    * <p>Contains the optional fields that are included in the inventory results.</p>
    */
  var OptionalFields: js.UndefOr[
    (js.Array[
      Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
    ]) | (Iterable[
      Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
    ])
  ] = js.native
  
  /**
    * <p>Specifies the schedule for generating inventory results.</p>
    */
  var Schedule: InventorySchedule = js.native
}
object InventoryConfiguration {
  
  @scala.inline
  def apply(
    Destination: InventoryDestination,
    Id: String,
    IncludedObjectVersions: All | Current | String,
    IsEnabled: Boolean,
    Schedule: InventorySchedule
  ): InventoryConfiguration = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IncludedObjectVersions = IncludedObjectVersions.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryConfiguration]
  }
  
  @scala.inline
  implicit class InventoryConfigurationOps[Self <: InventoryConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: InventoryDestination): Self = this.set("Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedObjectVersions(value: All | Current | String): Self = this.set("IncludedObjectVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("IsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedule(value: InventorySchedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: InventoryFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    
    @scala.inline
    def setOptionalFieldsVarargs(
      value: (Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String)*
    ): Self = this.set("OptionalFields", js.Array(value :_*))
    
    @scala.inline
    def setOptionalFields(
      value: (js.Array[
          Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
        ]) | (Iterable[
          Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
        ])
    ): Self = this.set("OptionalFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalFields: Self = this.set("OptionalFields", js.undefined)
  }
}
