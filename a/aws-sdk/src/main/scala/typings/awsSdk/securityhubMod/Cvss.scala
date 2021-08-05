package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cvss extends StObject {
  
  /**
    * The base CVSS score.
    */
  var BaseScore: js.UndefOr[Double] = js.undefined
  
  /**
    * The base scoring vector for the CVSS score.
    */
  var BaseVector: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The version of CVSS for the CVSS score.
    */
  var Version: js.UndefOr[NonEmptyString] = js.undefined
}
object Cvss {
  
  inline def apply(): Cvss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cvss]
  }
  
  extension [Self <: Cvss](x: Self) {
    
    inline def setBaseScore(value: Double): Self = StObject.set(x, "BaseScore", value.asInstanceOf[js.Any])
    
    inline def setBaseScoreUndefined: Self = StObject.set(x, "BaseScore", js.undefined)
    
    inline def setBaseVector(value: NonEmptyString): Self = StObject.set(x, "BaseVector", value.asInstanceOf[js.Any])
    
    inline def setBaseVectorUndefined: Self = StObject.set(x, "BaseVector", js.undefined)
    
    inline def setVersion(value: NonEmptyString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
