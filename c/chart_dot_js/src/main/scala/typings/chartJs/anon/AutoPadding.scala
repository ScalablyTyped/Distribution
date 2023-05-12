package typings.chartJs.anon

import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesGeometricMod.Padding
import typings.chartJs.distTypesIndexMod.ScriptableContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoPadding[TType /* <: typings.chartJs.distTypesIndexMod.ChartType */] extends StObject {
  
  var autoPadding: Boolean
  
  var padding: typings.chartJs.distTypesIndexMod.Scriptable[Padding, ScriptableContext[TType]]
}
object AutoPadding {
  
  inline def apply[TType /* <: typings.chartJs.distTypesIndexMod.ChartType */](
    autoPadding: Boolean,
    padding: typings.chartJs.distTypesIndexMod.Scriptable[Padding, ScriptableContext[TType]]
  ): AutoPadding[TType] = {
    val __obj = js.Dynamic.literal(autoPadding = autoPadding.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoPadding[TType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoPadding[?], TType /* <: typings.chartJs.distTypesIndexMod.ChartType */] (val x: Self & AutoPadding[TType]) extends AnyVal {
    
    inline def setAutoPadding(value: Boolean): Self = StObject.set(x, "autoPadding", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: typings.chartJs.distTypesIndexMod.Scriptable[Padding, ScriptableContext[TType]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingFunction2(value: (ScriptableContext[TType], /* options */ AnyObject) => js.UndefOr[Padding]): Self = StObject.set(x, "padding", js.Any.fromFunction2(value))
  }
}
