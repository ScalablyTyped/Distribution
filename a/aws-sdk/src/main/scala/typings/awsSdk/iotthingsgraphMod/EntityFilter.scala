package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityFilter extends StObject {
  
  /**
    * The name of the entity search filter field. REFERENCED_ENTITY_ID filters on entities that are used by the entity in the result set. For example, you can filter on the ID of a property that is used in a state.
    */
  var name: js.UndefOr[EntityFilterName] = js.native
  
  /**
    * An array of string values for the search filter field. Multiple values function as AND criteria in the search.
    */
  var value: js.UndefOr[EntityFilterValues] = js.native
}
object EntityFilter {
  
  @scala.inline
  def apply(): EntityFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityFilter]
  }
  
  @scala.inline
  implicit class EntityFilterMutableBuilder[Self <: EntityFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: EntityFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: EntityFilterValues): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: EntityFilterValue*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
