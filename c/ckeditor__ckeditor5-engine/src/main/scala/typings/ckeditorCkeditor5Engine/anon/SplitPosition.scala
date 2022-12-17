package typings.ckeditorCkeditor5Engine.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitPosition extends StObject {
  
  var baseVersion: Double | Null
  
  var graveyardPosition: js.UndefOr[ReturnType[js.Function0[Root]]] = js.undefined
  
  var insertionPosition: ReturnType[js.Function0[Root]]
  
  var splitPosition: ReturnType[js.Function0[Root]]
}
object SplitPosition {
  
  inline def apply(insertionPosition: ReturnType[js.Function0[Root]], splitPosition: ReturnType[js.Function0[Root]]): SplitPosition = {
    val __obj = js.Dynamic.literal(insertionPosition = insertionPosition.asInstanceOf[js.Any], splitPosition = splitPosition.asInstanceOf[js.Any], baseVersion = null)
    __obj.asInstanceOf[SplitPosition]
  }
  
  extension [Self <: SplitPosition](x: Self) {
    
    inline def setBaseVersion(value: Double): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
    
    inline def setBaseVersionNull: Self = StObject.set(x, "baseVersion", null)
    
    inline def setGraveyardPosition(value: ReturnType[js.Function0[Root]]): Self = StObject.set(x, "graveyardPosition", value.asInstanceOf[js.Any])
    
    inline def setGraveyardPositionUndefined: Self = StObject.set(x, "graveyardPosition", js.undefined)
    
    inline def setInsertionPosition(value: ReturnType[js.Function0[Root]]): Self = StObject.set(x, "insertionPosition", value.asInstanceOf[js.Any])
    
    inline def setSplitPosition(value: ReturnType[js.Function0[Root]]): Self = StObject.set(x, "splitPosition", value.asInstanceOf[js.Any])
  }
}
