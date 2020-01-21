package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCodeRepositoryInput extends js.Object {
  /**
    * The name of the Git repository to describe.
    */
  var CodeRepositoryName: EntityName = js.native
}

object DescribeCodeRepositoryInput {
  @scala.inline
  def apply(CodeRepositoryName: EntityName): DescribeCodeRepositoryInput = {
    val __obj = js.Dynamic.literal(CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeCodeRepositoryInput]
  }
}

