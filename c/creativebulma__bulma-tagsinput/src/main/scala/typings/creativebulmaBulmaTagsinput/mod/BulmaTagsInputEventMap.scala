package typings.creativebulmaBulmaTagsinput.mod

import typings.creativebulmaBulmaTagsinput.anon.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulmaTagsInputEventMap extends js.Object {
  /**
    * Triggered once a tag has been added. The added item and the related tag are passed in an object as
    * parameter.
    */
  @JSName("after.add")
  var afterDotadd: Item = js.native
  /**
    * Triggered after flushing items.
    */
  @JSName("after.flush")
  var afterDotflush: js.Array[String | BulmaTagsInputItem] = js.native
  /**
    * Triggered once a tag has been removed. The removed item is passed as parameter.
    */
  @JSName("after.remove")
  var afterDotremove: String | BulmaTagsInputItem = js.native
  /**
    * Triggered once an item has been selected. The concerned item and related tag are passed in
    * an Object as parameter.
    */
  @JSName("after.select")
  var afterDotselect: Item = js.native
  /**
    * Triggered once an item has been unselected. The concerned item and related tag are passed in
    * an Object as parameter.
    */
  @JSName("after.unselect")
  var afterDotunselect: Item = js.native
  /**
    * Trigerred before adding new tag. The concerned item is passed as parameter. You can modify the item
    * before its treatment by returning the new item data or prevent tag to be added by returning false.
    */
  @JSName("before.add")
  var beforeDotadd: String | BulmaTagsInputItem = js.native
  /**
    * Triggered before flushing items. Items array is passed as parameter.
    */
  @JSName("before.flush")
  var beforeDotflush: js.Array[String | BulmaTagsInputItem] = js.native
  /**
    * Triggered before removing a tag. The concerned item is passed as parameter. You can prevent
    * deletion by returning `false`.
    */
  @JSName("before.remove")
  var beforeDotremove: String | BulmaTagsInputItem = js.native
  /**
    * Triggered before selecting an item. The concerned item and related tag are passed in an
    * Object as parameter.
    */
  @JSName("before.select")
  var beforeDotselect: Item = js.native
  /**
    * Triggered before unselect an item. The concerned item and related tag are passed in an Object
    * as parameter.
    */
  @JSName("before.unselect")
  var beforeDotunselect: Item = js.native
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
  @scala.inline
  implicit class BulmaTagsInputEventMapOps[Self <: BulmaTagsInputEventMap] (val x: Self) extends AnyVal {
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
    def setAfterDotadd(value: Item): Self = this.set("after.add", value.asInstanceOf[js.Any])
    @scala.inline
    def setAfterDotflushVarargs(value: (String | BulmaTagsInputItem)*): Self = this.set("after.flush", js.Array(value :_*))
    @scala.inline
    def setAfterDotflush(value: js.Array[String | BulmaTagsInputItem]): Self = this.set("after.flush", value.asInstanceOf[js.Any])
    @scala.inline
    def setAfterDotremove(value: String | BulmaTagsInputItem): Self = this.set("after.remove", value.asInstanceOf[js.Any])
    @scala.inline
    def setAfterDotselect(value: Item): Self = this.set("after.select", value.asInstanceOf[js.Any])
    @scala.inline
    def setAfterDotunselect(value: Item): Self = this.set("after.unselect", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeDotadd(value: String | BulmaTagsInputItem): Self = this.set("before.add", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeDotflushVarargs(value: (String | BulmaTagsInputItem)*): Self = this.set("before.flush", js.Array(value :_*))
    @scala.inline
    def setBeforeDotflush(value: js.Array[String | BulmaTagsInputItem]): Self = this.set("before.flush", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeDotremove(value: String | BulmaTagsInputItem): Self = this.set("before.remove", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeDotselect(value: Item): Self = this.set("before.select", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeDotunselect(value: Item): Self = this.set("before.unselect", value.asInstanceOf[js.Any])
  }
  
}

