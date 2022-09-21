package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIdFormatResult extends StObject {
  
  /**
    * Information about the ID format for the resource.
    */
  var Statuses: js.UndefOr[IdFormatList] = js.undefined
}
object DescribeIdFormatResult {
  
  inline def apply(): DescribeIdFormatResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdFormatResult]
  }
  
  extension [Self <: DescribeIdFormatResult](x: Self) {
    
    inline def setStatuses(value: IdFormatList): Self = StObject.set(x, "Statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "Statuses", js.undefined)
    
    inline def setStatusesVarargs(value: IdFormat*): Self = StObject.set(x, "Statuses", js.Array(value*))
  }
}
