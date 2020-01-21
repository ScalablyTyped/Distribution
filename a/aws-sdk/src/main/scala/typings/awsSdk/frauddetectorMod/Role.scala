package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Role extends js.Object {
  /**
    * The role ARN.
    */
  var arn: String = js.native
  /**
    * The role name.
    */
  var name: String = js.native
}

object Role {
  @scala.inline
  def apply(arn: String, name: String): Role = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Role]
  }
}

