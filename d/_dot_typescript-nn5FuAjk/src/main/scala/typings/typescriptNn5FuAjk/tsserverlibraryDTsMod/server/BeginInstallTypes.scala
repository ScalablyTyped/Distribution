package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginInstallTypes
  extends StObject
     with InstallTypes {
  
  @JSName("kind")
  val kind_BeginInstallTypes: EventBeginInstallTypes
}
object BeginInstallTypes {
  
  inline def apply(
    eventId: Double,
    kind: EventBeginInstallTypes,
    packagesToInstall: Array[String],
    projectName: String,
    typingsInstallerVersion: String
  ): BeginInstallTypes = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], packagesToInstall = packagesToInstall.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], typingsInstallerVersion = typingsInstallerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginInstallTypes]
  }
  
  extension [Self <: BeginInstallTypes](x: Self) {
    
    inline def setKind(value: EventBeginInstallTypes): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
