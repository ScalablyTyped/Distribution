package typings.chessJs.anon

import typings.chessJs.chessJsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Square extends js.Object {
  /**
    * The string to test if it is a valid move, if it is not then an
    * empty array is returned
    */
  var square: js.UndefOr[String] = js.native
  /** Set to true to return verbose move objects instead of strings */
  var verbose: `true` = js.native
}

object Square {
  @scala.inline
  def apply(verbose: `true`): Square = {
    val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Square]
  }
  @scala.inline
  implicit class SquareOps[Self <: Square] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setSquare(value: String): Self = this.set("square", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSquare: Self = this.set("square", js.undefined)
  }
  
}

