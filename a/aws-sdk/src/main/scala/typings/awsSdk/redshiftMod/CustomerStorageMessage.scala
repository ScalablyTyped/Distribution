package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerStorageMessage extends StObject {
  
  /**
    * The total amount of storage currently used for snapshots.
    */
  var TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.native
  
  /**
    * The total amount of storage currently provisioned.
    */
  var TotalProvisionedStorageInMegaBytes: js.UndefOr[Double] = js.native
}
object CustomerStorageMessage {
  
  @scala.inline
  def apply(): CustomerStorageMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerStorageMessage]
  }
  
  @scala.inline
  implicit class CustomerStorageMessageMutableBuilder[Self <: CustomerStorageMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotalBackupSizeInMegaBytes(value: Double): Self = StObject.set(x, "TotalBackupSizeInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBackupSizeInMegaBytesUndefined: Self = StObject.set(x, "TotalBackupSizeInMegaBytes", js.undefined)
    
    @scala.inline
    def setTotalProvisionedStorageInMegaBytes(value: Double): Self = StObject.set(x, "TotalProvisionedStorageInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalProvisionedStorageInMegaBytesUndefined: Self = StObject.set(x, "TotalProvisionedStorageInMegaBytes", js.undefined)
  }
}
