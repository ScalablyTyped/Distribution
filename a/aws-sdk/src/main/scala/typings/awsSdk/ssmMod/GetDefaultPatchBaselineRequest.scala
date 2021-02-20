package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDefaultPatchBaselineRequest extends StObject {
  
  /**
    * Returns the default patch baseline for the specified operating system.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.ssmMod.OperatingSystem] = js.native
}
object GetDefaultPatchBaselineRequest {
  
  @scala.inline
  def apply(): GetDefaultPatchBaselineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDefaultPatchBaselineRequest]
  }
  
  @scala.inline
  implicit class GetDefaultPatchBaselineRequestMutableBuilder[Self <: GetDefaultPatchBaselineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
  }
}
