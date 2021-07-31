package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSGenerateOptions extends StObject {
  
  var compact: js.UndefOr[Boolean] = js.undefined
  
  var decorate: js.UndefOr[js.Function2[/* result */ String, /* node */ DSNode, Unit]] = js.undefined
  
  var forceBraces: js.UndefOr[Boolean] = js.undefined
}
object DSGenerateOptions {
  
  @scala.inline
  def apply(): DSGenerateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DSGenerateOptions]
  }
  
  @scala.inline
  implicit class DSGenerateOptionsMutableBuilder[Self <: DSGenerateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    @scala.inline
    def setDecorate(value: (/* result */ String, /* node */ DSNode) => Unit): Self = StObject.set(x, "decorate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDecorateUndefined: Self = StObject.set(x, "decorate", js.undefined)
    
    @scala.inline
    def setForceBraces(value: Boolean): Self = StObject.set(x, "forceBraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceBracesUndefined: Self = StObject.set(x, "forceBraces", js.undefined)
  }
}
