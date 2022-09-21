package typings.baseui

import typings.baseui.baseuiStrings.i
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.medium_
import typings.baseui.baseuiStrings.small_
import typings.baseui.spinnerTypesMod.SpinnerProps
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseuiSpinnerMod {
  
  object SIZE {
    
    @JSImport("baseui/spinner", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/spinner", "SIZE.medium")
    @js.native
    val medium: medium_ = js.native
    
    @JSImport("baseui/spinner", "SIZE.small")
    @js.native
    val small: small_ = js.native
  }
  
  @JSImport("baseui/spinner", "Spinner")
  @js.native
  val Spinner: StyletronComponent[i, SpinnerProps] = js.native
}
