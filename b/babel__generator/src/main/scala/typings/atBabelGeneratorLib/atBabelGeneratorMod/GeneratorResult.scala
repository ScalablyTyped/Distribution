package typings
package atBabelGeneratorLib.atBabelGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratorResult extends js.Object {
  var code: java.lang.String
  var map: atBabelGeneratorLib.Anon_File | scala.Null
}

object GeneratorResult {
  @scala.inline
  def apply(code: java.lang.String, map: atBabelGeneratorLib.Anon_File = null): GeneratorResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    if (map != null) __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[GeneratorResult]
  }
}

