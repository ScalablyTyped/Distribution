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
  var background: js.UndefOr[chromeLib.Anon_Page] = js.undefined
  var background_page: js.UndefOr[java.lang.String] = js.undefined
  // Pick one (or none)
  var browser_action: js.UndefOr[ManifestAction] = js.undefined
  var chrome_settings_overrides: js.UndefOr[chromeLib.Anon_Homepage] = js.undefined
  var chrome_ui_overrides: js.UndefOr[chromeLib.Anon_Bookmarksui] = js.undefined
  var chrome_url_overrides: js.UndefOr[chromeLib.Anon_Bookmarks] = js.undefined
  var commands: js.UndefOr[org.scalablytyped.runtime.StringDictionary[chromeLib.Anon_Description]] = js.undefined
  var content_capabilities: js.UndefOr[chromeLib.Anon_Matches] = js.undefined
  var content_scripts: js.UndefOr[js.Array[chromeLib.Anon_Allframes]] = js.undefined
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
  var externally_connectable: js.UndefOr[chromeLib.Anon_Acceptstlschannelid] = js.undefined
  var file_browser_handlers: js.UndefOr[js.Array[chromeLib.Anon_Defaulttitle]] = js.undefined
  var file_system_provider_capabilities: js.UndefOr[chromeLib.Anon_Configurable] = js.undefined
  var homepage_url: js.UndefOr[java.lang.String] = js.undefined
  var icons: js.UndefOr[ManifestIcons] = js.undefined
  var `import`: js.UndefOr[js.Array[chromeLib.Anon_Id]] = js.undefined
  var incognito: js.UndefOr[java.lang.String] = js.undefined
  var input_components: js.UndefOr[js.Array[chromeLib.Anon_DescriptionId]] = js.undefined
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
  var options_ui: js.UndefOr[chromeLib.Anon_Chromestyle] = js.undefined
  var page_action: js.UndefOr[ManifestAction] = js.undefined
  var permissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var platforms: js.UndefOr[js.Array[chromeLib.Anon_Naclarch]] = js.undefined
  var plugins: js.UndefOr[js.Array[chromeLib.Anon_Path]] = js.undefined
  var requirements: js.UndefOr[chromeLib.Anon_3D] = js.undefined
  var sandbox: js.UndefOr[chromeLib.Anon_Contentsecuritypolicy] = js.undefined
  var short_name: js.UndefOr[java.lang.String] = js.undefined
  var signature: js.UndefOr[js.Any] = js.undefined
  var spellcheck: js.UndefOr[chromeLib.Anon_Dictionaryformat] = js.undefined
  var storage: js.UndefOr[chromeLib.Anon_Managedschema] = js.undefined
  var system_indicator: js.UndefOr[js.Any] = js.undefined
  var tts_engine: js.UndefOr[chromeLib.Anon_Voices] = js.undefined
  var update_url: js.UndefOr[java.lang.String] = js.undefined
  var version: java.lang.String
  var version_name: js.UndefOr[java.lang.String] = js.undefined
  var web_accessible_resources: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Manifest {
  @scala.inline
  def apply(
    manifest_version: scala.Double,
    name: java.lang.String,
    version: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    author: js.Any = null,
    automation: js.Any = null,
    background: chromeLib.Anon_Page = null,
    background_page: java.lang.String = null,
    browser_action: ManifestAction = null,
    chrome_settings_overrides: chromeLib.Anon_Homepage = null,
    chrome_ui_overrides: chromeLib.Anon_Bookmarksui = null,
    chrome_url_overrides: chromeLib.Anon_Bookmarks = null,
    commands: org.scalablytyped.runtime.StringDictionary[chromeLib.Anon_Description] = null,
    content_capabilities: chromeLib.Anon_Matches = null,
    content_scripts: js.Array[chromeLib.Anon_Allframes] = null,
    content_security_policy: java.lang.String = null,
    converted_from_user_script: js.UndefOr[scala.Boolean] = js.undefined,
    copresence: js.Any = null,
    current_locale: java.lang.String = null,
    default_locale: java.lang.String = null,
    description: java.lang.String = null,
    devtools_page: java.lang.String = null,
    event_rules: js.Array[chromeLib.Anon_Actions] = null,
    export: chromeLib.Anon_Whitelist = null,
    externally_connectable: chromeLib.Anon_Acceptstlschannelid = null,
    file_browser_handlers: js.Array[chromeLib.Anon_Defaulttitle] = null,
    file_system_provider_capabilities: chromeLib.Anon_Configurable = null,
    homepage_url: java.lang.String = null,
    icons: ManifestIcons = null,
    `import`: js.Array[chromeLib.Anon_Id] = null,
    incognito: java.lang.String = null,
    input_components: js.Array[chromeLib.Anon_DescriptionId] = null,
    key: java.lang.String = null,
    minimum_chrome_version: java.lang.String = null,
    nacl_modules: js.Array[chromeLib.Anon_Mimetype] = null,
    oauth2: chromeLib.Anon_Clientid = null,
    offline_enabled: js.UndefOr[scala.Boolean] = js.undefined,
    omnibox: chromeLib.Anon_Keyword = null,
    optional_permissions: js.Array[java.lang.String] = null,
    options_page: java.lang.String = null,
    options_ui: chromeLib.Anon_Chromestyle = null,
    page_action: ManifestAction = null,
    permissions: js.Array[java.lang.String] = null,
    platforms: js.Array[chromeLib.Anon_Naclarch] = null,
    plugins: js.Array[chromeLib.Anon_Path] = null,
    requirements: chromeLib.Anon_3D = null,
    sandbox: chromeLib.Anon_Contentsecuritypolicy = null,
    short_name: java.lang.String = null,
    signature: js.Any = null,
    spellcheck: chromeLib.Anon_Dictionaryformat = null,
    storage: chromeLib.Anon_Managedschema = null,
    system_indicator: js.Any = null,
    tts_engine: chromeLib.Anon_Voices = null,
    update_url: java.lang.String = null,
    version_name: java.lang.String = null,
    web_accessible_resources: js.Array[java.lang.String] = null
  ): Manifest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("manifest_version")(manifest_version)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (author != null) __obj.updateDynamic("author")(author)
    if (automation != null) __obj.updateDynamic("automation")(automation)
    if (background != null) __obj.updateDynamic("background")(background)
    if (background_page != null) __obj.updateDynamic("background_page")(background_page)
    if (browser_action != null) __obj.updateDynamic("browser_action")(browser_action)
    if (chrome_settings_overrides != null) __obj.updateDynamic("chrome_settings_overrides")(chrome_settings_overrides)
    if (chrome_ui_overrides != null) __obj.updateDynamic("chrome_ui_overrides")(chrome_ui_overrides)
    if (chrome_url_overrides != null) __obj.updateDynamic("chrome_url_overrides")(chrome_url_overrides)
    if (commands != null) __obj.updateDynamic("commands")(commands)
    if (content_capabilities != null) __obj.updateDynamic("content_capabilities")(content_capabilities)
    if (content_scripts != null) __obj.updateDynamic("content_scripts")(content_scripts)
    if (content_security_policy != null) __obj.updateDynamic("content_security_policy")(content_security_policy)
    if (!js.isUndefined(converted_from_user_script)) __obj.updateDynamic("converted_from_user_script")(converted_from_user_script)
    if (copresence != null) __obj.updateDynamic("copresence")(copresence)
    if (current_locale != null) __obj.updateDynamic("current_locale")(current_locale)
    if (default_locale != null) __obj.updateDynamic("default_locale")(default_locale)
    if (description != null) __obj.updateDynamic("description")(description)
    if (devtools_page != null) __obj.updateDynamic("devtools_page")(devtools_page)
    if (event_rules != null) __obj.updateDynamic("event_rules")(event_rules)
    if (export != null) __obj.updateDynamic("export")(export)
    if (externally_connectable != null) __obj.updateDynamic("externally_connectable")(externally_connectable)
    if (file_browser_handlers != null) __obj.updateDynamic("file_browser_handlers")(file_browser_handlers)
    if (file_system_provider_capabilities != null) __obj.updateDynamic("file_system_provider_capabilities")(file_system_provider_capabilities)
    if (homepage_url != null) __obj.updateDynamic("homepage_url")(homepage_url)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (`import` != null) __obj.updateDynamic("import")(`import`)
    if (incognito != null) __obj.updateDynamic("incognito")(incognito)
    if (input_components != null) __obj.updateDynamic("input_components")(input_components)
    if (key != null) __obj.updateDynamic("key")(key)
    if (minimum_chrome_version != null) __obj.updateDynamic("minimum_chrome_version")(minimum_chrome_version)
    if (nacl_modules != null) __obj.updateDynamic("nacl_modules")(nacl_modules)
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2)
    if (!js.isUndefined(offline_enabled)) __obj.updateDynamic("offline_enabled")(offline_enabled)
    if (omnibox != null) __obj.updateDynamic("omnibox")(omnibox)
    if (optional_permissions != null) __obj.updateDynamic("optional_permissions")(optional_permissions)
    if (options_page != null) __obj.updateDynamic("options_page")(options_page)
    if (options_ui != null) __obj.updateDynamic("options_ui")(options_ui)
    if (page_action != null) __obj.updateDynamic("page_action")(page_action)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (platforms != null) __obj.updateDynamic("platforms")(platforms)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (requirements != null) __obj.updateDynamic("requirements")(requirements)
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (short_name != null) __obj.updateDynamic("short_name")(short_name)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (spellcheck != null) __obj.updateDynamic("spellcheck")(spellcheck)
    if (storage != null) __obj.updateDynamic("storage")(storage)
    if (system_indicator != null) __obj.updateDynamic("system_indicator")(system_indicator)
    if (tts_engine != null) __obj.updateDynamic("tts_engine")(tts_engine)
    if (update_url != null) __obj.updateDynamic("update_url")(update_url)
    if (version_name != null) __obj.updateDynamic("version_name")(version_name)
    if (web_accessible_resources != null) __obj.updateDynamic("web_accessible_resources")(web_accessible_resources)
    __obj.asInstanceOf[Manifest]
  }
}

