package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeMetadata extends StObject {
  
  /**
    * A Boolean value indicating whether the merge has been made.
    */
  var isMerged: js.UndefOr[IsMerged] = js.native
  
  /**
    * The commit ID for the merge commit, if any.
    */
  var mergeCommitId: js.UndefOr[CommitId] = js.native
  
  /**
    * The merge strategy used in the merge.
    */
  var mergeOption: js.UndefOr[MergeOptionTypeEnum] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the user who merged the branches.
    */
  var mergedBy: js.UndefOr[Arn] = js.native
}
object MergeMetadata {
  
  @scala.inline
  def apply(): MergeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeMetadata]
  }
  
  @scala.inline
  implicit class MergeMetadataMutableBuilder[Self <: MergeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMerged(value: IsMerged): Self = StObject.set(x, "isMerged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMergedUndefined: Self = StObject.set(x, "isMerged", js.undefined)
    
    @scala.inline
    def setMergeCommitId(value: CommitId): Self = StObject.set(x, "mergeCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeCommitIdUndefined: Self = StObject.set(x, "mergeCommitId", js.undefined)
    
    @scala.inline
    def setMergeOption(value: MergeOptionTypeEnum): Self = StObject.set(x, "mergeOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeOptionUndefined: Self = StObject.set(x, "mergeOption", js.undefined)
    
    @scala.inline
    def setMergedBy(value: Arn): Self = StObject.set(x, "mergedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergedByUndefined: Self = StObject.set(x, "mergedBy", js.undefined)
  }
}
