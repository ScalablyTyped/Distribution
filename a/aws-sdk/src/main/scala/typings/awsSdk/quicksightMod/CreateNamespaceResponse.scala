package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNamespaceResponse extends js.Object {
  /**
    * The ARN of the QuickSight namespace you created. 
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The AWS Region that you want to use for the free SPICE capacity for the new namespace. This is set to the region that you run CreateNamespace in. 
    */
  var CapacityRegion: js.UndefOr[String] = js.native
  /**
    * The status of the creation of the namespace. This is an asynchronous process. A status of CREATED means that your namespace is ready to use. If an error occurs, it indicates if the process is retryable or non-retryable. In the case of a non-retryable error, refer to the error message for follow-up actions.
    */
  var CreationStatus: js.UndefOr[NamespaceStatus] = js.native
  /**
    * Specifies the type of your user identity directory. Currently, this supports users with an identity type of QUICKSIGHT.
    */
  var IdentityStore: js.UndefOr[typings.awsSdk.quicksightMod.IdentityStore] = js.native
  /**
    * The name of the new namespace that you created.
    */
  var Name: js.UndefOr[Namespace] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object CreateNamespaceResponse {
  @scala.inline
  def apply(): CreateNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNamespaceResponse]
  }
  @scala.inline
  implicit class CreateNamespaceResponseOps[Self <: CreateNamespaceResponse] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCapacityRegion(value: String): Self = this.set("CapacityRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityRegion: Self = this.set("CapacityRegion", js.undefined)
    @scala.inline
    def setCreationStatus(value: NamespaceStatus): Self = this.set("CreationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationStatus: Self = this.set("CreationStatus", js.undefined)
    @scala.inline
    def setIdentityStore(value: IdentityStore): Self = this.set("IdentityStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityStore: Self = this.set("IdentityStore", js.undefined)
    @scala.inline
    def setName(value: Namespace): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
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

