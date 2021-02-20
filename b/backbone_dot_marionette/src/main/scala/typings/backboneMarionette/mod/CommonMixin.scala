package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonMixin extends StObject {
  
  var bindEvents: js.Any = js.native
  
  var getOption: js.Any = js.native
  
  var mergeOptions: js.Any = js.native
  
  var normalizeMethods: js.Any = js.native
  
  var unbindEvents: js.Any = js.native
}
object CommonMixin {
  
  @scala.inline
  def apply(
    bindEvents: js.Any,
    getOption: js.Any,
    mergeOptions: js.Any,
    normalizeMethods: js.Any,
    unbindEvents: js.Any
  ): CommonMixin = {
    val __obj = js.Dynamic.literal(bindEvents = bindEvents.asInstanceOf[js.Any], getOption = getOption.asInstanceOf[js.Any], mergeOptions = mergeOptions.asInstanceOf[js.Any], normalizeMethods = normalizeMethods.asInstanceOf[js.Any], unbindEvents = unbindEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonMixin]
  }
  
  @scala.inline
  implicit class CommonMixinMutableBuilder[Self <: CommonMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindEvents(value: js.Any): Self = StObject.set(x, "bindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetOption(value: js.Any): Self = StObject.set(x, "getOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeOptions(value: js.Any): Self = StObject.set(x, "mergeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeMethods(value: js.Any): Self = StObject.set(x, "normalizeMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnbindEvents(value: js.Any): Self = StObject.set(x, "unbindEvents", value.asInstanceOf[js.Any])
  }
}
