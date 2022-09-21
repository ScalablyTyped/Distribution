package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.PartialProgressBarPropsRe
import typings.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressBarProgressbarMod extends Shortcut {
  
  @JSImport("baseui/progress-bar/progressbar", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PartialProgressBarPropsRe] = js.native
  
  type _To = ForwardRefExoticComponent[PartialProgressBarPropsRe]
  
  /* This means you don't have to write `default`, but can instead just say `progressBarProgressbarMod.foo` */
  override def _to: ForwardRefExoticComponent[PartialProgressBarPropsRe] = default
}
