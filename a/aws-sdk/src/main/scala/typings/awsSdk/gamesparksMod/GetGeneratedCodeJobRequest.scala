package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGeneratedCodeJobRequest extends StObject {
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.gamesparksMod.GameName
  
  /**
    * The identifier of the code generation job.
    */
  var JobId: GeneratedCodeJobId
  
  /**
    * The identifier of the snapshot for the code generation job.
    */
  var SnapshotId: typings.awsSdk.gamesparksMod.SnapshotId
}
object GetGeneratedCodeJobRequest {
  
  inline def apply(GameName: GameName, JobId: GeneratedCodeJobId, SnapshotId: SnapshotId): GetGeneratedCodeJobRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGeneratedCodeJobRequest]
  }
  
  extension [Self <: GetGeneratedCodeJobRequest](x: Self) {
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: GeneratedCodeJobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}
