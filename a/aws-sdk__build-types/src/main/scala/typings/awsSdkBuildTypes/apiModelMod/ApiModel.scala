package typings.awsSdkBuildTypes.apiModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiModel extends js.Object {
  
  var documentation: js.UndefOr[java.lang.String] = js.native
  
  var metadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ js.Any = js.native
  
  var operations: OperationMap = js.native
  
  var shapes: ShapeMap = js.native
}
object ApiModel {
  
  @scala.inline
  def apply(
    metadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ js.Any,
    operations: OperationMap,
    shapes: ShapeMap
  ): ApiModel = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiModel]
  }
  
  @scala.inline
  implicit class ApiModelOps[Self <: ApiModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMetadata(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ js.Any
    ): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: OperationMap): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapes(value: ShapeMap): Self = this.set("shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentation(value: java.lang.String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
  }
}
