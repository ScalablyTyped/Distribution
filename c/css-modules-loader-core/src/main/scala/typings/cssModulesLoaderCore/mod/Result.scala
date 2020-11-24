package typings.cssModulesLoaderCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  var exportTokens: ExportTokens = js.native
  
  var injectableSource: String = js.native
}
object Result {
  
  @scala.inline
  def apply(exportTokens: ExportTokens, injectableSource: String): Result = {
    val __obj = js.Dynamic.literal(exportTokens = exportTokens.asInstanceOf[js.Any], injectableSource = injectableSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExportTokens(value: ExportTokens): Self = this.set("exportTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInjectableSource(value: String): Self = this.set("injectableSource", value.asInstanceOf[js.Any])
  }
}
