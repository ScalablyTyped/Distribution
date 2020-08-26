package typings.connectMongo.mod

import typings.mongoose.mod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoUrlOptions extends DefaultOptions {
  var mongoOptions: js.UndefOr[ConnectionOptions] = js.native
  var url: String = js.native
}

object MongoUrlOptions {
  @scala.inline
  def apply(url: String): MongoUrlOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoUrlOptions]
  }
  @scala.inline
  implicit class MongoUrlOptionsOps[Self <: MongoUrlOptions] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setMongoOptions(value: ConnectionOptions): Self = this.set("mongoOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMongoOptions: Self = this.set("mongoOptions", js.undefined)
  }
  
}

