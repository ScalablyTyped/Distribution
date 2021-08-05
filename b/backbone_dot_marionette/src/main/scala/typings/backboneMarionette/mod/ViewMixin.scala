package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewMixin
  extends StObject
     with DomMixin
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
  
  inline def apply(
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
  
  extension [Self <: ViewMixin](x: Self) {
    
    inline def setBindUIElements(value: js.Any): Self = StObject.set(x, "bindUIElements", value.asInstanceOf[js.Any])
    
    inline def setChildViewEventPrefix(value: js.Any): Self = StObject.set(x, "childViewEventPrefix", value.asInstanceOf[js.Any])
    
    inline def setDelegateEntityEvents(value: js.Any): Self = StObject.set(x, "delegateEntityEvents", value.asInstanceOf[js.Any])
    
    inline def setDelegateEvents(value: js.Any): Self = StObject.set(x, "delegateEvents", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: js.Any): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setGetTriggers(value: js.Any): Self = StObject.set(x, "getTriggers", value.asInstanceOf[js.Any])
    
    inline def setIsAttached(value: js.Any): Self = StObject.set(x, "isAttached", value.asInstanceOf[js.Any])
    
    inline def setIsDestroyed(value: js.Any): Self = StObject.set(x, "isDestroyed", value.asInstanceOf[js.Any])
    
    inline def setIsRendered(value: js.Any): Self = StObject.set(x, "isRendered", value.asInstanceOf[js.Any])
    
    inline def setSupportsDestroyLifecycle(value: js.Any): Self = StObject.set(x, "supportsDestroyLifecycle", value.asInstanceOf[js.Any])
    
    inline def setSupportsRenderLifecycle(value: js.Any): Self = StObject.set(x, "supportsRenderLifecycle", value.asInstanceOf[js.Any])
    
    inline def setTriggerMethod(value: js.Any): Self = StObject.set(x, "triggerMethod", value.asInstanceOf[js.Any])
    
    inline def setUnbindUIElements(value: js.Any): Self = StObject.set(x, "unbindUIElements", value.asInstanceOf[js.Any])
    
    inline def setUndelegateEntityEvents(value: js.Any): Self = StObject.set(x, "undelegateEntityEvents", value.asInstanceOf[js.Any])
  }
}
