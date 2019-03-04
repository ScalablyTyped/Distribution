package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Indicate extends js.Object {
  /**
  						 * 该特征值是否支持 indicate 操作
  						 */
  var indicate: scala.Boolean
  /**
  						 * 该特征值是否支持 notify 操作
  						 */
  @JSName("notify")
  var notify_FAnon_Indicate: scala.Boolean
  /**
  						 * 该特征值是否支持 read 操作
  						 */
  var read: scala.Boolean
  /**
  						 * 该特征值是否支持 write 操作
  						 */
  var write: scala.Boolean
}

object Anon_Indicate {
  @scala.inline
  def apply(indicate: scala.Boolean, notify: scala.Boolean, read: scala.Boolean, write: scala.Boolean): Anon_Indicate = {
    val __obj = js.Dynamic.literal(indicate = indicate, notify = notify, read = read, write = write)
  
    __obj.asInstanceOf[Anon_Indicate]
  }
}

