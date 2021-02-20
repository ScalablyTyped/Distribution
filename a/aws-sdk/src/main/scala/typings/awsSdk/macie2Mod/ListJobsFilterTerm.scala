package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsFilterTerm extends StObject {
  
  /**
    * The operator to use to filter the results.
    */
  var comparator: js.UndefOr[JobComparator] = js.native
  
  /**
    * The property to use to filter the results.
    */
  var key: js.UndefOr[ListJobsFilterKey] = js.native
  
  /**
    * An array that lists one or more values to use to filter the results.
    */
  var values: js.UndefOr[listOfString] = js.native
}
object ListJobsFilterTerm {
  
  @scala.inline
  def apply(): ListJobsFilterTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsFilterTerm]
  }
  
  @scala.inline
  implicit class ListJobsFilterTermMutableBuilder[Self <: ListJobsFilterTerm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: JobComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    @scala.inline
    def setKey(value: ListJobsFilterKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValues(value: listOfString): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: string*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
