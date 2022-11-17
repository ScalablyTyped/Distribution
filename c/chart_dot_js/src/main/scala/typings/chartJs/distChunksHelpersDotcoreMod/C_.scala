package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js/dist/chunks/helpers.core", "C")
@js.native
open class C_ protected ()
  extends StObject
     with Chart2 {
  def this(item: Any, userConfig: Any) = this()
}
object C_ {
  
  @JSImport("chart.js/dist/chunks/helpers.core", "C")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("chart.js/dist/chunks/helpers.core", "C.defaults")
  @js.native
  def defaults: Defaults = js.native
  inline def defaults_=(x: Defaults): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("chart.js/dist/chunks/helpers.core", "C.getChart")
  @js.native
  def getChart: js.Function1[/* key */ Any, Any] = js.native
  inline def getChart_=(x: js.Function1[/* key */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getChart")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("chart.js/dist/chunks/helpers.core", "C.overrides")
  @js.native
  def overrides: Any = js.native
  inline def overrides_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def register(items: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  /* static member */
  @JSImport("chart.js/dist/chunks/helpers.core", "C.registry")
  @js.native
  def registry: Registry = js.native
  inline def registry_=(x: Registry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registry")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def unregister(items: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  /* static member */
  @JSImport("chart.js/dist/chunks/helpers.core", "C.version")
  @js.native
  def version: Any = js.native
  inline def version_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
