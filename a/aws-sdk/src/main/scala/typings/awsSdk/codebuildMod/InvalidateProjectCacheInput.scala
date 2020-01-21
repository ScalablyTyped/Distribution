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
}

