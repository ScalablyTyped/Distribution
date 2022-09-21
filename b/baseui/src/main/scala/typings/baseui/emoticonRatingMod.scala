package typings.baseui

import typings.baseui.ratingTypesMod.EmoticonRatingProps
import typings.baseui.ratingTypesMod.RatingState
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emoticonRatingMod {
  
  @JSImport("baseui/rating/emoticon-rating", JSImport.Default)
  @js.native
  open class default () extends EmoticonRating
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/rating/emoticon-rating", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/rating/emoticon-rating", "default.defaultProps.readOnly")
      @js.native
      def readOnly: Boolean = js.native
      inline def readOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EmoticonRating extends Component[EmoticonRatingProps, RatingState, Any] {
    
    def handleBlur(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    def handleFocus(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    def renderRatingContents(): js.Array[Any] = js.native
    
    def selectItem(value: Double): Unit = js.native
    
    def updatePreview(): Unit = js.native
    def updatePreview(previewIndex: Double): Unit = js.native
  }
}
