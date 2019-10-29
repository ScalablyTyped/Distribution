package typings.bemDashCn.bemDashCnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBlock extends BemItem {
  def apply(elemNameOrMods: (String | BemMods)*): BemItem with String = js.native
}

