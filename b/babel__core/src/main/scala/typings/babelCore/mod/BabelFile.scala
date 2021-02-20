package typings.babelCore.mod

import typings.babelTraverse.mod.Hub
import typings.babelTraverse.mod.Scope
import typings.babelTypes.mod.File_
import typings.babelTypes.mod.Program_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BabelFile extends StObject {
  
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
  implicit class BabelFileMutableBuilder[Self <: BabelFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAst(value: File_): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHub(value: Hub): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputMap(value: js.Object): Self = StObject.set(x, "inputMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputMapNull: Self = StObject.set(x, "inputMap", null)
    
    @scala.inline
    def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpts(value: TransformOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: typings.babelTraverse.mod.NodePath[Program_]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
