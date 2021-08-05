package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyScore extends StObject {
  
  /**
    *  The last observed score. 
    */
  var CurrentScore: GenericDouble
  
  /**
    *  The maximum score observed during the AnomalyDateInterval. 
    */
  var MaxScore: GenericDouble
}
object AnomalyScore {
  
  inline def apply(CurrentScore: GenericDouble, MaxScore: GenericDouble): AnomalyScore = {
    val __obj = js.Dynamic.literal(CurrentScore = CurrentScore.asInstanceOf[js.Any], MaxScore = MaxScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyScore]
  }
  
  extension [Self <: AnomalyScore](x: Self) {
    
    inline def setCurrentScore(value: GenericDouble): Self = StObject.set(x, "CurrentScore", value.asInstanceOf[js.Any])
    
    inline def setMaxScore(value: GenericDouble): Self = StObject.set(x, "MaxScore", value.asInstanceOf[js.Any])
  }
}
