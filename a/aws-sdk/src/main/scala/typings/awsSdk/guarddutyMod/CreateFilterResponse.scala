package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFilterResponse extends js.Object {
  /**
    * The name of the successfully created filter.
    */
  var Name: FilterName = js.native
}

object CreateFilterResponse {
  @scala.inline
  def apply(Name: FilterName): CreateFilterResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateFilterResponse]
  }
}

