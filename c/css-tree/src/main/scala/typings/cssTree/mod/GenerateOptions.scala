package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateOptions extends StObject {
  
  var decorator: js.UndefOr[js.Function1[/* handlers */ GenerateHandlers, GenerateHandlers]] = js.undefined
  
  var sourceMap: js.UndefOr[Boolean] = js.undefined
}
object GenerateOptions {
  
  inline def apply(): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateOptions]
  }
  
  extension [Self <: GenerateOptions](x: Self) {
    
    inline def setDecorator(value: /* handlers */ GenerateHandlers => GenerateHandlers): Self = StObject.set(x, "decorator", js.Any.fromFunction1(value))
    
    inline def setDecoratorUndefined: Self = StObject.set(x, "decorator", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
  }
}
