package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMergeCommitOutput extends StObject {
  
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The commit ID for the merge commit created when the source branch was merged into the destination branch. If the fast-forward merge strategy was used, there is no merge commit.
    */
  var mergedCommitId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: js.UndefOr[ObjectId] = js.native
}
object GetMergeCommitOutput {
  
  @scala.inline
  def apply(): GetMergeCommitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMergeCommitOutput]
  }
  
  @scala.inline
  implicit class GetMergeCommitOutputMutableBuilder[Self <: GetMergeCommitOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseCommitId(value: ObjectId): Self = StObject.set(x, "baseCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseCommitIdUndefined: Self = StObject.set(x, "baseCommitId", js.undefined)
    
    @scala.inline
    def setDestinationCommitId(value: ObjectId): Self = StObject.set(x, "destinationCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationCommitIdUndefined: Self = StObject.set(x, "destinationCommitId", js.undefined)
    
    @scala.inline
    def setMergedCommitId(value: ObjectId): Self = StObject.set(x, "mergedCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergedCommitIdUndefined: Self = StObject.set(x, "mergedCommitId", js.undefined)
    
    @scala.inline
    def setSourceCommitId(value: ObjectId): Self = StObject.set(x, "sourceCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCommitIdUndefined: Self = StObject.set(x, "sourceCommitId", js.undefined)
  }
}
