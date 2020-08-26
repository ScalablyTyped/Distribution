package typings.crumb.anon

import typings.crumb.crumbStrings.payload
import typings.crumb.crumbStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
  /**
    * The name of the cookie to store the CSRF crumb into.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Override for the server's 'restful' setting
    */
  var restful: js.UndefOr[Boolean] = js.native
  /**
    * Specifies how the crumb will be sent in requests.
    *
    * @default 'payload'
    */
  var source: js.UndefOr[payload | query] = js.native
}

object Key {
  @scala.inline
  def apply(): Key = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setRestful(value: Boolean): Self = this.set("restful", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestful: Self = this.set("restful", js.undefined)
    @scala.inline
    def setSource(value: payload | query): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

