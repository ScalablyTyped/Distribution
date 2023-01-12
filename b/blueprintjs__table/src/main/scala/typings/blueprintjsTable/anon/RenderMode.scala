package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderMode extends StObject {
  
  var renderMode: typings.blueprintjsTable.libEsmCommonRenderModeMod.RenderMode
}
object RenderMode {
  
  inline def apply(renderMode: typings.blueprintjsTable.libEsmCommonRenderModeMod.RenderMode): RenderMode = {
    val __obj = js.Dynamic.literal(renderMode = renderMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderMode] (val x: Self) extends AnyVal {
    
    inline def setRenderMode(value: typings.blueprintjsTable.libEsmCommonRenderModeMod.RenderMode): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
  }
}
