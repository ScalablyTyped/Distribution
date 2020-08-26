package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingTypeProperties extends js.Object {
  /**
    * A list of searchable thing attribute names.
    */
  var searchableAttributes: js.UndefOr[SearchableAttributes] = js.native
  /**
    * The description of the thing type.
    */
  var thingTypeDescription: js.UndefOr[ThingTypeDescription] = js.native
}

object ThingTypeProperties {
  @scala.inline
  def apply(): ThingTypeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingTypeProperties]
  }
  @scala.inline
  implicit class ThingTypePropertiesOps[Self <: ThingTypeProperties] (val x: Self) extends AnyVal {
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
    def setSearchableAttributesVarargs(value: AttributeName*): Self = this.set("searchableAttributes", js.Array(value :_*))
    @scala.inline
    def setSearchableAttributes(value: SearchableAttributes): Self = this.set("searchableAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchableAttributes: Self = this.set("searchableAttributes", js.undefined)
    @scala.inline
    def setThingTypeDescription(value: ThingTypeDescription): Self = this.set("thingTypeDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingTypeDescription: Self = this.set("thingTypeDescription", js.undefined)
  }
  
}

