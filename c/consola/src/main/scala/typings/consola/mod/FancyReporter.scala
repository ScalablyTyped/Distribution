package typings.consola.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("consola", "FancyReporter")
@js.native
class FancyReporter () extends BasicReporter {
  def this(options: FancyReporterOptions) = this()
  
  /* protected */ def formatType(logObj: ConsolaReporterLogObject): Unit = js.native
}
