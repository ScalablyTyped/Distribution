package typings.combineSourceMap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var source: String
  var sourceFile: String
}

object Source {
  @scala.inline
  def apply(source: String, sourceFile: String): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

