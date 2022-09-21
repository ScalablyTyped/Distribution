package typings.barnard59Core

import typings.clownface.mod.GraphPointer
import typings.rdfLoadersRegistry.mod.LoaderRegistry
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.readableStream.mod.Readable
import typings.readableStream.mod.Writable
import typings.std.Map
import typings.winston.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamObjectMod {
  
  @JSImport("barnard59-core/lib/StreamObject", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with StreamObject {
    
    /* CompleteClass */
    var basePath: String = js.native
    
    /* CompleteClass */
    var children: js.Array[StreamObject] = js.native
    
    /* CompleteClass */
    var context: Context = js.native
    
    /* CompleteClass */
    var loaderRegistry: LoaderRegistry = js.native
    
    /* CompleteClass */
    var logger: Logger = js.native
    
    /* CompleteClass */
    var ptr: GraphPointer[Term, DatasetCore[Quad, Quad]] = js.native
    
    /* CompleteClass */
    var variables: VariableMap = js.native
  }
  
  trait Context extends StObject {
    
    var logger: Logger
    
    var variables: VariableMap
  }
  object Context {
    
    inline def apply(logger: Logger, variables: VariableMap): Context = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: VariableMap): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  type Keys = /* keyof barnard59-core.barnard59-core/lib/StreamObject.Variables */ String
  
  trait StreamObject extends StObject {
    
    var basePath: String
    
    var children: js.Array[StreamObject]
    
    var context: Context
    
    var loaderRegistry: LoaderRegistry
    
    var logger: Logger
    
    var ptr: GraphPointer[Term, DatasetCore[Quad, Quad]]
    
    var stream: js.UndefOr[Readable | Writable] = js.undefined
    
    var variables: VariableMap
  }
  object StreamObject {
    
    inline def apply(
      basePath: String,
      children: js.Array[StreamObject],
      context: Context,
      loaderRegistry: LoaderRegistry,
      logger: Logger,
      ptr: GraphPointer[Term, DatasetCore[Quad, Quad]],
      variables: VariableMap
    ): StreamObject = {
      val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], loaderRegistry = loaderRegistry.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], ptr = ptr.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamObject]
    }
    
    extension [Self <: StreamObject](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[StreamObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: StreamObject*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setLoaderRegistry(value: LoaderRegistry): Self = StObject.set(x, "loaderRegistry", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setPtr(value: GraphPointer[Term, DatasetCore[Quad, Quad]]): Self = StObject.set(x, "ptr", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Readable | Writable): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setVariables(value: VariableMap): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypedMap
    extends StObject
       with Map[Keys, Any] {
    
    // tslint:disable-next-line:no-unnecessary-generics
    def get[K /* <: /* keyof barnard59-core.barnard59-core/lib/StreamObject.Variables */ String */](key: K): /* import warning: importer.ImportType#apply Failed type conversion: barnard59-core.barnard59-core/lib/StreamObject.Variables[/ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof key * / any] */ js.Any = js.native
    
    // tslint:disable-next-line:no-unnecessary-generics
    def set[K /* <: /* keyof barnard59-core.barnard59-core/lib/StreamObject.Variables */ String */](key: K): this.type = js.native
    def set[K /* <: /* keyof barnard59-core.barnard59-core/lib/StreamObject.Variables */ String */](
      key: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: barnard59-core.barnard59-core/lib/StreamObject.Variables[/ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof key * / any] */ js.Any
    ): this.type = js.native
  }
  
  type VariableMap = TypedMap | (Map[String, Any])
  
  trait Variables extends StObject
}
