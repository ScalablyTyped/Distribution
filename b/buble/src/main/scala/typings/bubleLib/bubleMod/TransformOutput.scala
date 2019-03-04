package typings
package bubleLib.bubleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOutput extends js.Object {
  var code: java.lang.String
  var map: magicDashStringLib.magicDashStringMod.SourceMap
}

object TransformOutput {
  @scala.inline
  def apply(code: java.lang.String, map: magicDashStringLib.magicDashStringMod.SourceMap): TransformOutput = {
    val __obj = js.Dynamic.literal(code = code, map = map)
  
    __obj.asInstanceOf[TransformOutput]
  }
}

