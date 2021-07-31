package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapFilter extends StObject {
  
  /**
    * The condition to apply to the key value when querying for findings with a map filter. To search for values that exactly match the filter value, use EQUALS. For example, for the ResourceTags field, the filter Department EQUALS Security matches findings that have the value Security for the tag Department. To search for values other than the filter value, use NOT_EQUALS. For example, for the ResourceTags field, the filter Department NOT_EQUALS Finance matches findings that do not have the value Finance for the tag Department.  EQUALS filters on the same field are joined by OR. A finding matches if it matches any one of those filters.  NOT_EQUALS filters on the same field are joined by AND. A finding matches only if it matches all of those filters. You cannot have both an EQUALS filter and a NOT_EQUALS filter on the same field.
    */
  var Comparison: js.UndefOr[MapFilterComparison] = js.undefined
  
  /**
    * The key of the map filter. For example, for ResourceTags, Key identifies the name of the tag. For UserDefinedFields, Key is the name of the field.
    */
  var Key: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The value for the key in the map filter. Filter values are case sensitive. For example, one of the values for a tag called Department might be Security. If you provide security as the filter value, then there is no match.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object MapFilter {
  
  @scala.inline
  def apply(): MapFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapFilter]
  }
  
  @scala.inline
  implicit class MapFilterMutableBuilder[Self <: MapFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparison(value: MapFilterComparison): Self = StObject.set(x, "Comparison", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonUndefined: Self = StObject.set(x, "Comparison", js.undefined)
    
    @scala.inline
    def setKey(value: NonEmptyString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
