package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomMixin extends StObject {
  
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
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(appendChildren = appendChildren.asInstanceOf[js.Any], beforeEl = beforeEl.asInstanceOf[js.Any], createBuffer = createBuffer.asInstanceOf[js.Any], detachContents = detachContents.asInstanceOf[js.Any], detachEl = detachEl.asInstanceOf[js.Any], findEls = findEls.asInstanceOf[js.Any], removeEl = removeEl.asInstanceOf[js.Any], replaceEl = replaceEl.asInstanceOf[js.Any], setInnerContent = setInnerContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomMixin]
  }
  
  extension [Self <: DomMixin](x: Self) {
    
    inline def setAppendChildren(value: js.Any): Self = StObject.set(x, "appendChildren", value.asInstanceOf[js.Any])
    
    inline def setBeforeEl(value: js.Any): Self = StObject.set(x, "beforeEl", value.asInstanceOf[js.Any])
    
    inline def setCreateBuffer(value: js.Any): Self = StObject.set(x, "createBuffer", value.asInstanceOf[js.Any])
    
    inline def setDetachContents(value: js.Any): Self = StObject.set(x, "detachContents", value.asInstanceOf[js.Any])
    
    inline def setDetachEl(value: js.Any): Self = StObject.set(x, "detachEl", value.asInstanceOf[js.Any])
    
    inline def setFindEls(value: js.Any): Self = StObject.set(x, "findEls", value.asInstanceOf[js.Any])
    
    inline def setRemoveEl(value: js.Any): Self = StObject.set(x, "removeEl", value.asInstanceOf[js.Any])
    
    inline def setReplaceEl(value: js.Any): Self = StObject.set(x, "replaceEl", value.asInstanceOf[js.Any])
    
    inline def setSetInnerContent(value: js.Any): Self = StObject.set(x, "setInnerContent", value.asInstanceOf[js.Any])
  }
}
