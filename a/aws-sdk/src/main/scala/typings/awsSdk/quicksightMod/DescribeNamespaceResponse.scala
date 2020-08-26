package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNamespaceResponse extends js.Object {
  /**
    * The information about the namespace that you're describing. The response includes the namespace ARN, name, AWS Region, creation status, and identity store. DescribeNamespace also works for namespaces that are in the process of being created. For incomplete namespaces, this API lists the namespace error types and messages associated with the creation process.
    */
  var Namespace: js.UndefOr[NamespaceInfoV2] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
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
    def setNamespace(value: NamespaceInfoV2): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("Namespace", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

