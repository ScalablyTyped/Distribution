package typings.bip174.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputCount extends StObject {
  
  var inputCount: Double = js.native
  
  var outputCount: Double = js.native
}
object InputCount {
  
  @scala.inline
  def apply(inputCount: Double, outputCount: Double): InputCount = {
    val __obj = js.Dynamic.literal(inputCount = inputCount.asInstanceOf[js.Any], outputCount = outputCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputCount]
  }
  
  @scala.inline
  implicit class InputCountMutableBuilder[Self <: InputCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputCount(value: Double): Self = StObject.set(x, "inputCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputCount(value: Double): Self = StObject.set(x, "outputCount", value.asInstanceOf[js.Any])
  }
}
