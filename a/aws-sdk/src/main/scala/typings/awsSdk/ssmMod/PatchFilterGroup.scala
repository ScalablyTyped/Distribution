package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchFilterGroup extends StObject {
  
  /**
    * The set of patch filters that make up the group.
    */
  var PatchFilters: PatchFilterList
}
object PatchFilterGroup {
  
  inline def apply(PatchFilters: PatchFilterList): PatchFilterGroup = {
    val __obj = js.Dynamic.literal(PatchFilters = PatchFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchFilterGroup]
  }
  
  extension [Self <: PatchFilterGroup](x: Self) {
    
    inline def setPatchFilters(value: PatchFilterList): Self = StObject.set(x, "PatchFilters", value.asInstanceOf[js.Any])
    
    inline def setPatchFiltersVarargs(value: PatchFilter*): Self = StObject.set(x, "PatchFilters", js.Array(value :_*))
  }
}
