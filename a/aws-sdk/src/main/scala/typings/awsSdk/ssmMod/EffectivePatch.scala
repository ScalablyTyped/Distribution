package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectivePatch extends StObject {
  
  /**
    * Provides metadata for a patch, including information such as the KB ID, severity, classification and a URL for where more information can be obtained about the patch.
    */
  var Patch: js.UndefOr[typings.awsSdk.ssmMod.Patch] = js.native
  
  /**
    * The status of the patch in a patch baseline. This includes information about whether the patch is currently approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date the patch was or will be approved.
    */
  var PatchStatus: js.UndefOr[typings.awsSdk.ssmMod.PatchStatus] = js.native
}
object EffectivePatch {
  
  @scala.inline
  def apply(): EffectivePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectivePatch]
  }
  
  @scala.inline
  implicit class EffectivePatchMutableBuilder[Self <: EffectivePatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPatch(value: Patch): Self = StObject.set(x, "Patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchStatus(value: PatchStatus): Self = StObject.set(x, "PatchStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchStatusUndefined: Self = StObject.set(x, "PatchStatus", js.undefined)
    
    @scala.inline
    def setPatchUndefined: Self = StObject.set(x, "Patch", js.undefined)
  }
}
