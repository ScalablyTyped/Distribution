package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationId extends js.Object {
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The revision number of the configuration.
    */
  var Revision: js.UndefOr[integer] = js.native
}

object ConfigurationId {
  @scala.inline
  def apply(Id: string = null, Revision: js.UndefOr[integer] = js.undefined): ConfigurationId = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (!js.isUndefined(Revision)) __obj.updateDynamic("Revision")(Revision.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationId]
  }
}

