package typings.awsSdkClientPinpointBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImportJobInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetImportJobInputMod.GetImportJobInput
object GetImportJobInput {
  
  inline def apply(ApplicationId: String, JobId: String): GetImportJobInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportJobInput]
  }
}
