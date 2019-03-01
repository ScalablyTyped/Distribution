package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: babelDashTypesLib.Anon_Column
  var start: babelDashTypesLib.Anon_Column
}

object SourceLocation {
  @scala.inline
  def apply(end: babelDashTypesLib.Anon_Column, start: babelDashTypesLib.Anon_Column): SourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[SourceLocation]
  }
}

