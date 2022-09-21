package typings.consola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("consola", "BasicReporter")
@js.native
open class BasicReporter ()
  extends StObject
     with ConsolaReporter {
  def this(options: BasicReporterOptions) = this()
  
  /* protected */ def filterAndJoin(arr: js.Array[js.UndefOr[String]]): String = js.native
  
  /* protected */ def formatArgs(args: js.Array[Any]): String = js.native
  
  /* protected */ def formatDate(date: js.Date): String = js.native
  
  /* protected */ def formatLogObj(logObj: ConsolaReporterLogObject): String = js.native
  
  /* protected */ def formatStack(stack: String): String = js.native
  
  /* CompleteClass */
  override def log(logObj: ConsolaReporterLogObject, args: ConsolaReporterArgs): Unit = js.native
  
  /* protected */ var options: BasicReporterOptions = js.native
}
