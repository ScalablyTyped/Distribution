package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDetectorResult extends StObject {
  
  /**
    * The detector ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.undefined
  
  /**
    * The detector ID.
    */
  var detectorId: js.UndefOr[identifier] = js.undefined
  
  /**
    * The status and description for each detector version.
    */
  var detectorVersionSummaries: js.UndefOr[DetectorVersionSummaryList] = js.undefined
  
  /**
    * The next token to be used for subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object DescribeDetectorResult {
  
  inline def apply(): DescribeDetectorResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDetectorResult]
  }
  
  extension [Self <: DescribeDetectorResult](x: Self) {
    
    inline def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
    
    inline def setDetectorVersionSummaries(value: DetectorVersionSummaryList): Self = StObject.set(x, "detectorVersionSummaries", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersionSummariesUndefined: Self = StObject.set(x, "detectorVersionSummaries", js.undefined)
    
    inline def setDetectorVersionSummariesVarargs(value: DetectorVersionSummary*): Self = StObject.set(x, "detectorVersionSummaries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
