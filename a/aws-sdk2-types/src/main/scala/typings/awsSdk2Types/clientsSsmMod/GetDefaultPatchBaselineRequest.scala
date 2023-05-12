package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDefaultPatchBaselineRequest extends StObject {
  
  /**
    * Returns the default patch baseline for the specified operating system.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.OperatingSystem] = js.undefined
}
object GetDefaultPatchBaselineRequest {
  
  inline def apply(): GetDefaultPatchBaselineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDefaultPatchBaselineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDefaultPatchBaselineRequest] (val x: Self) extends AnyVal {
    
    inline def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
  }
}
