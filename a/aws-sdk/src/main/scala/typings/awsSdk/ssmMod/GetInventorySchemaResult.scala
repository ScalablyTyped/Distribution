package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInventorySchemaResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Inventory schemas returned by the request.
    */
  var Schemas: js.UndefOr[InventoryItemSchemaResultList] = js.native
}

object GetInventorySchemaResult {
  @scala.inline
  def apply(): GetInventorySchemaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInventorySchemaResult]
  }
  @scala.inline
  implicit class GetInventorySchemaResultOps[Self <: GetInventorySchemaResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSchemasVarargs(value: InventoryItemSchema*): Self = this.set("Schemas", js.Array(value :_*))
    @scala.inline
    def setSchemas(value: InventoryItemSchemaResultList): Self = this.set("Schemas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemas: Self = this.set("Schemas", js.undefined)
  }
  
}

