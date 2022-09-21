package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotRequest extends StObject {
  
  /**
    * The description of the snapshot.
    */
  var Description: js.UndefOr[SnapshotDescription] = js.undefined
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.gamesparksMod.GameName
}
object CreateSnapshotRequest {
  
  inline def apply(GameName: GameName): CreateSnapshotRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotRequest]
  }
  
  extension [Self <: CreateSnapshotRequest](x: Self) {
    
    inline def setDescription(value: SnapshotDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
  }
}
