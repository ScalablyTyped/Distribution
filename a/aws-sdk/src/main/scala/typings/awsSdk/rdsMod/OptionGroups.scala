package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionGroups extends StObject {
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * List of option groups.
    */
  var OptionGroupsList: js.UndefOr[typings.awsSdk.rdsMod.OptionGroupsList] = js.undefined
}
object OptionGroups {
  
  inline def apply(): OptionGroups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionGroups]
  }
  
  extension [Self <: OptionGroups](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setOptionGroupsList(value: OptionGroupsList): Self = StObject.set(x, "OptionGroupsList", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupsListUndefined: Self = StObject.set(x, "OptionGroupsList", js.undefined)
    
    inline def setOptionGroupsListVarargs(value: OptionGroup*): Self = StObject.set(x, "OptionGroupsList", js.Array(value :_*))
  }
}
