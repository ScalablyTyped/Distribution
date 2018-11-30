package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * SelectorQuery对象实例
	 */
@js.native
trait SelectorQuery extends js.Object {
  /**
  		 * 执行所有的请求
  		 * 请求结果按请求次序构成数组，在callback的第一个参数中返回。
  		 */
  def exec(): scala.Unit = js.native
  /**
  		 * 执行所有的请求
  		 * 请求结果按请求次序构成数组，在callback的第一个参数中返回。
  		 */
  def exec(callback: js.Function1[/* result */ js.Array[_], scala.Unit]): scala.Unit = js.native
  /**
  		 * 将选择器的选取范围更改为自定义组件component内
  		 * （初始时，选择器仅选取页面范围的节点，不会选取任何自定义组件中的节点
  		 * @version 1.6.0
  		 */
  def in(component: Component[js.Object, js.Object]): SelectorQuery = js.native
  /**
  		 * 在当前页面下选择第一个匹配选择器selector的节点，返回一个NodesRef对象实例，可以用于获取节点信息。
  		 * selector类似于CSS的选择器，但仅支持下列语法。
  		 * + ID选择器：#the-id
  		 * + class选择器（可以连续指定多个）：.a-class.another-class
  		 * + 子元素选择器：.the-parent > .the-child
  		 * + 后代选择器：.the-ancestor .the-descendant
  		 * + 跨自定义组件的后代选择器：.the-ancestor >>> .the-descendant
  		 * + 多选择器的并集：#a-node, .some-other-nodes
  		 */
  def select(selector: java.lang.String): NodesRef = js.native
  /**
  		 * 在当前页面下选择匹配选择器selector的节点，返回一个NodesRef对象实例。
  		 * 与selectorQuery.selectNode(selector)不同的是，它选择所有匹配选择器的节点。
  		 */
  def selectAll(selector: java.lang.String): NodesRef = js.native
  /**
  		 * 选择显示区域，可用于获取显示区域的尺寸、滚动位置等信息
  		 * 返回一个NodesRef对象实例。
  		 */
  def selectViewport(): NodesRef = js.native
}

