package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskImageVolumeDescription extends StObject {
  
  /**
    * The volume identifier.
    */
  var Id: js.UndefOr[String] = js.native
  
  /**
    * The size of the volume, in GiB.
    */
  var Size: js.UndefOr[Long] = js.native
}
object DiskImageVolumeDescription {
  
  @scala.inline
  def apply(): DiskImageVolumeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskImageVolumeDescription]
  }
  
  @scala.inline
  implicit class DiskImageVolumeDescriptionMutableBuilder[Self <: DiskImageVolumeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setSize(value: Long): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
  }
}
