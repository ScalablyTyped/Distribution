package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSlotTypeVersionsResponse extends js.Object {
  
  /**
    * A pagination token for fetching the next page of slot type versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * An array of SlotTypeMetadata objects, one for each numbered version of the slot type plus one for the $LATEST version.
    */
  var slotTypes: js.UndefOr[SlotTypeMetadataList] = js.native
}
object GetSlotTypeVersionsResponse {
  
  @scala.inline
  def apply(): GetSlotTypeVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSlotTypeVersionsResponse]
  }
  
  @scala.inline
  implicit class GetSlotTypeVersionsResponseOps[Self <: GetSlotTypeVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setSlotTypesVarargs(value: SlotTypeMetadata*): Self = this.set("slotTypes", js.Array(value :_*))
    
    @scala.inline
    def setSlotTypes(value: SlotTypeMetadataList): Self = this.set("slotTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotTypes: Self = this.set("slotTypes", js.undefined)
  }
}
