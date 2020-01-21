package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNotebookInstanceLifecycleConfigsOutput extends js.Object {
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To get the next set of lifecycle configurations, use it in the next request. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * An array of NotebookInstanceLifecycleConfiguration objects, each listing a lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigs: js.UndefOr[NotebookInstanceLifecycleConfigSummaryList] = js.native
}

object ListNotebookInstanceLifecycleConfigsOutput {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    NotebookInstanceLifecycleConfigs: NotebookInstanceLifecycleConfigSummaryList = null
  ): ListNotebookInstanceLifecycleConfigsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (NotebookInstanceLifecycleConfigs != null) __obj.updateDynamic("NotebookInstanceLifecycleConfigs")(NotebookInstanceLifecycleConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNotebookInstanceLifecycleConfigsOutput]
  }
}

