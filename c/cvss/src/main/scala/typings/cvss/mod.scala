package typings.cvss

import typings.cvss.anon.Base
import typings.cvss.anon.OmitCVSSOptionsbaseOnly
import typings.cvss.anon.OmitCVSSOptionsenv
import typings.cvss.anon.OmitCVSSOptionstemporal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cvss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAll(input: String): Base = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(input.asInstanceOf[js.Any]).asInstanceOf[Base]
  
  inline def getBase(input: String): CVSSBase = ^.asInstanceOf[js.Dynamic].applyDynamic("getBase")(input.asInstanceOf[js.Any]).asInstanceOf[CVSSBase]
  inline def getBase(input: String, options: OmitCVSSOptionsbaseOnly): CVSSBase = (^.asInstanceOf[js.Dynamic].applyDynamic("getBase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CVSSBase]
  
  inline def getBaseScore(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseScore")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getBaseScore(input: String, options: OmitCVSSOptionsbaseOnly): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseScore")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getEnvironmental(input: String): CVSSBase = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvironmental")(input.asInstanceOf[js.Any]).asInstanceOf[CVSSBase]
  inline def getEnvironmental(input: String, options: OmitCVSSOptionsenv): CVSSBase = (^.asInstanceOf[js.Dynamic].applyDynamic("getEnvironmental")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CVSSBase]
  
  inline def getEnvironmentalScore(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvironmentalScore")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getEnvironmentalScore(input: String, options: OmitCVSSOptionsenv): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getEnvironmentalScore")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getRating(score: Double): CVSSRating = ^.asInstanceOf[js.Dynamic].applyDynamic("getRating")(score.asInstanceOf[js.Any]).asInstanceOf[CVSSRating]
  
  inline def getScore(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScore")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getScore(input: String, options: CVSSOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getScore")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTemporal(input: String): CVSSBase = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemporal")(input.asInstanceOf[js.Any]).asInstanceOf[CVSSBase]
  inline def getTemporal(input: String, options: OmitCVSSOptionstemporal): CVSSBase = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemporal")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CVSSBase]
  
  inline def getTemporalScore(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemporalScore")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getTemporalScore(input: String, options: OmitCVSSOptionstemporal): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemporalScore")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait CVSSBase extends StObject {
    
    var rating: CVSSRating
    
    var score: Double
  }
  object CVSSBase {
    
    inline def apply(rating: CVSSRating, score: Double): CVSSBase = {
      val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[CVSSBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CVSSBase] (val x: Self) extends AnyVal {
      
      inline def setRating(value: CVSSRating): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  trait CVSSOptions extends StObject {
    
    //  Only consider base metrics when calculating score
    var baseOnly: js.UndefOr[Boolean] = js.undefined
    
    //  Include temporal AND environmental metrics when calculating score (both are included per CVSS3 spec)
    var env: js.UndefOr[Boolean] = js.undefined
    
    //  Include temporal metrics when calculating score
    var temporal: js.UndefOr[Boolean] = js.undefined
    
    //  If validation returns an error, throw the error
    var `throw`: js.UndefOr[Boolean] = js.undefined
  }
  object CVSSOptions {
    
    inline def apply(): CVSSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CVSSOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CVSSOptions] (val x: Self) extends AnyVal {
      
      inline def setBaseOnly(value: Boolean): Self = StObject.set(x, "baseOnly", value.asInstanceOf[js.Any])
      
      inline def setBaseOnlyUndefined: Self = StObject.set(x, "baseOnly", js.undefined)
      
      inline def setEnv(value: Boolean): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setTemporal(value: Boolean): Self = StObject.set(x, "temporal", value.asInstanceOf[js.Any])
      
      inline def setTemporalUndefined: Self = StObject.set(x, "temporal", js.undefined)
      
      inline def setThrow(value: Boolean): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
      
      inline def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cvss.cvssStrings.None
    - typings.cvss.cvssStrings.Low
    - typings.cvss.cvssStrings.Medium
    - typings.cvss.cvssStrings.High
    - typings.cvss.cvssStrings.Critical
  */
  trait CVSSRating extends StObject
  object CVSSRating {
    
    inline def Critical: typings.cvss.cvssStrings.Critical = "Critical".asInstanceOf[typings.cvss.cvssStrings.Critical]
    
    inline def High: typings.cvss.cvssStrings.High = "High".asInstanceOf[typings.cvss.cvssStrings.High]
    
    inline def Low: typings.cvss.cvssStrings.Low = "Low".asInstanceOf[typings.cvss.cvssStrings.Low]
    
    inline def Medium: typings.cvss.cvssStrings.Medium = "Medium".asInstanceOf[typings.cvss.cvssStrings.Medium]
    
    inline def None: typings.cvss.cvssStrings.None = "None".asInstanceOf[typings.cvss.cvssStrings.None]
  }
}
