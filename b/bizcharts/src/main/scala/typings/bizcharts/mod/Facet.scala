package typings.bizcharts.mod

import typings.antvG2.libInterfaceMod.FacetCfg
import typings.antvG2.libInterfaceMod.FacetData
import typings.bizcharts.libComponentsFacetMod.IFacetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("bizcharts", "Facet")
@js.native
open class Facet[C /* <: FacetCfg[FacetData] */, F /* <: FacetData */] protected ()
  extends typings.bizcharts.libCoreMod.Facet[C, F] {
  def this(view: typings.antvG2.libChartViewMod.View, cfg: C) = this()
}
object Facet {
  
  @JSImport("bizcharts", "Facet")
  @js.native
  def apply(props: IFacetProps): Any = js.native
}
