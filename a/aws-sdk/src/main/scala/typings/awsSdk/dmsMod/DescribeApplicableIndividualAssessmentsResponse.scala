package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeApplicableIndividualAssessmentsResponse extends js.Object {
  
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
  implicit class DescribeApplicableIndividualAssessmentsResponseOps[Self <: DescribeApplicableIndividualAssessmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndividualAssessmentNamesVarargs(value: String*): Self = this.set("IndividualAssessmentNames", js.Array(value :_*))
    
    @scala.inline
    def setIndividualAssessmentNames(value: IndividualAssessmentNameList): Self = this.set("IndividualAssessmentNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndividualAssessmentNames: Self = this.set("IndividualAssessmentNames", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
