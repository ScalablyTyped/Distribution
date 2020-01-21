package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  /**
    * The repository to be created in AWS CodeStar. Valid values are AWS CodeCommit or GitHub. After AWS CodeStar provisions the new repository, the source code files provided with the project request are placed in the repository.
    */
  var destination: CodeDestination = js.native
  /**
    * The location where the source code files provided with the project request are stored. AWS CodeStar retrieves the files during project creation.
    */
  var source: CodeSource = js.native
}

object Code {
  @scala.inline
  def apply(destination: CodeDestination, source: CodeSource): Code = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Code]
  }
}

