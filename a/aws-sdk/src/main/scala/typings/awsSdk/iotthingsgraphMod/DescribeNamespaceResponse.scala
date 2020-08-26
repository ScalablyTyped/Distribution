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
  def apply(): DescribeNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNamespaceResponse]
  }
  @scala.inline
  implicit class DescribeNamespaceResponseOps[Self <: DescribeNamespaceResponse] (val x: Self) extends AnyVal {
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
    def setNamespaceArn(value: Arn): Self = this.set("namespaceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceArn: Self = this.set("namespaceArn", js.undefined)
    @scala.inline
    def setNamespaceName(value: NamespaceName): Self = this.set("namespaceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceName: Self = this.set("namespaceName", js.undefined)
    @scala.inline
    def setNamespaceVersion(value: Version): Self = this.set("namespaceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceVersion: Self = this.set("namespaceVersion", js.undefined)
    @scala.inline
    def setTrackingNamespaceName(value: NamespaceName): Self = this.set("trackingNamespaceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackingNamespaceName: Self = this.set("trackingNamespaceName", js.undefined)
    @scala.inline
    def setTrackingNamespaceVersion(value: Version): Self = this.set("trackingNamespaceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackingNamespaceVersion: Self = this.set("trackingNamespaceVersion", js.undefined)
  }
  
}

