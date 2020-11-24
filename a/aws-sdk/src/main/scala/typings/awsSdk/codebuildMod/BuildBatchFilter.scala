package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBatchFilter extends js.Object {
  
  /**
    * The status of the batch builds to retrieve. Only batch builds that have this status will be retrieved.
    */
  var status: js.UndefOr[StatusType] = js.native
}
object BuildBatchFilter {
  
  @scala.inline
  def apply(): BuildBatchFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBatchFilter]
  }
  
  @scala.inline
  implicit class BuildBatchFilterOps[Self <: BuildBatchFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStatus(value: StatusType): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
