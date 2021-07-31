package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassificationDetails extends StObject {
  
  /**
    * The path to the folder or file (in Amazon S3) that contains the corresponding sensitive data discovery result for the finding. If a finding applies to a large archive or compressed file, this value is the path to a folder. Otherwise, this value is the path to a file.
    */
  var detailedResultsLocation: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the classification job that produced the finding.
    */
  var jobArn: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the classification job that produced the finding.
    */
  var jobId: js.UndefOr[string] = js.undefined
  
  /**
    * The status and other details for the finding.
    */
  var result: js.UndefOr[ClassificationResult] = js.undefined
}
object ClassificationDetails {
  
  @scala.inline
  def apply(): ClassificationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationDetails]
  }
  
  @scala.inline
  implicit class ClassificationDetailsMutableBuilder[Self <: ClassificationDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetailedResultsLocation(value: string): Self = StObject.set(x, "detailedResultsLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedResultsLocationUndefined: Self = StObject.set(x, "detailedResultsLocation", js.undefined)
    
    @scala.inline
    def setJobArn(value: string): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobArnUndefined: Self = StObject.set(x, "jobArn", js.undefined)
    
    @scala.inline
    def setJobId(value: string): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setResult(value: ClassificationResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
