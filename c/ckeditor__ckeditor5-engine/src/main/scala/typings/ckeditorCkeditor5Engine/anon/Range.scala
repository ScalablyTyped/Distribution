package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcModelRangeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  var affectsData: js.UndefOr[Boolean] = js.undefined
  
  var range: default
  
  var usingOperation: js.UndefOr[Boolean] = js.undefined
}
object Range {
  
  inline def apply(range: default): Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    inline def setAffectsData(value: Boolean): Self = StObject.set(x, "affectsData", value.asInstanceOf[js.Any])
    
    inline def setAffectsDataUndefined: Self = StObject.set(x, "affectsData", js.undefined)
    
    inline def setRange(value: default): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setUsingOperation(value: Boolean): Self = StObject.set(x, "usingOperation", value.asInstanceOf[js.Any])
    
    inline def setUsingOperationUndefined: Self = StObject.set(x, "usingOperation", js.undefined)
  }
}
