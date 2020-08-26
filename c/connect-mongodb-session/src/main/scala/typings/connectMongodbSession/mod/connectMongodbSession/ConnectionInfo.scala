package typings.connectMongodbSession.mod.connectMongodbSession

import typings.mongodb.mod.MongoClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionInfo extends js.Object {
  var collection: String = js.native
  var connectionOptions: js.UndefOr[MongoClientOptions] = js.native
  var databaseName: js.UndefOr[String] = js.native
  var expires: js.UndefOr[Double] = js.native
  var idField: js.UndefOr[String] = js.native
  var uri: String = js.native
}

object ConnectionInfo {
  @scala.inline
  def apply(collection: String, uri: String): ConnectionInfo = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInfo]
  }
  @scala.inline
  implicit class ConnectionInfoOps[Self <: ConnectionInfo] (val x: Self) extends AnyVal {
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
    def setCollection(value: String): Self = this.set("collection", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionOptions(value: MongoClientOptions): Self = this.set("connectionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionOptions: Self = this.set("connectionOptions", js.undefined)
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseName: Self = this.set("databaseName", js.undefined)
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setIdField(value: String): Self = this.set("idField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdField: Self = this.set("idField", js.undefined)
  }
  
}

