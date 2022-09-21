package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypingsInstalledTelemetryEventPayload extends StObject {
  
  /**
    * true if install request succeeded, otherwise - false
    */
  var installSuccess: Boolean
  
  /**
    * Comma separated list of installed typing packages
    */
  var installedPackages: String
  
  /**
    * version of typings installer
    */
  var typingsInstallerVersion: String
}
object TypingsInstalledTelemetryEventPayload {
  
  inline def apply(installSuccess: Boolean, installedPackages: String, typingsInstallerVersion: String): TypingsInstalledTelemetryEventPayload = {
    val __obj = js.Dynamic.literal(installSuccess = installSuccess.asInstanceOf[js.Any], installedPackages = installedPackages.asInstanceOf[js.Any], typingsInstallerVersion = typingsInstallerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypingsInstalledTelemetryEventPayload]
  }
  
  extension [Self <: TypingsInstalledTelemetryEventPayload](x: Self) {
    
    inline def setInstallSuccess(value: Boolean): Self = StObject.set(x, "installSuccess", value.asInstanceOf[js.Any])
    
    inline def setInstalledPackages(value: String): Self = StObject.set(x, "installedPackages", value.asInstanceOf[js.Any])
    
    inline def setTypingsInstallerVersion(value: String): Self = StObject.set(x, "typingsInstallerVersion", value.asInstanceOf[js.Any])
  }
}
