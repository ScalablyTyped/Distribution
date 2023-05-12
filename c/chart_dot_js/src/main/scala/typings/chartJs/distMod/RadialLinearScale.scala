package typings.chartJs.distMod

import typings.chartJs.anon.AngleLines
import typings.chartJs.anon.AngleLinescolor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js/dist", "RadialLinearScale")
@js.native
open class RadialLinearScale ()
  extends typings.chartJs.distScalesMod.RadialLinearScale
/* static members */
object RadialLinearScale {
  
  @JSImport("chart.js/dist", "RadialLinearScale")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart.js/dist", "RadialLinearScale.defaultRoutes")
  @js.native
  def defaultRoutes: AngleLinescolor = js.native
  inline def defaultRoutes_=(x: AngleLinescolor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
  
  /**
    * @type {any}
    */
  @JSImport("chart.js/dist", "RadialLinearScale.defaults")
  @js.native
  def defaults: Any = js.native
  inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist", "RadialLinearScale.descriptors")
  @js.native
  def descriptors: AngleLines = js.native
  inline def descriptors_=(x: AngleLines): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist", "RadialLinearScale.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
}
