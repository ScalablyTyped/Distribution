package typings
package chromeLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  // Optional
  var author: js.UndefOr[js.Any] = js.undefined
  var automation: js.UndefOr[js.Any] = js.undefined
  var background: js.UndefOr[chromeLib.Anon_Persistent] = js.undefined
  var background_page: js.UndefOr[java.lang.String] = js.undefined
  // Pick one (or none)
  var browser_action: js.UndefOr[ManifestAction] = js.undefined
  var chrome_settings_overrides: js.UndefOr[chromeLib.Anon_Startuppages] = js.undefined
  var chrome_ui_overrides: js.UndefOr[chromeLib.Anon_Bookmarksui] = js.undefined
  var chrome_url_overrides: js.UndefOr[chromeLib.Anon_Bookmarks] = js.undefined
  var commands: js.UndefOr[org.scalablytyped.runtime.StringDictionary[chromeLib.Anon_Suggestedkey]] = js.undefined
  var content_capabilities: js.UndefOr[chromeLib.Anon_Matches] = js.undefined
  var content_scripts: js.UndefOr[js.Array[chromeLib.Anon_Excludeglobs]] = js.undefined
  var content_security_policy: js.UndefOr[java.lang.String] = js.undefined
  var converted_from_user_script: js.UndefOr[scala.Boolean] = js.undefined
  var copresence: js.UndefOr[js.Any] = js.undefined
  var current_locale: js.UndefOr[java.lang.String] = js.undefined
  // Recommended
  var default_locale: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var devtools_page: js.UndefOr[java.lang.String] = js.undefined
  var event_rules: js.UndefOr[js.Array[chromeLib.Anon_Actions]] = js.undefined
  var export: js.UndefOr[chromeLib.Anon_Whitelist] = js.undefined
  var externally_connectable: js.UndefOr[chromeLib.Anon_MatchesAcceptstlschannelid] = js.undefined
  var file_browser_handlers: js.UndefOr[js.Array[chromeLib.Anon_Defaulttitle]] = js.undefined
  var file_system_provider_capabilities: js.UndefOr[chromeLib.Anon_Source] = js.undefined
  var homepage_url: js.UndefOr[java.lang.String] = js.undefined
  var icons: js.UndefOr[ManifestIcons] = js.undefined
  var `import`: js.UndefOr[js.Array[chromeLib.Anon_Minimumversion]] = js.undefined
  var incognito: js.UndefOr[java.lang.String] = js.undefined
  var input_components: js.UndefOr[js.Array[chromeLib.Anon_NameDescription]] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  // Required
  var manifest_version: scala.Double
  var minimum_chrome_version: js.UndefOr[java.lang.String] = js.undefined
  var nacl_modules: js.UndefOr[js.Array[chromeLib.Anon_Mimetype]] = js.undefined
  var name: java.lang.String
  var oauth2: js.UndefOr[chromeLib.Anon_Clientid] = js.undefined
  var offline_enabled: js.UndefOr[scala.Boolean] = js.undefined
  var omnibox: js.UndefOr[chromeLib.Anon_Keyword] = js.undefined
  var optional_permissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var options_page: js.UndefOr[java.lang.String] = js.undefined
  var options_ui: js.UndefOr[chromeLib.Anon_Openintab] = js.undefined
  var page_action: js.UndefOr[ManifestAction] = js.undefined
  var permissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var platforms: js.UndefOr[js.Array[chromeLib.Anon_Subpackagepath]] = js.undefined
  var plugins: js.UndefOr[js.Array[chromeLib.Anon_Path]] = js.undefined
  var requirements: js.UndefOr[chromeLib.Anon_3D] = js.undefined
  var sandbox: js.UndefOr[chromeLib.Anon_Contentsecuritypolicy] = js.undefined
  var short_name: js.UndefOr[java.lang.String] = js.undefined
  var signature: js.UndefOr[js.Any] = js.undefined
  var spellcheck: js.UndefOr[chromeLib.Anon_Dictionarylanguage] = js.undefined
  var storage: js.UndefOr[chromeLib.Anon_Managedschema] = js.undefined
  var system_indicator: js.UndefOr[js.Any] = js.undefined
  var tts_engine: js.UndefOr[chromeLib.Anon_Voices] = js.undefined
  var update_url: js.UndefOr[java.lang.String] = js.undefined
  var version: java.lang.String
  var version_name: js.UndefOr[java.lang.String] = js.undefined
  var web_accessible_resources: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

