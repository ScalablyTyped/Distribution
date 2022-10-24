package typings.baseui

import typings.baseui.anon.ActionPosition
import typings.baseui.anon.BackgroundColor
import typings.baseui.anon.IncludesArtwork
import typings.baseui.anon.Nested
import typings.baseui.bannerTypesMod.ActionContent
import typings.baseui.bannerTypesMod.ArtworkContent
import typings.baseui.bannerTypesMod.BannerProps
import typings.baseui.baseuiStrings.button
import typings.baseui.baseuiStrings.div
import typings.react.mod.global.JSX.Element
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bannerMod {
  
  @JSImport("baseui/banner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<{ readonly below :'below',  readonly trailing :'trailing'}> */
  object ACTION_POSITION {
    
    @JSImport("baseui/banner", "ACTION_POSITION.below")
    @js.native
    val below: typings.baseui.baseuiStrings.below = js.native
    
    @JSImport("baseui/banner", "ACTION_POSITION.trailing")
    @js.native
    val trailing: typings.baseui.baseuiStrings.trailing = js.native
  }
  
  /* Inlined std.Readonly<{ readonly icon :'icon',  readonly badge :'badge'}> */
  object ARTWORK_TYPE {
    
    @JSImport("baseui/banner", "ARTWORK_TYPE.badge")
    @js.native
    val badge: typings.baseui.baseuiStrings.badge = js.native
    
    @JSImport("baseui/banner", "ARTWORK_TYPE.icon")
    @js.native
    val icon: typings.baseui.baseuiStrings.icon = js.native
  }
  
  inline def Banner(param0: BannerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Banner")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Readonly<{ readonly low :'low',  readonly high :'high'}> */
  object HIERARCHY {
    
    @JSImport("baseui/banner", "HIERARCHY.high")
    @js.native
    val high: typings.baseui.baseuiStrings.high = js.native
    
    @JSImport("baseui/banner", "HIERARCHY.low")
    @js.native
    val low: typings.baseui.baseuiStrings.low = js.native
  }
  
  /* Inlined std.Readonly<{ readonly info :'info',  readonly negative :'negative',  readonly positive :'positive',  readonly warning :'warning'}> */
  object KIND {
    
    @JSImport("baseui/banner", "KIND.info")
    @js.native
    val info: typings.baseui.baseuiStrings.info = js.native
    
    @JSImport("baseui/banner", "KIND.negative")
    @js.native
    val negative: typings.baseui.baseuiStrings.negative = js.native
    
    @JSImport("baseui/banner", "KIND.positive")
    @js.native
    val positive: typings.baseui.baseuiStrings.positive = js.native
    
    @JSImport("baseui/banner", "KIND.warning")
    @js.native
    val warning: typings.baseui.baseuiStrings.warning = js.native
  }
  
  @JSImport("baseui/banner", "StyledBelowContent")
  @js.native
  val StyledBelowContent: StyletronComponent[div, ActionPosition] = js.native
  
  @JSImport("baseui/banner", "StyledLeadingContent")
  @js.native
  val StyledLeadingContent: StyletronComponent[div, IncludesArtwork] = js.native
  
  @JSImport("baseui/banner", "StyledMessage")
  @js.native
  val StyledMessage: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/banner", "StyledMessageContent")
  @js.native
  val StyledMessageContent: StyletronComponent[div, ActionPosition] = js.native
  
  @JSImport("baseui/banner", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, BackgroundColor] = js.native
  
  @JSImport("baseui/banner", "StyledTitle")
  @js.native
  val StyledTitle: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/banner", "StyledTrailingButtonContainer")
  @js.native
  val StyledTrailingButtonContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/banner", "StyledTrailingContent")
  @js.native
  val StyledTrailingContent: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/banner", "StyledTrailingIconButton")
  @js.native
  val StyledTrailingIconButton: StyletronComponent[button, Nested] = js.native
  
  type ActionContentT = ActionContent
  
  type ArtworkContentT = ArtworkContent
  
  type PropsT = BannerProps
}
