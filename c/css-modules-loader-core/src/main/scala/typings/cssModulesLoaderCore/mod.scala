package typings.cssModulesLoaderCore

import org.scalablytyped.runtime.StringDictionary
import typings.cssModulesLoaderCore.anon.ToString
import typings.postcss.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-modules-loader-core", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Core {
    def this(plugins: js.Array[Plugin]) = this()
  }
  @JSImport("css-modules-loader-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("css-modules-loader-core", "defaultPlugins")
  @js.native
  def defaultPlugins: js.Array[Plugin] = js.native
  inline def defaultPlugins_=(x: js.Array[Plugin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPlugins")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("css-modules-loader-core", "extractImports")
  @js.native
  def extractImports: Plugin = js.native
  inline def extractImports_=(x: Plugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extractImports")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("css-modules-loader-core", "localByDefault")
  @js.native
  def localByDefault: Plugin = js.native
  inline def localByDefault_=(x: Plugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localByDefault")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("css-modules-loader-core", "scope")
  @js.native
  def scope: Plugin = js.native
  inline def scope_=(x: Plugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("css-modules-loader-core", "values")
  @js.native
  def values: Plugin = js.native
  inline def values_=(x: Plugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("values")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Core extends StObject {
    
    def load(source: Source): js.Promise[Result] = js.native
    def load(source: Source, sourcePath: String): js.Promise[Result] = js.native
    def load(source: Source, sourcePath: String, trace: String): js.Promise[Result] = js.native
    def load(source: Source, sourcePath: String, trace: String, pathFetcher: PathFetcher): js.Promise[Result] = js.native
    def load(source: Source, sourcePath: String, trace: Unit, pathFetcher: PathFetcher): js.Promise[Result] = js.native
    def load(source: Source, sourcePath: Unit, trace: String): js.Promise[Result] = js.native
    def load(source: Source, sourcePath: Unit, trace: String, pathFetcher: PathFetcher): js.Promise[Result] = js.native
    def load(source: Source, sourcePath: Unit, trace: Unit, pathFetcher: PathFetcher): js.Promise[Result] = js.native
  }
  
  type ExportTokens = StringDictionary[String]
  
  type PathFetcher = js.Function3[/* file */ String, /* relativeTo */ String, /* depTrace */ String, Unit]
  
  trait Result extends StObject {
    
    var exportTokens: ExportTokens
    
    var injectableSource: String
  }
  object Result {
    
    inline def apply(exportTokens: ExportTokens, injectableSource: String): Result = {
      val __obj = js.Dynamic.literal(exportTokens = exportTokens.asInstanceOf[js.Any], injectableSource = injectableSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setExportTokens(value: ExportTokens): Self = StObject.set(x, "exportTokens", value.asInstanceOf[js.Any])
      
      inline def setInjectableSource(value: String): Self = StObject.set(x, "injectableSource", value.asInstanceOf[js.Any])
    }
  }
  
  type Source = String | ToString
}
