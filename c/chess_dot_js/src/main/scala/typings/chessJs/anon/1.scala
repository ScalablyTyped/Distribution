package typings.chessJs.anon

import typings.chessJs.chessJsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1` extends js.Object {
  /**
    * Pass true if you want this function to output verbose objects
    * instead of strings.
    */
  var verbose: `true` = js.native
}

object `1` {
  @scala.inline
  def apply(verbose: `true`): `1` = {
    val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVerbose(value: `true`): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
  
}

