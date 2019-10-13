package typings.debessmann.debessmannMod._Global_

import typings.debessmann.debessmannMod.DM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var dm: DM
}

object Window {
  @scala.inline
  def apply(dm: DM): Window = {
    val __obj = js.Dynamic.literal(dm = dm)
  
    __obj.asInstanceOf[Window]
  }
}

