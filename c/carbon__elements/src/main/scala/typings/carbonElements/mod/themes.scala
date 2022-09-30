package typings.carbonElements.mod

import typings.carbonElements.anon.Background
import typings.carbonElements.anon.BackgroundActive
import typings.carbonElements.anon.BackgroundBrand
import typings.carbonElements.anon.BackgroundHover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themes {
  
  @JSImport("@carbon/elements", "themes")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@carbon/elements", "themes.g10")
  @js.native
  def g10: BackgroundActive = js.native
  
  @JSImport("@carbon/elements", "themes.g100")
  @js.native
  def g100: BackgroundHover = js.native
  inline def g100_=(x: BackgroundHover): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("g100")(x.asInstanceOf[js.Any])
  
  inline def g10_=(x: BackgroundActive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("g10")(x.asInstanceOf[js.Any])
  
  @JSImport("@carbon/elements", "themes.g90")
  @js.native
  def g90: BackgroundBrand = js.native
  inline def g90_=(x: BackgroundBrand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("g90")(x.asInstanceOf[js.Any])
  
  @JSImport("@carbon/elements", "themes.white")
  @js.native
  def white: Background = js.native
  inline def white_=(x: Background): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("white")(x.asInstanceOf[js.Any])
}
