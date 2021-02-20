package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructValue extends StObject {
  
  /**
    * The attributes returned in the record.
    */
  var attributes: js.UndefOr[ArrayValueList] = js.native
}
object StructValue {
  
  @scala.inline
  def apply(): StructValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructValue]
  }
  
  @scala.inline
  implicit class StructValueMutableBuilder[Self <: StructValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: ArrayValueList): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: Value*): Self = StObject.set(x, "attributes", js.Array(value :_*))
  }
}
