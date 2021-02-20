package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetByteMatchSetResponse extends StObject {
  
  /**
    * Information about the ByteMatchSet that you specified in the GetByteMatchSet request. For more information, see the following topics:    ByteMatchSet: Contains ByteMatchSetId, ByteMatchTuples, and Name     ByteMatchTuples: Contains an array of ByteMatchTuple objects. Each ByteMatchTuple object contains FieldToMatch, PositionalConstraint, TargetString, and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var ByteMatchSet: js.UndefOr[typings.awsSdk.wafMod.ByteMatchSet] = js.native
}
object GetByteMatchSetResponse {
  
  @scala.inline
  def apply(): GetByteMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetByteMatchSetResponse]
  }
  
  @scala.inline
  implicit class GetByteMatchSetResponseMutableBuilder[Self <: GetByteMatchSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteMatchSet(value: ByteMatchSet): Self = StObject.set(x, "ByteMatchSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteMatchSetUndefined: Self = StObject.set(x, "ByteMatchSet", js.undefined)
  }
}
