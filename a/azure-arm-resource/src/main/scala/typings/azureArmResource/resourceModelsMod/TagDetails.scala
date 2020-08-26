package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagDetails extends js.Object {
  /**
    * The total number of resources that use the resource tag. When a tag is initially created and
    * has no associated resources, the value is 0.
    */
  var count: js.UndefOr[TagCount] = js.native
  /**
    * The tag ID.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The tag name.
    */
  var tagName: js.UndefOr[String] = js.native
  /**
    * The list of tag values.
    */
  var values: js.UndefOr[js.Array[TagValue]] = js.native
}

object TagDetails {
  @scala.inline
  def apply(): TagDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagDetails]
  }
  @scala.inline
  implicit class TagDetailsOps[Self <: TagDetails] (val x: Self) extends AnyVal {
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
    def setCount(value: TagCount): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    @scala.inline
    def setValuesVarargs(value: TagValue*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[TagValue]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

