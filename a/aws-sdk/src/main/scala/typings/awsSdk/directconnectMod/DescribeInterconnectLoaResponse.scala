package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInterconnectLoaResponse extends StObject {
  
  /**
    * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA).
    */
  var loa: js.UndefOr[Loa] = js.undefined
}
object DescribeInterconnectLoaResponse {
  
  inline def apply(): DescribeInterconnectLoaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInterconnectLoaResponse]
  }
  
  extension [Self <: DescribeInterconnectLoaResponse](x: Self) {
    
    inline def setLoa(value: Loa): Self = StObject.set(x, "loa", value.asInstanceOf[js.Any])
    
    inline def setLoaUndefined: Self = StObject.set(x, "loa", js.undefined)
  }
}
