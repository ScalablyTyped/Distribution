package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeMetadata extends StObject {
  
  /**
    * A Boolean value indicating whether the merge has been made.
    */
  var isMerged: js.UndefOr[IsMerged] = js.undefined
  
  /**
    * The commit ID for the merge commit, if any.
    */
  var mergeCommitId: js.UndefOr[CommitId] = js.undefined
  
  /**
    * The merge strategy used in the merge.
    */
  var mergeOption: js.UndefOr[MergeOptionTypeEnum] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user who merged the branches.
    */
  var mergedBy: js.UndefOr[Arn] = js.undefined
}
object MergeMetadata {
  
  inline def apply(): MergeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeMetadata]
  }
  
  extension [Self <: MergeMetadata](x: Self) {
    
    inline def setIsMerged(value: IsMerged): Self = StObject.set(x, "isMerged", value.asInstanceOf[js.Any])
    
    inline def setIsMergedUndefined: Self = StObject.set(x, "isMerged", js.undefined)
    
    inline def setMergeCommitId(value: CommitId): Self = StObject.set(x, "mergeCommitId", value.asInstanceOf[js.Any])
    
    inline def setMergeCommitIdUndefined: Self = StObject.set(x, "mergeCommitId", js.undefined)
    
    inline def setMergeOption(value: MergeOptionTypeEnum): Self = StObject.set(x, "mergeOption", value.asInstanceOf[js.Any])
    
    inline def setMergeOptionUndefined: Self = StObject.set(x, "mergeOption", js.undefined)
    
    inline def setMergedBy(value: Arn): Self = StObject.set(x, "mergedBy", value.asInstanceOf[js.Any])
    
    inline def setMergedByUndefined: Self = StObject.set(x, "mergedBy", js.undefined)
  }
}
