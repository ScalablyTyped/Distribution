package typings.awsSdk.cloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hits extends StObject {
  
  /**
    * A cursor that can be used to retrieve the next set of matching documents when you want to page through a large result set.
    */
  var cursor: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of documents that match the search request.
    */
  var found: js.UndefOr[Long] = js.undefined
  
  /**
    * A document that matches the search request.
    */
  var hit: js.UndefOr[HitList] = js.undefined
  
  /**
    * The index of the first matching document.
    */
  var start: js.UndefOr[Long] = js.undefined
}
object Hits {
  
  inline def apply(): Hits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hits]
  }
  
  extension [Self <: Hits](x: Self) {
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setFound(value: Long): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def setFoundUndefined: Self = StObject.set(x, "found", js.undefined)
    
    inline def setHit(value: HitList): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
    
    inline def setHitUndefined: Self = StObject.set(x, "hit", js.undefined)
    
    inline def setHitVarargs(value: Hit*): Self = StObject.set(x, "hit", js.Array(value*))
    
    inline def setStart(value: Long): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
