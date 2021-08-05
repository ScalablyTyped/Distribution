package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableFastSnapshotRestoreStateError extends StObject {
  
  /**
    * The error code.
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    * The error message.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object DisableFastSnapshotRestoreStateError {
  
  inline def apply(): DisableFastSnapshotRestoreStateError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableFastSnapshotRestoreStateError]
  }
  
  extension [Self <: DisableFastSnapshotRestoreStateError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
