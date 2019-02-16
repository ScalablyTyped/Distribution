package typings
package cometdLib.cometdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  var incoming: js.UndefOr[Listener] = js.undefined
  var outgoing: js.UndefOr[Listener] = js.undefined
  var registered: js.UndefOr[js.Function2[/* name */ java.lang.String, /* cometd */ CometD, scala.Unit]] = js.undefined
  var unregistered: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

