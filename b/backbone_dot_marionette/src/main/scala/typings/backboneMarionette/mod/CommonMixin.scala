package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonMixin extends StObject {
  
  var bindEvents: js.Any
  
  var getOption: js.Any
  
  var mergeOptions: js.Any
  
  var normalizeMethods: js.Any
  
  var unbindEvents: js.Any
}
object CommonMixin {
  
  inline def apply(
    bindEvents: js.Any,
    getOption: js.Any,
    mergeOptions: js.Any,
    normalizeMethods: js.Any,
    unbindEvents: js.Any
  ): CommonMixin = {
    val __obj = js.Dynamic.literal(bindEvents = bindEvents.asInstanceOf[js.Any], getOption = getOption.asInstanceOf[js.Any], mergeOptions = mergeOptions.asInstanceOf[js.Any], normalizeMethods = normalizeMethods.asInstanceOf[js.Any], unbindEvents = unbindEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonMixin]
  }
  
  extension [Self <: CommonMixin](x: Self) {
    
    inline def setBindEvents(value: js.Any): Self = StObject.set(x, "bindEvents", value.asInstanceOf[js.Any])
    
    inline def setGetOption(value: js.Any): Self = StObject.set(x, "getOption", value.asInstanceOf[js.Any])
    
    inline def setMergeOptions(value: js.Any): Self = StObject.set(x, "mergeOptions", value.asInstanceOf[js.Any])
    
    inline def setNormalizeMethods(value: js.Any): Self = StObject.set(x, "normalizeMethods", value.asInstanceOf[js.Any])
    
    inline def setUnbindEvents(value: js.Any): Self = StObject.set(x, "unbindEvents", value.asInstanceOf[js.Any])
  }
}
