package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInputRequest extends StObject {
  
  /**
    * The name of the input.
    */
  var inputName: InputName
}
object DescribeInputRequest {
  
  inline def apply(inputName: InputName): DescribeInputRequest = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInputRequest]
  }
  
  extension [Self <: DescribeInputRequest](x: Self) {
    
    inline def setInputName(value: InputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
  }
}
