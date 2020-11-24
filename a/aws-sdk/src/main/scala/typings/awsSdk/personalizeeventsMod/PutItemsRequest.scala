package typings.awsSdk.personalizeeventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutItemsRequest extends js.Object {
  
  /**
    * The Amazon Resource Number (ARN) of the Items dataset you are adding the item or items to.
    */
  var datasetArn: Arn = js.native
  
  /**
    * A list of item data.
    */
  var items: ItemList = js.native
}
object PutItemsRequest {
  
  @scala.inline
  def apply(datasetArn: Arn, items: ItemList): PutItemsRequest = {
    val __obj = js.Dynamic.literal(datasetArn = datasetArn.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutItemsRequest]
  }
  
  @scala.inline
  implicit class PutItemsRequestOps[Self <: PutItemsRequest] (val x: Self) extends AnyVal {
    
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
    def setDatasetArn(value: Arn): Self = this.set("datasetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: ItemList): Self = this.set("items", value.asInstanceOf[js.Any])
  }
}
