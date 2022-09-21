package typings.dependencyTreeGsCd6byU

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): Tree = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Tree]
  
  @JSImport(".dependency-tree-gsCd6byU", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDependencies(config: Config): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_getDependencies")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def toList(options: Options): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toList")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  trait Config
    extends StObject
       with Options
  object Config {
    
    inline def apply(directory: String, filename: String): Config = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
  }
  
  trait Options extends StObject {
    
    var detectiveConfig: js.UndefOr[Any] = js.undefined
    
    var directory: String
    
    var filename: String
    
    var filter: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.undefined
    
    var isListForm: js.UndefOr[Boolean] = js.undefined
    
    var noTypeDefinitions: js.UndefOr[Boolean] = js.undefined
    
    var nodeModulesConfig: js.UndefOr[Any] = js.undefined
    
    var nonExistent: js.UndefOr[js.Array[String]] = js.undefined
    
    var requireConfig: js.UndefOr[String] = js.undefined
    
    var tsConfig: js.UndefOr[String | (Record[String, Any])] = js.undefined
    
    var visited: js.UndefOr[Tree] = js.undefined
    
    var webpackConfig: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(directory: String, filename: String): Options = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDetectiveConfig(value: Any): Self = StObject.set(x, "detectiveConfig", value.asInstanceOf[js.Any])
      
      inline def setDetectiveConfigUndefined: Self = StObject.set(x, "detectiveConfig", js.undefined)
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: /* path */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setIsListForm(value: Boolean): Self = StObject.set(x, "isListForm", value.asInstanceOf[js.Any])
      
      inline def setIsListFormUndefined: Self = StObject.set(x, "isListForm", js.undefined)
      
      inline def setNoTypeDefinitions(value: Boolean): Self = StObject.set(x, "noTypeDefinitions", value.asInstanceOf[js.Any])
      
      inline def setNoTypeDefinitionsUndefined: Self = StObject.set(x, "noTypeDefinitions", js.undefined)
      
      inline def setNodeModulesConfig(value: Any): Self = StObject.set(x, "nodeModulesConfig", value.asInstanceOf[js.Any])
      
      inline def setNodeModulesConfigUndefined: Self = StObject.set(x, "nodeModulesConfig", js.undefined)
      
      inline def setNonExistent(value: js.Array[String]): Self = StObject.set(x, "nonExistent", value.asInstanceOf[js.Any])
      
      inline def setNonExistentUndefined: Self = StObject.set(x, "nonExistent", js.undefined)
      
      inline def setNonExistentVarargs(value: String*): Self = StObject.set(x, "nonExistent", js.Array(value*))
      
      inline def setRequireConfig(value: String): Self = StObject.set(x, "requireConfig", value.asInstanceOf[js.Any])
      
      inline def setRequireConfigUndefined: Self = StObject.set(x, "requireConfig", js.undefined)
      
      inline def setTsConfig(value: String | (Record[String, Any])): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
      
      inline def setTsConfigUndefined: Self = StObject.set(x, "tsConfig", js.undefined)
      
      inline def setVisited(value: Tree): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
      
      inline def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
      
      inline def setWebpackConfig(value: String): Self = StObject.set(x, "webpackConfig", value.asInstanceOf[js.Any])
      
      inline def setWebpackConfigUndefined: Self = StObject.set(x, "webpackConfig", js.undefined)
    }
  }
  
  type Tree = TreeInnerNode | String
  
  trait TreeInnerNode
    extends StObject
       with /* parent */ StringDictionary[TreeInnerNode | String]
  object TreeInnerNode {
    
    inline def apply(): TreeInnerNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeInnerNode]
    }
  }
}
