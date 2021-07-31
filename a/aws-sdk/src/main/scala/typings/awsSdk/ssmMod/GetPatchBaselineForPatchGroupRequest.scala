package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPatchBaselineForPatchGroupRequest extends StObject {
  
  /**
    * Returns he operating system rule specified for patch groups using the patch baseline.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.ssmMod.OperatingSystem] = js.undefined
  
  /**
    * The name of the patch group whose patch baseline should be retrieved.
    */
  var PatchGroup: typings.awsSdk.ssmMod.PatchGroup
}
object GetPatchBaselineForPatchGroupRequest {
  
  @scala.inline
  def apply(PatchGroup: PatchGroup): GetPatchBaselineForPatchGroupRequest = {
    val __obj = js.Dynamic.literal(PatchGroup = PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatchBaselineForPatchGroupRequest]
  }
  
  @scala.inline
  implicit class GetPatchBaselineForPatchGroupRequestMutableBuilder[Self <: GetPatchBaselineForPatchGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
    
    @scala.inline
    def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
  }
}
