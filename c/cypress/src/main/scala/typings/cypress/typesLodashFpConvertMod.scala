package typings.cypress

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLodashFpConvertMod extends Shortcut {
  
  @JSImport("cypress/types/lodash/fp/convert", JSImport.Namespace)
  @js.native
  val ^ : Convert = js.native
  
  @js.native
  trait Convert extends StObject {
    
    def apply(func: js.Object): Any = js.native
    def apply(func: js.Object, options: ConvertOptions): Any = js.native
    def apply(name: String, func: js.Function1[/* repeated */ Any, Any]): Any = js.native
    def apply(name: String, func: js.Function1[/* repeated */ Any, Any], options: ConvertOptions): Any = js.native
  }
  
  trait ConvertOptions extends StObject {
    
    var cap: js.UndefOr[Boolean] = js.undefined
    
    var curry: js.UndefOr[Boolean] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var immutable: js.UndefOr[Boolean] = js.undefined
    
    var rearg: js.UndefOr[Boolean] = js.undefined
  }
  object ConvertOptions {
    
    inline def apply(): ConvertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConvertOptions]
    }
    
    extension [Self <: ConvertOptions](x: Self) {
      
      inline def setCap(value: Boolean): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
      
      inline def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
      
      inline def setCurry(value: Boolean): Self = StObject.set(x, "curry", value.asInstanceOf[js.Any])
      
      inline def setCurryUndefined: Self = StObject.set(x, "curry", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
      
      inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
      
      inline def setRearg(value: Boolean): Self = StObject.set(x, "rearg", value.asInstanceOf[js.Any])
      
      inline def setReargUndefined: Self = StObject.set(x, "rearg", js.undefined)
    }
  }
  
  type _To = Convert
  
  /* This means you don't have to write `^`, but can instead just say `typesLodashFpConvertMod.foo` */
  override def _to: Convert = ^
}
