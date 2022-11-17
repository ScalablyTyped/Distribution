package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.AnyObject
import typings.chartJs.distChunksHelpersDotcoreMod.ChartType
import typings.chartJs.distChunksHelpersDotcoreMod.Padding
import typings.chartJs.distChunksHelpersDotcoreMod.Scriptable
import typings.chartJs.distChunksHelpersDotcoreMod.ScriptableContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoPadding[TType /* <: ChartType */] extends StObject {
  
  var autoPadding: Boolean
  
  var padding: Scriptable[Padding, ScriptableContext[TType]]
}
object AutoPadding {
  
  inline def apply[TType /* <: ChartType */](autoPadding: Boolean, padding: Scriptable[Padding, ScriptableContext[TType]]): AutoPadding[TType] = {
    val __obj = js.Dynamic.literal(autoPadding = autoPadding.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoPadding[TType]]
  }
  
  extension [Self <: AutoPadding[?], TType /* <: ChartType */](x: Self & AutoPadding[TType]) {
    
    inline def setAutoPadding(value: Boolean): Self = StObject.set(x, "autoPadding", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Scriptable[Padding, ScriptableContext[TType]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingFunction2(value: (ScriptableContext[TType], /* options */ AnyObject) => js.UndefOr[Padding]): Self = StObject.set(x, "padding", js.Any.fromFunction2(value))
  }
}
