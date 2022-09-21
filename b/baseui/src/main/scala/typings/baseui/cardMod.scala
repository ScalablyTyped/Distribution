package typings.baseui

import typings.baseui.anon.Thumbnail
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.h1
import typings.baseui.baseuiStrings.img
import typings.baseui.baseuiStrings.section
import typings.baseui.cardTypesMod.CardProps
import typings.react.mod.global.JSX.Element
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("baseui/card", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Card {
    
    inline def apply(props: CardProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/card", "Card")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/card", "Card.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/card", "Card.defaultProps.action")
      @js.native
      def action: Any = js.native
      inline def action_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("action")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/card", "Card.defaultProps.children")
      @js.native
      def children: Any = js.native
      inline def children_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/card", "Card.defaultProps.hasThumbnail")
      @js.native
      def hasThumbnail: js.Function1[/* props */ Thumbnail, Boolean] = js.native
      inline def hasThumbnail_=(x: js.Function1[/* props */ Thumbnail, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasThumbnail")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/card", "StyledAction")
  @js.native
  val StyledAction: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/card", "StyledBody")
  @js.native
  val StyledBody: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/card", "StyledContents")
  @js.native
  val StyledContents: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/card", "StyledHeaderImage")
  @js.native
  val StyledHeaderImage: StyletronComponent[img, js.Object] = js.native
  
  @JSImport("baseui/card", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[section, js.Object] = js.native
  
  @JSImport("baseui/card", "StyledThumbnail")
  @js.native
  val StyledThumbnail: StyletronComponent[img, js.Object] = js.native
  
  @JSImport("baseui/card", "StyledTitle")
  @js.native
  val StyledTitle: StyletronComponent[h1, js.Object] = js.native
  
  @JSImport("baseui/card", "StyledWrapper")
  @js.native
  val StyledWrapper: StyletronComponent[section, js.Object] = js.native
  
  inline def hasThumbnail(props: Thumbnail): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasThumbnail")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
