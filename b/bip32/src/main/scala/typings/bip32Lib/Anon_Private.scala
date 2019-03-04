package typings
package bip32Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Private extends js.Object {
   // UInt32
  var `private`: scala.Double
  var public: scala.Double
}

object Anon_Private {
  @scala.inline
  def apply(`private`: scala.Double, public: scala.Double): Anon_Private = {
    val __obj = js.Dynamic.literal(public = public)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[Anon_Private]
  }
}

