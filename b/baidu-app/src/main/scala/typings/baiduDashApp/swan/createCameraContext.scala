package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.createCameraContext")
@js.native
object createCameraContext extends js.Object {
  /**
  	 * 创建并返回 camera 上下文 cameraContext 对象
  	 * cameraContext 与页面的 camera 组件绑定
  	 * 一个页面只能有一个camera，通过它可以操作对应的 <camera/> 组件。
  	 * 在自定义组件下，第一个参数传入组件实例this，以操作组件内 <camera/> 组件
  	 * @version 1.6.0
  	 */
  def apply(): CameraContext = js.native
  def apply(instance: js.Any): CameraContext = js.native
}

