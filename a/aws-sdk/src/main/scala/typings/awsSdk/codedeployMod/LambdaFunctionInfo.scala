package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaFunctionInfo extends js.Object {
  /**
    *  The version of a Lambda function that production traffic points to. 
    */
  var currentVersion: js.UndefOr[Version] = js.native
  /**
    *  The alias of a Lambda function. For more information, see AWS Lambda Function Aliases in the AWS Lambda Developer Guide.
    */
  var functionAlias: js.UndefOr[LambdaFunctionAlias] = js.native
  /**
    *  The name of a Lambda function. 
    */
  var functionName: js.UndefOr[LambdaFunctionName] = js.native
  /**
    *  The version of a Lambda function that production traffic points to after the Lambda function is deployed. 
    */
  var targetVersion: js.UndefOr[Version] = js.native
  /**
    *  The percentage of production traffic that the target version of a Lambda function receives. 
    */
  var targetVersionWeight: js.UndefOr[TrafficWeight] = js.native
}

object LambdaFunctionInfo {
  @scala.inline
  def apply(): LambdaFunctionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaFunctionInfo]
  }
  @scala.inline
  implicit class LambdaFunctionInfoOps[Self <: LambdaFunctionInfo] (val x: Self) extends AnyVal {
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
    def setCurrentVersion(value: Version): Self = this.set("currentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentVersion: Self = this.set("currentVersion", js.undefined)
    @scala.inline
    def setFunctionAlias(value: LambdaFunctionAlias): Self = this.set("functionAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionAlias: Self = this.set("functionAlias", js.undefined)
    @scala.inline
    def setFunctionName(value: LambdaFunctionName): Self = this.set("functionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionName: Self = this.set("functionName", js.undefined)
    @scala.inline
    def setTargetVersion(value: Version): Self = this.set("targetVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetVersion: Self = this.set("targetVersion", js.undefined)
    @scala.inline
    def setTargetVersionWeight(value: TrafficWeight): Self = this.set("targetVersionWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetVersionWeight: Self = this.set("targetVersionWeight", js.undefined)
  }
  
}

