package typings.chessboardjs.chessboardjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardConfig extends js.Object {
  var appearSpeed: js.UndefOr[Double | SpeedType] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var dropOffBoard: js.UndefOr[DropOffBoardType] = js.undefined
  var moveSpeed: js.UndefOr[Double | SpeedType] = js.undefined
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
  var pieceTheme: js.UndefOr[String | Callback] = js.undefined
  var position: js.UndefOr[PositionType] = js.undefined
  var showErrors: js.UndefOr[Boolean | String | Callback] = js.undefined
  var showNotation: js.UndefOr[Boolean] = js.undefined
  var snapSpeed: js.UndefOr[Double | SpeedType] = js.undefined
  var snapbackSpeed: js.UndefOr[Double | SpeedType] = js.undefined
  var sparePieces: js.UndefOr[Boolean] = js.undefined
  var trashSpeed: js.UndefOr[Double | SpeedType] = js.undefined
}

object BoardConfig {
  @scala.inline
  def apply(
    appearSpeed: Double | SpeedType = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    dropOffBoard: DropOffBoardType = null,
    moveSpeed: Double | SpeedType = null,
    onChange: Callback = null,
    onDragMove: Callback = null,
    onDragStart: Callback = null,
    onDrop: Callback = null,
    onMouseoutSquare: Callback = null,
    onMouseoverSquare: Callback = null,
    onMoveEnd: Callback = null,
    onSnapEnd: Callback = null,
    onSnapbackEnd: Callback = null,
    orientation: OrientationType = null,
    pieceTheme: String | Callback = null,
    position: PositionType = null,
    showErrors: Boolean | String | Callback = null,
    showNotation: js.UndefOr[Boolean] = js.undefined,
    snapSpeed: Double | SpeedType = null,
    snapbackSpeed: Double | SpeedType = null,
    sparePieces: js.UndefOr[Boolean] = js.undefined,
    trashSpeed: Double | SpeedType = null
  ): BoardConfig = {
    val __obj = js.Dynamic.literal()
    if (appearSpeed != null) __obj.updateDynamic("appearSpeed")(appearSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (dropOffBoard != null) __obj.updateDynamic("dropOffBoard")(dropOffBoard)
    if (moveSpeed != null) __obj.updateDynamic("moveSpeed")(moveSpeed.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(onDragMove)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onMouseoutSquare != null) __obj.updateDynamic("onMouseoutSquare")(onMouseoutSquare)
    if (onMouseoverSquare != null) __obj.updateDynamic("onMouseoverSquare")(onMouseoverSquare)
    if (onMoveEnd != null) __obj.updateDynamic("onMoveEnd")(onMoveEnd)
    if (onSnapEnd != null) __obj.updateDynamic("onSnapEnd")(onSnapEnd)
    if (onSnapbackEnd != null) __obj.updateDynamic("onSnapbackEnd")(onSnapbackEnd)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (pieceTheme != null) __obj.updateDynamic("pieceTheme")(pieceTheme.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (showErrors != null) __obj.updateDynamic("showErrors")(showErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(showNotation)) __obj.updateDynamic("showNotation")(showNotation)
    if (snapSpeed != null) __obj.updateDynamic("snapSpeed")(snapSpeed.asInstanceOf[js.Any])
    if (snapbackSpeed != null) __obj.updateDynamic("snapbackSpeed")(snapbackSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(sparePieces)) __obj.updateDynamic("sparePieces")(sparePieces)
    if (trashSpeed != null) __obj.updateDynamic("trashSpeed")(trashSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardConfig]
  }
}

