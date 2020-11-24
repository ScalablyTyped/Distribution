package typings.awsSdkBuildTypes.treeModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeModel
  extends Documented
     with Named {
  
  var metadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ js.Any = js.native
  
  var operations: TreeModelOperationMap = js.native
  
  var shapes: TreeModelShapeMap = js.native
}
object TreeModel {
  
  @scala.inline
  def apply(
    documentation: String,
    metadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ js.Any,
    name: String,
    operations: TreeModelOperationMap,
    shapes: TreeModelShapeMap
  ): TreeModel = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModel]
  }
  
  @scala.inline
  implicit class TreeModelOps[Self <: TreeModel] (val x: Self) extends AnyVal {
    
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
    def setMetadata(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ js.Any
    ): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: TreeModelOperationMap): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapes(value: TreeModelShapeMap): Self = this.set("shapes", value.asInstanceOf[js.Any])
  }
}
