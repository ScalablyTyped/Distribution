package typings.cyclonedx.anon

import typings.cyclonedx.mod.RatingMethod
import typings.cyclonedx.mod.Severity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Justification extends StObject {
  
  var justification: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[RatingMethod] = js.undefined
  
  var score: js.UndefOr[Double] = js.undefined
  
  var severity: js.UndefOr[Severity] = js.undefined
  
  var source: js.UndefOr[typings.cyclonedx.mod.Source] = js.undefined
  
  var vector: js.UndefOr[String] = js.undefined
}
object Justification {
  
  inline def apply(): Justification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Justification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Justification] (val x: Self) extends AnyVal {
    
    inline def setJustification(value: String): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
    
    inline def setJustificationUndefined: Self = StObject.set(x, "justification", js.undefined)
    
    inline def setMethod(value: RatingMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSource(value: typings.cyclonedx.mod.Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVector(value: String): Self = StObject.set(x, "vector", value.asInstanceOf[js.Any])
    
    inline def setVectorUndefined: Self = StObject.set(x, "vector", js.undefined)
  }
}
