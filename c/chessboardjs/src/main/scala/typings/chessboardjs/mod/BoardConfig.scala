package typings.chessboardjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoardConfig extends js.Object {
  var appearSpeed: js.UndefOr[Double | SpeedType] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var dropOffBoard: js.UndefOr[DropOffBoardType] = js.native
  var moveSpeed: js.UndefOr[Double | SpeedType] = js.native
  var onChange: js.UndefOr[Callback] = js.native
  var onDragMove: js.UndefOr[Callback] = js.native
  var onDragStart: js.UndefOr[Callback] = js.native
  var onDrop: js.UndefOr[Callback] = js.native
  var onMouseoutSquare: js.UndefOr[Callback] = js.native
  var onMouseoverSquare: js.UndefOr[Callback] = js.native
  var onMoveEnd: js.UndefOr[Callback] = js.native
  var onSnapEnd: js.UndefOr[Callback] = js.native
  var onSnapbackEnd: js.UndefOr[Callback] = js.native
  var orientation: js.UndefOr[OrientationType] = js.native
  var pieceTheme: js.UndefOr[String | Callback] = js.native
  var position: js.UndefOr[PositionType] = js.native
  var showErrors: js.UndefOr[Boolean | String | Callback] = js.native
  var showNotation: js.UndefOr[Boolean] = js.native
  var snapSpeed: js.UndefOr[Double | SpeedType] = js.native
  var snapbackSpeed: js.UndefOr[Double | SpeedType] = js.native
  var sparePieces: js.UndefOr[Boolean] = js.native
  var trashSpeed: js.UndefOr[Double | SpeedType] = js.native
}

object BoardConfig {
  @scala.inline
  def apply(): BoardConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoardConfig]
  }
  @scala.inline
  implicit class BoardConfigOps[Self <: BoardConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppearSpeed(value: Double | SpeedType): Self = this.set("appearSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppearSpeed: Self = this.set("appearSpeed", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setDropOffBoard(value: DropOffBoardType): Self = this.set("dropOffBoard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropOffBoard: Self = this.set("dropOffBoard", js.undefined)
    @scala.inline
    def setMoveSpeed(value: Double | SpeedType): Self = this.set("moveSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveSpeed: Self = this.set("moveSpeed", js.undefined)
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnDragMove(value: () => Unit): Self = this.set("onDragMove", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDragMove: Self = this.set("onDragMove", js.undefined)
    @scala.inline
    def setOnDragStart(value: () => Unit): Self = this.set("onDragStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDrop(value: () => Unit): Self = this.set("onDrop", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setOnMouseoutSquare(value: () => Unit): Self = this.set("onMouseoutSquare", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMouseoutSquare: Self = this.set("onMouseoutSquare", js.undefined)
    @scala.inline
    def setOnMouseoverSquare(value: () => Unit): Self = this.set("onMouseoverSquare", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMouseoverSquare: Self = this.set("onMouseoverSquare", js.undefined)
    @scala.inline
    def setOnMoveEnd(value: () => Unit): Self = this.set("onMoveEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMoveEnd: Self = this.set("onMoveEnd", js.undefined)
    @scala.inline
    def setOnSnapEnd(value: () => Unit): Self = this.set("onSnapEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSnapEnd: Self = this.set("onSnapEnd", js.undefined)
    @scala.inline
    def setOnSnapbackEnd(value: () => Unit): Self = this.set("onSnapbackEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSnapbackEnd: Self = this.set("onSnapbackEnd", js.undefined)
    @scala.inline
    def setOrientation(value: OrientationType): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPieceThemeFunction0(value: () => Unit): Self = this.set("pieceTheme", js.Any.fromFunction0(value))
    @scala.inline
    def setPieceTheme(value: String | Callback): Self = this.set("pieceTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePieceTheme: Self = this.set("pieceTheme", js.undefined)
    @scala.inline
    def setPosition(value: PositionType): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowErrorsFunction0(value: () => Unit): Self = this.set("showErrors", js.Any.fromFunction0(value))
    @scala.inline
    def setShowErrors(value: Boolean | String | Callback): Self = this.set("showErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowErrors: Self = this.set("showErrors", js.undefined)
    @scala.inline
    def setShowNotation(value: Boolean): Self = this.set("showNotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNotation: Self = this.set("showNotation", js.undefined)
    @scala.inline
    def setSnapSpeed(value: Double | SpeedType): Self = this.set("snapSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapSpeed: Self = this.set("snapSpeed", js.undefined)
    @scala.inline
    def setSnapbackSpeed(value: Double | SpeedType): Self = this.set("snapbackSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapbackSpeed: Self = this.set("snapbackSpeed", js.undefined)
    @scala.inline
    def setSparePieces(value: Boolean): Self = this.set("sparePieces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSparePieces: Self = this.set("sparePieces", js.undefined)
    @scala.inline
    def setTrashSpeed(value: Double | SpeedType): Self = this.set("trashSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrashSpeed: Self = this.set("trashSpeed", js.undefined)
  }
  
}

