package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobScopingBlock extends js.Object {
  
  /**
    * An array of conditions, one for each condition that determines which objects to include or exclude from the job.
    */
  var and: js.UndefOr[listOfJobScopeTerm] = js.native
}
object JobScopingBlock {
  
  @scala.inline
  def apply(): JobScopingBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobScopingBlock]
  }
  
  @scala.inline
  implicit class JobScopingBlockOps[Self <: JobScopingBlock] (val x: Self) extends AnyVal {
    
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
    def setAndVarargs(value: JobScopeTerm*): Self = this.set("and", js.Array(value :_*))
    
    @scala.inline
    def setAnd(value: listOfJobScopeTerm): Self = this.set("and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnd: Self = this.set("and", js.undefined)
  }
}
