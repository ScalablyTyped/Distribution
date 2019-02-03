package typings
package chessboardjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chessboardjsMod {
  type BoardPositionType = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in chessboardjs.chessboardjs.Square ]:? chessboardjs.chessboardjs.Piece}
    */ chessboardjsLib.chessboardjsLibStrings.BoardPositionType with js.Any
  type Callback = js.Function0[scala.Unit]
  type DropOffBoardType = chessboardjsLib.chessboardjsLibStrings.snapback | chessboardjsLib.chessboardjsLibStrings.trash
  type OrientationFlipType = chessboardjsLib.chessboardjsLibStrings.flip
  type OrientationType = chessboardjsLib.chessboardjsLibStrings.white | chessboardjsLib.chessboardjsLibStrings.black
  type PositionFenType = chessboardjsLib.chessboardjsLibStrings.fen
  type PositionType = chessboardjsLib.chessboardjsLibStrings.start | java.lang.String | BoardPositionType
  type SpeedType = chessboardjsLib.chessboardjsLibStrings.slow | chessboardjsLib.chessboardjsLibStrings.fast
}
