package typings
package detectDashCharacterDashEncodingLib.detectDashCharacterDashEncodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var confidence: scala.Double
  var encoding: java.lang.String
}

object Result {
  @scala.inline
  def apply(confidence: scala.Double, encoding: java.lang.String): Result = {
    val __obj = js.Dynamic.literal(confidence = confidence, encoding = encoding)
  
    __obj.asInstanceOf[Result]
  }
}

