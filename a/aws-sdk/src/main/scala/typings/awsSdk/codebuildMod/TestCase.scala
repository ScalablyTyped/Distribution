package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestCase extends js.Object {
  
  /**
    *  The number of nanoseconds it took to run this test case. 
    */
  var durationInNanoSeconds: js.UndefOr[WrapperLong] = js.native
  
  /**
    *  The date and time a test case expires. A test case expires 30 days after it is created. An expired test case is not available to view in CodeBuild. 
    */
  var expired: js.UndefOr[Timestamp] = js.native
  
  /**
    *  A message associated with a test case. For example, an error message or stack trace. 
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    *  The name of the test case. 
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *  A string that is applied to a series of related test cases. CodeBuild generates the prefix. The prefix depends on the framework used to generate the tests. 
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    *  The ARN of the report to which the test case belongs. 
    */
  var reportArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    *  The status returned by the test case after it was run. Valid statuses are SUCCEEDED, FAILED, ERROR, SKIPPED, and UNKNOWN. 
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    *  The path to the raw data file that contains the test result. 
    */
  var testRawDataPath: js.UndefOr[String] = js.native
}
object TestCase {
  
  @scala.inline
  def apply(): TestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCase]
  }
  
  @scala.inline
  implicit class TestCaseOps[Self <: TestCase] (val x: Self) extends AnyVal {
    
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
    def setDurationInNanoSeconds(value: WrapperLong): Self = this.set("durationInNanoSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationInNanoSeconds: Self = this.set("durationInNanoSeconds", js.undefined)
    
    @scala.inline
    def setExpired(value: Timestamp): Self = this.set("expired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpired: Self = this.set("expired", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setReportArn(value: NonEmptyString): Self = this.set("reportArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportArn: Self = this.set("reportArn", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTestRawDataPath(value: String): Self = this.set("testRawDataPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestRawDataPath: Self = this.set("testRawDataPath", js.undefined)
  }
}
