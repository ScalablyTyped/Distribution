package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorInfo extends js.Object {
  /**
    * 
    A number describing the error programmatically.
    
    */
  var ErrorCode: js.UndefOr[string] = js.native
  /**
    * 
    An optional field to provide more details about the error.
    
    */
  var ErrorString: js.UndefOr[string] = js.native
}

object ErrorInfo {
  @scala.inline
  def apply(ErrorCode: string = null, ErrorString: string = null): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorString != null) __obj.updateDynamic("ErrorString")(ErrorString.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorInfo]
  }
}

