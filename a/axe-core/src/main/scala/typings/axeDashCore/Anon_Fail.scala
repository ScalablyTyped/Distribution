package typings.axeDashCore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fail extends js.Object {
  var fail: String
  var incomplete: String | StringDictionary[String]
  var pass: String
}

object Anon_Fail {
  @scala.inline
  def apply(fail: String, incomplete: String | StringDictionary[String], pass: String): Anon_Fail = {
    val __obj = js.Dynamic.literal(fail = fail, incomplete = incomplete.asInstanceOf[js.Any], pass = pass)
  
    __obj.asInstanceOf[Anon_Fail]
  }
}

