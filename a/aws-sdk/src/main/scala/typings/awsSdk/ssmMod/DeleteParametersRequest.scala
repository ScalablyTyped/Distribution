package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteParametersRequest extends js.Object {
  /**
    * The names of the parameters to delete.
    */
  var Names: ParameterNameList = js.native
}

object DeleteParametersRequest {
  @scala.inline
  def apply(Names: ParameterNameList): DeleteParametersRequest = {
    val __obj = js.Dynamic.literal(Names = Names.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersRequest]
  }
}

