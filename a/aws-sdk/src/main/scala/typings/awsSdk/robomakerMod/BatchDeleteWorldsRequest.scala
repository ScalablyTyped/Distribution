package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteWorldsRequest extends StObject {
  
  /**
    * A list of Amazon Resource Names (arns) that correspond to worlds to delete.
    */
  var worlds: Arns
}
object BatchDeleteWorldsRequest {
  
  inline def apply(worlds: Arns): BatchDeleteWorldsRequest = {
    val __obj = js.Dynamic.literal(worlds = worlds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteWorldsRequest]
  }
  
  extension [Self <: BatchDeleteWorldsRequest](x: Self) {
    
    inline def setWorlds(value: Arns): Self = StObject.set(x, "worlds", value.asInstanceOf[js.Any])
    
    inline def setWorldsVarargs(value: Arn*): Self = StObject.set(x, "worlds", js.Array(value*))
  }
}
