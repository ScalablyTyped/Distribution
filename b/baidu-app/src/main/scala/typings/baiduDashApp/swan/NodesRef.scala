package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesRef extends js.Object {
  /**
  		 * 添加节点的布局位置的查询请求，相对于显示区域，以像素为单位。
  		 * 其功能类似于DOM的getBoundingClientRect。
  		 * 返回值是nodesRef对应的selectorQuery。
  		 * 返回的节点信息中，每个节点的位置用
  		 * left、right、top、bottom、width、height字段描述。
  		 * 如果提供了callback回调函数，在执行selectQuery的exec方法后
  		 * 节点信息会在callback中返回。
  		 */
  def boundingClientRect(): SelectorQuery = js.native
  def boundingClientRect(callback: js.Function1[/* rect */ NodesRefRect | js.Array[NodesRefRect], Unit]): SelectorQuery = js.native
  /**
  		 * 获取节点的相关信息，需要获取的字段在fields中指定。
  		 * 返回值是nodesRef对应的selectorQuery。
  		 */
  def fields(fields: NodeRefFieldsOptions): SelectorQuery = js.native
  def fields(fields: NodeRefFieldsOptions, callback: js.Function1[/* result */ js.Any, Unit]): SelectorQuery = js.native
  /**
  		 * 添加节点的滚动位置查询请求，以像素为单位。
  		 * 节点必须是scroll-view或者viewport。
  		 * 返回值是nodesRef对应的selectorQuery。
  		 * 返回的节点信息中，每个节点的滚动位置用scrollLeft、scrollHeight字段描述。
  		 * 如果提供了callback回调函数，在执行selectQuery的exec方法后，节点信息会在callback中返回。
  		 */
  def scrollOffset(): SelectorQuery = js.native
  def scrollOffset(callback: js.Function1[/* rect */ NodeRefOffset, Unit]): SelectorQuery = js.native
}

