package typings.bristol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bristol extends js.Object {
  
  def addTarget(target: js.Any): js.Any = js.native
  def addTarget(target: js.Any, opts: js.Any): js.Any = js.native
  
  def debug(message: String, data: LogData): js.Any = js.native
  
  def error(message: String, data: LogData): js.Any = js.native
  
  def info(message: String, data: LogData): js.Any = js.native
  
  def warn(message: String, data: LogData): js.Any = js.native
  
  def withFormatter(formatter: String): js.Any = js.native
  
  def withLowestSeverity(severity: String): js.Any = js.native
}
