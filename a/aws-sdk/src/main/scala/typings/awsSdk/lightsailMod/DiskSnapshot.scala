package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskSnapshot extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the disk snapshot.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The date when the disk snapshot was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the source disk from which the disk snapshot was created.
    */
  var fromDiskArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The unique name of the source disk from which the disk snapshot was created.
    */
  var fromDiskName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the source instance from which the disk (system volume) snapshot was created.
    */
  var fromInstanceArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The unique name of the source instance from which the disk (system volume) snapshot was created.
    */
  var fromInstanceName: js.UndefOr[ResourceName] = js.native
  
  /**
    * A Boolean value indicating whether the snapshot was created from an automatic snapshot.
    */
  var isFromAutoSnapshot: js.UndefOr[Boolean] = js.native
  
  /**
    * The AWS Region and Availability Zone where the disk snapshot was created.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  
  /**
    * The name of the disk snapshot (e.g., my-disk-snapshot).
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The progress of the disk snapshot operation.
    */
  var progress: js.UndefOr[String] = js.native
  
  /**
    * The Lightsail resource type (e.g., DiskSnapshot).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * The size of the disk in GB.
    */
  var sizeInGb: js.UndefOr[integer] = js.native
  
  /**
    * The status of the disk snapshot operation.
    */
  var state: js.UndefOr[DiskSnapshotState] = js.native
  
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object DiskSnapshot {
  
  @scala.inline
  def apply(): DiskSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskSnapshot]
  }
  
  @scala.inline
  implicit class DiskSnapshotMutableBuilder[Self <: DiskSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setFromDiskArn(value: NonEmptyString): Self = StObject.set(x, "fromDiskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDiskArnUndefined: Self = StObject.set(x, "fromDiskArn", js.undefined)
    
    @scala.inline
    def setFromDiskName(value: ResourceName): Self = StObject.set(x, "fromDiskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDiskNameUndefined: Self = StObject.set(x, "fromDiskName", js.undefined)
    
    @scala.inline
    def setFromInstanceArn(value: NonEmptyString): Self = StObject.set(x, "fromInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromInstanceArnUndefined: Self = StObject.set(x, "fromInstanceArn", js.undefined)
    
    @scala.inline
    def setFromInstanceName(value: ResourceName): Self = StObject.set(x, "fromInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromInstanceNameUndefined: Self = StObject.set(x, "fromInstanceName", js.undefined)
    
    @scala.inline
    def setIsFromAutoSnapshot(value: Boolean): Self = StObject.set(x, "isFromAutoSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFromAutoSnapshotUndefined: Self = StObject.set(x, "isFromAutoSnapshot", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setSizeInGb(value: integer): Self = StObject.set(x, "sizeInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInGbUndefined: Self = StObject.set(x, "sizeInGb", js.undefined)
    
    @scala.inline
    def setState(value: DiskSnapshotState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
