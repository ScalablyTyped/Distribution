package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExportRequest extends StObject {
  
  /**
    * The unique identifier of the export to describe.
    */
  var exportId: Id
}
object DescribeExportRequest {
  
  inline def apply(exportId: Id): DescribeExportRequest = {
    val __obj = js.Dynamic.literal(exportId = exportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExportRequest]
  }
  
  extension [Self <: DescribeExportRequest](x: Self) {
    
    inline def setExportId(value: Id): Self = StObject.set(x, "exportId", value.asInstanceOf[js.Any])
  }
}
