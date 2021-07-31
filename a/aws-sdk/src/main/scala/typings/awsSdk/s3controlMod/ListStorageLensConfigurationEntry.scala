package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStorageLensConfigurationEntry extends StObject {
  
  /**
    * A container for the S3 Storage Lens home Region. Your metrics data is stored and retained in your designated S3 Storage Lens home Region.
    */
  var HomeRegion: S3AWSRegion
  
  /**
    * A container for the S3 Storage Lens configuration ID.
    */
  var Id: ConfigId
  
  /**
    * A container for whether the S3 Storage Lens configuration is enabled. This property is required.
    */
  var IsEnabled: js.UndefOr[typings.awsSdk.s3controlMod.IsEnabled] = js.undefined
  
  /**
    * The ARN of the S3 Storage Lens configuration. This property is read-only.
    */
  var StorageLensArn: typings.awsSdk.s3controlMod.StorageLensArn
}
object ListStorageLensConfigurationEntry {
  
  @scala.inline
  def apply(HomeRegion: S3AWSRegion, Id: ConfigId, StorageLensArn: StorageLensArn): ListStorageLensConfigurationEntry = {
    val __obj = js.Dynamic.literal(HomeRegion = HomeRegion.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], StorageLensArn = StorageLensArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStorageLensConfigurationEntry]
  }
  
  @scala.inline
  implicit class ListStorageLensConfigurationEntryMutableBuilder[Self <: ListStorageLensConfigurationEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHomeRegion(value: S3AWSRegion): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ConfigId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: IsEnabled): Self = StObject.set(x, "IsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabledUndefined: Self = StObject.set(x, "IsEnabled", js.undefined)
    
    @scala.inline
    def setStorageLensArn(value: StorageLensArn): Self = StObject.set(x, "StorageLensArn", value.asInstanceOf[js.Any])
  }
}
