package typings
package cqrsDashDomainLib.cqrsDashDomainMod.DomainNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region defineCommandHandler
trait DefineCommandHandlerOptions extends js.Object {
  /**
    * optional, default is file name without extension
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, if not defined it will pass the whole command...
    */
  var payload: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default 0
    */
  var version: js.UndefOr[scala.Double] = js.undefined
}

