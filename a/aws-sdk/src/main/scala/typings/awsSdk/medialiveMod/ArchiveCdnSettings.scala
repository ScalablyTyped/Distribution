package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveCdnSettings extends StObject {
  
  var ArchiveS3Settings: js.UndefOr[typings.awsSdk.medialiveMod.ArchiveS3Settings] = js.undefined
}
object ArchiveCdnSettings {
  
  inline def apply(): ArchiveCdnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveCdnSettings]
  }
  
  extension [Self <: ArchiveCdnSettings](x: Self) {
    
    inline def setArchiveS3Settings(value: ArchiveS3Settings): Self = StObject.set(x, "ArchiveS3Settings", value.asInstanceOf[js.Any])
    
    inline def setArchiveS3SettingsUndefined: Self = StObject.set(x, "ArchiveS3Settings", js.undefined)
  }
}
