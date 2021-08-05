package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerStorageMessage extends StObject {
  
  /**
    * The total amount of storage currently used for snapshots.
    */
  var TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * The total amount of storage currently provisioned.
    */
  var TotalProvisionedStorageInMegaBytes: js.UndefOr[Double] = js.undefined
}
object CustomerStorageMessage {
  
  inline def apply(): CustomerStorageMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerStorageMessage]
  }
  
  extension [Self <: CustomerStorageMessage](x: Self) {
    
    inline def setTotalBackupSizeInMegaBytes(value: Double): Self = StObject.set(x, "TotalBackupSizeInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalBackupSizeInMegaBytesUndefined: Self = StObject.set(x, "TotalBackupSizeInMegaBytes", js.undefined)
    
    inline def setTotalProvisionedStorageInMegaBytes(value: Double): Self = StObject.set(x, "TotalProvisionedStorageInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalProvisionedStorageInMegaBytesUndefined: Self = StObject.set(x, "TotalProvisionedStorageInMegaBytes", js.undefined)
  }
}
