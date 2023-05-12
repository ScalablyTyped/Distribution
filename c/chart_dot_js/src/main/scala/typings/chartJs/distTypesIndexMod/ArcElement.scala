package typings.chartJs.distTypesIndexMod

import typings.chartJs.anon.Angle
import typings.chartJs.anon.BackgroundColor
import typings.chartJs.anon.Indexable
import typings.chartJs.distElementsElementDotarcMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js/dist/types/index", "ArcElement")
@js.native
open class ArcElement protected () extends default {
  def this(cfg: Any) = this()
}
/* static members */
object ArcElement {
  
  @JSImport("chart.js/dist/types/index", "ArcElement")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart.js/dist/types/index", "ArcElement.defaultRoutes")
  @js.native
  def defaultRoutes: BackgroundColor = js.native
  inline def defaultRoutes_=(x: BackgroundColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist/types/index", "ArcElement.defaults")
  @js.native
  def defaults: Angle = js.native
  inline def defaults_=(x: Angle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist/types/index", "ArcElement.descriptors")
  @js.native
  def descriptors: Indexable = js.native
  inline def descriptors_=(x: Indexable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist/types/index", "ArcElement.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
}
