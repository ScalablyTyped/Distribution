package typings.chartJs.distMod

import typings.chartJs.anon.Indexable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js/dist", "LineElement")
@js.native
open class LineElement protected ()
  extends typings.chartJs.distElementsMod.LineElement {
  def this(cfg: Any) = this()
}
/* static members */
object LineElement {
  
  @JSImport("chart.js/dist", "LineElement")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @type {any}
    */
  @JSImport("chart.js/dist", "LineElement.defaults")
  @js.native
  def defaults: Any = js.native
  inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist", "LineElement.descriptors")
  @js.native
  def descriptors: Indexable = js.native
  inline def descriptors_=(x: Indexable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist", "LineElement.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
}
