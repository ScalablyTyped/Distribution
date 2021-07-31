package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectionLoaResponse extends StObject {
  
  /**
    * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA).
    */
  var loa: js.UndefOr[Loa] = js.undefined
}
object DescribeConnectionLoaResponse {
  
  @scala.inline
  def apply(): DescribeConnectionLoaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectionLoaResponse]
  }
  
  @scala.inline
  implicit class DescribeConnectionLoaResponseMutableBuilder[Self <: DescribeConnectionLoaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoa(value: Loa): Self = StObject.set(x, "loa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaUndefined: Self = StObject.set(x, "loa", js.undefined)
  }
}
