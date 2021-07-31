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
  
  @scala.inline
  def apply(PatchFilters: PatchFilterList): PatchFilterGroup = {
    val __obj = js.Dynamic.literal(PatchFilters = PatchFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchFilterGroup]
  }
  
  @scala.inline
  implicit class PatchFilterGroupMutableBuilder[Self <: PatchFilterGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPatchFilters(value: PatchFilterList): Self = StObject.set(x, "PatchFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchFiltersVarargs(value: PatchFilter*): Self = StObject.set(x, "PatchFilters", js.Array(value :_*))
  }
}
