package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostnameSuggestionRequest extends js.Object {
  /**
    * The layer ID.
    */
  var LayerId: String = js.native
}

object GetHostnameSuggestionRequest {
  @scala.inline
  def apply(LayerId: String): GetHostnameSuggestionRequest = {
    val __obj = js.Dynamic.literal(LayerId = LayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostnameSuggestionRequest]
  }
}

