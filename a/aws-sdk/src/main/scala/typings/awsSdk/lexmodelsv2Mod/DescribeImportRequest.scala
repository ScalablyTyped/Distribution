package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImportRequest extends StObject {
  
  /**
    * The unique identifier of the import to describe.
    */
  var importId: Id
}
object DescribeImportRequest {
  
  inline def apply(importId: Id): DescribeImportRequest = {
    val __obj = js.Dynamic.literal(importId = importId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImportRequest]
  }
  
  extension [Self <: DescribeImportRequest](x: Self) {
    
    inline def setImportId(value: Id): Self = StObject.set(x, "importId", value.asInstanceOf[js.Any])
  }
}
