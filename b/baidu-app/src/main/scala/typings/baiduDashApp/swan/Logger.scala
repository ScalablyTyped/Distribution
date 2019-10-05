package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 接口
trait Logger extends js.Object {
  /**
  		 * 写debug日志，参数同log方法
  		 */
  def debug(args: js.Any*): Unit
  /**
  		 * 写info日志，参数同log方法
  		 */
  def info(args: js.Any*): Unit
  /**
  		 * 写log日志，可以提供任意个参数，每个参数的类型为Object/Array/Number/String，参数p1到pN的内容会写入日志
  		 */
  def log(args: js.Any*): Unit
  /**
  		 * 写warn日志，参数同log方法
  		 */
  def warn(args: js.Any*): Unit
}

object Logger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit,
    info: /* repeated */ js.Any => Unit,
    log: /* repeated */ js.Any => Unit,
    warn: /* repeated */ js.Any => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Logger]
  }
}

