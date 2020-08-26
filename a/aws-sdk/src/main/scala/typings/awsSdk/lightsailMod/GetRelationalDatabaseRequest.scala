package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseRequest extends js.Object {
  /**
    * The name of the database that you are looking up.
    */
  var relationalDatabaseName: ResourceName = js.native
}

object GetRelationalDatabaseRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): GetRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseRequest]
  }
  @scala.inline
  implicit class GetRelationalDatabaseRequestOps[Self <: GetRelationalDatabaseRequest] (val x: Self) extends AnyVal {
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

