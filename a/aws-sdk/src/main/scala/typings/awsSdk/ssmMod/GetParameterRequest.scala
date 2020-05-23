package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParameterRequest extends js.Object {
  /**
    * The name of the parameter you want to query.
    */
  var Name: PSParameterName = js.native
  /**
    * Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.
    */
  var WithDecryption: js.UndefOr[Boolean] = js.native
}

object GetParameterRequest {
  @scala.inline
  def apply(Name: PSParameterName, WithDecryption: js.UndefOr[Boolean] = js.undefined): GetParameterRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (!js.isUndefined(WithDecryption)) __obj.updateDynamic("WithDecryption")(WithDecryption.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameterRequest]
  }
}

