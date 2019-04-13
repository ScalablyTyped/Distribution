package typings
package cssDashModulesDashLoaderDashCoreLib.cssDashModulesDashLoaderDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var exportTokens: ExportTokens
  var injectableSource: java.lang.String
}

object Result {
  @scala.inline
  def apply(exportTokens: ExportTokens, injectableSource: java.lang.String): Result = {
    val __obj = js.Dynamic.literal(exportTokens = exportTokens, injectableSource = injectableSource)
  
    __obj.asInstanceOf[Result]
  }
}

