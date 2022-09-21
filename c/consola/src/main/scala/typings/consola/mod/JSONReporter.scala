package typings.consola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("consola", "JSONReporter")
@js.native
open class JSONReporter ()
  extends StObject
     with ConsolaReporter {
  def this(options: JSONReporterOptions) = this()
  
  /* CompleteClass */
  override def log(logObj: ConsolaReporterLogObject, args: ConsolaReporterArgs): Unit = js.native
}
