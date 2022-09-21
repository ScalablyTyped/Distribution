package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUOutOfMemoryError
  extends StObject
     with GPUError
object GPUOutOfMemoryError {
  
  inline def apply(message: String): GPUOutOfMemoryError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUOutOfMemoryError]
  }
}
