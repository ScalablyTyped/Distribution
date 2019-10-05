package typings.chrome.chrome.runtime

import org.scalablytyped.runtime.StringDictionary
import typings.chrome.Anon_3D
import typings.chrome.Anon_Acceptstlschannelid
import typings.chrome.Anon_Actions
import typings.chrome.Anon_Allframes
import typings.chrome.Anon_Bookmarks
import typings.chrome.Anon_Bookmarksui
import typings.chrome.Anon_Chromestyle
import typings.chrome.Anon_Clientid
import typings.chrome.Anon_Configurable
import typings.chrome.Anon_Contentsecuritypolicy
import typings.chrome.Anon_Defaulttitle
import typings.chrome.Anon_Description
import typings.chrome.Anon_DescriptionId
import typings.chrome.Anon_Dictionaryformat
import typings.chrome.Anon_Homepage
import typings.chrome.Anon_Id
import typings.chrome.Anon_Keyword
import typings.chrome.Anon_Managedschema
import typings.chrome.Anon_Matches
import typings.chrome.Anon_Mimetype
import typings.chrome.Anon_Naclarch
import typings.chrome.Anon_Page
import typings.chrome.Anon_Path
import typings.chrome.Anon_Voices
import typings.chrome.Anon_Whitelist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest
  extends /* key */ StringDictionary[js.Any] {
  // Optional
  var author: js.UndefOr[js.Any] = js.undefined
  var automation: js.UndefOr[js.Any] = js.undefined
  var background: js.UndefOr[Anon_Page] = js.undefined
  var background_page: js.UndefOr[String] = js.undefined
  // Pick one (or none)
  var browser_action: js.UndefOr[ManifestAction] = js.undefined
  var chrome_settings_overrides: js.UndefOr[Anon_Homepage] = js.undefined
  var chrome_ui_overrides: js.UndefOr[Anon_Bookmarksui] = js.undefined
  var chrome_url_overrides: js.UndefOr[Anon_Bookmarks] = js.undefined
  var commands: js.UndefOr[StringDictionary[Anon_Description]] = js.undefined
  var content_capabilities: js.UndefOr[Anon_Matches] = js.undefined
  var content_scripts: js.UndefOr[js.Array[Anon_Allframes]] = js.undefined
  var content_security_policy: js.UndefOr[String] = js.undefined
  var converted_from_user_script: js.UndefOr[Boolean] = js.undefined
  var copresence: js.UndefOr[js.Any] = js.undefined
  var current_locale: js.UndefOr[String] = js.undefined
  // Recommended
  var default_locale: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var devtools_page: js.UndefOr[String] = js.undefined
  var event_rules: js.UndefOr[js.Array[Anon_Actions]] = js.undefined
  var export: js.UndefOr[Anon_Whitelist] = js.undefined
  var externally_connectable: js.UndefOr[Anon_Acceptstlschannelid] = js.undefined
  var file_browser_handlers: js.UndefOr[js.Array[Anon_Defaulttitle]] = js.undefined
  var file_system_provider_capabilities: js.UndefOr[Anon_Configurable] = js.undefined
  var homepage_url: js.UndefOr[String] = js.undefined
  var icons: js.UndefOr[ManifestIcons] = js.undefined
  var `import`: js.UndefOr[js.Array[Anon_Id]] = js.undefined
  var incognito: js.UndefOr[String] = js.undefined
  var input_components: js.UndefOr[js.Array[Anon_DescriptionId]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  // Required
  var manifest_version: Double
  var minimum_chrome_version: js.UndefOr[String] = js.undefined
  var nacl_modules: js.UndefOr[js.Array[Anon_Mimetype]] = js.undefined
  var name: String
  var oauth2: js.UndefOr[Anon_Clientid] = js.undefined
  var offline_enabled: js.UndefOr[Boolean] = js.undefined
  var omnibox: js.UndefOr[Anon_Keyword] = js.undefined
  var optional_permissions: js.UndefOr[js.Array[String]] = js.undefined
  var options_page: js.UndefOr[String] = js.undefined
  var options_ui: js.UndefOr[Anon_Chromestyle] = js.undefined
  var page_action: js.UndefOr[ManifestAction] = js.undefined
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
  var platforms: js.UndefOr[js.Array[Anon_Naclarch]] = js.undefined
  var plugins: js.UndefOr[js.Array[Anon_Path]] = js.undefined
  var requirements: js.UndefOr[Anon_3D] = js.undefined
  var sandbox: js.UndefOr[Anon_Contentsecuritypolicy] = js.undefined
  var short_name: js.UndefOr[String] = js.undefined
  var signature: js.UndefOr[js.Any] = js.undefined
  var spellcheck: js.UndefOr[Anon_Dictionaryformat] = js.undefined
  var storage: js.UndefOr[Anon_Managedschema] = js.undefined
  var system_indicator: js.UndefOr[js.Any] = js.undefined
  var tts_engine: js.UndefOr[Anon_Voices] = js.undefined
  var update_url: js.UndefOr[String] = js.undefined
  var version: String
  var version_name: js.UndefOr[String] = js.undefined
  var web_accessible_resources: js.UndefOr[js.Array[String]] = js.undefined
}

object Manifest {
  @scala.inline
  def apply(
    manifest_version: Double,
    name: String,
    version: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    author: js.Any = null,
    automation: js.Any = null,
    background: Anon_Page = null,
    background_page: String = null,
    browser_action: ManifestAction = null,
    chrome_settings_overrides: Anon_Homepage = null,
    chrome_ui_overrides: Anon_Bookmarksui = null,
    chrome_url_overrides: Anon_Bookmarks = null,
    commands: StringDictionary[Anon_Description] = null,
    content_capabilities: Anon_Matches = null,
    content_scripts: js.Array[Anon_Allframes] = null,
    content_security_policy: String = null,
    converted_from_user_script: js.UndefOr[Boolean] = js.undefined,
    copresence: js.Any = null,
    current_locale: String = null,
    default_locale: String = null,
    description: String = null,
    devtools_page: String = null,
    event_rules: js.Array[Anon_Actions] = null,
    export: Anon_Whitelist = null,
    externally_connectable: Anon_Acceptstlschannelid = null,
    file_browser_handlers: js.Array[Anon_Defaulttitle] = null,
    file_system_provider_capabilities: Anon_Configurable = null,
    homepage_url: String = null,
    icons: ManifestIcons = null,
    `import`: js.Array[Anon_Id] = null,
    incognito: String = null,
    input_components: js.Array[Anon_DescriptionId] = null,
    key: String = null,
    minimum_chrome_version: String = null,
    nacl_modules: js.Array[Anon_Mimetype] = null,
    oauth2: Anon_Clientid = null,
    offline_enabled: js.UndefOr[Boolean] = js.undefined,
    omnibox: Anon_Keyword = null,
    optional_permissions: js.Array[String] = null,
    options_page: String = null,
    options_ui: Anon_Chromestyle = null,
    page_action: ManifestAction = null,
    permissions: js.Array[String] = null,
    platforms: js.Array[Anon_Naclarch] = null,
    plugins: js.Array[Anon_Path] = null,
    requirements: Anon_3D = null,
    sandbox: Anon_Contentsecuritypolicy = null,
    short_name: String = null,
    signature: js.Any = null,
    spellcheck: Anon_Dictionaryformat = null,
    storage: Anon_Managedschema = null,
    system_indicator: js.Any = null,
    tts_engine: Anon_Voices = null,
    update_url: String = null,
    version_name: String = null,
    web_accessible_resources: js.Array[String] = null
  ): Manifest = {
    val __obj = js.Dynamic.literal(manifest_version = manifest_version, name = name, version = version)
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

