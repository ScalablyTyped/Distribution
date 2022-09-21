package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackApplicationResponse extends StObject {
  
  var ApplicationDetail: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationDetail
}
object RollbackApplicationResponse {
  
  inline def apply(ApplicationDetail: ApplicationDetail): RollbackApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationDetail = ApplicationDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackApplicationResponse]
  }
  
  extension [Self <: RollbackApplicationResponse](x: Self) {
    
    inline def setApplicationDetail(value: ApplicationDetail): Self = StObject.set(x, "ApplicationDetail", value.asInstanceOf[js.Any])
  }
}
