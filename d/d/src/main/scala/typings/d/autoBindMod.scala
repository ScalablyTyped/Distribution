package typings.d

import org.scalablytyped.runtime.StringDictionary
import typings.std.PropertyDescriptor
import typings.std.PropertyDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoBindMod {
  
  @JSImport("d/auto-bind", JSImport.Namespace)
  @js.native
  def apply(obj: StringDictionary[PropertyDescriptor]): PropertyDescriptorMap = js.native
  @JSImport("d/auto-bind", JSImport.Namespace)
  @js.native
  def apply(obj: StringDictionary[PropertyDescriptor], options: Options): PropertyDescriptorMap = js.native
  
  @js.native
  trait Options extends StObject {
    
    var overwriteDefinition: js.UndefOr[Boolean] = js.native
    
    var resolveContext: js.UndefOr[js.Function1[/* context */ js.Any, _]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverwriteDefinition(value: Boolean): Self = StObject.set(x, "overwriteDefinition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteDefinitionUndefined: Self = StObject.set(x, "overwriteDefinition", js.undefined)
      
      @scala.inline
      def setResolveContext(value: /* context */ js.Any => _): Self = StObject.set(x, "resolveContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolveContextUndefined: Self = StObject.set(x, "resolveContext", js.undefined)
    }
  }
}
