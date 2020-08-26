package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalDatabaseEvent extends js.Object {
  /**
    * The timestamp when the database event was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * The category that the database event belongs to.
    */
  var eventCategories: js.UndefOr[StringList] = js.native
  /**
    * The message of the database event.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The database that the database event relates to.
    */
  var resource: js.UndefOr[ResourceName] = js.native
}

object RelationalDatabaseEvent {
  @scala.inline
  def apply(): RelationalDatabaseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseEvent]
  }
  @scala.inline
  implicit class RelationalDatabaseEventOps[Self <: RelationalDatabaseEvent] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setEventCategoriesVarargs(value: String*): Self = this.set("eventCategories", js.Array(value :_*))
    @scala.inline
    def setEventCategories(value: StringList): Self = this.set("eventCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventCategories: Self = this.set("eventCategories", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setResource(value: ResourceName): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
  
}

