package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSnapshotRequest extends StObject {
  
  /**
    * The description of the snapshot.
    */
  var Description: js.UndefOr[SnapshotDescription] = js.undefined
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.gamesparksMod.GameName
  
  /**
    * The identifier of the snapshot.
    */
  var SnapshotId: typings.awsSdk.gamesparksMod.SnapshotId
}
object UpdateSnapshotRequest {
  
  inline def apply(GameName: GameName, SnapshotId: SnapshotId): UpdateSnapshotRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSnapshotRequest]
  }
  
  extension [Self <: UpdateSnapshotRequest](x: Self) {
    
    inline def setDescription(value: SnapshotDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}
