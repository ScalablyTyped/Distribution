package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeStatusDetails extends StObject {
  
  /**
    * The name of the volume status.
    */
  var Name: js.UndefOr[VolumeStatusName] = js.undefined
  
  /**
    * The intended status of the volume status.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object VolumeStatusDetails {
  
  inline def apply(): VolumeStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusDetails]
  }
  
  extension [Self <: VolumeStatusDetails](x: Self) {
    
    inline def setName(value: VolumeStatusName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
