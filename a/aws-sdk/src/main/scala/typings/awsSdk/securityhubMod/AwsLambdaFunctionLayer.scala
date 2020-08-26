package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaFunctionLayer extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the function layer.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The size of the layer archive in bytes.
    */
  var CodeSize: js.UndefOr[Integer] = js.native
}

object AwsLambdaFunctionLayer {
  @scala.inline
  def apply(): AwsLambdaFunctionLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionLayer]
  }
  @scala.inline
  implicit class AwsLambdaFunctionLayerOps[Self <: AwsLambdaFunctionLayer] (val x: Self) extends AnyVal {
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
    def setArn(value: NonEmptyString): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCodeSize(value: Integer): Self = this.set("CodeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeSize: Self = this.set("CodeSize", js.undefined)
  }
  
}

