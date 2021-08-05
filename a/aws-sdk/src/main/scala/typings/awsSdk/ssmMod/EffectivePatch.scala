package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectivePatch extends StObject {
  
  /**
    * Provides metadata for a patch, including information such as the KB ID, severity, classification and a URL for where more information can be obtained about the patch.
    */
  var Patch: js.UndefOr[typings.awsSdk.ssmMod.Patch] = js.undefined
  
  /**
    * The status of the patch in a patch baseline. This includes information about whether the patch is currently approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date the patch was or will be approved.
    */
  var PatchStatus: js.UndefOr[typings.awsSdk.ssmMod.PatchStatus] = js.undefined
}
object EffectivePatch {
  
  inline def apply(): EffectivePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectivePatch]
  }
  
  extension [Self <: EffectivePatch](x: Self) {
    
    inline def setPatch(value: Patch): Self = StObject.set(x, "Patch", value.asInstanceOf[js.Any])
    
    inline def setPatchStatus(value: PatchStatus): Self = StObject.set(x, "PatchStatus", value.asInstanceOf[js.Any])
    
    inline def setPatchStatusUndefined: Self = StObject.set(x, "PatchStatus", js.undefined)
    
    inline def setPatchUndefined: Self = StObject.set(x, "Patch", js.undefined)
  }
}
