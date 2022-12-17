package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.merge
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletionPosition extends StObject {
  
  var deletionPosition: ReturnType[js.Function0[Root]]
  
  var graveyardPosition: ReturnType[js.Function0[Root]]
  
  var howMany: Double
  
  var movedRange: ReturnType[js.Function0[End]]
  
  var sourcePosition: ReturnType[js.Function0[Root]]
  
  var targetPosition: ReturnType[js.Function0[Root]]
  
  var `type`: merge
}
object DeletionPosition {
  
  inline def apply(
    deletionPosition: ReturnType[js.Function0[Root]],
    graveyardPosition: ReturnType[js.Function0[Root]],
    howMany: Double,
    movedRange: ReturnType[js.Function0[End]],
    sourcePosition: ReturnType[js.Function0[Root]],
    targetPosition: ReturnType[js.Function0[Root]]
  ): DeletionPosition = {
    val __obj = js.Dynamic.literal(deletionPosition = deletionPosition.asInstanceOf[js.Any], graveyardPosition = graveyardPosition.asInstanceOf[js.Any], howMany = howMany.asInstanceOf[js.Any], movedRange = movedRange.asInstanceOf[js.Any], sourcePosition = sourcePosition.asInstanceOf[js.Any], targetPosition = targetPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("merge")
    __obj.asInstanceOf[DeletionPosition]
  }
  
  extension [Self <: DeletionPosition](x: Self) {
    
    inline def setDeletionPosition(value: ReturnType[js.Function0[Root]]): Self = StObject.set(x, "deletionPosition", value.asInstanceOf[js.Any])
    
    inline def setGraveyardPosition(value: ReturnType[js.Function0[Root]]): Self = StObject.set(x, "graveyardPosition", value.asInstanceOf[js.Any])
    
    inline def setHowMany(value: Double): Self = StObject.set(x, "howMany", value.asInstanceOf[js.Any])
    
    inline def setMovedRange(value: ReturnType[js.Function0[End]]): Self = StObject.set(x, "movedRange", value.asInstanceOf[js.Any])
    
    inline def setSourcePosition(value: ReturnType[js.Function0[Root]]): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
    
    inline def setTargetPosition(value: ReturnType[js.Function0[Root]]): Self = StObject.set(x, "targetPosition", value.asInstanceOf[js.Any])
    
    inline def setType(value: merge): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
