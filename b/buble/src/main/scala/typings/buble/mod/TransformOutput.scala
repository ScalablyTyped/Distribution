package typings.buble.mod

import typings.magicString.mod.SourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOutput extends js.Object {
  var code: String
  var map: SourceMap
}

object TransformOutput {
  @scala.inline
  def apply(code: String, map: SourceMap): TransformOutput = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransformOutput]
  }
}

