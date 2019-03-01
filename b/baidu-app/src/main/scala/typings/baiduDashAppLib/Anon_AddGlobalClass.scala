package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddGlobalClass extends js.Object {
  /**
  			 * 使用外部样式类可以让组件使用指定的组件外样式类，如果希望组件外样式类能够完全影响组件内部，
  			 * 可以将组件构造器中的options.addGlobalClass字段置为true。这个特性从小程序基础库版本 2.2.3 开始支持。
  			 *
  			 * @version 2.2.3
  			 */
  var addGlobalClass: scala.Boolean
  /**
  			 * 在组件的swan中可以包含 slot 节点，用于承载组件使用者提供的swan结构。
  			 * 默认情况下，一个组件的swan中只能有一个slot。需要使用多slot时，可以在组件js中声明启用。
  			 */
  var multipleSlots: scala.Boolean
}

object Anon_AddGlobalClass {
  @scala.inline
  def apply(addGlobalClass: scala.Boolean, multipleSlots: scala.Boolean): Anon_AddGlobalClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addGlobalClass")(addGlobalClass)
    __obj.updateDynamic("multipleSlots")(multipleSlots)
    __obj.asInstanceOf[Anon_AddGlobalClass]
  }
}

