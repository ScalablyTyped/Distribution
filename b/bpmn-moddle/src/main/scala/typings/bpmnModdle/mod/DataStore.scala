package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataStore extends ItemAwareElement {
  var capacity: Double = js.native
  var isUnlimited: Boolean = js.native
  var name: String = js.native
}

object DataStore {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    capacity: Double,
    dataState: DataState,
    id: String,
    isUnlimited: Boolean,
    itemSubjectRef: ItemDefinition,
    name: String
  ): DataStore = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isUnlimited = isUnlimited.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataStore]
  }
  @scala.inline
  implicit class DataStoreOps[Self <: DataStore] (val x: Self) extends AnyVal {
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
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsUnlimited(value: Boolean): Self = this.set("isUnlimited", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

