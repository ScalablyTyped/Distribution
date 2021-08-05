package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAutoMLJobRequest extends StObject {
  
  /**
    * Request information about a job using that job's unique name.
    */
  var AutoMLJobName: typings.awsSdk.sagemakerMod.AutoMLJobName
}
object DescribeAutoMLJobRequest {
  
  inline def apply(AutoMLJobName: AutoMLJobName): DescribeAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutoMLJobRequest]
  }
  
  extension [Self <: DescribeAutoMLJobRequest](x: Self) {
    
    inline def setAutoMLJobName(value: AutoMLJobName): Self = StObject.set(x, "AutoMLJobName", value.asInstanceOf[js.Any])
  }
}
