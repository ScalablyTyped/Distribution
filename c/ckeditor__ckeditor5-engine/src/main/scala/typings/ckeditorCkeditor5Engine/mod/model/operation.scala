package typings.ckeditorCkeditor5Engine.mod.model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operation {
  
  @JSImport("@ckeditor/ckeditor5-engine", "model.operation")
  @js.native
  val ^ : js.Any = js.native
  
  // engine/model/operation/attributeoperation
  @JSImport("@ckeditor/ckeditor5-engine", "model.operation.AttributeOperation")
  @js.native
  class AttributeOperation () extends StObject
  
  // engine/model/operation/detachoperation
  @JSImport("@ckeditor/ckeditor5-engine", "model.operation.DetachOperation")
  @js.native
  class DetachOperation () extends StObject
  
  // engine/model/operation/insertoperation
  @JSImport("@ckeditor/ckeditor5-engine", "model.operation.InsertOperation")
  @js.native
  class InsertOperation () extends StObject
  
  // engine/model/operation/markeroperation
  @JSImport("@ckeditor/ckeditor5-engine", "model.operation.MarkerOperation")
  @js.native
  class MarkerOperation () extends StObject
  
  // engine/model/operation/mergeoperation
  @JSImport("@ckeditor/ckeditor5-engine", "model.operation.MergeOperation")
  @js.native
  class MergeOperation () extends StObject
  
  // engine/model/operation/moveoperation
  @JSImport("@ckeditor/ckeditor5-engine", "model.operation.MoveOperation")
  @js.native
  class MoveOperation () extends StObject
  
  // engine/model/operation/nooperation
  @JSImport("@ckeditor/ckeditor5-engine", "model.operation.NoOperation")
  @js.native
  class NoOperation () extends StObject
  
  // engine/model/operation/operation
  @JSImport("@ckeditor/ckeditor5-engine", "model.operation.Operation")
  @js.native
  class Operation () extends StObject
  
  // engine/model/operation/operationfactory
  @JSImport("@ckeditor/ckeditor5-engine", "model.operation.OperationFactory")
  @js.native
  class OperationFactory () extends StObject
  
  // engine/model/operation/renameoperation
  @JSImport("@ckeditor/ckeditor5-engine", "model.operation.RenameOperation")
  @js.native
  class RenameOperation () extends StObject
  
  // engine/model/operation/rootattributeoperation
  @JSImport("@ckeditor/ckeditor5-engine", "model.operation.RootAttributeOperation")
  @js.native
  class RootAttributeOperation () extends StObject
  
  // engine/model/operation/splitoperation
  @JSImport("@ckeditor/ckeditor5-engine", "model.operation.SplitOperation")
  @js.native
  class SplitOperation () extends StObject
  
  // engine/model/operation/transform
  @JSImport("@ckeditor/ckeditor5-engine", "model.operation.TransformationContext")
  @js.native
  class TransformationContext () extends StObject
  
  @scala.inline
  def transform(a: Operation, b: Operation, context: TransformationContext): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  
  @scala.inline
  def transformSets(
    operationsA: js.Array[Operation],
    operationsB: js.Array[Operation],
    options: typings.ckeditorCkeditor5Engine.anon.Document
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSets")(operationsA.asInstanceOf[js.Any], operationsB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
