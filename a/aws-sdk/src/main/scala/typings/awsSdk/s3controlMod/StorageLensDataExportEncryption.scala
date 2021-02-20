package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageLensDataExportEncryption extends StObject {
  
  /**
    * 
    */
  var SSEKMS: js.UndefOr[typings.awsSdk.s3controlMod.SSEKMS] = js.native
  
  /**
    * 
    */
  var SSES3: js.UndefOr[typings.awsSdk.s3controlMod.SSES3] = js.native
}
object StorageLensDataExportEncryption {
  
  @scala.inline
  def apply(): StorageLensDataExportEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageLensDataExportEncryption]
  }
  
  @scala.inline
  implicit class StorageLensDataExportEncryptionMutableBuilder[Self <: StorageLensDataExportEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSSEKMS(value: SSEKMS): Self = StObject.set(x, "SSEKMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSEKMSUndefined: Self = StObject.set(x, "SSEKMS", js.undefined)
    
    @scala.inline
    def setSSES3(value: SSES3): Self = StObject.set(x, "SSES3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSES3Undefined: Self = StObject.set(x, "SSES3", js.undefined)
  }
}
