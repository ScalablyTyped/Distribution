package typings.damerauLevenshtein

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(__this: String, that: String): DamerauLevenshteinResponse = (^.asInstanceOf[js.Dynamic].apply(__this.asInstanceOf[js.Any], that.asInstanceOf[js.Any])).asInstanceOf[DamerauLevenshteinResponse]
  inline def apply(__this: String, that: String, limit: Double): DamerauLevenshteinResponse = (^.asInstanceOf[js.Dynamic].apply(__this.asInstanceOf[js.Any], that.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[DamerauLevenshteinResponse]
  
  @JSImport("damerau-levenshtein", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DamerauLevenshteinResponse extends StObject {
    
    var relative: Double
    
    var similarity: Double
    
    var steps: Double
  }
  object DamerauLevenshteinResponse {
    
    inline def apply(relative: Double, similarity: Double, steps: Double): DamerauLevenshteinResponse = {
      val __obj = js.Dynamic.literal(relative = relative.asInstanceOf[js.Any], similarity = similarity.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[DamerauLevenshteinResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DamerauLevenshteinResponse] (val x: Self) extends AnyVal {
      
      inline def setRelative(value: Double): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setSimilarity(value: Double): Self = StObject.set(x, "similarity", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    }
  }
}
