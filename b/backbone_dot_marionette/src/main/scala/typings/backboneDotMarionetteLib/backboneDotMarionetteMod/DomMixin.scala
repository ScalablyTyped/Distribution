package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomMixin extends js.Object {
  var appendChildren: js.Any
  var beforeEl: js.Any
  var createBuffer: js.Any
  var detachContents: js.Any
  var detachEl: js.Any
  var findEls: js.Any
  var removeEl: js.Any
  var replaceEl: js.Any
  var setInnerContent: js.Any
}

object DomMixin {
  @scala.inline
  def apply(
    appendChildren: js.Any,
    beforeEl: js.Any,
    createBuffer: js.Any,
    detachContents: js.Any,
    detachEl: js.Any,
    findEls: js.Any,
    removeEl: js.Any,
    replaceEl: js.Any,
    setInnerContent: js.Any
  ): DomMixin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendChildren")(appendChildren)
    __obj.updateDynamic("beforeEl")(beforeEl)
    __obj.updateDynamic("createBuffer")(createBuffer)
    __obj.updateDynamic("detachContents")(detachContents)
    __obj.updateDynamic("detachEl")(detachEl)
    __obj.updateDynamic("findEls")(findEls)
    __obj.updateDynamic("removeEl")(removeEl)
    __obj.updateDynamic("replaceEl")(replaceEl)
    __obj.updateDynamic("setInnerContent")(setInnerContent)
    __obj.asInstanceOf[DomMixin]
  }
}

