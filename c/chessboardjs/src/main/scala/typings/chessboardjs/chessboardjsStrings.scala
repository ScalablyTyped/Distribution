package typings.chessboardjs

import typings.chessboardjs.chessboardjsMod.DropOffBoardType
import typings.chessboardjs.chessboardjsMod.OrientationType
import typings.chessboardjs.chessboardjsMod.SpeedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object chessboardjsStrings {
  @js.native
  sealed trait BoardPositionType extends js.Object
  
  @js.native
  sealed trait black extends OrientationType
  
  @js.native
  sealed trait fast extends SpeedType
  
  @js.native
  sealed trait fen extends js.Object
  
  @js.native
  sealed trait flip extends js.Object
  
  @js.native
  sealed trait slow extends SpeedType
  
  @js.native
  sealed trait snapback extends DropOffBoardType
  
  @js.native
  sealed trait start extends js.Object
  
  @js.native
  sealed trait trash extends DropOffBoardType
  
  @js.native
  sealed trait white extends OrientationType
  
  @scala.inline
  def BoardPositionType: BoardPositionType = "BoardPositionType".asInstanceOf[BoardPositionType]
  @scala.inline
  def black: black = "black".asInstanceOf[black]
  @scala.inline
  def fast: fast = "fast".asInstanceOf[fast]
  @scala.inline
  def fen: fen = "fen".asInstanceOf[fen]
  @scala.inline
  def flip: flip = "flip".asInstanceOf[flip]
  @scala.inline
  def slow: slow = "slow".asInstanceOf[slow]
  @scala.inline
  def snapback: snapback = "snapback".asInstanceOf[snapback]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def trash: trash = "trash".asInstanceOf[trash]
  @scala.inline
  def white: white = "white".asInstanceOf[white]
}

