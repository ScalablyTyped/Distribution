package typings.culori

import typings.culori.srcCommonMod.Mode
import typings.culori.srcMapMod.ColorToSameColorMapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcFilterMod {
  
  @JSImport("culori/src/filter", "filterBrightness")
  @js.native
  val filterBrightness: Filter = js.native
  
  @JSImport("culori/src/filter", "filterContrast")
  @js.native
  val filterContrast: Filter = js.native
  
  @JSImport("culori/src/filter", "filterGrayscale")
  @js.native
  val filterGrayscale: Filter = js.native
  
  @JSImport("culori/src/filter", "filterHueRotate")
  @js.native
  val filterHueRotate: Filter = js.native
  
  @JSImport("culori/src/filter", "filterInvert")
  @js.native
  val filterInvert: Filter = js.native
  
  @JSImport("culori/src/filter", "filterSaturate")
  @js.native
  val filterSaturate: Filter = js.native
  
  @JSImport("culori/src/filter", "filterSepia")
  @js.native
  val filterSepia: Filter = js.native
  
  type Filter = js.Function2[/* amt */ js.UndefOr[Double], /* mode */ js.UndefOr[Mode], ColorToSameColorMapper]
}
