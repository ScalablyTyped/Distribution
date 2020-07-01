package typings.creativebulmaBulmaTagsinput.mod

import typings.creativebulmaBulmaTagsinput.anon.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulmaTagsInputEventMap extends js.Object {
  /**
    * Triggered once a tag has been added. The added item and the related tag are passed in an object as
    * parameter.
    */
  @JSName("after.add")
  var afterDotadd: Item
  /**
    * Triggered after flushing items.
    */
  @JSName("after.flush")
  var afterDotflush: js.Array[String | BulmaTagsInputItem]
  /**
    * Triggered once a tag has been removed. The removed item is passed as parameter.
    */
  @JSName("after.remove")
  var afterDotremove: String | BulmaTagsInputItem
  /**
    * Triggered once an item has been selected. The concerned item and related tag are passed in
    * an Object as parameter.
    */
  @JSName("after.select")
  var afterDotselect: Item
  /**
    * Triggered once an item has been unselected. The concerned item and related tag are passed in
    * an Object as parameter.
    */
  @JSName("after.unselect")
  var afterDotunselect: Item
  /**
    * Trigerred before adding new tag. The concerned item is passed as parameter. You can modify the item
    * before its treatment by returning the new item data or prevent tag to be added by returning false.
    */
  @JSName("before.add")
  var beforeDotadd: String | BulmaTagsInputItem
  /**
    * Triggered before flushing items. Items array is passed as parameter.
    */
  @JSName("before.flush")
  var beforeDotflush: js.Array[String | BulmaTagsInputItem]
  /**
    * Triggered before removing a tag. The concerned item is passed as parameter. You can prevent
    * deletion by returning `false`.
    */
  @JSName("before.remove")
  var beforeDotremove: String | BulmaTagsInputItem
  /**
    * Triggered before selecting an item. The concerned item and related tag are passed in an
    * Object as parameter.
    */
  @JSName("before.select")
  var beforeDotselect: Item
  /**
    * Triggered before unselect an item. The concerned item and related tag are passed in an Object
    * as parameter.
    */
  @JSName("before.unselect")
  var beforeDotunselect: Item
}

object BulmaTagsInputEventMap {
  @scala.inline
  def apply(
    afterDotadd: Item,
    afterDotflush: js.Array[String | BulmaTagsInputItem],
    afterDotremove: String | BulmaTagsInputItem,
    afterDotselect: Item,
    afterDotunselect: Item,
    beforeDotadd: String | BulmaTagsInputItem,
    beforeDotflush: js.Array[String | BulmaTagsInputItem],
    beforeDotremove: String | BulmaTagsInputItem,
    beforeDotselect: Item,
    beforeDotunselect: Item
  ): BulmaTagsInputEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after.add")(afterDotadd.asInstanceOf[js.Any])
    __obj.updateDynamic("after.flush")(afterDotflush.asInstanceOf[js.Any])
    __obj.updateDynamic("after.remove")(afterDotremove.asInstanceOf[js.Any])
    __obj.updateDynamic("after.select")(afterDotselect.asInstanceOf[js.Any])
    __obj.updateDynamic("after.unselect")(afterDotunselect.asInstanceOf[js.Any])
    __obj.updateDynamic("before.add")(beforeDotadd.asInstanceOf[js.Any])
    __obj.updateDynamic("before.flush")(beforeDotflush.asInstanceOf[js.Any])
    __obj.updateDynamic("before.remove")(beforeDotremove.asInstanceOf[js.Any])
    __obj.updateDynamic("before.select")(beforeDotselect.asInstanceOf[js.Any])
    __obj.updateDynamic("before.unselect")(beforeDotunselect.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulmaTagsInputEventMap]
  }
}

