package typings
package chessboardjsLib.chessboardjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChessBoardInstance extends js.Object {
  def clear(): scala.Unit = js.native
  def clear(useAnimation: scala.Boolean): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def fen(): java.lang.String = js.native
  def flip(): scala.Unit = js.native
  def move(args: java.lang.String*): BoardPositionType = js.native
  def orientation(): java.lang.String = js.native
  def orientation(side: OrientationFlipType): java.lang.String = js.native
  def orientation(side: OrientationType): java.lang.String = js.native
  def position(): BoardPositionType = js.native
  def position(fen: PositionFenType): java.lang.String = js.native
  def position(newPosition: PositionType): scala.Unit = js.native
  def position(newPosition: PositionType, useAnimation: scala.Boolean): scala.Unit = js.native
  def resize(): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def start(useAnimation: scala.Boolean): scala.Unit = js.native
}

