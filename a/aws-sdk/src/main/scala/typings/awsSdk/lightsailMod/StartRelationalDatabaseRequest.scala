package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartRelationalDatabaseRequest extends js.Object {
  /**
    * The name of your database to start.
    */
  var relationalDatabaseName: ResourceName = js.native
}

object StartRelationalDatabaseRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): StartRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRelationalDatabaseRequest]
  }
  @scala.inline
  implicit class StartRelationalDatabaseRequestOps[Self <: StartRelationalDatabaseRequest] (val x: Self) extends AnyVal {
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
    def setRelationalDatabaseName(value: ResourceName): Self = this.set("relationalDatabaseName", value.asInstanceOf[js.Any])
  }
  
}

