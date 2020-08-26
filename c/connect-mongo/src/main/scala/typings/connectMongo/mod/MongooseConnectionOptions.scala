package typings.connectMongo.mod

import typings.mongoose.mod.Connection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongooseConnectionOptions extends DefaultOptions {
  var mongooseConnection: Connection_ = js.native
}

object MongooseConnectionOptions {
  @scala.inline
  def apply(mongooseConnection: Connection_): MongooseConnectionOptions = {
    val __obj = js.Dynamic.literal(mongooseConnection = mongooseConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongooseConnectionOptions]
  }
  @scala.inline
  implicit class MongooseConnectionOptionsOps[Self <: MongooseConnectionOptions] (val x: Self) extends AnyVal {
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
    def setMongooseConnection(value: Connection_): Self = this.set("mongooseConnection", value.asInstanceOf[js.Any])
  }
  
}

