package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawCanvasOptions extends StObject {
  
  /**
    * 绘图动作数组，由 swan.createCanvasContext 创建的 context，
    * 调用 getActions 方法导出绘图动作数组。
    */
  var actions: js.Array[CanvasAction]
  
  /** 画布标识，传入 <canvas/> 的 cavas-id */
  var canvasId: Double | String
}
object DrawCanvasOptions {
  
  inline def apply(actions: js.Array[CanvasAction], canvasId: Double | String): DrawCanvasOptions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], canvasId = canvasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawCanvasOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawCanvasOptions] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[CanvasAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: CanvasAction*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setCanvasId(value: Double | String): Self = StObject.set(x, "canvasId", value.asInstanceOf[js.Any])
  }
}
