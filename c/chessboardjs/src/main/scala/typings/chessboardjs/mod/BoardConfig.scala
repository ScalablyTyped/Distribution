package typings.chessboardjs.mod

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
    onChange: () => Unit = null,
    onDragMove: () => Unit = null,
    onDragStart: () => Unit = null,
    onDrop: () => Unit = null,
    onMouseoutSquare: () => Unit = null,
    onMouseoverSquare: () => Unit = null,
    onMoveEnd: () => Unit = null,
    onSnapEnd: () => Unit = null,
    onSnapbackEnd: () => Unit = null,
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
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (dropOffBoard != null) __obj.updateDynamic("dropOffBoard")(dropOffBoard.asInstanceOf[js.Any])
    if (moveSpeed != null) __obj.updateDynamic("moveSpeed")(moveSpeed.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction0(onChange))
    if (onDragMove != null) __obj.updateDynamic("onDragMove")(js.Any.fromFunction0(onDragMove))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction0(onDrop))
    if (onMouseoutSquare != null) __obj.updateDynamic("onMouseoutSquare")(js.Any.fromFunction0(onMouseoutSquare))
    if (onMouseoverSquare != null) __obj.updateDynamic("onMouseoverSquare")(js.Any.fromFunction0(onMouseoverSquare))
    if (onMoveEnd != null) __obj.updateDynamic("onMoveEnd")(js.Any.fromFunction0(onMoveEnd))
    if (onSnapEnd != null) __obj.updateDynamic("onSnapEnd")(js.Any.fromFunction0(onSnapEnd))
    if (onSnapbackEnd != null) __obj.updateDynamic("onSnapbackEnd")(js.Any.fromFunction0(onSnapbackEnd))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pieceTheme != null) __obj.updateDynamic("pieceTheme")(pieceTheme.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (showErrors != null) __obj.updateDynamic("showErrors")(showErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(showNotation)) __obj.updateDynamic("showNotation")(showNotation.asInstanceOf[js.Any])
    if (snapSpeed != null) __obj.updateDynamic("snapSpeed")(snapSpeed.asInstanceOf[js.Any])
    if (snapbackSpeed != null) __obj.updateDynamic("snapbackSpeed")(snapbackSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(sparePieces)) __obj.updateDynamic("sparePieces")(sparePieces.asInstanceOf[js.Any])
    if (trashSpeed != null) __obj.updateDynamic("trashSpeed")(trashSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardConfig]
  }
}

