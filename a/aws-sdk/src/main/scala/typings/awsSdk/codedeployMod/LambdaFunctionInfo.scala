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
  def apply(
    currentVersion: Version = null,
    functionAlias: LambdaFunctionAlias = null,
    functionName: LambdaFunctionName = null,
    targetVersion: Version = null,
    targetVersionWeight: js.UndefOr[TrafficWeight] = js.undefined
  ): LambdaFunctionInfo = {
    val __obj = js.Dynamic.literal()
    if (currentVersion != null) __obj.updateDynamic("currentVersion")(currentVersion.asInstanceOf[js.Any])
    if (functionAlias != null) __obj.updateDynamic("functionAlias")(functionAlias.asInstanceOf[js.Any])
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (targetVersion != null) __obj.updateDynamic("targetVersion")(targetVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(targetVersionWeight)) __obj.updateDynamic("targetVersionWeight")(targetVersionWeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionInfo]
  }
}

