package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultRow extends StObject {
  
  /**
    * An array of objects that defines the field and field values that were used to group data in a result set that contains multiple results. This value is null if the data in a result set isn’t grouped.
    */
  var GroupedBys: ListOfResultRowValue
  
  /**
    * An array of objects that provides pre-aggregated values for a standard metric that applies to an application, campaign, or journey.
    */
  var Values: ListOfResultRowValue
}
object ResultRow {
  
  inline def apply(GroupedBys: ListOfResultRowValue, Values: ListOfResultRowValue): ResultRow = {
    val __obj = js.Dynamic.literal(GroupedBys = GroupedBys.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultRow]
  }
  
  extension [Self <: ResultRow](x: Self) {
    
    inline def setGroupedBys(value: ListOfResultRowValue): Self = StObject.set(x, "GroupedBys", value.asInstanceOf[js.Any])
    
    inline def setGroupedBysVarargs(value: ResultRowValue*): Self = StObject.set(x, "GroupedBys", js.Array(value :_*))
    
    inline def setValues(value: ListOfResultRowValue): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: ResultRowValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
