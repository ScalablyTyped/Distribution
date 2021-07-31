package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestCase extends StObject {
  
  /**
    *  The number of nanoseconds it took to run this test case. 
    */
  var durationInNanoSeconds: js.UndefOr[WrapperLong] = js.undefined
  
  /**
    *  The date and time a test case expires. A test case expires 30 days after it is created. An expired test case is not available to view in CodeBuild. 
    */
  var expired: js.UndefOr[Timestamp] = js.undefined
  
  /**
    *  A message associated with a test case. For example, an error message or stack trace. 
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    *  The name of the test case. 
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *  A string that is applied to a series of related test cases. CodeBuild generates the prefix. The prefix depends on the framework used to generate the tests. 
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    *  The ARN of the report to which the test case belongs. 
    */
  var reportArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The status returned by the test case after it was run. Valid statuses are SUCCEEDED, FAILED, ERROR, SKIPPED, and UNKNOWN. 
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    *  The path to the raw data file that contains the test result. 
    */
  var testRawDataPath: js.UndefOr[String] = js.undefined
}
object TestCase {
  
  @scala.inline
  def apply(): TestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCase]
  }
  
  @scala.inline
  implicit class TestCaseMutableBuilder[Self <: TestCase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationInNanoSeconds(value: WrapperLong): Self = StObject.set(x, "durationInNanoSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInNanoSecondsUndefined: Self = StObject.set(x, "durationInNanoSeconds", js.undefined)
    
    @scala.inline
    def setExpired(value: Timestamp): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiredUndefined: Self = StObject.set(x, "expired", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setReportArn(value: NonEmptyString): Self = StObject.set(x, "reportArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportArnUndefined: Self = StObject.set(x, "reportArn", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTestRawDataPath(value: String): Self = StObject.set(x, "testRawDataPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRawDataPathUndefined: Self = StObject.set(x, "testRawDataPath", js.undefined)
  }
}
