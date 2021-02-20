package typings.awsSdk.cloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hits extends StObject {
  
  /**
    * A cursor that can be used to retrieve the next set of matching documents when you want to page through a large result set.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The total number of documents that match the search request.
    */
  var found: js.UndefOr[Long] = js.native
  
  /**
    * A document that matches the search request.
    */
  var hit: js.UndefOr[HitList] = js.native
  
  /**
    * The index of the first matching document.
    */
  var start: js.UndefOr[Long] = js.native
}
object Hits {
  
  @scala.inline
  def apply(): Hits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hits]
  }
  
  @scala.inline
  implicit class HitsMutableBuilder[Self <: Hits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setFound(value: Long): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoundUndefined: Self = StObject.set(x, "found", js.undefined)
    
    @scala.inline
    def setHit(value: HitList): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitUndefined: Self = StObject.set(x, "hit", js.undefined)
    
    @scala.inline
    def setHitVarargs(value: Hit*): Self = StObject.set(x, "hit", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: Long): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
