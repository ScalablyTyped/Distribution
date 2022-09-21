package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.transparent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchType extends StObject {
  
  var batchType: js.UndefOr[default | transparent] = js.undefined
}
object BatchType {
  
  inline def apply(): BatchType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchType]
  }
  
  extension [Self <: BatchType](x: Self) {
    
    inline def setBatchType(value: default | transparent): Self = StObject.set(x, "batchType", value.asInstanceOf[js.Any])
    
    inline def setBatchTypeUndefined: Self = StObject.set(x, "batchType", js.undefined)
  }
}
