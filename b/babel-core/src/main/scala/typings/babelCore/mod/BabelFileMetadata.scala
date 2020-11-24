package typings.babelCore.mod

import typings.babelCore.anon.Loc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BabelFileMetadata extends js.Object {
  
  var marked: js.Array[Loc] = js.native
  
  var modules: BabelFileModulesMetadata = js.native
  
  var usedHelpers: js.Array[String] = js.native
}
object BabelFileMetadata {
  
  @scala.inline
  def apply(marked: js.Array[Loc], modules: BabelFileModulesMetadata, usedHelpers: js.Array[String]): BabelFileMetadata = {
    val __obj = js.Dynamic.literal(marked = marked.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], usedHelpers = usedHelpers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelFileMetadata]
  }
  
  @scala.inline
  implicit class BabelFileMetadataOps[Self <: BabelFileMetadata] (val x: Self) extends AnyVal {
    
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
    def setMarkedVarargs(value: Loc*): Self = this.set("marked", js.Array(value :_*))
    
    @scala.inline
    def setMarked(value: js.Array[Loc]): Self = this.set("marked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModules(value: BabelFileModulesMetadata): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedHelpersVarargs(value: String*): Self = this.set("usedHelpers", js.Array(value :_*))
    
    @scala.inline
    def setUsedHelpers(value: js.Array[String]): Self = this.set("usedHelpers", value.asInstanceOf[js.Any])
  }
}
