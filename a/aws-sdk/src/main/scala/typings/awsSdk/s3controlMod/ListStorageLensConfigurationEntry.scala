package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStorageLensConfigurationEntry extends js.Object {
  
  /**
    * A container for the S3 Storage Lens home Region. Your metrics data is stored and retained in your designated S3 Storage Lens home Region.
    */
  var HomeRegion: S3AWSRegion = js.native
  
  /**
    * A container for the S3 Storage Lens configuration ID.
    */
  var Id: ConfigId = js.native
  
  /**
    * A container for whether the S3 Storage Lens configuration is enabled. This property is required.
    */
  var IsEnabled: js.UndefOr[typings.awsSdk.s3controlMod.IsEnabled] = js.native
  
  /**
    * The ARN of the S3 Storage Lens configuration. This property is read-only.
    */
  var StorageLensArn: typings.awsSdk.s3controlMod.StorageLensArn = js.native
}
object ListStorageLensConfigurationEntry {
  
  @scala.inline
  def apply(HomeRegion: S3AWSRegion, Id: ConfigId, StorageLensArn: StorageLensArn): ListStorageLensConfigurationEntry = {
    val __obj = js.Dynamic.literal(HomeRegion = HomeRegion.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], StorageLensArn = StorageLensArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStorageLensConfigurationEntry]
  }
  
  @scala.inline
  implicit class ListStorageLensConfigurationEntryOps[Self <: ListStorageLensConfigurationEntry] (val x: Self) extends AnyVal {
    
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
    def setHomeRegion(value: S3AWSRegion): Self = this.set("HomeRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ConfigId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageLensArn(value: StorageLensArn): Self = this.set("StorageLensArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: IsEnabled): Self = this.set("IsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("IsEnabled", js.undefined)
  }
}
