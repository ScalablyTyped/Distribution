package typings.backboneMarionette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewMixin
  extends DomMixin
     with CommonMixin {
  
  var bindUIElements: js.Any = js.native
  
  var childViewEventPrefix: js.Any = js.native
  
  var delegateEntityEvents: js.Any = js.native
  
  var delegateEvents: js.Any = js.native
  
  var destroy: js.Any = js.native
  
  var getTriggers: js.Any = js.native
  
  var isAttached: js.Any = js.native
  
  var isDestroyed: js.Any = js.native
  
  var isRendered: js.Any = js.native
  
  var supportsDestroyLifecycle: js.Any = js.native
  
  var supportsRenderLifecycle: js.Any = js.native
  
  var triggerMethod: js.Any = js.native
  
  var unbindUIElements: js.Any = js.native
  
  var undelegateEntityEvents: js.Any = js.native
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
  
  @scala.inline
  implicit class ViewMixinOps[Self <: ViewMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBindUIElements(value: js.Any): Self = this.set("bindUIElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildViewEventPrefix(value: js.Any): Self = this.set("childViewEventPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegateEntityEvents(value: js.Any): Self = this.set("delegateEntityEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegateEvents(value: js.Any): Self = this.set("delegateEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: js.Any): Self = this.set("destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTriggers(value: js.Any): Self = this.set("getTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAttached(value: js.Any): Self = this.set("isAttached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDestroyed(value: js.Any): Self = this.set("isDestroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRendered(value: js.Any): Self = this.set("isRendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsDestroyLifecycle(value: js.Any): Self = this.set("supportsDestroyLifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsRenderLifecycle(value: js.Any): Self = this.set("supportsRenderLifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerMethod(value: js.Any): Self = this.set("triggerMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnbindUIElements(value: js.Any): Self = this.set("unbindUIElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndelegateEntityEvents(value: js.Any): Self = this.set("undelegateEntityEvents", value.asInstanceOf[js.Any])
  }
}
