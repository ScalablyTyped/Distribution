package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliverabilityTestReport extends StObject {
  
  /**
    * The date and time when the predictive inbox placement test was created, in Unix time format.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The status of the predictive inbox placement test. If the status is IN_PROGRESS, then the predictive inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of creating the test. If the status is COMPLETE, then the test is finished, and you can use the GetDeliverabilityTestReport to view the results of the test.
    */
  var DeliverabilityTestStatus: js.UndefOr[typings.awsSdk.pinpointemailMod.DeliverabilityTestStatus] = js.native
  
  /**
    * The sender address that you specified for the predictive inbox placement test.
    */
  var FromEmailAddress: js.UndefOr[EmailAddress] = js.native
  
  /**
    * A unique string that identifies the predictive inbox placement test.
    */
  var ReportId: js.UndefOr[typings.awsSdk.pinpointemailMod.ReportId] = js.native
  
  /**
    * A name that helps you identify a predictive inbox placement test report.
    */
  var ReportName: js.UndefOr[typings.awsSdk.pinpointemailMod.ReportName] = js.native
  
  /**
    * The subject line for an email that you submitted in a predictive inbox placement test.
    */
  var Subject: js.UndefOr[DeliverabilityTestSubject] = js.native
}
object DeliverabilityTestReport {
  
  @scala.inline
  def apply(): DeliverabilityTestReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliverabilityTestReport]
  }
  
  @scala.inline
  implicit class DeliverabilityTestReportMutableBuilder[Self <: DeliverabilityTestReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDate(value: Timestamp): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setDeliverabilityTestStatus(value: DeliverabilityTestStatus): Self = StObject.set(x, "DeliverabilityTestStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliverabilityTestStatusUndefined: Self = StObject.set(x, "DeliverabilityTestStatus", js.undefined)
    
    @scala.inline
    def setFromEmailAddress(value: EmailAddress): Self = StObject.set(x, "FromEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromEmailAddressUndefined: Self = StObject.set(x, "FromEmailAddress", js.undefined)
    
    @scala.inline
    def setReportId(value: ReportId): Self = StObject.set(x, "ReportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportIdUndefined: Self = StObject.set(x, "ReportId", js.undefined)
    
    @scala.inline
    def setReportName(value: ReportName): Self = StObject.set(x, "ReportName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportNameUndefined: Self = StObject.set(x, "ReportName", js.undefined)
    
    @scala.inline
    def setSubject(value: DeliverabilityTestSubject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
  }
}
