package typings.chayns.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic Functions
  * chayns.passKit
  */
@JSGlobal("chayns.passKit")
@js.native
object passKit extends js.Object {
  def getInstalled(): js.Promise[_] = js.native
  def isInstalled(identifier: String): js.Promise[_] = js.native
}

