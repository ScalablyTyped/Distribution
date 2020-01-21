package typings.chessJs

import typings.chessJs.chessJsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSquare extends js.Object {
  /**
    * The string to test if it is a valid move, if it is not then an
    * empty array is returned
    */
  var square: js.UndefOr[String] = js.undefined
  /** Set to true to return verbose move objects instead of strings */
  var verbose: `true`
}

object AnonSquare {
  @scala.inline
  def apply(verbose: `true`, square: String = null): AnonSquare = {
    val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
    if (square != null) __obj.updateDynamic("square")(square.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSquare]
  }
}

