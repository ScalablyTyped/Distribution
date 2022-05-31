package typings.cssModulesLoaderCore

import typings.postcss.mod.Plugin_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Core {
    
    @JSGlobal("Core")
    @js.native
    class ^ ()
      extends typings.cssModulesLoaderCore.mod.^ {
      def this(plugins: js.Array[Plugin_[js.Any]]) = this()
    }
    
    @JSGlobal("Core")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Core.defaultPlugins")
    @js.native
    def defaultPlugins: js.Array[Plugin_[js.Object]] = js.native
    inline def defaultPlugins_=(x: js.Array[Plugin_[js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPlugins")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Core.extractImports")
    @js.native
    def extractImports: Plugin_[js.Object] = js.native
    inline def extractImports_=(x: Plugin_[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extractImports")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Core.localByDefault")
    @js.native
    def localByDefault: Plugin_[js.Object] = js.native
    inline def localByDefault_=(x: Plugin_[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localByDefault")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Core.scope")
    @js.native
    def scope: Plugin_[js.Object] = js.native
    inline def scope_=(x: Plugin_[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Core.values")
    @js.native
    def values: Plugin_[js.Object] = js.native
    inline def values_=(x: Plugin_[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("values")(x.asInstanceOf[js.Any])
  }
}
