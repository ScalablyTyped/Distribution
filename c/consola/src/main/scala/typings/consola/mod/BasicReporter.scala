package typings.consola.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("consola", "BasicReporter")
@js.native
class BasicReporter () extends ConsolaReporter {
  def this(options: BasicReporterOptions) = this()
  
  /* protected */ def filterAndJoin(arr: js.Array[js.UndefOr[String]]): String = js.native
  
  /* protected */ def formatArgs(args: js.Array[_]): String = js.native
  
  /* protected */ def formatDate(date: Date): String = js.native
  
  /* protected */ def formatLogObj(logObj: ConsolaReporterLogObject): String = js.native
  
  /* protected */ def formatStack(stack: String): String = js.native
  
  var options: BasicReporterOptions = js.native
}
