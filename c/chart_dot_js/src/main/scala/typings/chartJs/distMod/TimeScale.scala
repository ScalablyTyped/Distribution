package typings.chartJs.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js/dist", "TimeScale")
@js.native
open class TimeScale protected ()
  extends typings.chartJs.distScalesMod.TimeScale {
  /**
    * @param {object} props
    */
  def this(props: js.Object) = this()
}
/* static members */
object TimeScale {
  
  @JSImport("chart.js/dist", "TimeScale")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @type {any}
    */
  @JSImport("chart.js/dist", "TimeScale.defaults")
  @js.native
  def defaults: Any = js.native
  inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist", "TimeScale.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
}
