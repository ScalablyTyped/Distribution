package typings.babelPluginReactDocgen

import typings.babelPluginReactDocgen.babelPluginReactDocgenStrings.findAllComponentDefinitions
import typings.babelPluginReactDocgen.babelPluginReactDocgenStrings.findAllExportedComponentDefinitions
import typings.babelPluginReactDocgen.babelPluginReactDocgenStrings.findExportedComponentDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("babel-plugin-react-docgen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(babelApi: Any): BabelPluginObj = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(babelApi.asInstanceOf[js.Any]).asInstanceOf[BabelPluginObj]
  
  type BabelPluginObj = Any
  
  trait ComponentType extends StObject {
    
    // DocumentationObject
    var __docgenInfo: Any
  }
  object ComponentType {
    
    inline def apply(__docgenInfo: Any): ComponentType = {
      val __obj = js.Dynamic.literal(__docgenInfo = __docgenInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentType]
    }
    
    extension [Self <: ComponentType](x: Self) {
      
      inline def set__docgenInfo(value: Any): Self = StObject.set(x, "__docgenInfo", value.asInstanceOf[js.Any])
    }
  }
  
  type Handler = js.Function3[/* documentation */ Any, /* path */ Any, /* importer */ Importer, Unit]
  
  type Importer = js.Function2[/* path */ Any, /* name */ String, Any]
  
  trait Options extends StObject {
    
    var DOC_GEN_COLLECTION_NAME: js.UndefOr[String] = js.undefined
    
    var handlers: js.UndefOr[js.Array[String | Handler]] = js.undefined
    
    var removeMethods: js.UndefOr[Boolean] = js.undefined
    
    var resolver: js.UndefOr[
        findAllComponentDefinitions | findAllExportedComponentDefinitions | findExportedComponentDefinition | Resolver
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDOC_GEN_COLLECTION_NAME(value: String): Self = StObject.set(x, "DOC_GEN_COLLECTION_NAME", value.asInstanceOf[js.Any])
      
      inline def setDOC_GEN_COLLECTION_NAMEUndefined: Self = StObject.set(x, "DOC_GEN_COLLECTION_NAME", js.undefined)
      
      inline def setHandlers(value: js.Array[String | Handler]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setHandlersVarargs(value: (String | Handler)*): Self = StObject.set(x, "handlers", js.Array(value*))
      
      inline def setRemoveMethods(value: Boolean): Self = StObject.set(x, "removeMethods", value.asInstanceOf[js.Any])
      
      inline def setRemoveMethodsUndefined: Self = StObject.set(x, "removeMethods", js.undefined)
      
      inline def setResolver(
        value: findAllComponentDefinitions | findAllExportedComponentDefinitions | findExportedComponentDefinition | Resolver
      ): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      inline def setResolverFunction3(value: (/* node */ Any, /* parser */ Any, /* importer */ Importer) => Any): Self = StObject.set(x, "resolver", js.Any.fromFunction3(value))
      
      inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
    }
  }
  
  type Resolver = js.Function3[/* node */ Any, /* parser */ Any, /* importer */ Importer, Any]
}
