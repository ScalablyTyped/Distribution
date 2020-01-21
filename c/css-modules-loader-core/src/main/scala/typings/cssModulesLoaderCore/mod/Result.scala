package typings.cssModulesLoaderCore.mod

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
    val __obj = js.Dynamic.literal(exportTokens = exportTokens.asInstanceOf[js.Any], injectableSource = injectableSource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

