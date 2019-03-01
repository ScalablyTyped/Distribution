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
  type OrientationFlipType = chessboardjsLib.chessboardjsLibStrings.flip
  type PositionFenType = chessboardjsLib.chessboardjsLibStrings.fen
  type PositionType = chessboardjsLib.chessboardjsLibStrings.start | java.lang.String | BoardPositionType
}
