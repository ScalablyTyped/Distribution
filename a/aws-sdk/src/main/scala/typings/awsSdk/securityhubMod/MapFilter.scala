package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapFilter extends js.Object {
  
  /**
    * The condition to apply to the key value when querying for findings with a map filter. To search for values that exactly match the filter value, use EQUALS. For example, for the ResourceTags field, the filter Department EQUALS Security matches findings that have the value Security for the tag Department. To search for values other than the filter value, use NOT_EQUALS. For example, for the ResourceTags field, the filter Department NOT_EQUALS Finance matches findings that do not have the value Finance for the tag Department.  EQUALS filters on the same field are joined by OR. A finding matches if it matches any one of those filters.  NOT_EQUALS filters on the same field are joined by AND. A finding matches only if it matches all of those filters. You cannot have both an EQUALS filter and a NOT_EQUALS filter on the same field.
    */
  var Comparison: js.UndefOr[MapFilterComparison] = js.native
  
  /**
    * The key of the map filter. For example, for ResourceTags, Key identifies the name of the tag. For UserDefinedFields, Key is the name of the field.
    */
  var Key: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The value for the key in the map filter. Filter values are case sensitive. For example, one of the values for a tag called Department might be Security. If you provide security as the filter value, then there is no match.
    */
  var Value: js.UndefOr[NonEmptyString] = js.native
}
object MapFilter {
  
  @scala.inline
  def apply(): MapFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapFilter]
  }
  
  @scala.inline
  implicit class MapFilterOps[Self <: MapFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComparison(value: MapFilterComparison): Self = this.set("Comparison", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparison: Self = this.set("Comparison", js.undefined)
    
    @scala.inline
    def setKey(value: NonEmptyString): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setValue(value: NonEmptyString): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
