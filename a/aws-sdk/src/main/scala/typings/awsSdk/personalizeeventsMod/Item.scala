package typings.awsSdk.personalizeeventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends js.Object {
  
  /**
    * The ID associated with the item.
    */
  var itemId: StringType = js.native
  
  /**
    * A string map of item-specific metadata. Each element in the map consists of a key-value pair. For example,   {"numberOfRatings": "12"}  The keys use camel case names that match the fields in the Items schema. In the above example, the numberOfRatings would match the 'NUMBER_OF_RATINGS' field defined in the Items schema.
    */
  var properties: js.UndefOr[ItemProperties] = js.native
}
object Item {
  
  @scala.inline
  def apply(itemId: StringType): Item = {
    val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    
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
    def setItemId(value: StringType): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: ItemProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
