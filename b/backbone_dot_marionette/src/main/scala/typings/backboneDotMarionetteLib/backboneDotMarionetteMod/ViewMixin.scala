package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewMixin
  extends DomMixin
     with CommonMixin {
  var bindUIElements: js.Any
  var childViewEventPrefix: js.Any
  var delegateEntityEvents: js.Any
  var delegateEvents: js.Any
  var destroy: js.Any
  var getTriggers: js.Any
  var isAttached: js.Any
  var isDestroyed: js.Any
  var isRendered: js.Any
  var supportsDestroyLifecycle: js.Any
  var supportsRenderLifecycle: js.Any
  var triggerMethod: js.Any
  var unbindUIElements: js.Any
  var undelegateEntityEvents: js.Any
}

object ViewMixin {
  @scala.inline
  def apply(
    appendChildren: js.Any,
    beforeEl: js.Any,
    bindEvents: js.Any,
    bindUIElements: js.Any,
    childViewEventPrefix: js.Any,
    createBuffer: js.Any,
    delegateEntityEvents: js.Any,
    delegateEvents: js.Any,
    destroy: js.Any,
    detachContents: js.Any,
    detachEl: js.Any,
    findEls: js.Any,
    getOption: js.Any,
    getTriggers: js.Any,
    isAttached: js.Any,
    isDestroyed: js.Any,
    isRendered: js.Any,
    mergeOptions: js.Any,
    normalizeMethods: js.Any,
    removeEl: js.Any,
    replaceEl: js.Any,
    setInnerContent: js.Any,
    supportsDestroyLifecycle: js.Any,
    supportsRenderLifecycle: js.Any,
    triggerMethod: js.Any,
    unbindEvents: js.Any,
    unbindUIElements: js.Any,
    undelegateEntityEvents: js.Any
  ): ViewMixin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendChildren")(appendChildren)
    __obj.updateDynamic("beforeEl")(beforeEl)
    __obj.updateDynamic("bindEvents")(bindEvents)
    __obj.updateDynamic("bindUIElements")(bindUIElements)
    __obj.updateDynamic("childViewEventPrefix")(childViewEventPrefix)
    __obj.updateDynamic("createBuffer")(createBuffer)
    __obj.updateDynamic("delegateEntityEvents")(delegateEntityEvents)
    __obj.updateDynamic("delegateEvents")(delegateEvents)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("detachContents")(detachContents)
    __obj.updateDynamic("detachEl")(detachEl)
    __obj.updateDynamic("findEls")(findEls)
    __obj.updateDynamic("getOption")(getOption)
    __obj.updateDynamic("getTriggers")(getTriggers)
    __obj.updateDynamic("isAttached")(isAttached)
    __obj.updateDynamic("isDestroyed")(isDestroyed)
    __obj.updateDynamic("isRendered")(isRendered)
    __obj.updateDynamic("mergeOptions")(mergeOptions)
    __obj.updateDynamic("normalizeMethods")(normalizeMethods)
    __obj.updateDynamic("removeEl")(removeEl)
    __obj.updateDynamic("replaceEl")(replaceEl)
    __obj.updateDynamic("setInnerContent")(setInnerContent)
    __obj.updateDynamic("supportsDestroyLifecycle")(supportsDestroyLifecycle)
    __obj.updateDynamic("supportsRenderLifecycle")(supportsRenderLifecycle)
    __obj.updateDynamic("triggerMethod")(triggerMethod)
    __obj.updateDynamic("unbindEvents")(unbindEvents)
    __obj.updateDynamic("unbindUIElements")(unbindUIElements)
    __obj.updateDynamic("undelegateEntityEvents")(undelegateEntityEvents)
    __obj.asInstanceOf[ViewMixin]
  }
}

