package typings.cqrsDashDomain.cqrsDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region defineCommandHandler
trait DefineCommandHandlerOptions extends js.Object {
  /**
    * optional, default is file name without extension
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * optional, if not defined it will pass the whole command...
    */
  var payload: js.UndefOr[String] = js.undefined
  /**
    * optional, default 0
    */
  var version: js.UndefOr[Double] = js.undefined
}

object DefineCommandHandlerOptions {
  @scala.inline
  def apply(name: String = null, payload: String = null, version: Int | Double = null): DefineCommandHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineCommandHandlerOptions]
  }
}

