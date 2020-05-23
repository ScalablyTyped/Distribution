package typings.axeCore.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fail extends js.Object {
  var fail: String
  var incomplete: String | StringDictionary[String]
  var pass: String
}

object Fail {
  @scala.inline
  def apply(fail: String, incomplete: String | StringDictionary[String], pass: String): Fail = {
    val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fail]
  }
}

