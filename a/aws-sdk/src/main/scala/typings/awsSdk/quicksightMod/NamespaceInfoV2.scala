package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceInfoV2 extends js.Object {
  /**
    * The namespace ARN.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The namespace AWS Region.
    */
  var CapacityRegion: js.UndefOr[String] = js.native
  /**
    * The creation status of a namespace that is not yet completely created.
    */
  var CreationStatus: js.UndefOr[NamespaceStatus] = js.native
  /**
    * The identity store used for the namespace.
    */
  var IdentityStore: js.UndefOr[typings.awsSdk.quicksightMod.IdentityStore] = js.native
  /**
    * The name of the error.
    */
  var Name: js.UndefOr[Namespace] = js.native
  /**
    * An error that occured when the namespace was created.
    */
  var NamespaceError: js.UndefOr[typings.awsSdk.quicksightMod.NamespaceError] = js.native
}

object NamespaceInfoV2 {
  @scala.inline
  def apply(): NamespaceInfoV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceInfoV2]
  }
  @scala.inline
  implicit class NamespaceInfoV2Ops[Self <: NamespaceInfoV2] (val x: Self) extends AnyVal {
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
    def setNamespaceError(value: NamespaceError): Self = this.set("NamespaceError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceError: Self = this.set("NamespaceError", js.undefined)
  }
  
}

