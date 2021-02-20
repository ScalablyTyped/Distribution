package typings.chessboardjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoardConfig extends StObject {
  
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
  implicit class BoardConfigMutableBuilder[Self <: BoardConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppearSpeed(value: Double | SpeedType): Self = StObject.set(x, "appearSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearSpeedUndefined: Self = StObject.set(x, "appearSpeed", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setDropOffBoard(value: DropOffBoardType): Self = StObject.set(x, "dropOffBoard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropOffBoardUndefined: Self = StObject.set(x, "dropOffBoard", js.undefined)
    
    @scala.inline
    def setMoveSpeed(value: Double | SpeedType): Self = StObject.set(x, "moveSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveSpeedUndefined: Self = StObject.set(x, "moveSpeed", js.undefined)
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnDragMove(value: () => Unit): Self = StObject.set(x, "onDragMove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: () => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    @scala.inline
    def setOnDrop(value: () => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    @scala.inline
    def setOnMouseoutSquare(value: () => Unit): Self = StObject.set(x, "onMouseoutSquare", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseoutSquareUndefined: Self = StObject.set(x, "onMouseoutSquare", js.undefined)
    
    @scala.inline
    def setOnMouseoverSquare(value: () => Unit): Self = StObject.set(x, "onMouseoverSquare", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseoverSquareUndefined: Self = StObject.set(x, "onMouseoverSquare", js.undefined)
    
    @scala.inline
    def setOnMoveEnd(value: () => Unit): Self = StObject.set(x, "onMoveEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMoveEndUndefined: Self = StObject.set(x, "onMoveEnd", js.undefined)
    
    @scala.inline
    def setOnSnapEnd(value: () => Unit): Self = StObject.set(x, "onSnapEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSnapEndUndefined: Self = StObject.set(x, "onSnapEnd", js.undefined)
    
    @scala.inline
    def setOnSnapbackEnd(value: () => Unit): Self = StObject.set(x, "onSnapbackEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSnapbackEndUndefined: Self = StObject.set(x, "onSnapbackEnd", js.undefined)
    
    @scala.inline
    def setOrientation(value: OrientationType): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPieceTheme(value: String | Callback): Self = StObject.set(x, "pieceTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieceThemeFunction0(value: () => Unit): Self = StObject.set(x, "pieceTheme", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPieceThemeUndefined: Self = StObject.set(x, "pieceTheme", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowErrors(value: Boolean | String | Callback): Self = StObject.set(x, "showErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowErrorsFunction0(value: () => Unit): Self = StObject.set(x, "showErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowErrorsUndefined: Self = StObject.set(x, "showErrors", js.undefined)
    
    @scala.inline
    def setShowNotation(value: Boolean): Self = StObject.set(x, "showNotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNotationUndefined: Self = StObject.set(x, "showNotation", js.undefined)
    
    @scala.inline
    def setSnapSpeed(value: Double | SpeedType): Self = StObject.set(x, "snapSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapSpeedUndefined: Self = StObject.set(x, "snapSpeed", js.undefined)
    
    @scala.inline
    def setSnapbackSpeed(value: Double | SpeedType): Self = StObject.set(x, "snapbackSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapbackSpeedUndefined: Self = StObject.set(x, "snapbackSpeed", js.undefined)
    
    @scala.inline
    def setSparePieces(value: Boolean): Self = StObject.set(x, "sparePieces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSparePiecesUndefined: Self = StObject.set(x, "sparePieces", js.undefined)
    
    @scala.inline
    def setTrashSpeed(value: Double | SpeedType): Self = StObject.set(x, "trashSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrashSpeedUndefined: Self = StObject.set(x, "trashSpeed", js.undefined)
  }
}
