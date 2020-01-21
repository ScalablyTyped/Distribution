package typings.combineSourceMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSource extends js.Object {
  var source: String
  var sourceFile: String
}

object AnonSource {
  @scala.inline
  def apply(source: String, sourceFile: String): AnonSource = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSource]
  }
}

