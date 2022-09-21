package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemFailureDetails extends StObject {
  
  /**
    * A message describing any failures that occurred.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
}
object FileSystemFailureDetails {
  
  inline def apply(): FileSystemFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemFailureDetails]
  }
  
  extension [Self <: FileSystemFailureDetails](x: Self) {
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
