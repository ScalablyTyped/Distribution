package typings.consola.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("consola", "BasicReporter")
@js.native
class BasicReporter ()
  extends StObject
     with ConsolaReporter {
  def this(options: BasicReporterOptions) = this()
  
  /* protected */ def filterAndJoin(arr: js.Array[js.UndefOr[String]]): String = js.native
  
  /* protected */ def formatArgs(args: js.Array[js.Any]): String = js.native
  
  /* protected */ def formatDate(date: Date): String = js.native
  
  /* protected */ def formatLogObj(logObj: ConsolaReporterLogObject): String = js.native
  
  /* protected */ def formatStack(stack: String): String = js.native
  
  /* CompleteClass */
  override def log(logObj: ConsolaReporterLogObject, args: ConsolaReporterArgs): Unit = js.native
  
  var options: BasicReporterOptions = js.native
}
