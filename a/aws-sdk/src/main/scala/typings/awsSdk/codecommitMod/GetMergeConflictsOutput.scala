package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMergeConflictsOutput extends StObject {
  
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * A list of metadata for any conflicting files. If the specified merge strategy is FAST_FORWARD_MERGE, this list is always empty.
    */
  var conflictMetadataList: ConflictMetadataList
  
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId
  
  /**
    * A Boolean value that indicates whether the code is mergeable by the specified merge option.
    */
  var mergeable: IsMergeable
  
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId
}
object GetMergeConflictsOutput {
  
  inline def apply(
    conflictMetadataList: ConflictMetadataList,
    destinationCommitId: ObjectId,
    mergeable: IsMergeable,
    sourceCommitId: ObjectId
  ): GetMergeConflictsOutput = {
    val __obj = js.Dynamic.literal(conflictMetadataList = conflictMetadataList.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMergeConflictsOutput]
  }
  
  extension [Self <: GetMergeConflictsOutput](x: Self) {
    
    inline def setBaseCommitId(value: ObjectId): Self = StObject.set(x, "baseCommitId", value.asInstanceOf[js.Any])
    
    inline def setBaseCommitIdUndefined: Self = StObject.set(x, "baseCommitId", js.undefined)
    
    inline def setConflictMetadataList(value: ConflictMetadataList): Self = StObject.set(x, "conflictMetadataList", value.asInstanceOf[js.Any])
    
    inline def setConflictMetadataListVarargs(value: ConflictMetadata*): Self = StObject.set(x, "conflictMetadataList", js.Array(value*))
    
    inline def setDestinationCommitId(value: ObjectId): Self = StObject.set(x, "destinationCommitId", value.asInstanceOf[js.Any])
    
    inline def setMergeable(value: IsMergeable): Self = StObject.set(x, "mergeable", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSourceCommitId(value: ObjectId): Self = StObject.set(x, "sourceCommitId", value.asInstanceOf[js.Any])
  }
}
