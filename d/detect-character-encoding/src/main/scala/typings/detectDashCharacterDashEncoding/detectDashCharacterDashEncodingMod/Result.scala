package typings.detectDashCharacterDashEncoding.detectDashCharacterDashEncodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var confidence: Double
  var encoding: String
}

object Result {
  @scala.inline
  def apply(confidence: Double, encoding: String): Result = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

