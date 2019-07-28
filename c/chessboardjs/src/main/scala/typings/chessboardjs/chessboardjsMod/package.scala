package typings.chessboardjs

import typings.chessboardjs.chessboardjsStrings.fen
import typings.chessboardjs.chessboardjsStrings.flip
import typings.chessboardjs.chessboardjsStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chessboardjsMod {
  type BoardPositionType = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in chessboardjs.chessboardjs.Square ]:? chessboardjs.chessboardjs.Piece}
    */ typings.chessboardjs.chessboardjsStrings.BoardPositionType with js.Any
  type Callback = js.Function0[Unit]
  type OrientationFlipType = flip
  type PositionFenType = fen
  type PositionType = start | String | BoardPositionType
}
