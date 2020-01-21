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
  def apply(namespaceArn: Arn = null, namespaceName: NamespaceName = null): DeleteNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    if (namespaceArn != null) __obj.updateDynamic("namespaceArn")(namespaceArn.asInstanceOf[js.Any])
    if (namespaceName != null) __obj.updateDynamic("namespaceName")(namespaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNamespaceResponse]
  }
}

