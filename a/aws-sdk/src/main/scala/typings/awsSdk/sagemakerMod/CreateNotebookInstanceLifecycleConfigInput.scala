package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNotebookInstanceLifecycleConfigInput extends js.Object {
  /**
    * The name of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigName: typings.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigName = js.native
  /**
    * A shell script that runs only once, when you create a notebook instance. The shell script must be a base64-encoded string.
    */
  var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.native
  /**
    * A shell script that runs every time you start a notebook instance, including when you create the notebook instance. The shell script must be a base64-encoded string.
    */
  var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.native
}

object CreateNotebookInstanceLifecycleConfigInput {
  @scala.inline
  def apply(
    NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName,
    OnCreate: NotebookInstanceLifecycleConfigList = null,
    OnStart: NotebookInstanceLifecycleConfigList = null
  ): CreateNotebookInstanceLifecycleConfigInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any])
    if (OnCreate != null) __obj.updateDynamic("OnCreate")(OnCreate.asInstanceOf[js.Any])
    if (OnStart != null) __obj.updateDynamic("OnStart")(OnStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotebookInstanceLifecycleConfigInput]
  }
}

