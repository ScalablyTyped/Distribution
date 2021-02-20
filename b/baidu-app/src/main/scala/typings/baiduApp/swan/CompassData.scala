package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 设备-----罗盘
@js.native
trait CompassData extends StObject {
  
  /** 面对的方向度数 */
  var direction: Double = js.native
}
object CompassData {
  
  @scala.inline
  def apply(direction: Double): CompassData = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassData]
  }
  
  @scala.inline
  implicit class CompassDataMutableBuilder[Self <: CompassData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
