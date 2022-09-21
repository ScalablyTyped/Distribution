package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureOption extends StObject {
  
  /**
    * Specify the boundary of data to capture.
    */
  var CaptureMode: typings.awsSdk.sagemakerMod.CaptureMode
}
object CaptureOption {
  
  inline def apply(CaptureMode: CaptureMode): CaptureOption = {
    val __obj = js.Dynamic.literal(CaptureMode = CaptureMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureOption]
  }
  
  extension [Self <: CaptureOption](x: Self) {
    
    inline def setCaptureMode(value: CaptureMode): Self = StObject.set(x, "CaptureMode", value.asInstanceOf[js.Any])
  }
}
