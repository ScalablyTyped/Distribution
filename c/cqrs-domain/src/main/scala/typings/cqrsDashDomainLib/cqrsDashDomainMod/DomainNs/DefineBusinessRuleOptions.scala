package typings
package cqrsDashDomainLib.cqrsDashDomainMod.DomainNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region defineBusinessRule

trait DefineBusinessRuleOptions extends js.Object {
  /**
           * optional
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * optional, default is file name without extension
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * optional, default Infinity, all business rules will be sorted by this value
           */
  var priority: js.UndefOr[scala.Double] = js.undefined
}

