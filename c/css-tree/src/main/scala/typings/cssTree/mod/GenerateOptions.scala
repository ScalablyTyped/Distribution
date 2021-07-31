package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateOptions extends StObject {
  
  var decorator: js.UndefOr[js.Function1[/* handlers */ GenerateHandlers, GenerateHandlers]] = js.undefined
  
  var sourceMap: js.UndefOr[Boolean] = js.undefined
}
object GenerateOptions {
  
  @scala.inline
  def apply(): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateOptions]
  }
  
  @scala.inline
  implicit class GenerateOptionsMutableBuilder[Self <: GenerateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecorator(value: /* handlers */ GenerateHandlers => GenerateHandlers): Self = StObject.set(x, "decorator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecoratorUndefined: Self = StObject.set(x, "decorator", js.undefined)
    
    @scala.inline
    def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
  }
}
