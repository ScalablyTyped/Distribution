package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNotebookInstanceLifecycleConfigInput extends js.Object {
  /**
    * The name of the lifecycle configuration to describe.
    */
  var NotebookInstanceLifecycleConfigName: typings.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigName = js.native
}

object DescribeNotebookInstanceLifecycleConfigInput {
  @scala.inline
  def apply(NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName): DescribeNotebookInstanceLifecycleConfigInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotebookInstanceLifecycleConfigInput]
  }
}

