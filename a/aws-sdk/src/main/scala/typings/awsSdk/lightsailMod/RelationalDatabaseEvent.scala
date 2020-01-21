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
  def apply(
    createdAt: IsoDate = null,
    eventCategories: StringList = null,
    message: String = null,
    resource: ResourceName = null
  ): RelationalDatabaseEvent = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (eventCategories != null) __obj.updateDynamic("eventCategories")(eventCategories.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalDatabaseEvent]
  }
}

