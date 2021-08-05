package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchTags extends StObject {
  
  /**
    * Highlight both matching tags.
    */
  var bothTags: js.UndefOr[Boolean] = js.undefined
}
object MatchTags {
  
  inline def apply(): MatchTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchTags]
  }
  
  extension [Self <: MatchTags](x: Self) {
    
    inline def setBothTags(value: Boolean): Self = StObject.set(x, "bothTags", value.asInstanceOf[js.Any])
    
    inline def setBothTagsUndefined: Self = StObject.set(x, "bothTags", js.undefined)
  }
}
