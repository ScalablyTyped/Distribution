package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastError extends StObject {
  
  /**
    * The error code for the VPC endpoint error.
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    * The error message for the VPC endpoint error.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object LastError {
  
  inline def apply(): LastError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastError]
  }
  
  extension [Self <: LastError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
