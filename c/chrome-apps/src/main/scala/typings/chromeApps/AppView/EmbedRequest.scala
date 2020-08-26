package typings.chromeApps.AppView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmbedRequest extends js.Object {
  /** Optional developer specified data that the app to be embedded can use when making an embedding decision. */
  var data: js.UndefOr[js.Any] = js.native
  /** The ID of the app that sent the embedding request. */
  var embedderId: String = js.native
  /**
    * Allows the embedding request
    * @param url Specifies the content to be embedded.
    */
  def allow(url: String): Unit = js.native
  /** Prevents the embedding request */
  def deny(): Unit = js.native
}

object EmbedRequest {
  @scala.inline
  def apply(allow: String => Unit, deny: () => Unit, embedderId: String): EmbedRequest = {
    val __obj = js.Dynamic.literal(allow = js.Any.fromFunction1(allow), deny = js.Any.fromFunction0(deny), embedderId = embedderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbedRequest]
  }
  @scala.inline
  implicit class EmbedRequestOps[Self <: EmbedRequest] (val x: Self) extends AnyVal {
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
    def setAllow(value: String => Unit): Self = this.set("allow", js.Any.fromFunction1(value))
    @scala.inline
    def setDeny(value: () => Unit): Self = this.set("deny", js.Any.fromFunction0(value))
    @scala.inline
    def setEmbedderId(value: String): Self = this.set("embedderId", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

