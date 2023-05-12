package typings.culori

import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDeficiencyMod {
  
  @JSImport("culori/src/deficiency", "filterDeficiencyDeuter")
  @js.native
  val filterDeficiencyDeuter: FilterDeficiencyFactory = js.native
  
  @JSImport("culori/src/deficiency", "filterDeficiencyProt")
  @js.native
  val filterDeficiencyProt: FilterDeficiencyFactory = js.native
  
  @JSImport("culori/src/deficiency", "filterDeficiencyTrit")
  @js.native
  val filterDeficiencyTrit: FilterDeficiencyFactory = js.native
  
  type FilterDeficiencyFactory = js.Function1[/* severity */ Double, js.Function1[/* color */ Color, Color]]
}
