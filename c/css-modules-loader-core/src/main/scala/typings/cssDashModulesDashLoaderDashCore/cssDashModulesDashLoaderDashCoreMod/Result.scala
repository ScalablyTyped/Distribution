package typings.cssDashModulesDashLoaderDashCore.cssDashModulesDashLoaderDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var exportTokens: ExportTokens
  var injectableSource: String
}

object Result {
  @scala.inline
  def apply(exportTokens: ExportTokens, injectableSource: String): Result = {
    val __obj = js.Dynamic.literal(exportTokens = exportTokens, injectableSource = injectableSource)
  
    __obj.asInstanceOf[Result]
  }
}

