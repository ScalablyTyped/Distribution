package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScoreDetails extends StObject {
  
  /**
    * An object that contains details about the CVSS score given to a finding.
    */
  var cvss: js.UndefOr[CvssScoreDetails] = js.undefined
}
object ScoreDetails {
  
  inline def apply(): ScoreDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScoreDetails]
  }
  
  extension [Self <: ScoreDetails](x: Self) {
    
    inline def setCvss(value: CvssScoreDetails): Self = StObject.set(x, "cvss", value.asInstanceOf[js.Any])
    
    inline def setCvssUndefined: Self = StObject.set(x, "cvss", js.undefined)
  }
}
