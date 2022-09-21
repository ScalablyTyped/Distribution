package typings.baseui

import typings.baseui.avatarTypesMod.AvatarProps
import typings.baseui.avatarTypesMod.AvatarStyleProps
import typings.baseui.avatarTypesMod.InitialsStyleProps
import typings.baseui.avatarTypesMod.RootStyleProps
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.img
import typings.react.mod.global.JSX.Element
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarMod {
  
  @JSImport("baseui/avatar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Avatar(hasInitialsNameOverridesSizeSrc: AvatarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Avatar")(hasInitialsNameOverridesSizeSrc.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/avatar", "StyledAvatar")
  @js.native
  val StyledAvatar: StyletronComponent[img, AvatarStyleProps] = js.native
  
  @JSImport("baseui/avatar", "StyledInitials")
  @js.native
  val StyledInitials: StyletronComponent[div, InitialsStyleProps] = js.native
  
  @JSImport("baseui/avatar", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, RootStyleProps] = js.native
}
