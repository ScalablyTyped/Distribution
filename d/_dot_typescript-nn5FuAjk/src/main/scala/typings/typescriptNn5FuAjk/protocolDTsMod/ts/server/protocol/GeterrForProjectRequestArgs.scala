package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for GeterrForProject request.
  */
trait GeterrForProjectRequestArgs extends StObject {
  
  /**
    * Delay in milliseconds to wait before starting to compute
    * errors for the files in the file list
    */
  var delay: Double
  
  /**
    * the file requesting project error list
    */
  var file: String
}
object GeterrForProjectRequestArgs {
  
  inline def apply(delay: Double, file: String): GeterrForProjectRequestArgs = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeterrForProjectRequestArgs]
  }
  
  extension [Self <: GeterrForProjectRequestArgs](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
