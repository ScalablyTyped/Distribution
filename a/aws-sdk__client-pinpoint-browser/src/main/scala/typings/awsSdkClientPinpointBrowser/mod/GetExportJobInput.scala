package typings.awsSdkClientPinpointBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExportJobInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetExportJobInputMod.GetExportJobInput
object GetExportJobInput {
  
  inline def apply(ApplicationId: String, JobId: String): GetExportJobInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportJobInput]
  }
}
