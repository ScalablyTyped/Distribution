package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 接口
@js.native
trait Logger extends js.Object {
  /**
    * 写debug日志，参数同log方法
    */
  def debug(args: js.Any*): Unit = js.native
  /**
    * 写info日志，参数同log方法
    */
  def info(args: js.Any*): Unit = js.native
  /**
    * 写log日志，可以提供任意个参数，每个参数的类型为Object/Array/Number/String，参数p1到pN的内容会写入日志
    */
  def log(args: js.Any*): Unit = js.native
  /**
    * 写warn日志，参数同log方法
    */
  def warn(args: js.Any*): Unit = js.native
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
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDebug(value: /* repeated */ js.Any => Unit): Self = this.set("debug", js.Any.fromFunction1(value))
    @scala.inline
    def setInfo(value: /* repeated */ js.Any => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
  
}

