package typings.chromeApps.chrome.runtime

import typings.chromeApps.anon.Accepttlschannelid
import typings.chromeApps.anon.Background
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidManifest
  extends StObject
     with PartialManifest
     with Manifest {
  
  /** Not for packaged apps */
  var browser_action: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Not for packaged apps
    * Only for extensions and legacy packaged apps
    */
  var chrome_url_overrides: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Not for packaged apps
    * Only for extensions and legacy packaged apps
    */
  var content_security_policy: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Not for packaged apps */
  var options_page: js.UndefOr[scala.Nothing] = js.undefined
  
  //
  // Never types - should never exist
  // Are declared to prevent use since many
  // legacy app are using them. Will result
  // in errors. Many examples and code bases
  // have these included.
  //
  /** Not for packaged apps */
  var options_ui: js.UndefOr[scala.Nothing] = js.undefined
}
object InvalidManifest {
  
  inline def apply(app: Background, externally_connectable: Accepttlschannelid, name: String, version: String): InvalidManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], manifest_version = 2, name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidManifest]
  }
}
