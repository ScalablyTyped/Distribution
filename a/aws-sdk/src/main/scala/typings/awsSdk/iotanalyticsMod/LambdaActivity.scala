package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaActivity extends js.Object {
  
  /**
    * The number of messages passed to the Lambda function for processing. The Lambda function must be able to process all of these messages within five minutes, which is the maximum timeout duration for Lambda functions.
    */
  var batchSize: ActivityBatchSize = js.native
  
  /**
    * The name of the Lambda function that is run on the message.
    */
  var lambdaName: LambdaName = js.native
  
  /**
    * The name of the lambda activity.
    */
  var name: ActivityName = js.native
  
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
}
object LambdaActivity {
  
  @scala.inline
  def apply(batchSize: ActivityBatchSize, lambdaName: LambdaName, name: ActivityName): LambdaActivity = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], lambdaName = lambdaName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaActivity]
  }
  
  @scala.inline
  implicit class LambdaActivityOps[Self <: LambdaActivity] (val x: Self) extends AnyVal {
    
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
    def setBatchSize(value: ActivityBatchSize): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaName(value: LambdaName): Self = this.set("lambdaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ActivityName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: ActivityName): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
}
