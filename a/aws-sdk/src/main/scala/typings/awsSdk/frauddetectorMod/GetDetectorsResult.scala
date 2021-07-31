package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDetectorsResult extends StObject {
  
  /**
    * The detectors.
    */
  var detectors: js.UndefOr[DetectorList] = js.undefined
  
  /**
    * The next page token.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object GetDetectorsResult {
  
  @scala.inline
  def apply(): GetDetectorsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDetectorsResult]
  }
  
  @scala.inline
  implicit class GetDetectorsResultMutableBuilder[Self <: GetDetectorsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectors(value: DetectorList): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorsUndefined: Self = StObject.set(x, "detectors", js.undefined)
    
    @scala.inline
    def setDetectorsVarargs(value: Detector*): Self = StObject.set(x, "detectors", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
