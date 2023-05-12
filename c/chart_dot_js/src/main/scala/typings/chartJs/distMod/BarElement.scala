package typings.chartJs.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js/dist", "BarElement")
@js.native
open class BarElement protected ()
  extends typings.chartJs.distElementsMod.BarElement {
  def this(cfg: Any) = this()
}
/* static members */
object BarElement {
  
  @JSImport("chart.js/dist", "BarElement")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @type {any}
    */
  @JSImport("chart.js/dist", "BarElement.defaults")
  @js.native
  def defaults: Any = js.native
  inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist", "BarElement.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
}
