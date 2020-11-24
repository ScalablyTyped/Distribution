package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetCustomDataIdentifiersRequest extends js.Object {
  
  /**
    * An array of strings that lists the unique identifiers for the custom data identifiers to retrieve information about.
    */
  var ids: js.UndefOr[listOfString] = js.native
}
object BatchGetCustomDataIdentifiersRequest {
  
  @scala.inline
  def apply(): BatchGetCustomDataIdentifiersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetCustomDataIdentifiersRequest]
  }
  
  @scala.inline
  implicit class BatchGetCustomDataIdentifiersRequestOps[Self <: BatchGetCustomDataIdentifiersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdsVarargs(value: string*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: listOfString): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
  }
}
