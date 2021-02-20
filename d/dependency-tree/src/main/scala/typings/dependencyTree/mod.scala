package typings.dependencyTree

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dependency-tree", JSImport.Namespace)
  @js.native
  def apply(options: Options): DependencyObj = js.native
  
  @JSImport("dependency-tree", "toList")
  @js.native
  def toList(options: Options): js.Array[String] = js.native
  
  @js.native
  trait DependencyObj extends /* k */ StringDictionary[DependencyObj]
  object DependencyObj {
    
    @scala.inline
    def apply(): DependencyObj = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DependencyObj]
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var detective: js.UndefOr[js.Any] = js.native
    
    var directory: js.UndefOr[String] = js.native
    
    var filename: String = js.native
    
    var filter: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.native
    
    var isListForm: js.UndefOr[Boolean] = js.native
    
    var nodeModulesConfig: js.UndefOr[js.Any] = js.native
    
    var nonExistent: js.UndefOr[js.Array[String]] = js.native
    
    var requireConfig: js.UndefOr[String] = js.native
    
    var tsConfig: js.UndefOr[String] = js.native
    
    var visited: js.UndefOr[DependencyObj] = js.native
    
    var webpackConfig: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(filename: String): Options = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetective(value: js.Any): Self = StObject.set(x, "detective", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectiveUndefined: Self = StObject.set(x, "detective", js.undefined)
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: /* path */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setIsListForm(value: Boolean): Self = StObject.set(x, "isListForm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsListFormUndefined: Self = StObject.set(x, "isListForm", js.undefined)
      
      @scala.inline
      def setNodeModulesConfig(value: js.Any): Self = StObject.set(x, "nodeModulesConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeModulesConfigUndefined: Self = StObject.set(x, "nodeModulesConfig", js.undefined)
      
      @scala.inline
      def setNonExistent(value: js.Array[String]): Self = StObject.set(x, "nonExistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonExistentUndefined: Self = StObject.set(x, "nonExistent", js.undefined)
      
      @scala.inline
      def setNonExistentVarargs(value: String*): Self = StObject.set(x, "nonExistent", js.Array(value :_*))
      
      @scala.inline
      def setRequireConfig(value: String): Self = StObject.set(x, "requireConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireConfigUndefined: Self = StObject.set(x, "requireConfig", js.undefined)
      
      @scala.inline
      def setTsConfig(value: String): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTsConfigUndefined: Self = StObject.set(x, "tsConfig", js.undefined)
      
      @scala.inline
      def setVisited(value: DependencyObj): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
      
      @scala.inline
      def setWebpackConfig(value: String): Self = StObject.set(x, "webpackConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebpackConfigUndefined: Self = StObject.set(x, "webpackConfig", js.undefined)
    }
  }
}
