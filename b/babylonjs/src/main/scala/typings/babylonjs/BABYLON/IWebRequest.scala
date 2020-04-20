package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebRequest extends js.Object {
  /**
    * Returns client's response url
    */
  var responseURL: String
  /**
    * Returns client's status
    */
  var status: Double
  /**
    * Returns client's status as a text
    */
  var statusText: String
}

object IWebRequest {
  @scala.inline
  def apply(responseURL: String, status: Double, statusText: String): IWebRequest = {
    val __obj = js.Dynamic.literal(responseURL = responseURL.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebRequest]
  }
}

