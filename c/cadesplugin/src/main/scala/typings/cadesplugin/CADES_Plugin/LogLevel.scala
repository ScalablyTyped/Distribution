package typings.cadesplugin.CADES_Plugin

import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import typings.cadesplugin.cadespluginNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogLevel extends js.Object {
  
  val LOG_LEVEL_DEBUG: `4` = js.native
  
  val LOG_LEVEL_ERROR: `1` = js.native
  
  val LOG_LEVEL_INFO: `2` = js.native
}
object LogLevel {
  
  @scala.inline
  def apply(LOG_LEVEL_DEBUG: `4`, LOG_LEVEL_ERROR: `1`, LOG_LEVEL_INFO: `2`): LogLevel = {
    val __obj = js.Dynamic.literal(LOG_LEVEL_DEBUG = LOG_LEVEL_DEBUG.asInstanceOf[js.Any], LOG_LEVEL_ERROR = LOG_LEVEL_ERROR.asInstanceOf[js.Any], LOG_LEVEL_INFO = LOG_LEVEL_INFO.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevel]
  }
  
  @scala.inline
  implicit class LogLevelOps[Self <: LogLevel] (val x: Self) extends AnyVal {
    
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
    def setLOG_LEVEL_DEBUG(value: `4`): Self = this.set("LOG_LEVEL_DEBUG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOG_LEVEL_ERROR(value: `1`): Self = this.set("LOG_LEVEL_ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOG_LEVEL_INFO(value: `2`): Self = this.set("LOG_LEVEL_INFO", value.asInstanceOf[js.Any])
  }
}
