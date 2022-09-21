package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSnapshotRequest extends StObject {
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.gamesparksMod.GameName
  
  /**
    * The list of game configuration sections to be described.
    */
  var Sections: js.UndefOr[SectionList] = js.undefined
  
  /**
    * The identifier of the snapshot.
    */
  var SnapshotId: typings.awsSdk.gamesparksMod.SnapshotId
}
object GetSnapshotRequest {
  
  inline def apply(GameName: GameName, SnapshotId: SnapshotId): GetSnapshotRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotRequest]
  }
  
  extension [Self <: GetSnapshotRequest](x: Self) {
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setSections(value: SectionList): Self = StObject.set(x, "Sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "Sections", js.undefined)
    
    inline def setSectionsVarargs(value: SectionName*): Self = StObject.set(x, "Sections", js.Array(value*))
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}
