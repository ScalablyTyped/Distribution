package typings.chessboardjs

import typings.chessboardjs.mod.DropOffBoardType
import typings.chessboardjs.mod.OrientationType
import typings.chessboardjs.mod.SpeedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chessboardjsStrings {
  
  @js.native
  sealed trait BoardPositionType extends StObject
  inline def BoardPositionType: BoardPositionType = "BoardPositionType".asInstanceOf[BoardPositionType]
  
  @js.native
  sealed trait black
    extends StObject
       with OrientationType
  inline def black: black = "black".asInstanceOf[black]
  
  @js.native
  sealed trait fast
    extends StObject
       with SpeedType
  inline def fast: fast = "fast".asInstanceOf[fast]
  
  @js.native
  sealed trait fen extends StObject
  inline def fen: fen = "fen".asInstanceOf[fen]
  
  @js.native
  sealed trait flip extends StObject
  inline def flip: flip = "flip".asInstanceOf[flip]
  
  @js.native
  sealed trait slow
    extends StObject
       with SpeedType
  inline def slow: slow = "slow".asInstanceOf[slow]
  
  @js.native
  sealed trait snapback
    extends StObject
       with DropOffBoardType
  inline def snapback: snapback = "snapback".asInstanceOf[snapback]
  
  @js.native
  sealed trait start extends StObject
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait trash
    extends StObject
       with DropOffBoardType
  inline def trash: trash = "trash".asInstanceOf[trash]
  
  @js.native
  sealed trait white
    extends StObject
       with OrientationType
  inline def white: white = "white".asInstanceOf[white]
}
