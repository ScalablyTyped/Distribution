package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaultRootCauseService extends js.Object {
  /**
    * The account ID associated to the service.
    */
  var AccountId: js.UndefOr[String] = js.native
  /**
    * The path of root cause entities found on the service. 
    */
  var EntityPath: js.UndefOr[FaultRootCauseEntityPath] = js.native
  /**
    * A Boolean value indicating if the service is inferred from the trace.
    */
  var Inferred: js.UndefOr[NullableBoolean] = js.native
  /**
    * The service name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * A collection of associated service names.
    */
  var Names: js.UndefOr[ServiceNames] = js.native
  /**
    * The type associated to the service.
    */
  var Type: js.UndefOr[String] = js.native
}

object FaultRootCauseService {
  @scala.inline
  def apply(): FaultRootCauseService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaultRootCauseService]
  }
  @scala.inline
  implicit class FaultRootCauseServiceOps[Self <: FaultRootCauseService] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setEntityPathVarargs(value: FaultRootCauseEntity*): Self = this.set("EntityPath", js.Array(value :_*))
    @scala.inline
    def setEntityPath(value: FaultRootCauseEntityPath): Self = this.set("EntityPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityPath: Self = this.set("EntityPath", js.undefined)
    @scala.inline
    def setInferred(value: NullableBoolean): Self = this.set("Inferred", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInferred: Self = this.set("Inferred", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("Names", js.Array(value :_*))
    @scala.inline
    def setNames(value: ServiceNames): Self = this.set("Names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("Names", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

