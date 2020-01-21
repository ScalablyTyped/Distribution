package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugHookConfig extends js.Object {
  /**
    * Configuration information for tensor collections.
    */
  var CollectionConfigurations: js.UndefOr[typings.awsSdk.sagemakerMod.CollectionConfigurations] = js.native
  /**
    * Configuration information for the debug hook parameters.
    */
  var HookParameters: js.UndefOr[typings.awsSdk.sagemakerMod.HookParameters] = js.native
  /**
    * Path to local storage location for tensors. Defaults to /opt/ml/output/tensors/.
    */
  var LocalPath: js.UndefOr[DirectoryPath] = js.native
  /**
    * Path to Amazon S3 storage location for tensors.
    */
  var S3OutputPath: S3Uri = js.native
}

object DebugHookConfig {
  @scala.inline
  def apply(
    S3OutputPath: S3Uri,
    CollectionConfigurations: CollectionConfigurations = null,
    HookParameters: HookParameters = null,
    LocalPath: DirectoryPath = null
  ): DebugHookConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    if (CollectionConfigurations != null) __obj.updateDynamic("CollectionConfigurations")(CollectionConfigurations.asInstanceOf[js.Any])
    if (HookParameters != null) __obj.updateDynamic("HookParameters")(HookParameters.asInstanceOf[js.Any])
    if (LocalPath != null) __obj.updateDynamic("LocalPath")(LocalPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugHookConfig]
  }
}

