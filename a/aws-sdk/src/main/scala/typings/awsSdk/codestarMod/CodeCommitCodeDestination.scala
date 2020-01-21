package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeCommitCodeDestination extends js.Object {
  /**
    * The name of the AWS CodeCommit repository to be created in AWS CodeStar.
    */
  var name: RepositoryName = js.native
}

object CodeCommitCodeDestination {
  @scala.inline
  def apply(name: RepositoryName): CodeCommitCodeDestination = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CodeCommitCodeDestination]
  }
}

