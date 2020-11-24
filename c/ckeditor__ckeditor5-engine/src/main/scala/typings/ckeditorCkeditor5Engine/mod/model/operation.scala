package typings.ckeditorCkeditor5Engine.mod.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ckeditor/ckeditor5-engine", "model.operation")
@js.native
object operation extends js.Object {
  
  def transform(a: Operation, b: Operation, context: TransformationContext): js.Array[Operation] = js.native
  
  def transformSets(
    operationsA: js.Array[Operation],
    operationsB: js.Array[Operation],
    options: typings.ckeditorCkeditor5Engine.anon.Document
  ): js.Object = js.native
  
  // engine/model/operation/attributeoperation
  @js.native
  class AttributeOperation () extends js.Object
  
  // engine/model/operation/detachoperation
  @js.native
  class DetachOperation () extends js.Object
  
  // engine/model/operation/insertoperation
  @js.native
  class InsertOperation () extends js.Object
  
  // engine/model/operation/markeroperation
  @js.native
  class MarkerOperation () extends js.Object
  
  // engine/model/operation/mergeoperation
  @js.native
  class MergeOperation () extends js.Object
  
  // engine/model/operation/moveoperation
  @js.native
  class MoveOperation () extends js.Object
  
  // engine/model/operation/nooperation
  @js.native
  class NoOperation () extends js.Object
  
  // engine/model/operation/operation
  @js.native
  class Operation () extends js.Object
  
  // engine/model/operation/operationfactory
  @js.native
  class OperationFactory () extends js.Object
  
  // engine/model/operation/renameoperation
  @js.native
  class RenameOperation () extends js.Object
  
  // engine/model/operation/rootattributeoperation
  @js.native
  class RootAttributeOperation () extends js.Object
  
  // engine/model/operation/splitoperation
  @js.native
  class SplitOperation () extends js.Object
  
  // engine/model/operation/transform
  @js.native
  class TransformationContext () extends js.Object
}
