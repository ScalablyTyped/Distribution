package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// 界面-----绘图
trait CanvasAction extends js.Object {
  var data: js.Array[CanvasAction | Double | String]
  var method: String
}

object CanvasAction {
  @scala.inline
  def apply(data: js.Array[CanvasAction | Double | String], method: String): CanvasAction = {
    val __obj = js.Dynamic.literal(data = data, method = method)
  
    __obj.asInstanceOf[CanvasAction]
  }
}

