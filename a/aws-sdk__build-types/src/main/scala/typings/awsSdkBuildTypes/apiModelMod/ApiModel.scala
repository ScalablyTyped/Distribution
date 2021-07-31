package typings.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiModel extends StObject {
  
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  
  var metadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ js.Any
  
  var operations: OperationMap
  
  var shapes: ShapeMap
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
  implicit class ApiModelMutableBuilder[Self <: ApiModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentation(value: java.lang.String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceMetadata */ js.Any
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: OperationMap): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapes(value: ShapeMap): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
  }
}
