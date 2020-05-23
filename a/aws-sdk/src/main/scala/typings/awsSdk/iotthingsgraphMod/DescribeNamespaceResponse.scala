package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNamespaceResponse extends js.Object {
  /**
    * The ARN of the namespace.
    */
  var namespaceArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the namespace.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.native
  /**
    * The version of the user's namespace to describe.
    */
  var namespaceVersion: js.UndefOr[Version] = js.native
  /**
    * The name of the public namespace that the latest namespace version is tracking.
    */
  var trackingNamespaceName: js.UndefOr[NamespaceName] = js.native
  /**
    * The version of the public namespace that the latest version is tracking.
    */
  var trackingNamespaceVersion: js.UndefOr[Version] = js.native
}

object DescribeNamespaceResponse {
  @scala.inline
  def apply(
    namespaceArn: Arn = null,
    namespaceName: NamespaceName = null,
    namespaceVersion: js.UndefOr[Version] = js.undefined,
    trackingNamespaceName: NamespaceName = null,
    trackingNamespaceVersion: js.UndefOr[Version] = js.undefined
  ): DescribeNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    if (namespaceArn != null) __obj.updateDynamic("namespaceArn")(namespaceArn.asInstanceOf[js.Any])
    if (namespaceName != null) __obj.updateDynamic("namespaceName")(namespaceName.asInstanceOf[js.Any])
    if (!js.isUndefined(namespaceVersion)) __obj.updateDynamic("namespaceVersion")(namespaceVersion.get.asInstanceOf[js.Any])
    if (trackingNamespaceName != null) __obj.updateDynamic("trackingNamespaceName")(trackingNamespaceName.asInstanceOf[js.Any])
    if (!js.isUndefined(trackingNamespaceVersion)) __obj.updateDynamic("trackingNamespaceVersion")(trackingNamespaceVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNamespaceResponse]
  }
}

