package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBuildBatchOutput extends js.Object {
  /**
    * An array of strings that contain the identifiers of the builds that were deleted.
    */
  var buildsDeleted: js.UndefOr[BuildIds] = js.native
  /**
    * An array of BuildNotDeleted objects that specify the builds that could not be deleted.
    */
  var buildsNotDeleted: js.UndefOr[BuildsNotDeleted] = js.native
  /**
    * The status code.
    */
  var statusCode: js.UndefOr[String] = js.native
}

object DeleteBuildBatchOutput {
  @scala.inline
  def apply(): DeleteBuildBatchOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBuildBatchOutput]
  }
  @scala.inline
  implicit class DeleteBuildBatchOutputOps[Self <: DeleteBuildBatchOutput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setStatusCode(value: String): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
  
}

