package typings.backboneMarionette.mod

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
    val __obj = js.Dynamic.literal(appendChildren = appendChildren.asInstanceOf[js.Any], beforeEl = beforeEl.asInstanceOf[js.Any], bindEvents = bindEvents.asInstanceOf[js.Any], bindUIElements = bindUIElements.asInstanceOf[js.Any], childViewEventPrefix = childViewEventPrefix.asInstanceOf[js.Any], createBuffer = createBuffer.asInstanceOf[js.Any], delegateEntityEvents = delegateEntityEvents.asInstanceOf[js.Any], delegateEvents = delegateEvents.asInstanceOf[js.Any], destroy = destroy.asInstanceOf[js.Any], detachContents = detachContents.asInstanceOf[js.Any], detachEl = detachEl.asInstanceOf[js.Any], findEls = findEls.asInstanceOf[js.Any], getOption = getOption.asInstanceOf[js.Any], getTriggers = getTriggers.asInstanceOf[js.Any], isAttached = isAttached.asInstanceOf[js.Any], isDestroyed = isDestroyed.asInstanceOf[js.Any], isRendered = isRendered.asInstanceOf[js.Any], mergeOptions = mergeOptions.asInstanceOf[js.Any], normalizeMethods = normalizeMethods.asInstanceOf[js.Any], removeEl = removeEl.asInstanceOf[js.Any], replaceEl = replaceEl.asInstanceOf[js.Any], setInnerContent = setInnerContent.asInstanceOf[js.Any], supportsDestroyLifecycle = supportsDestroyLifecycle.asInstanceOf[js.Any], supportsRenderLifecycle = supportsRenderLifecycle.asInstanceOf[js.Any], triggerMethod = triggerMethod.asInstanceOf[js.Any], unbindEvents = unbindEvents.asInstanceOf[js.Any], unbindUIElements = unbindUIElements.asInstanceOf[js.Any], undelegateEntityEvents = undelegateEntityEvents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewMixin]
  }
}

