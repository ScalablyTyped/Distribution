package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInputResponse extends StObject {
  
  /**
    * Information about the input.
    */
  var input: js.UndefOr[Input] = js.undefined
}
object DescribeInputResponse {
  
  inline def apply(): DescribeInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInputResponse]
  }
  
  extension [Self <: DescribeInputResponse](x: Self) {
    
    inline def setInput(value: Input): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
  }
}
