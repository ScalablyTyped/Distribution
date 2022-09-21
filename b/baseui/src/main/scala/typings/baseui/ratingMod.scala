package typings.baseui

import typings.baseui.baseuiStrings.li_
import typings.baseui.baseuiStrings.ul
import typings.baseui.emoticonRatingMod.default
import typings.baseui.ratingTypesMod.StyledRatingItemProps
import typings.baseui.ratingTypesMod.StyledRootProps
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratingMod {
  
  @JSImport("baseui/rating", "EmoticonRating")
  @js.native
  open class EmoticonRating () extends default
  object EmoticonRating {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/rating", "EmoticonRating.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/rating", "EmoticonRating.defaultProps.readOnly")
      @js.native
      def readOnly: Boolean = js.native
      inline def readOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/rating", "StarRating")
  @js.native
  open class StarRating ()
    extends typings.baseui.starRatingMod.default
  object StarRating {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/rating", "StarRating.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/rating", "StarRating.defaultProps.numItems")
      @js.native
      def numItems: Double = js.native
      inline def numItems_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numItems")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/rating", "StarRating.defaultProps.readOnly")
      @js.native
      def readOnly: Boolean = js.native
      inline def readOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/rating", "StyledEmoticon")
  @js.native
  val StyledEmoticon: StyletronComponent[li_, StyledRatingItemProps] = js.native
  
  @JSImport("baseui/rating", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[ul, StyledRootProps] = js.native
  
  @JSImport("baseui/rating", "StyledStar")
  @js.native
  val StyledStar: StyletronComponent[li_, StyledRatingItemProps] = js.native
}
