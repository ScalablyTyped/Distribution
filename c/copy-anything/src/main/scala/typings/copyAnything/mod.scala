package typings.copyAnything

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("copy-anything", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copy[T](target: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(target.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def copy[T](target: T, options: Options): T = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait Options extends StObject {
    
    var nonenumerable: js.UndefOr[Boolean] = js.undefined
    
    var props: js.UndefOr[js.Array[String | js.Symbol]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setNonenumerable(value: Boolean): Self = StObject.set(x, "nonenumerable", value.asInstanceOf[js.Any])
      
      inline def setNonenumerableUndefined: Self = StObject.set(x, "nonenumerable", js.undefined)
      
      inline def setProps(value: js.Array[String | js.Symbol]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setPropsVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "props", js.Array(value*))
    }
  }
}
