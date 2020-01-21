package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookInstanceLifecycleConfigSummary extends js.Object {
  /**
    * A timestamp that tells when the lifecycle configuration was created.
    */
  var CreationTime: js.UndefOr[typings.awsSdk.sagemakerMod.CreationTime] = js.native
  /**
    * A timestamp that tells when the lifecycle configuration was last modified.
    */
  var LastModifiedTime: js.UndefOr[typings.awsSdk.sagemakerMod.LastModifiedTime] = js.native
  /**
    * The Amazon Resource Name (ARN) of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigArn: typings.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigArn = js.native
  /**
    * The name of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigName: typings.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigName = js.native
}

object NotebookInstanceLifecycleConfigSummary {
  @scala.inline
  def apply(
    NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn,
    NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName,
    CreationTime: CreationTime = null,
    LastModifiedTime: LastModifiedTime = null
  ): NotebookInstanceLifecycleConfigSummary = {
    val __obj = js.Dynamic.literal(NotebookInstanceLifecycleConfigArn = NotebookInstanceLifecycleConfigArn.asInstanceOf[js.Any], NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookInstanceLifecycleConfigSummary]
  }
}

