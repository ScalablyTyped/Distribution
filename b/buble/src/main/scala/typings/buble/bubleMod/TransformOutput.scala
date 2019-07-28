package typings.buble.bubleMod

import typings.magicDashString.magicDashStringMod.SourceMap
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
    val __obj = js.Dynamic.literal(code = code, map = map)
  
    __obj.asInstanceOf[TransformOutput]
  }
}

