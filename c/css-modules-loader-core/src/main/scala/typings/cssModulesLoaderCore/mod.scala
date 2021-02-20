package typings.cssModulesLoaderCore

import org.scalablytyped.runtime.StringDictionary
import typings.cssModulesLoaderCore.anon.ToString
import typings.postcss.mod.Plugin_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-modules-loader-core", JSImport.Namespace)
  @js.native
  class ^ () extends Core {
    def this(plugins: js.Array[Plugin_[_]]) = this()
  }
  @JSImport("css-modules-loader-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("css-modules-loader-core", "defaultPlugins")
  @js.native
  def defaultPlugins: js.Array[Plugin_[js.Object]] = js.native
  @scala.inline
  def defaultPlugins_=(x: js.Array[Plugin_[js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPlugins")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("css-modules-loader-core", "extractImports")
  @js.native
  def extractImports: Plugin_[js.Object] = js.native
  @scala.inline
  def extractImports_=(x: Plugin_[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extractImports")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("css-modules-loader-core", "localByDefault")
  @js.native
  def localByDefault: Plugin_[js.Object] = js.native
  @scala.inline
  def localByDefault_=(x: Plugin_[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localByDefault")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("css-modules-loader-core", "scope")
  @js.native
  def scope: Plugin_[js.Object] = js.native
  @scala.inline
  def scope_=(x: Plugin_[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("css-modules-loader-core", "values")
  @js.native
  def values: Plugin_[js.Object] = js.native
  @scala.inline
  def values_=(x: Plugin_[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("values")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Core extends StObject {
    
    def load(source: Source): js.Promise[Result] = js.native
    def load(
      source: Source,
      sourcePath: js.UndefOr[scala.Nothing],
      trace: js.UndefOr[scala.Nothing],
      pathFetcher: PathFetcher
    ): js.Promise[Result] = js.native
    def load(source: Source, sourcePath: js.UndefOr[scala.Nothing], trace: String): js.Promise[Result] = js.native
    def load(source: Source, sourcePath: js.UndefOr[scala.Nothing], trace: String, pathFetcher: PathFetcher): js.Promise[Result] = js.native
    def load(source: Source, sourcePath: String): js.Promise[Result] = js.native
    def load(source: Source, sourcePath: String, trace: js.UndefOr[scala.Nothing], pathFetcher: PathFetcher): js.Promise[Result] = js.native
    def load(source: Source, sourcePath: String, trace: String): js.Promise[Result] = js.native
    def load(source: Source, sourcePath: String, trace: String, pathFetcher: PathFetcher): js.Promise[Result] = js.native
  }
  
  type ExportTokens = StringDictionary[String]
  
  type PathFetcher = js.Function3[/* file */ String, /* relativeTo */ String, /* depTrace */ String, Unit]
  
  @js.native
  trait Result extends StObject {
    
    var exportTokens: ExportTokens = js.native
    
    var injectableSource: String = js.native
  }
  object Result {
    
    @scala.inline
    def apply(exportTokens: ExportTokens, injectableSource: String): Result = {
      val __obj = js.Dynamic.literal(exportTokens = exportTokens.asInstanceOf[js.Any], injectableSource = injectableSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportTokens(value: ExportTokens): Self = StObject.set(x, "exportTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectableSource(value: String): Self = StObject.set(x, "injectableSource", value.asInstanceOf[js.Any])
    }
  }
  
  type Source = String | ToString
}
