package typings.chessboardjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ChessBoard: typings.chessboardjs.mod.ChessBoardFactory = typings.chessboardjs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ChessBoard").asInstanceOf[typings.chessboardjs.mod.ChessBoardFactory]

type BoardPositionType = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in chessboardjs.chessboardjs.Square ]:? chessboardjs.chessboardjs.Piece}
  */ typings.chessboardjs.chessboardjsStrings.BoardPositionType & org.scalablytyped.runtime.TopLevel[js.Any]

type Callback = js.Function0[scala.Unit]

type OrientationFlipType = typings.chessboardjs.chessboardjsStrings.flip

type PositionFenType = typings.chessboardjs.chessboardjsStrings.fen

type PositionType = typings.chessboardjs.chessboardjsStrings.start | java.lang.String | typings.chessboardjs.mod.BoardPositionType
