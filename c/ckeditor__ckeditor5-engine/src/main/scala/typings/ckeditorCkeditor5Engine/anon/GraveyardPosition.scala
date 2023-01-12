package typings.ckeditorCkeditor5Engine.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraveyardPosition extends StObject {
  
  var baseVersion: Double | Null
  
  var graveyardPosition: ReturnType[js.Function0[Root]]
  
  var howMany: Double
  
  var sourcePosition: ReturnType[js.Function0[Root]]
  
  var targetPosition: ReturnType[js.Function0[Root]]
}
object GraveyardPosition {
  
  inline def apply(
    graveyardPosition: ReturnType[js.Function0[Root]],
    howMany: Double,
    sourcePosition: ReturnType[js.Function0[Root]],
    targetPosition: ReturnType[js.Function0[Root]]
  ): GraveyardPosition = {
    val __obj = js.Dynamic.literal(graveyardPosition = graveyardPosition.asInstanceOf[js.Any], howMany = howMany.asInstanceOf[js.Any], sourcePosition = sourcePosition.asInstanceOf[js.Any], targetPosition = targetPosition.asInstanceOf[js.Any], baseVersion = null)
    __obj.asInstanceOf[GraveyardPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraveyardPosition] (val x: Self) extends AnyVal {
    
    inline def setBaseVersion(value: Double): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
    
    inline def setBaseVersionNull: Self = StObject.set(x, "baseVersion", null)
    
    inline def setGraveyardPosition(value: ReturnType[js.Function0[Root]]): Self = StObject.set(x, "graveyardPosition", value.asInstanceOf[js.Any])
    
    inline def setHowMany(value: Double): Self = StObject.set(x, "howMany", value.asInstanceOf[js.Any])
    
    inline def setSourcePosition(value: ReturnType[js.Function0[Root]]): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
    
    inline def setTargetPosition(value: ReturnType[js.Function0[Root]]): Self = StObject.set(x, "targetPosition", value.asInstanceOf[js.Any])
  }
}
