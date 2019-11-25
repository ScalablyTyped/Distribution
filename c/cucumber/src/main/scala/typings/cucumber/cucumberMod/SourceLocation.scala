package typings.cucumber.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var line: Double
  var uri: String
}

object SourceLocation {
  @scala.inline
  def apply(line: Double, uri: String): SourceLocation = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceLocation]
  }
}

