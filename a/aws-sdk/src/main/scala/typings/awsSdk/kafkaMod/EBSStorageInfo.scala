package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EBSStorageInfo extends StObject {
  
  /**
    * 
    The size in GiB of the EBS volume for the data drive on each broker node.
    
    */
  var VolumeSize: js.UndefOr[integerMin1Max16384] = js.native
}
object EBSStorageInfo {
  
  @scala.inline
  def apply(): EBSStorageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EBSStorageInfo]
  }
  
  @scala.inline
  implicit class EBSStorageInfoMutableBuilder[Self <: EBSStorageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolumeSize(value: integerMin1Max16384): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
  }
}
