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
  def apply(S3OutputPath: S3Uri): DebugHookConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugHookConfig]
  }
  @scala.inline
  implicit class DebugHookConfigOps[Self <: DebugHookConfig] (val x: Self) extends AnyVal {
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
    def setS3OutputPath(value: S3Uri): Self = this.set("S3OutputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollectionConfigurationsVarargs(value: CollectionConfiguration*): Self = this.set("CollectionConfigurations", js.Array(value :_*))
    @scala.inline
    def setCollectionConfigurations(value: CollectionConfigurations): Self = this.set("CollectionConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionConfigurations: Self = this.set("CollectionConfigurations", js.undefined)
    @scala.inline
    def setHookParameters(value: HookParameters): Self = this.set("HookParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHookParameters: Self = this.set("HookParameters", js.undefined)
    @scala.inline
    def setLocalPath(value: DirectoryPath): Self = this.set("LocalPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalPath: Self = this.set("LocalPath", js.undefined)
  }
  
}

