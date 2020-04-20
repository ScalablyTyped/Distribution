package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBuiltinIntentRequest extends js.Object {
  /**
    * The unique identifier for a built-in intent. To find the signature for an intent, see Standard Built-in Intents in the Alexa Skills Kit.
    */
  var signature: BuiltinIntentSignature = js.native
}

object GetBuiltinIntentRequest {
  @scala.inline
  def apply(signature: BuiltinIntentSignature): GetBuiltinIntentRequest = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBuiltinIntentRequest]
  }
}

