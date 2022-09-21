package typings.cssModulesLoaderCore

import typings.postcss.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Core {
    
    @JSGlobal("Core")
    @js.native
    open class ^ ()
      extends typings.cssModulesLoaderCore.mod.^ {
      def this(plugins: js.Array[Plugin]) = this()
    }
    
    @JSGlobal("Core")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Core.defaultPlugins")
    @js.native
    def defaultPlugins: js.Array[Plugin] = js.native
    inline def defaultPlugins_=(x: js.Array[Plugin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPlugins")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Core.extractImports")
    @js.native
    def extractImports: Plugin = js.native
    inline def extractImports_=(x: Plugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extractImports")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Core.localByDefault")
    @js.native
    def localByDefault: Plugin = js.native
    inline def localByDefault_=(x: Plugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localByDefault")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Core.scope")
    @js.native
    def scope: Plugin = js.native
    inline def scope_=(x: Plugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Core.values")
    @js.native
    def values: Plugin = js.native
    inline def values_=(x: Plugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("values")(x.asInstanceOf[js.Any])
  }
}
