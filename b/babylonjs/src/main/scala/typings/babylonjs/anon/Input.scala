package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  var input: js.UndefOr[String] = js.undefined
  
  var output: js.UndefOr[String] = js.undefined
  
  var outputSwizzle: js.UndefOr[String] = js.undefined
}
object Input {
  
  inline def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  extension [Self <: Input](x: Self) {
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputSwizzle(value: String): Self = StObject.set(x, "outputSwizzle", value.asInstanceOf[js.Any])
    
    inline def setOutputSwizzleUndefined: Self = StObject.set(x, "outputSwizzle", js.undefined)
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
