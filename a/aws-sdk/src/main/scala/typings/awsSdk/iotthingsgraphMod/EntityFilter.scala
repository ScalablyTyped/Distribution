package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityFilter extends js.Object {
  /**
    * The name of the entity search filter field. REFERENCED_ENTITY_ID filters on entities that are used by the entity in the result set. For example, you can filter on the ID of a property that is used in a state.
    */
  var name: js.UndefOr[EntityFilterName] = js.native
  /**
    * An array of string values for the search filter field. Multiple values function as AND criteria in the search.
    */
  var value: js.UndefOr[EntityFilterValues] = js.native
}

object EntityFilter {
  @scala.inline
  def apply(): EntityFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityFilter]
  }
  @scala.inline
  implicit class EntityFilterOps[Self <: EntityFilter] (val x: Self) extends AnyVal {
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
    def setName(value: EntityFilterName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValueVarargs(value: EntityFilterValue*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: EntityFilterValues): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

