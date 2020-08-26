package typings.chessJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SquareVerbose extends js.Object {
  /**
    * The string to test if it is a valid move, if it is not then an
    * empty array is returned
    */
  var square: js.UndefOr[String] = js.native
  /** Set to true to return verbose move objects instead of strings */
  var verbose: js.UndefOr[Boolean] = js.native
}

object SquareVerbose {
  @scala.inline
  def apply(): SquareVerbose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SquareVerbose]
  }
  @scala.inline
  implicit class SquareVerboseOps[Self <: SquareVerbose] (val x: Self) extends AnyVal {
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
    def setSquare(value: String): Self = this.set("square", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSquare: Self = this.set("square", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

