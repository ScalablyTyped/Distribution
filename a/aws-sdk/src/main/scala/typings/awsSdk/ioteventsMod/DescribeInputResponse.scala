package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInputResponse extends StObject {
  
  /**
    * Information about the input.
    */
  var input: js.UndefOr[Input] = js.native
}
object DescribeInputResponse {
  
  @scala.inline
  def apply(): DescribeInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInputResponse]
  }
  
  @scala.inline
  implicit class DescribeInputResponseMutableBuilder[Self <: DescribeInputResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: Input): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
  }
}
