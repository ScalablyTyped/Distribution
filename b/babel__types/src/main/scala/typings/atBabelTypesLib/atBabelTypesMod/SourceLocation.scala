package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: atBabelTypesLib.Anon_Column
  var start: atBabelTypesLib.Anon_Column
}

object SourceLocation {
  @scala.inline
  def apply(end: atBabelTypesLib.Anon_Column, start: atBabelTypesLib.Anon_Column): SourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[SourceLocation]
  }
}

