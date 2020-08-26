package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeHook extends js.Object {
  /**
    * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function. For more information, see using-lambda.
    */
  var messageVersion: MessageVersion = js.native
  /**
    * The Amazon Resource Name (ARN) of the Lambda function.
    */
  var uri: LambdaARN = js.native
}

object CodeHook {
  @scala.inline
  def apply(messageVersion: MessageVersion, uri: LambdaARN): CodeHook = {
    val __obj = js.Dynamic.literal(messageVersion = messageVersion.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeHook]
  }
  @scala.inline
  implicit class CodeHookOps[Self <: CodeHook] (val x: Self) extends AnyVal {
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
    def setMessageVersion(value: MessageVersion): Self = this.set("messageVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: LambdaARN): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

