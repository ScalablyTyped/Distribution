package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNamespaceResponse extends js.Object {
  /**
    * The ARN of the namespace to be deleted.
    */
  var namespaceArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the namespace to be deleted.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.native
}

object DeleteNamespaceResponse {
  @scala.inline
  def apply(): DeleteNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNamespaceResponse]
  }
  @scala.inline
  implicit class DeleteNamespaceResponseOps[Self <: DeleteNamespaceResponse] (val x: Self) extends AnyVal {
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
  }
  
}

