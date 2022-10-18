package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubBooleans.`false`
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError
import typings.chainsafeLibp2pGossipsub.distSrcUtilsBuildRawMessageMod.ValidationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorValid
  extends StObject
     with ValidationResult {
  
  var error: ValidateError
  
  var valid: `false`
}
object ErrorValid {
  
  inline def apply(error: ValidateError): ErrorValid = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], valid = false)
    __obj.asInstanceOf[ErrorValid]
  }
  
  extension [Self <: ErrorValid](x: Self) {
    
    inline def setError(value: ValidateError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setValid(value: `false`): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
