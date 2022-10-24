package typings.baseui

import typings.baseui.anon.BackgroundColorType
import typings.baseui.anon.BackgroundPosition
import typings.baseui.baseuiStrings.button
import typings.baseui.baseuiStrings.div
import typings.baseui.messageCardTypesMod.MessageCardProps
import typings.react.mod.global.JSX.Element
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageCardMod {
  
  @JSImport("baseui/message-card", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<{ readonly light :'light',  readonly dark :'dark'}> */
  object BACKGROUND_COLOR_TYPE {
    
    @JSImport("baseui/message-card", "BACKGROUND_COLOR_TYPE.dark")
    @js.native
    val dark: typings.baseui.baseuiStrings.dark = js.native
    
    @JSImport("baseui/message-card", "BACKGROUND_COLOR_TYPE.light")
    @js.native
    val light: typings.baseui.baseuiStrings.light = js.native
  }
  
  /* Inlined std.Readonly<{ readonly secondary :'secondary',  readonly tertiary :'tertiary'}> */
  object BUTTON_KIND {
    
    @JSImport("baseui/message-card", "BUTTON_KIND.secondary")
    @js.native
    val secondary: typings.baseui.baseuiStrings.secondary = js.native
    
    @JSImport("baseui/message-card", "BUTTON_KIND.tertiary")
    @js.native
    val tertiary: typings.baseui.baseuiStrings.tertiary = js.native
  }
  
  /* Inlined std.Readonly<{ readonly top :'top',  readonly trailing :'trailing'}> */
  object IMAGE_LAYOUT {
    
    @JSImport("baseui/message-card", "IMAGE_LAYOUT.top")
    @js.native
    val top: typings.baseui.baseuiStrings.top = js.native
    
    @JSImport("baseui/message-card", "IMAGE_LAYOUT.trailing")
    @js.native
    val trailing: typings.baseui.baseuiStrings.trailing = js.native
  }
  
  inline def MessageCard(param0: MessageCardProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MessageCard")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/message-card", "StyledContentContainer")
  @js.native
  val StyledContentContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/message-card", "StyledHeadingContainer")
  @js.native
  val StyledHeadingContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/message-card", "StyledImage")
  @js.native
  val StyledImage: StyletronComponent[div, BackgroundPosition] = js.native
  
  @JSImport("baseui/message-card", "StyledParagraphContainer")
  @js.native
  val StyledParagraphContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/message-card", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[button, BackgroundColorType] = js.native
}
