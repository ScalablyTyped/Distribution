package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConnectionInput extends js.Object {
  /**
    * The name of the connection to be created. The name must be unique in the calling AWS account.
    */
  var ConnectionName: typings.awsSdk.codestarconnectionsMod.ConnectionName = js.native
  /**
    * The Amazon Resource Name (ARN) of the host associated with the connection to be created.
    */
  var HostArn: js.UndefOr[typings.awsSdk.codestarconnectionsMod.HostArn] = js.native
  /**
    * The name of the external provider where your third-party code repository is configured. The valid provider type is Bitbucket.
    */
  var ProviderType: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ProviderType] = js.native
  /**
    * The key-value pair to use when tagging the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateConnectionInput {
  @scala.inline
  def apply(
    ConnectionName: ConnectionName,
    HostArn: HostArn = null,
    ProviderType: ProviderType = null,
    Tags: TagList = null
  ): CreateConnectionInput = {
    val __obj = js.Dynamic.literal(ConnectionName = ConnectionName.asInstanceOf[js.Any])
    if (HostArn != null) __obj.updateDynamic("HostArn")(HostArn.asInstanceOf[js.Any])
    if (ProviderType != null) __obj.updateDynamic("ProviderType")(ProviderType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionInput]
  }
}

