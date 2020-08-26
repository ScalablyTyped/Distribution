package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAttributesActivity extends js.Object {
  /**
    * A list of 1-50 attributes to remove from the message.
    */
  var attributes: AttributeNames = js.native
  /**
    * The name of the 'removeAttributes' activity.
    */
  var name: ActivityName = js.native
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
}

object RemoveAttributesActivity {
  @scala.inline
  def apply(attributes: AttributeNames, name: ActivityName): RemoveAttributesActivity = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttributesActivity]
  }
  @scala.inline
  implicit class RemoveAttributesActivityOps[Self <: RemoveAttributesActivity] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: AttributeName*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: AttributeNames): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ActivityName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: ActivityName): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
  
}

