package typings
package chessboardjsLib.chessboardjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardConfig extends js.Object {
  var appearSpeed: js.UndefOr[scala.Double | SpeedType] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var dropOffBoard: js.UndefOr[DropOffBoardType] = js.undefined
  var moveSpeed: js.UndefOr[scala.Double | SpeedType] = js.undefined
  var onChange: js.UndefOr[Callback] = js.undefined
  var onDragMove: js.UndefOr[Callback] = js.undefined
  var onDragStart: js.UndefOr[Callback] = js.undefined
  var onDrop: js.UndefOr[Callback] = js.undefined
  var onMouseoutSquare: js.UndefOr[Callback] = js.undefined
  var onMouseoverSquare: js.UndefOr[Callback] = js.undefined
  var onMoveEnd: js.UndefOr[Callback] = js.undefined
  var onSnapEnd: js.UndefOr[Callback] = js.undefined
  var onSnapbackEnd: js.UndefOr[Callback] = js.undefined
  var orientation: js.UndefOr[OrientationType] = js.undefined
  var pieceTheme: js.UndefOr[java.lang.String | Callback] = js.undefined
  var position: js.UndefOr[PositionType] = js.undefined
  var showErrors: js.UndefOr[scala.Boolean | java.lang.String | Callback] = js.undefined
  var showNotation: js.UndefOr[scala.Boolean] = js.undefined
  var snapSpeed: js.UndefOr[scala.Double | SpeedType] = js.undefined
  var snapbackSpeed: js.UndefOr[scala.Double | SpeedType] = js.undefined
  var sparePieces: js.UndefOr[scala.Boolean] = js.undefined
  var trashSpeed: js.UndefOr[scala.Double | SpeedType] = js.undefined
}

