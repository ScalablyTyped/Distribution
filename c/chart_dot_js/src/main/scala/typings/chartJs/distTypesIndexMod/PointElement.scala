package typings.chartJs.distTypesIndexMod

import typings.chartJs.anon.BorderColor
import typings.chartJs.anon.BorderWidth
import typings.chartJs.distElementsElementDotpointMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js/dist/types/index", "PointElement")
@js.native
open class PointElement protected () extends default {
  def this(cfg: Any) = this()
}
/* static members */
object PointElement {
  
  @JSImport("chart.js/dist/types/index", "PointElement")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @type {any}
    */
  @JSImport("chart.js/dist/types/index", "PointElement.defaultRoutes")
  @js.native
  def defaultRoutes: BorderColor = js.native
  inline def defaultRoutes_=(x: BorderColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
  
  /**
    * @type {any}
    */
  @JSImport("chart.js/dist/types/index", "PointElement.defaults")
  @js.native
  def defaults: BorderWidth = js.native
  inline def defaults_=(x: BorderWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist/types/index", "PointElement.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
}
