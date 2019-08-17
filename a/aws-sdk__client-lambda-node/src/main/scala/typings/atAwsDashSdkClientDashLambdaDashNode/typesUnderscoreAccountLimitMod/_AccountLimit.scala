package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreAccountLimitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AccountLimit extends js.Object {
  /**
    * <p>Size, in bytes, of code/dependencies that you can zip into a deployment package (uncompressed zip/jar size) for uploading. The default limit is 250 MB.</p>
    */
  var CodeSizeUnzipped: js.UndefOr[Double] = js.undefined
  /**
    * <p>Size, in bytes, of a single zipped code/dependencies package you can upload for your Lambda function(.zip/.jar file). Try using Amazon S3 for uploading larger files. Default limit is 50 MB.</p>
    */
  var CodeSizeZipped: js.UndefOr[Double] = js.undefined
  /**
    * <p>Number of simultaneous executions of your function per region. The default limit is 1000.</p>
    */
  var ConcurrentExecutions: js.UndefOr[Double] = js.undefined
  /**
    * <p>Maximum size, in bytes, of a code package you can upload per region. The default size is 75 GB. </p>
    */
  var TotalCodeSize: js.UndefOr[Double] = js.undefined
  /**
    * <p>The number of concurrent executions available to functions that do not have concurrency limits set. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
    */
  var UnreservedConcurrentExecutions: js.UndefOr[Double] = js.undefined
}

object _AccountLimit {
  @scala.inline
  def apply(
    CodeSizeUnzipped: Int | Double = null,
    CodeSizeZipped: Int | Double = null,
    ConcurrentExecutions: Int | Double = null,
    TotalCodeSize: Int | Double = null,
    UnreservedConcurrentExecutions: Int | Double = null
  ): _AccountLimit = {
    val __obj = js.Dynamic.literal()
    if (CodeSizeUnzipped != null) __obj.updateDynamic("CodeSizeUnzipped")(CodeSizeUnzipped.asInstanceOf[js.Any])
    if (CodeSizeZipped != null) __obj.updateDynamic("CodeSizeZipped")(CodeSizeZipped.asInstanceOf[js.Any])
    if (ConcurrentExecutions != null) __obj.updateDynamic("ConcurrentExecutions")(ConcurrentExecutions.asInstanceOf[js.Any])
    if (TotalCodeSize != null) __obj.updateDynamic("TotalCodeSize")(TotalCodeSize.asInstanceOf[js.Any])
    if (UnreservedConcurrentExecutions != null) __obj.updateDynamic("UnreservedConcurrentExecutions")(UnreservedConcurrentExecutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AccountLimit]
  }
}

