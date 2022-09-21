package typings.chessboardjs.mod

import org.scalablytyped.runtime.TopLevel
import typings.chessboardjs.chessboardjsStrings.fen
import typings.chessboardjs.chessboardjsStrings.flip
import typings.chessboardjs.chessboardjsStrings.start
import typings.chessboardjs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ChessBoard: ChessBoardFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ChessBoard").asInstanceOf[ChessBoardFactory]

type BoardPositionType = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in chessboardjs.chessboardjs.Square ]:? chessboardjs.chessboardjs.Piece}
  */ typings.chessboardjs.chessboardjsStrings.BoardPositionType & TopLevel[Any]

type Callback = js.Function0[Unit]

type OrientationFlipType = flip

type PositionFenType = fen

type PositionType = start | String | BoardPositionType
