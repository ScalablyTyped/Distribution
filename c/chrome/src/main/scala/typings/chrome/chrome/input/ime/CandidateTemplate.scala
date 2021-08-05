package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandidateTemplate extends StObject {
  
  /**
    * Optional.
    * Additional text describing the candidate
    */
  var annotation: js.UndefOr[String] = js.undefined
  
  /** The candidate */
  var candidate: String
  
  /** The candidate's id */
  var id: Double
  
  /**
    * Optional.
    * Short string displayed to next to the candidate, often the shortcut key or index
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    * The id to add these candidates under
    */
  var parentId: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional.
    * The usage or detail description of word.
    */
  var usage: js.UndefOr[CandidateUsage] = js.undefined
}
object CandidateTemplate {
  
  inline def apply(candidate: String, id: Double): CandidateTemplate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandidateTemplate]
  }
  
  extension [Self <: CandidateTemplate](x: Self) {
    
    inline def setAnnotation(value: String): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
    
    inline def setCandidate(value: String): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setParentId(value: Double): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setUsage(value: CandidateUsage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
