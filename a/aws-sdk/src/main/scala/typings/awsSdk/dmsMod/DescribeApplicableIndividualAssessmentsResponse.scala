package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeApplicableIndividualAssessmentsResponse extends StObject {
  
  /**
    * List of names for the individual assessments supported by the premigration assessment run that you start based on the specified request parameters. For more information on the available individual assessments, including compatibility with different migration task configurations, see Working with premigration assessment runs in the AWS Database Migration Service User Guide. 
    */
  var IndividualAssessmentNames: js.UndefOr[IndividualAssessmentNameList] = js.native
  
  /**
    * Pagination token returned for you to pass to a subsequent request. If you pass this token as the Marker value in a subsequent request, the response includes only records beyond the marker, up to the value specified in the request by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
}
object DescribeApplicableIndividualAssessmentsResponse {
  
  @scala.inline
  def apply(): DescribeApplicableIndividualAssessmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicableIndividualAssessmentsResponse]
  }
  
  @scala.inline
  implicit class DescribeApplicableIndividualAssessmentsResponseMutableBuilder[Self <: DescribeApplicableIndividualAssessmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndividualAssessmentNames(value: IndividualAssessmentNameList): Self = StObject.set(x, "IndividualAssessmentNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndividualAssessmentNamesUndefined: Self = StObject.set(x, "IndividualAssessmentNames", js.undefined)
    
    @scala.inline
    def setIndividualAssessmentNamesVarargs(value: String*): Self = StObject.set(x, "IndividualAssessmentNames", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
