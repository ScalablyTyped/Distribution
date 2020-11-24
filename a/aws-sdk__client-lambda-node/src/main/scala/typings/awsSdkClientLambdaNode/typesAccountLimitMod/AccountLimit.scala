package typings.awsSdkClientLambdaNode.typesAccountLimitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountLimit extends js.Object {
  
  /**
    * <p>Size, in bytes, of code/dependencies that you can zip into a deployment package (uncompressed zip/jar size) for uploading. The default limit is 250 MB.</p>
    */
  var CodeSizeUnzipped: js.UndefOr[Double] = js.native
  
  /**
    * <p>Size, in bytes, of a single zipped code/dependencies package you can upload for your Lambda function(.zip/.jar file). Try using Amazon S3 for uploading larger files. Default limit is 50 MB.</p>
    */
  var CodeSizeZipped: js.UndefOr[Double] = js.native
  
  /**
    * <p>Number of simultaneous executions of your function per region. The default limit is 1000.</p>
    */
  var ConcurrentExecutions: js.UndefOr[Double] = js.native
  
  /**
    * <p>Maximum size, in bytes, of a code package you can upload per region. The default size is 75 GB. </p>
    */
  var TotalCodeSize: js.UndefOr[Double] = js.native
  
  /**
    * <p>The number of concurrent executions available to functions that do not have concurrency limits set. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
    */
  var UnreservedConcurrentExecutions: js.UndefOr[Double] = js.native
}
object AccountLimit {
  
  @scala.inline
  def apply(): AccountLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountLimit]
  }
  
  @scala.inline
  implicit class AccountLimitOps[Self <: AccountLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCodeSizeUnzipped(value: Double): Self = this.set("CodeSizeUnzipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeSizeUnzipped: Self = this.set("CodeSizeUnzipped", js.undefined)
    
    @scala.inline
    def setCodeSizeZipped(value: Double): Self = this.set("CodeSizeZipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeSizeZipped: Self = this.set("CodeSizeZipped", js.undefined)
    
    @scala.inline
    def setConcurrentExecutions(value: Double): Self = this.set("ConcurrentExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrentExecutions: Self = this.set("ConcurrentExecutions", js.undefined)
    
    @scala.inline
    def setTotalCodeSize(value: Double): Self = this.set("TotalCodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCodeSize: Self = this.set("TotalCodeSize", js.undefined)
    
    @scala.inline
    def setUnreservedConcurrentExecutions(value: Double): Self = this.set("UnreservedConcurrentExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreservedConcurrentExecutions: Self = this.set("UnreservedConcurrentExecutions", js.undefined)
  }
}
