package typings.baseui

import typings.baseui.anon.Thumbnail
import typings.baseui.cardTypesMod.CardProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardCardMod {
  
  @JSImport("baseui/card/card", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(props: CardProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/card/card", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/card/card", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/card/card", "default.defaultProps.action")
      @js.native
      def action: Any = js.native
      inline def action_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("action")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/card/card", "default.defaultProps.children")
      @js.native
      def children: Any = js.native
      inline def children_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/card/card", "default.defaultProps.hasThumbnail")
      @js.native
      def hasThumbnail: js.Function1[/* props */ Thumbnail, Boolean] = js.native
      inline def hasThumbnail_=(x: js.Function1[/* props */ Thumbnail, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasThumbnail")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def hasThumbnail(props: Thumbnail): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasThumbnail")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
