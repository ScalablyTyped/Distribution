package typings.d

import org.scalablytyped.runtime.StringDictionary
import typings.std.PropertyDescriptor
import typings.std.PropertyDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoBindMod {
  
  inline def apply(obj: StringDictionary[PropertyDescriptor]): PropertyDescriptorMap = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[PropertyDescriptorMap]
  inline def apply(obj: StringDictionary[PropertyDescriptor], options: Options): PropertyDescriptorMap = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDescriptorMap]
  
  @JSImport("d/auto-bind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var overwriteDefinition: js.UndefOr[Boolean] = js.undefined
    
    var resolveContext: js.UndefOr[js.Function1[/* context */ js.Any, js.Any]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOverwriteDefinition(value: Boolean): Self = StObject.set(x, "overwriteDefinition", value.asInstanceOf[js.Any])
      
      inline def setOverwriteDefinitionUndefined: Self = StObject.set(x, "overwriteDefinition", js.undefined)
      
      inline def setResolveContext(value: /* context */ js.Any => js.Any): Self = StObject.set(x, "resolveContext", js.Any.fromFunction1(value))
      
      inline def setResolveContextUndefined: Self = StObject.set(x, "resolveContext", js.undefined)
    }
  }
}
