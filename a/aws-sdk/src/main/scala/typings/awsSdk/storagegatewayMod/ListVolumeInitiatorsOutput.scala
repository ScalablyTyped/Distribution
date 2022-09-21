package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVolumeInitiatorsOutput extends StObject {
  
  /**
    * The host names and port numbers of all iSCSI initiators that are connected to the gateway.
    */
  var Initiators: js.UndefOr[typings.awsSdk.storagegatewayMod.Initiators] = js.undefined
}
object ListVolumeInitiatorsOutput {
  
  inline def apply(): ListVolumeInitiatorsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVolumeInitiatorsOutput]
  }
  
  extension [Self <: ListVolumeInitiatorsOutput](x: Self) {
    
    inline def setInitiators(value: Initiators): Self = StObject.set(x, "Initiators", value.asInstanceOf[js.Any])
    
    inline def setInitiatorsUndefined: Self = StObject.set(x, "Initiators", js.undefined)
    
    inline def setInitiatorsVarargs(value: Initiator*): Self = StObject.set(x, "Initiators", js.Array(value*))
  }
}
