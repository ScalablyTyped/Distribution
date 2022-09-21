package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGeneratedCodeJobsRequest extends StObject {
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.gamesparksMod.GameName
  
  /**
    * The maximum number of results to return.  Use this parameter with NextToken to get results as a set of sequential pages. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.gamesparksMod.MaxResults] = js.undefined
  
  /**
    * The token that indicates the start of the next sequential page of results.  Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.gamesparksMod.NextToken] = js.undefined
  
  /**
    * The identifier of the snapshot.
    */
  var SnapshotId: typings.awsSdk.gamesparksMod.SnapshotId
}
object ListGeneratedCodeJobsRequest {
  
  inline def apply(GameName: GameName, SnapshotId: SnapshotId): ListGeneratedCodeJobsRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGeneratedCodeJobsRequest]
  }
  
  extension [Self <: ListGeneratedCodeJobsRequest](x: Self) {
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}
