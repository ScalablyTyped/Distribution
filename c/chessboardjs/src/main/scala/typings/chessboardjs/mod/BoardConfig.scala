package typings.chessboardjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoardConfig extends StObject {
  
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
  
  inline def apply(): BoardConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoardConfig]
  }
  
  extension [Self <: BoardConfig](x: Self) {
    
    inline def setAppearSpeed(value: Double | SpeedType): Self = StObject.set(x, "appearSpeed", value.asInstanceOf[js.Any])
    
    inline def setAppearSpeedUndefined: Self = StObject.set(x, "appearSpeed", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setDropOffBoard(value: DropOffBoardType): Self = StObject.set(x, "dropOffBoard", value.asInstanceOf[js.Any])
    
    inline def setDropOffBoardUndefined: Self = StObject.set(x, "dropOffBoard", js.undefined)
    
    inline def setMoveSpeed(value: Double | SpeedType): Self = StObject.set(x, "moveSpeed", value.asInstanceOf[js.Any])
    
    inline def setMoveSpeedUndefined: Self = StObject.set(x, "moveSpeed", js.undefined)
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnDragMove(value: () => Unit): Self = StObject.set(x, "onDragMove", js.Any.fromFunction0(value))
    
    inline def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
    
    inline def setOnDragStart(value: () => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction0(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDrop(value: () => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction0(value))
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnMouseoutSquare(value: () => Unit): Self = StObject.set(x, "onMouseoutSquare", js.Any.fromFunction0(value))
    
    inline def setOnMouseoutSquareUndefined: Self = StObject.set(x, "onMouseoutSquare", js.undefined)
    
    inline def setOnMouseoverSquare(value: () => Unit): Self = StObject.set(x, "onMouseoverSquare", js.Any.fromFunction0(value))
    
    inline def setOnMouseoverSquareUndefined: Self = StObject.set(x, "onMouseoverSquare", js.undefined)
    
    inline def setOnMoveEnd(value: () => Unit): Self = StObject.set(x, "onMoveEnd", js.Any.fromFunction0(value))
    
    inline def setOnMoveEndUndefined: Self = StObject.set(x, "onMoveEnd", js.undefined)
    
    inline def setOnSnapEnd(value: () => Unit): Self = StObject.set(x, "onSnapEnd", js.Any.fromFunction0(value))
    
    inline def setOnSnapEndUndefined: Self = StObject.set(x, "onSnapEnd", js.undefined)
    
    inline def setOnSnapbackEnd(value: () => Unit): Self = StObject.set(x, "onSnapbackEnd", js.Any.fromFunction0(value))
    
    inline def setOnSnapbackEndUndefined: Self = StObject.set(x, "onSnapbackEnd", js.undefined)
    
    inline def setOrientation(value: OrientationType): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPieceTheme(value: String | Callback): Self = StObject.set(x, "pieceTheme", value.asInstanceOf[js.Any])
    
    inline def setPieceThemeFunction0(value: () => Unit): Self = StObject.set(x, "pieceTheme", js.Any.fromFunction0(value))
    
    inline def setPieceThemeUndefined: Self = StObject.set(x, "pieceTheme", js.undefined)
    
    inline def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowErrors(value: Boolean | String | Callback): Self = StObject.set(x, "showErrors", value.asInstanceOf[js.Any])
    
    inline def setShowErrorsFunction0(value: () => Unit): Self = StObject.set(x, "showErrors", js.Any.fromFunction0(value))
    
    inline def setShowErrorsUndefined: Self = StObject.set(x, "showErrors", js.undefined)
    
    inline def setShowNotation(value: Boolean): Self = StObject.set(x, "showNotation", value.asInstanceOf[js.Any])
    
    inline def setShowNotationUndefined: Self = StObject.set(x, "showNotation", js.undefined)
    
    inline def setSnapSpeed(value: Double | SpeedType): Self = StObject.set(x, "snapSpeed", value.asInstanceOf[js.Any])
    
    inline def setSnapSpeedUndefined: Self = StObject.set(x, "snapSpeed", js.undefined)
    
    inline def setSnapbackSpeed(value: Double | SpeedType): Self = StObject.set(x, "snapbackSpeed", value.asInstanceOf[js.Any])
    
    inline def setSnapbackSpeedUndefined: Self = StObject.set(x, "snapbackSpeed", js.undefined)
    
    inline def setSparePieces(value: Boolean): Self = StObject.set(x, "sparePieces", value.asInstanceOf[js.Any])
    
    inline def setSparePiecesUndefined: Self = StObject.set(x, "sparePieces", js.undefined)
    
    inline def setTrashSpeed(value: Double | SpeedType): Self = StObject.set(x, "trashSpeed", value.asInstanceOf[js.Any])
    
    inline def setTrashSpeedUndefined: Self = StObject.set(x, "trashSpeed", js.undefined)
  }
}
