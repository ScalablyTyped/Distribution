package typings
package chromeLib.chromeNs.historyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VisitItem extends js.Object {
  /** The unique identifier for the item. */
  var id: java.lang.String
  /** The visit ID of the referrer. */
  var referringVisitId: java.lang.String
  /** The transition type for this visit from its referrer. */
  var transition: java.lang.String
  /** The unique identifier for this visit. */
  var visitId: java.lang.String
  /** Optional. When this visit occurred, represented in milliseconds since the epoch. */
  var visitTime: js.UndefOr[scala.Double] = js.undefined
}

