package typings.backboneDotMarionette.backboneDotMarionetteMod

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
    val __obj = js.Dynamic.literal(appendChildren = appendChildren, beforeEl = beforeEl, bindEvents = bindEvents, bindUIElements = bindUIElements, childViewEventPrefix = childViewEventPrefix, createBuffer = createBuffer, delegateEntityEvents = delegateEntityEvents, delegateEvents = delegateEvents, destroy = destroy, detachContents = detachContents, detachEl = detachEl, findEls = findEls, getOption = getOption, getTriggers = getTriggers, isAttached = isAttached, isDestroyed = isDestroyed, isRendered = isRendered, mergeOptions = mergeOptions, normalizeMethods = normalizeMethods, removeEl = removeEl, replaceEl = replaceEl, setInnerContent = setInnerContent, supportsDestroyLifecycle = supportsDestroyLifecycle, supportsRenderLifecycle = supportsRenderLifecycle, triggerMethod = triggerMethod, unbindEvents = unbindEvents, unbindUIElements = unbindUIElements, undelegateEntityEvents = undelegateEntityEvents)
  
    __obj.asInstanceOf[ViewMixin]
  }
}

