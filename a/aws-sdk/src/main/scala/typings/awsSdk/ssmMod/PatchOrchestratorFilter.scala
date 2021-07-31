package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchOrchestratorFilter extends StObject {
  
  /**
    * The key for the filter.
    */
  var Key: js.UndefOr[PatchOrchestratorFilterKey] = js.undefined
  
  /**
    * The value for the filter.
    */
  var Values: js.UndefOr[PatchOrchestratorFilterValues] = js.undefined
}
object PatchOrchestratorFilter {
  
  @scala.inline
  def apply(): PatchOrchestratorFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchOrchestratorFilter]
  }
  
  @scala.inline
  implicit class PatchOrchestratorFilterMutableBuilder[Self <: PatchOrchestratorFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: PatchOrchestratorFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValues(value: PatchOrchestratorFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: PatchOrchestratorFilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
