package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.data
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.editing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockFillerMode extends StObject {
  
  var blockFillerMode: js.UndefOr[typings.ckeditorCkeditor5Engine.srcViewDomconverterMod.BlockFillerMode] = js.undefined
  
  var renderingMode: js.UndefOr[data | editing] = js.undefined
}
object BlockFillerMode {
  
  inline def apply(): BlockFillerMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockFillerMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockFillerMode] (val x: Self) extends AnyVal {
    
    inline def setBlockFillerMode(value: typings.ckeditorCkeditor5Engine.srcViewDomconverterMod.BlockFillerMode): Self = StObject.set(x, "blockFillerMode", value.asInstanceOf[js.Any])
    
    inline def setBlockFillerModeUndefined: Self = StObject.set(x, "blockFillerMode", js.undefined)
    
    inline def setRenderingMode(value: data | editing): Self = StObject.set(x, "renderingMode", value.asInstanceOf[js.Any])
    
    inline def setRenderingModeUndefined: Self = StObject.set(x, "renderingMode", js.undefined)
  }
}
