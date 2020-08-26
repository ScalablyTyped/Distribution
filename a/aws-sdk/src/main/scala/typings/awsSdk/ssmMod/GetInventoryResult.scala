package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInventoryResult extends js.Object {
  /**
    * Collection of inventory entities such as a collection of instance inventory. 
    */
  var Entities: js.UndefOr[InventoryResultEntityList] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object GetInventoryResult {
  @scala.inline
  def apply(): GetInventoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInventoryResult]
  }
  @scala.inline
  implicit class GetInventoryResultOps[Self <: GetInventoryResult] (val x: Self) extends AnyVal {
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
    def setEntitiesVarargs(value: InventoryResultEntity*): Self = this.set("Entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: InventoryResultEntityList): Self = this.set("Entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("Entities", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

