package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    durationInNanoSeconds: js.UndefOr[WrapperLong] = js.undefined,
    expired: Timestamp = null,
    message: String = null,
    name: String = null,
    prefix: String = null,
    reportArn: NonEmptyString = null,
    status: String = null,
    testRawDataPath: String = null
  ): TestCase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(durationInNanoSeconds)) __obj.updateDynamic("durationInNanoSeconds")(durationInNanoSeconds.get.asInstanceOf[js.Any])
    if (expired != null) __obj.updateDynamic("expired")(expired.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (reportArn != null) __obj.updateDynamic("reportArn")(reportArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (testRawDataPath != null) __obj.updateDynamic("testRawDataPath")(testRawDataPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCase]
  }
}

