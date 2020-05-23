package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParametersRequest extends js.Object {
  /**
    * Names of the parameters for which you want to query information.
    */
  var Names: ParameterNameList = js.native
  /**
    * Return decrypted secure string value. Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.
    */
  var WithDecryption: js.UndefOr[Boolean] = js.native
}

object GetParametersRequest {
  @scala.inline
  def apply(Names: ParameterNameList, WithDecryption: js.UndefOr[Boolean] = js.undefined): GetParametersRequest = {
    val __obj = js.Dynamic.literal(Names = Names.asInstanceOf[js.Any])
    if (!js.isUndefined(WithDecryption)) __obj.updateDynamic("WithDecryption")(WithDecryption.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersRequest]
  }
}

