package typings.bizcharts.anon

import typings.antvG2.anon.namestringvaluestringMark
import typings.antvG2.libChartViewMod.View
import typings.antvG2.libDependentsMod.Attribute
import typings.antvG2.libGeometryBaseMod.default
import typings.antvG2.libInterfaceMod.MarkerCfg
import typings.antvG2.libInterfaceMod.ShapePoint
import typings.antvG2.libUtilLegendMod.ComponentLegendItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(view: View, geometry: default[ShapePoint], attr: Attribute, themeMarker: js.Object): js.Array[ComponentLegendItem] = js.native
  def apply(
    view: View,
    geometry: default[ShapePoint],
    attr: Attribute,
    themeMarker: js.Object,
    userMarker: js.Function3[/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark, MarkerCfg]
  ): js.Array[ComponentLegendItem] = js.native
  def apply(
    view: View,
    geometry: default[ShapePoint],
    attr: Attribute,
    themeMarker: js.Object,
    userMarker: MarkerCfg
  ): js.Array[ComponentLegendItem] = js.native
}
