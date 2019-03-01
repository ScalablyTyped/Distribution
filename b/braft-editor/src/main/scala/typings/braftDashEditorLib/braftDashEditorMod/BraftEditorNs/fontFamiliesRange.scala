package typings
package braftDashEditorLib.braftDashEditorMod.BraftEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fontFamiliesRange extends js.Object {
  var family: java.lang.String
  var name: java.lang.String
}

object fontFamiliesRange {
  @scala.inline
  def apply(family: java.lang.String, name: java.lang.String): fontFamiliesRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("family")(family)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[fontFamiliesRange]
  }
}

