package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeSpecification extends StObject {
  
  /**
    * The number of I/O operations per second (IOPS) that the volume supports.
    */
  var Iops: js.UndefOr[Integer] = js.native
  
  /**
    * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is 10.
    */
  var SizeInGB: Integer = js.native
  
  /**
    * The volume type. Volume types supported are gp2, io1, standard.
    */
  var VolumeType: String = js.native
}
object VolumeSpecification {
  
  @scala.inline
  def apply(SizeInGB: Integer, VolumeType: String): VolumeSpecification = {
    val __obj = js.Dynamic.literal(SizeInGB = SizeInGB.asInstanceOf[js.Any], VolumeType = VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeSpecification]
  }
  
  @scala.inline
  implicit class VolumeSpecificationMutableBuilder[Self <: VolumeSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    @scala.inline
    def setSizeInGB(value: Integer): Self = StObject.set(x, "SizeInGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeType(value: String): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
  }
}
