package typings.typescriptNn5FuAjk.mod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageInstalledResponse
  extends StObject
     with ProjectResponse {
  
  @JSName("kind")
  val kind_PackageInstalledResponse: ActionPackageInstalled
  
  val message: String
  
  val success: Boolean
}
object PackageInstalledResponse {
  
  inline def apply(kind: ActionPackageInstalled, message: String, projectName: String, success: Boolean): PackageInstalledResponse = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageInstalledResponse]
  }
  
  extension [Self <: PackageInstalledResponse](x: Self) {
    
    inline def setKind(value: ActionPackageInstalled): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
