package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidateProjectCacheInput extends js.Object {
  /**
    * The name of the AWS CodeBuild build project that the cache is reset for.
    */
  var projectName: NonEmptyString = js.native
}

object InvalidateProjectCacheInput {
  @scala.inline
  def apply(projectName: NonEmptyString): InvalidateProjectCacheInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidateProjectCacheInput]
  }
  @scala.inline
  implicit class InvalidateProjectCacheInputOps[Self <: InvalidateProjectCacheInput] (val x: Self) extends AnyVal {
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
    def setProjectName(value: NonEmptyString): Self = this.set("projectName", value.asInstanceOf[js.Any])
  }
  
}

