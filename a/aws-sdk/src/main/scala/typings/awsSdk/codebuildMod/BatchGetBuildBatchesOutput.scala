package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetBuildBatchesOutput extends StObject {
  
  /**
    * An array of BuildBatch objects that represent the retrieved batch builds.
    */
  var buildBatches: js.UndefOr[BuildBatches] = js.native
  
  /**
    * An array that contains the identifiers of any batch builds that are not found.
    */
  var buildBatchesNotFound: js.UndefOr[BuildBatchIds] = js.native
}
object BatchGetBuildBatchesOutput {
  
  @scala.inline
  def apply(): BatchGetBuildBatchesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetBuildBatchesOutput]
  }
  
  @scala.inline
  implicit class BatchGetBuildBatchesOutputMutableBuilder[Self <: BatchGetBuildBatchesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildBatches(value: BuildBatches): Self = StObject.set(x, "buildBatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildBatchesNotFound(value: BuildBatchIds): Self = StObject.set(x, "buildBatchesNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildBatchesNotFoundUndefined: Self = StObject.set(x, "buildBatchesNotFound", js.undefined)
    
    @scala.inline
    def setBuildBatchesNotFoundVarargs(value: NonEmptyString*): Self = StObject.set(x, "buildBatchesNotFound", js.Array(value :_*))
    
    @scala.inline
    def setBuildBatchesUndefined: Self = StObject.set(x, "buildBatches", js.undefined)
    
    @scala.inline
    def setBuildBatchesVarargs(value: BuildBatch*): Self = StObject.set(x, "buildBatches", js.Array(value :_*))
  }
}
