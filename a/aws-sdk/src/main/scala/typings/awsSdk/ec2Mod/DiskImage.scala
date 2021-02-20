package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskImage extends StObject {
  
  /**
    * A description of the disk image.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Information about the disk image.
    */
  var Image: js.UndefOr[DiskImageDetail] = js.native
  
  /**
    * Information about the volume.
    */
  var Volume: js.UndefOr[VolumeDetail] = js.native
}
object DiskImage {
  
  @scala.inline
  def apply(): DiskImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskImage]
  }
  
  @scala.inline
  implicit class DiskImageMutableBuilder[Self <: DiskImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setImage(value: DiskImageDetail): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
    
    @scala.inline
    def setVolume(value: VolumeDetail): Self = StObject.set(x, "Volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "Volume", js.undefined)
  }
}
