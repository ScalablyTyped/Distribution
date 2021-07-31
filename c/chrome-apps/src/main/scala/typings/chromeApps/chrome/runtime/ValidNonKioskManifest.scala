package typings.chromeApps.chrome.runtime

import typings.chromeApps.anon.Accepttlschannelid
import typings.chromeApps.anon.Background
import typings.chromeApps.chromeAppsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidNonKioskManifest
  extends StObject
     with PartialManifest
     with Manifest {
  
  var kiosk_enabled: js.UndefOr[`false`] = js.undefined
}
object ValidNonKioskManifest {
  
  @scala.inline
  def apply(app: Background, externally_connectable: Accepttlschannelid, name: String, version: String): ValidNonKioskManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], manifest_version = 2, name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidNonKioskManifest]
  }
  
  @scala.inline
  implicit class ValidNonKioskManifestMutableBuilder[Self <: ValidNonKioskManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKiosk_enabled(value: `false`): Self = StObject.set(x, "kiosk_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKiosk_enabledUndefined: Self = StObject.set(x, "kiosk_enabled", js.undefined)
  }
}
