package typings
package axeDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fail extends js.Object {
  var fail: java.lang.String
  var incomplete: java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var pass: java.lang.String
}

object Anon_Fail {
  @scala.inline
  def apply(
    fail: java.lang.String,
    incomplete: java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String],
    pass: java.lang.String
  ): Anon_Fail = {
    val __obj = js.Dynamic.literal(fail = fail, incomplete = incomplete.asInstanceOf[js.Any], pass = pass)
  
    __obj.asInstanceOf[Anon_Fail]
  }
}

