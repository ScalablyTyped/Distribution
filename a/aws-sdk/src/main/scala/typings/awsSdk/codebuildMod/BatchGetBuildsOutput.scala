package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetBuildsOutput extends js.Object {
  /**
    * Information about the requested builds.
    */
  var builds: js.UndefOr[Builds] = js.native
  /**
    * The IDs of builds for which information could not be found.
    */
  var buildsNotFound: js.UndefOr[BuildIds] = js.native
}

object BatchGetBuildsOutput {
  @scala.inline
  def apply(): BatchGetBuildsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetBuildsOutput]
  }
  @scala.inline
  implicit class BatchGetBuildsOutputOps[Self <: BatchGetBuildsOutput] (val x: Self) extends AnyVal {
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
    def setBuildsVarargs(value: Build*): Self = this.set("builds", js.Array(value :_*))
    @scala.inline
    def setBuilds(value: Builds): Self = this.set("builds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuilds: Self = this.set("builds", js.undefined)
    @scala.inline
    def setBuildsNotFoundVarargs(value: NonEmptyString*): Self = this.set("buildsNotFound", js.Array(value :_*))
    @scala.inline
    def setBuildsNotFound(value: BuildIds): Self = this.set("buildsNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildsNotFound: Self = this.set("buildsNotFound", js.undefined)
  }
  
}

