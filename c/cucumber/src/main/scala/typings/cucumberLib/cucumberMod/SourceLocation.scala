package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var line: scala.Double
  var uri: java.lang.String
}

object SourceLocation {
  @scala.inline
  def apply(line: scala.Double, uri: java.lang.String): SourceLocation = {
    val __obj = js.Dynamic.literal(line = line, uri = uri)
  
    __obj.asInstanceOf[SourceLocation]
  }
}

