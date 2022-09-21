package typings.contentfulResolveResponse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(response: Any): Any = ^.asInstanceOf[js.Dynamic].apply(response.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(response: Any, options: ResolveResponseOptions): Any = (^.asInstanceOf[js.Dynamic].apply(response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("contentful-resolve-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ResolveResponseOptions extends StObject {
    
    var itemEntryPoints: js.UndefOr[js.Array[String]] = js.undefined
    
    var removeUnresolved: js.UndefOr[Boolean] = js.undefined
  }
  object ResolveResponseOptions {
    
    inline def apply(): ResolveResponseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveResponseOptions]
    }
    
    extension [Self <: ResolveResponseOptions](x: Self) {
      
      inline def setItemEntryPoints(value: js.Array[String]): Self = StObject.set(x, "itemEntryPoints", value.asInstanceOf[js.Any])
      
      inline def setItemEntryPointsUndefined: Self = StObject.set(x, "itemEntryPoints", js.undefined)
      
      inline def setItemEntryPointsVarargs(value: String*): Self = StObject.set(x, "itemEntryPoints", js.Array(value*))
      
      inline def setRemoveUnresolved(value: Boolean): Self = StObject.set(x, "removeUnresolved", value.asInstanceOf[js.Any])
      
      inline def setRemoveUnresolvedUndefined: Self = StObject.set(x, "removeUnresolved", js.undefined)
    }
  }
}
