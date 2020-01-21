package typings.axeCore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFail extends js.Object {
  var fail: String
  var incomplete: String | StringDictionary[String]
  var pass: String
}

object AnonFail {
  @scala.inline
  def apply(fail: String, incomplete: String | StringDictionary[String], pass: String): AnonFail = {
    val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFail]
  }
}

