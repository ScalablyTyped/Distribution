package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomMixin extends StObject {
  
  var appendChildren: Any
  
  var beforeEl: Any
  
  var createBuffer: Any
  
  var detachContents: Any
  
  var detachEl: Any
  
  var findEls: Any
  
  var removeEl: Any
  
  var replaceEl: Any
  
  var setInnerContent: Any
}
object DomMixin {
  
  inline def apply(
    appendChildren: Any,
    beforeEl: Any,
    createBuffer: Any,
    detachContents: Any,
    detachEl: Any,
    findEls: Any,
    removeEl: Any,
    replaceEl: Any,
    setInnerContent: Any
  ): DomMixin = {
    val __obj = js.Dynamic.literal(appendChildren = appendChildren.asInstanceOf[js.Any], beforeEl = beforeEl.asInstanceOf[js.Any], createBuffer = createBuffer.asInstanceOf[js.Any], detachContents = detachContents.asInstanceOf[js.Any], detachEl = detachEl.asInstanceOf[js.Any], findEls = findEls.asInstanceOf[js.Any], removeEl = removeEl.asInstanceOf[js.Any], replaceEl = replaceEl.asInstanceOf[js.Any], setInnerContent = setInnerContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomMixin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomMixin] (val x: Self) extends AnyVal {
    
    inline def setAppendChildren(value: Any): Self = StObject.set(x, "appendChildren", value.asInstanceOf[js.Any])
    
    inline def setBeforeEl(value: Any): Self = StObject.set(x, "beforeEl", value.asInstanceOf[js.Any])
    
    inline def setCreateBuffer(value: Any): Self = StObject.set(x, "createBuffer", value.asInstanceOf[js.Any])
    
    inline def setDetachContents(value: Any): Self = StObject.set(x, "detachContents", value.asInstanceOf[js.Any])
    
    inline def setDetachEl(value: Any): Self = StObject.set(x, "detachEl", value.asInstanceOf[js.Any])
    
    inline def setFindEls(value: Any): Self = StObject.set(x, "findEls", value.asInstanceOf[js.Any])
    
    inline def setRemoveEl(value: Any): Self = StObject.set(x, "removeEl", value.asInstanceOf[js.Any])
    
    inline def setReplaceEl(value: Any): Self = StObject.set(x, "replaceEl", value.asInstanceOf[js.Any])
    
    inline def setSetInnerContent(value: Any): Self = StObject.set(x, "setInnerContent", value.asInstanceOf[js.Any])
  }
}
