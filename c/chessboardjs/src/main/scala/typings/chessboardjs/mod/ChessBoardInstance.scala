package typings.chessboardjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChessBoardInstance extends js.Object {
  def clear(): Unit = js.native
  def clear(useAnimation: Boolean): Unit = js.native
  def destroy(): Unit = js.native
  def fen(): String = js.native
  def flip(): Unit = js.native
  def move(args: String*): BoardPositionType = js.native
  def orientation(): String = js.native
  def orientation(side: OrientationFlipType): String = js.native
  def orientation(side: OrientationType): String = js.native
  def position(): BoardPositionType = js.native
  def position(fen: PositionFenType): String = js.native
  def position(newPosition: PositionType): Unit = js.native
  def position(newPosition: PositionType, useAnimation: Boolean): Unit = js.native
  def resize(): Unit = js.native
  def start(): Unit = js.native
  def start(useAnimation: Boolean): Unit = js.native
}

