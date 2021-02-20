package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disk extends StObject {
  
  /**
    * An array of objects representing the add-ons enabled on the disk.
    */
  var addOns: js.UndefOr[AddOnList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the disk.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The resources to which the disk is attached.
    */
  var attachedTo: js.UndefOr[ResourceName] = js.native
  
  /**
    * (Deprecated) The attachment state of the disk.  In releases prior to November 14, 2017, this parameter returned attached for system disks in the API response. It is now deprecated, but still included in the response. Use isAttached instead. 
    */
  var attachmentState: js.UndefOr[String] = js.native
  
  /**
    * The date when the disk was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * (Deprecated) The number of GB in use by the disk.  In releases prior to November 14, 2017, this parameter was not included in the API response. It is now deprecated. 
    */
  var gbInUse: js.UndefOr[integer] = js.native
  
  /**
    * The input/output operations per second (IOPS) of the disk.
    */
  var iops: js.UndefOr[integer] = js.native
  
  /**
    * A Boolean value indicating whether the disk is attached.
    */
  var isAttached: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
    */
  var isSystemDisk: js.UndefOr[Boolean] = js.native
  
  /**
    * The AWS Region and Availability Zone where the disk is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  
  /**
    * The unique name of the disk.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The disk path.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The Lightsail resource type (e.g., Disk).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * The size of the disk in GB.
    */
  var sizeInGb: js.UndefOr[integer] = js.native
  
  /**
    * Describes the status of the disk.
    */
  var state: js.UndefOr[DiskState] = js.native
  
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object Disk {
  
  @scala.inline
  def apply(): Disk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disk]
  }
  
  @scala.inline
  implicit class DiskMutableBuilder[Self <: Disk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOns(value: AddOnList): Self = StObject.set(x, "addOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnsUndefined: Self = StObject.set(x, "addOns", js.undefined)
    
    @scala.inline
    def setAddOnsVarargs(value: AddOn*): Self = StObject.set(x, "addOns", js.Array(value :_*))
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setAttachedTo(value: ResourceName): Self = StObject.set(x, "attachedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachedToUndefined: Self = StObject.set(x, "attachedTo", js.undefined)
    
    @scala.inline
    def setAttachmentState(value: String): Self = StObject.set(x, "attachmentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentStateUndefined: Self = StObject.set(x, "attachmentState", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setGbInUse(value: integer): Self = StObject.set(x, "gbInUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGbInUseUndefined: Self = StObject.set(x, "gbInUse", js.undefined)
    
    @scala.inline
    def setIops(value: integer): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
    
    @scala.inline
    def setIsAttached(value: Boolean): Self = StObject.set(x, "isAttached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAttachedUndefined: Self = StObject.set(x, "isAttached", js.undefined)
    
    @scala.inline
    def setIsSystemDisk(value: Boolean): Self = StObject.set(x, "isSystemDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSystemDiskUndefined: Self = StObject.set(x, "isSystemDisk", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setSizeInGb(value: integer): Self = StObject.set(x, "sizeInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInGbUndefined: Self = StObject.set(x, "sizeInGb", js.undefined)
    
    @scala.inline
    def setState(value: DiskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
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
