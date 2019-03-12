package typings
package chromeDashAppsLib.AppViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbedRequest extends js.Object {
  /** Optional developer specified data that the app to be embedded can use when making an embedding decision. */
  var data: js.UndefOr[js.Any] = js.undefined
  /** The ID of the app that sent the embedding request. */
  var embedderId: java.lang.String
  /**
    * Allows the embedding request
    * @param url Specifies the content to be embedded.
    */
  def allow(url: java.lang.String): scala.Unit
  /** Prevents the embedding request */
  def deny(): scala.Unit
}

object EmbedRequest {
  @scala.inline
  def apply(
    allow: java.lang.String => scala.Unit,
    deny: () => scala.Unit,
    embedderId: java.lang.String,
    data: js.Any = null
  ): EmbedRequest = {
    val __obj = js.Dynamic.literal(allow = js.Any.fromFunction1(allow), deny = js.Any.fromFunction0(deny), embedderId = embedderId)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[EmbedRequest]
  }
}

