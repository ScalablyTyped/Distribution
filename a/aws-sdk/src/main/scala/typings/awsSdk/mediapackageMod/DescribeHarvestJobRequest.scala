package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHarvestJobRequest extends StObject {
  
  /**
    * The ID of the HarvestJob.
    */
  var Id: string
}
object DescribeHarvestJobRequest {
  
  inline def apply(Id: string): DescribeHarvestJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHarvestJobRequest]
  }
  
  extension [Self <: DescribeHarvestJobRequest](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
