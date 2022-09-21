package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResourcesCriteriaBlock extends StObject {
  
  /**
    * An array of objects, one for each property- or tag-based condition that includes or excludes resources from the query results. If you specify more than one condition, Amazon Macie uses AND logic to join the conditions.
    */
  var and: js.UndefOr[listOfSearchResourcesCriteria] = js.undefined
}
object SearchResourcesCriteriaBlock {
  
  inline def apply(): SearchResourcesCriteriaBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResourcesCriteriaBlock]
  }
  
  extension [Self <: SearchResourcesCriteriaBlock](x: Self) {
    
    inline def setAnd(value: listOfSearchResourcesCriteria): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
    
    inline def setAndVarargs(value: SearchResourcesCriteria*): Self = StObject.set(x, "and", js.Array(value*))
  }
}
