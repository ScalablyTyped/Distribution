package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsFilterCriteria extends StObject {
  
  /**
    * An array of objects, one for each condition that determines which jobs to exclude from the results.
    */
  var excludes: js.UndefOr[listOfListJobsFilterTerm] = js.native
  
  /**
    * An array of objects, one for each condition that determines which jobs to include in the results.
    */
  var includes: js.UndefOr[listOfListJobsFilterTerm] = js.native
}
object ListJobsFilterCriteria {
  
  @scala.inline
  def apply(): ListJobsFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsFilterCriteria]
  }
  
  @scala.inline
  implicit class ListJobsFilterCriteriaMutableBuilder[Self <: ListJobsFilterCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludes(value: listOfListJobsFilterTerm): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    @scala.inline
    def setExcludesVarargs(value: ListJobsFilterTerm*): Self = StObject.set(x, "excludes", js.Array(value :_*))
    
    @scala.inline
    def setIncludes(value: listOfListJobsFilterTerm): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
    
    @scala.inline
    def setIncludesVarargs(value: ListJobsFilterTerm*): Self = StObject.set(x, "includes", js.Array(value :_*))
  }
}
