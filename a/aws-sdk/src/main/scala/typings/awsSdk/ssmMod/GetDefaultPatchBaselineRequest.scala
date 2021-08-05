package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDefaultPatchBaselineRequest extends StObject {
  
  /**
    * Returns the default patch baseline for the specified operating system.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.ssmMod.OperatingSystem] = js.undefined
}
object GetDefaultPatchBaselineRequest {
  
  inline def apply(): GetDefaultPatchBaselineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDefaultPatchBaselineRequest]
  }
  
  extension [Self <: GetDefaultPatchBaselineRequest](x: Self) {
    
    inline def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
  }
}
