package typings.consola.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("consola", "WinstonReporter")
@js.native
class WinstonReporter () extends ConsolaReporter {
  def this(logger: Winston) = this()
}
