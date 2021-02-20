package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetBuildBatchesInput extends StObject {
  
  /**
    * An array that contains the batch build identifiers to retrieve.
    */
  var ids: BuildBatchIds = js.native
}
object BatchGetBuildBatchesInput {
  
  @scala.inline
  def apply(ids: BuildBatchIds): BatchGetBuildBatchesInput = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetBuildBatchesInput]
  }
  
  @scala.inline
  implicit class BatchGetBuildBatchesInputMutableBuilder[Self <: BatchGetBuildBatchesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: BuildBatchIds): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ids", js.Array(value :_*))
  }
}
