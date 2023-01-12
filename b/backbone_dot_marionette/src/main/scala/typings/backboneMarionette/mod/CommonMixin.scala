package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonMixin extends StObject {
  
  var bindEvents: Any
  
  var getOption: Any
  
  var mergeOptions: Any
  
  var normalizeMethods: Any
  
  var unbindEvents: Any
}
object CommonMixin {
  
  inline def apply(bindEvents: Any, getOption: Any, mergeOptions: Any, normalizeMethods: Any, unbindEvents: Any): CommonMixin = {
    val __obj = js.Dynamic.literal(bindEvents = bindEvents.asInstanceOf[js.Any], getOption = getOption.asInstanceOf[js.Any], mergeOptions = mergeOptions.asInstanceOf[js.Any], normalizeMethods = normalizeMethods.asInstanceOf[js.Any], unbindEvents = unbindEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonMixin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommonMixin] (val x: Self) extends AnyVal {
    
    inline def setBindEvents(value: Any): Self = StObject.set(x, "bindEvents", value.asInstanceOf[js.Any])
    
    inline def setGetOption(value: Any): Self = StObject.set(x, "getOption", value.asInstanceOf[js.Any])
    
    inline def setMergeOptions(value: Any): Self = StObject.set(x, "mergeOptions", value.asInstanceOf[js.Any])
    
    inline def setNormalizeMethods(value: Any): Self = StObject.set(x, "normalizeMethods", value.asInstanceOf[js.Any])
    
    inline def setUnbindEvents(value: Any): Self = StObject.set(x, "unbindEvents", value.asInstanceOf[js.Any])
  }
}
