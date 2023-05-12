package typings.chartJs

import typings.chartJs.distCoreCoreDotdefaultsMod.Defaults
import typings.chartJs.distCoreCoreDotregistryMod.Registry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIndexDotumdMod {
  
  @JSImport("chart.js/dist/index.umd", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.chartJs.distCoreCoreDotcontrollerMod.default {
    def this(item: Any, userConfig: Any) = this()
  }
  object default {
    
    @JSImport("chart.js/dist/index.umd", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("chart.js/dist/index.umd", "default.defaults")
    @js.native
    def defaults: Defaults = js.native
    inline def defaults_=(x: Defaults): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("chart.js/dist/index.umd", "default.getChart")
    @js.native
    def getChart: js.Function1[/* key */ Any, Any] = js.native
    inline def getChart_=(x: js.Function1[/* key */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getChart")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("chart.js/dist/index.umd", "default.overrides")
    @js.native
    def overrides: Any = js.native
    inline def overrides_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def register(items: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    @JSImport("chart.js/dist/index.umd", "default.registry")
    @js.native
    def registry: Registry = js.native
    inline def registry_=(x: Registry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registry")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def unregister(items: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    @JSImport("chart.js/dist/index.umd", "default.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
