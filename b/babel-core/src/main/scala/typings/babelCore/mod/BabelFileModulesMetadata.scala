package typings.babelCore.mod

import typings.babelCore.anon.Exported
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BabelFileModulesMetadata extends js.Object {
  
  var exports: Exported = js.native
  
  var imports: js.Array[js.Object] = js.native
}
object BabelFileModulesMetadata {
  
  @scala.inline
  def apply(exports: Exported, imports: js.Array[js.Object]): BabelFileModulesMetadata = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelFileModulesMetadata]
  }
  
  @scala.inline
  implicit class BabelFileModulesMetadataOps[Self <: BabelFileModulesMetadata] (val x: Self) extends AnyVal {
    
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
    def setExports(value: Exported): Self = this.set("exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsVarargs(value: js.Object*): Self = this.set("imports", js.Array(value :_*))
    
    @scala.inline
    def setImports(value: js.Array[js.Object]): Self = this.set("imports", value.asInstanceOf[js.Any])
  }
}
