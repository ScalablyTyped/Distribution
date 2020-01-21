package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListThingPrincipalsResponse extends js.Object {
  /**
    * The principals associated with the thing.
    */
  var principals: js.UndefOr[Principals] = js.native
}

object ListThingPrincipalsResponse {
  @scala.inline
  def apply(principals: Principals = null): ListThingPrincipalsResponse = {
    val __obj = js.Dynamic.literal()
    if (principals != null) __obj.updateDynamic("principals")(principals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThingPrincipalsResponse]
  }
}

