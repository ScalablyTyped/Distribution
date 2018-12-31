package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 云开发
// 文档：https://smartprogram.baidu.com/docs/develop/tutorial/codedir/
trait Cloud extends js.Object {
  /**
  		 * 接受一个 name 参数，指定需引用的集合名称
  		 */
  def collection(name: java.lang.String): js.Object
  /**
  		 * 接受一个可选对象参数 env：环境 ID，获取数据库的引用
  		 */
  def database(options: baiduDashAppLib.Anon_Env): js.Object
  /**
  		 * 初始化方法（全局只需一次）
  		 */
  def init(options: InitCloudOptions): scala.Unit
}

