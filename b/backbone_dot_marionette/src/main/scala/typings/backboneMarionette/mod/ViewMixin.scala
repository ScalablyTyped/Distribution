package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewMixin
  extends StObject
     with DomMixin
     with CommonMixin {
  
  var bindUIElements: Any
  
  var childViewEventPrefix: Any
  
  var delegateEntityEvents: Any
  
  var delegateEvents: Any
  
  var destroy: Any
  
  var getTriggers: Any
  
  var isAttached: Any
  
  var isDestroyed: Any
  
  var isRendered: Any
  
  var supportsDestroyLifecycle: Any
  
  var supportsRenderLifecycle: Any
  
  var triggerMethod: Any
  
  var unbindUIElements: Any
  
  var undelegateEntityEvents: Any
}
object ViewMixin {
  
  inline def apply(
    appendChildren: Any,
    beforeEl: Any,
    bindEvents: Any,
    bindUIElements: Any,
    childViewEventPrefix: Any,
    createBuffer: Any,
    delegateEntityEvents: Any,
    delegateEvents: Any,
    destroy: Any,
    detachContents: Any,
    detachEl: Any,
    findEls: Any,
    getOption: Any,
    getTriggers: Any,
    isAttached: Any,
    isDestroyed: Any,
    isRendered: Any,
    mergeOptions: Any,
    normalizeMethods: Any,
    removeEl: Any,
    replaceEl: Any,
    setInnerContent: Any,
    supportsDestroyLifecycle: Any,
    supportsRenderLifecycle: Any,
    triggerMethod: Any,
    unbindEvents: Any,
    unbindUIElements: Any,
    undelegateEntityEvents: Any
  ): ViewMixin = {
    val __obj = js.Dynamic.literal(appendChildren = appendChildren.asInstanceOf[js.Any], beforeEl = beforeEl.asInstanceOf[js.Any], bindEvents = bindEvents.asInstanceOf[js.Any], bindUIElements = bindUIElements.asInstanceOf[js.Any], childViewEventPrefix = childViewEventPrefix.asInstanceOf[js.Any], createBuffer = createBuffer.asInstanceOf[js.Any], delegateEntityEvents = delegateEntityEvents.asInstanceOf[js.Any], delegateEvents = delegateEvents.asInstanceOf[js.Any], destroy = destroy.asInstanceOf[js.Any], detachContents = detachContents.asInstanceOf[js.Any], detachEl = detachEl.asInstanceOf[js.Any], findEls = findEls.asInstanceOf[js.Any], getOption = getOption.asInstanceOf[js.Any], getTriggers = getTriggers.asInstanceOf[js.Any], isAttached = isAttached.asInstanceOf[js.Any], isDestroyed = isDestroyed.asInstanceOf[js.Any], isRendered = isRendered.asInstanceOf[js.Any], mergeOptions = mergeOptions.asInstanceOf[js.Any], normalizeMethods = normalizeMethods.asInstanceOf[js.Any], removeEl = removeEl.asInstanceOf[js.Any], replaceEl = replaceEl.asInstanceOf[js.Any], setInnerContent = setInnerContent.asInstanceOf[js.Any], supportsDestroyLifecycle = supportsDestroyLifecycle.asInstanceOf[js.Any], supportsRenderLifecycle = supportsRenderLifecycle.asInstanceOf[js.Any], triggerMethod = triggerMethod.asInstanceOf[js.Any], unbindEvents = unbindEvents.asInstanceOf[js.Any], unbindUIElements = unbindUIElements.asInstanceOf[js.Any], undelegateEntityEvents = undelegateEntityEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewMixin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewMixin] (val x: Self) extends AnyVal {
    
    inline def setBindUIElements(value: Any): Self = StObject.set(x, "bindUIElements", value.asInstanceOf[js.Any])
    
    inline def setChildViewEventPrefix(value: Any): Self = StObject.set(x, "childViewEventPrefix", value.asInstanceOf[js.Any])
    
    inline def setDelegateEntityEvents(value: Any): Self = StObject.set(x, "delegateEntityEvents", value.asInstanceOf[js.Any])
    
    inline def setDelegateEvents(value: Any): Self = StObject.set(x, "delegateEvents", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Any): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setGetTriggers(value: Any): Self = StObject.set(x, "getTriggers", value.asInstanceOf[js.Any])
    
    inline def setIsAttached(value: Any): Self = StObject.set(x, "isAttached", value.asInstanceOf[js.Any])
    
    inline def setIsDestroyed(value: Any): Self = StObject.set(x, "isDestroyed", value.asInstanceOf[js.Any])
    
    inline def setIsRendered(value: Any): Self = StObject.set(x, "isRendered", value.asInstanceOf[js.Any])
    
    inline def setSupportsDestroyLifecycle(value: Any): Self = StObject.set(x, "supportsDestroyLifecycle", value.asInstanceOf[js.Any])
    
    inline def setSupportsRenderLifecycle(value: Any): Self = StObject.set(x, "supportsRenderLifecycle", value.asInstanceOf[js.Any])
    
    inline def setTriggerMethod(value: Any): Self = StObject.set(x, "triggerMethod", value.asInstanceOf[js.Any])
    
    inline def setUnbindUIElements(value: Any): Self = StObject.set(x, "unbindUIElements", value.asInstanceOf[js.Any])
    
    inline def setUndelegateEntityEvents(value: Any): Self = StObject.set(x, "undelegateEntityEvents", value.asInstanceOf[js.Any])
  }
}
