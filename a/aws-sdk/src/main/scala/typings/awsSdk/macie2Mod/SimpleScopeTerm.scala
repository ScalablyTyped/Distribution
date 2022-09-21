package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleScopeTerm extends StObject {
  
  /**
    * The operator to use in the condition. Valid values for each supported property (key) are: OBJECT_EXTENSION - EQ (equals) or NE (not equals) OBJECT_KEY - STARTS_WITH OBJECT_LAST_MODIFIED_DATE - Any operator except CONTAINS OBJECT_SIZE - Any operator except CONTAINS
    */
  var comparator: js.UndefOr[JobComparator] = js.undefined
  
  /**
    * The object property to use in the condition.
    */
  var key: js.UndefOr[ScopeFilterKey] = js.undefined
  
  /**
    * An array that lists the values to use in the condition. If the value for the key property is OBJECT_EXTENSION or OBJECT_KEY, this array can specify multiple values and Amazon Macie uses OR logic to join the values. Otherwise, this array can specify only one value. Valid values for each supported property (key) are: OBJECT_EXTENSION - A string that represents the file name extension of an object. For example: docx or pdf OBJECT_KEY - A string that represents the key prefix (folder name or path) of an object. For example: logs or awslogs/eventlogs. This value applies a condition to objects whose keys (names) begin with the specified value. OBJECT_LAST_MODIFIED_DATE - The date and time (in UTC and extended ISO 8601 format) when an object was created or last changed, whichever is latest. For example: 2020-09-28T14:31:13Z OBJECT_SIZE - An integer that represents the storage size (in bytes) of an object. Macie doesn't support use of wildcard characters in these values. Also, string values are case sensitive.
    */
  var values: js.UndefOr[listOfString] = js.undefined
}
object SimpleScopeTerm {
  
  inline def apply(): SimpleScopeTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleScopeTerm]
  }
  
  extension [Self <: SimpleScopeTerm](x: Self) {
    
    inline def setComparator(value: JobComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setKey(value: ScopeFilterKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValues(value: listOfString): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: string*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
