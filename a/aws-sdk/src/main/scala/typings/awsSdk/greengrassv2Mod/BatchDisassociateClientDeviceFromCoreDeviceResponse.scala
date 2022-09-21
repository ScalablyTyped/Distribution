package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateClientDeviceFromCoreDeviceResponse extends StObject {
  
  /**
    * The list of any errors for the entries in the request. Each error entry contains the name of the IoT thing that failed to disassociate.
    */
  var errorEntries: js.UndefOr[DisassociateClientDeviceFromCoreDeviceErrorList] = js.undefined
}
object BatchDisassociateClientDeviceFromCoreDeviceResponse {
  
  inline def apply(): BatchDisassociateClientDeviceFromCoreDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisassociateClientDeviceFromCoreDeviceResponse]
  }
  
  extension [Self <: BatchDisassociateClientDeviceFromCoreDeviceResponse](x: Self) {
    
    inline def setErrorEntries(value: DisassociateClientDeviceFromCoreDeviceErrorList): Self = StObject.set(x, "errorEntries", value.asInstanceOf[js.Any])
    
    inline def setErrorEntriesUndefined: Self = StObject.set(x, "errorEntries", js.undefined)
    
    inline def setErrorEntriesVarargs(value: DisassociateClientDeviceFromCoreDeviceErrorEntry*): Self = StObject.set(x, "errorEntries", js.Array(value*))
  }
}
