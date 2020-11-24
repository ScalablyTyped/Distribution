package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteBuildsOutput extends js.Object {
  
  /**
    * The IDs of the builds that were successfully deleted.
    */
  var buildsDeleted: js.UndefOr[BuildIds] = js.native
  
  /**
    * Information about any builds that could not be successfully deleted.
    */
  var buildsNotDeleted: js.UndefOr[BuildsNotDeleted] = js.native
}
object BatchDeleteBuildsOutput {
  
  @scala.inline
  def apply(): BatchDeleteBuildsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteBuildsOutput]
  }
  
  @scala.inline
  implicit class BatchDeleteBuildsOutputOps[Self <: BatchDeleteBuildsOutput] (val x: Self) extends AnyVal {
    
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
    def setBuildsDeletedVarargs(value: NonEmptyString*): Self = this.set("buildsDeleted", js.Array(value :_*))
    
    @scala.inline
    def setBuildsDeleted(value: BuildIds): Self = this.set("buildsDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildsDeleted: Self = this.set("buildsDeleted", js.undefined)
    
    @scala.inline
    def setBuildsNotDeletedVarargs(value: BuildNotDeleted*): Self = this.set("buildsNotDeleted", js.Array(value :_*))
    
    @scala.inline
    def setBuildsNotDeleted(value: BuildsNotDeleted): Self = this.set("buildsNotDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildsNotDeleted: Self = this.set("buildsNotDeleted", js.undefined)
  }
}
