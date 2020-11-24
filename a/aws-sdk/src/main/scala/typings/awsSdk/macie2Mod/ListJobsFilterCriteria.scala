package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsFilterCriteria extends js.Object {
  
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
  implicit class ListJobsFilterCriteriaOps[Self <: ListJobsFilterCriteria] (val x: Self) extends AnyVal {
    
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
    def setExcludesVarargs(value: ListJobsFilterTerm*): Self = this.set("excludes", js.Array(value :_*))
    
    @scala.inline
    def setExcludes(value: listOfListJobsFilterTerm): Self = this.set("excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludes: Self = this.set("excludes", js.undefined)
    
    @scala.inline
    def setIncludesVarargs(value: ListJobsFilterTerm*): Self = this.set("includes", js.Array(value :_*))
    
    @scala.inline
    def setIncludes(value: listOfListJobsFilterTerm): Self = this.set("includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludes: Self = this.set("includes", js.undefined)
  }
}
