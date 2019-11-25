package typings.atBabelGenerator.atBabelGeneratorMod

import typings.atBabelGenerator.Anon_File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratorResult extends js.Object {
  var code: String
  var map: Anon_File | Null
}

object GeneratorResult {
  @scala.inline
  def apply(code: String, map: Anon_File = null): GeneratorResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratorResult]
  }
}

