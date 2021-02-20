package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMergeOptionsOutput extends StObject {
  
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: ObjectId = js.native
  
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId = js.native
  
  /**
    * The merge option or strategy used to merge the code.
    */
  var mergeOptions: MergeOptions = js.native
  
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId = js.native
}
object GetMergeOptionsOutput {
  
  @scala.inline
  def apply(
    baseCommitId: ObjectId,
    destinationCommitId: ObjectId,
    mergeOptions: MergeOptions,
    sourceCommitId: ObjectId
  ): GetMergeOptionsOutput = {
    val __obj = js.Dynamic.literal(baseCommitId = baseCommitId.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeOptions = mergeOptions.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMergeOptionsOutput]
  }
  
  @scala.inline
  implicit class GetMergeOptionsOutputMutableBuilder[Self <: GetMergeOptionsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseCommitId(value: ObjectId): Self = StObject.set(x, "baseCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationCommitId(value: ObjectId): Self = StObject.set(x, "destinationCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeOptions(value: MergeOptions): Self = StObject.set(x, "mergeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeOptionsVarargs(value: MergeOptionTypeEnum*): Self = StObject.set(x, "mergeOptions", js.Array(value :_*))
    
    @scala.inline
    def setSourceCommitId(value: ObjectId): Self = StObject.set(x, "sourceCommitId", value.asInstanceOf[js.Any])
  }
}
