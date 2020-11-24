package typings.babelCore.mod

import typings.babelTraverse.mod.Hub
import typings.babelTraverse.mod.Scope
import typings.babelTypes.mod.File_
import typings.babelTypes.mod.Program_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BabelFile extends js.Object {
  
  var ast: File_ = js.native
  
  var code: String = js.native
  
  var hub: Hub = js.native
  
  var inputMap: js.Object | Null = js.native
  
  var metadata: js.Object = js.native
  
  var opts: TransformOptions = js.native
  
  var path: typings.babelTraverse.mod.NodePath[Program_] = js.native
  
  var scope: Scope = js.native
}
object BabelFile {
  
  @scala.inline
  def apply(
    ast: File_,
    code: String,
    hub: Hub,
    metadata: js.Object,
    opts: TransformOptions,
    path: typings.babelTraverse.mod.NodePath[Program_],
    scope: Scope
  ): BabelFile = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], hub = hub.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelFile]
  }
  
  @scala.inline
  implicit class BabelFileOps[Self <: BabelFile] (val x: Self) extends AnyVal {
    
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
    def setAst(value: File_): Self = this.set("ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHub(value: Hub): Self = this.set("hub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: js.Object): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpts(value: TransformOptions): Self = this.set("opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: typings.babelTraverse.mod.NodePath[Program_]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: Scope): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputMap(value: js.Object): Self = this.set("inputMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputMapNull: Self = this.set("inputMap", null)
  }
}
