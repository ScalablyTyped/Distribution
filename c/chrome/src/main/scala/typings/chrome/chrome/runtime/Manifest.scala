package typings.chrome.chrome.runtime

import org.scalablytyped.runtime.StringDictionary
import typings.chrome.anon.Acceptstlschannelid
import typings.chrome.anon.Actions
import typings.chrome.anon.Allframes
import typings.chrome.anon.Bookmarks
import typings.chrome.anon.Bookmarksui
import typings.chrome.anon.Chromestyle
import typings.chrome.anon.Clientid
import typings.chrome.anon.Configurable
import typings.chrome.anon.Contentsecuritypolicy
import typings.chrome.anon.Defaulttitle
import typings.chrome.anon.Description
import typings.chrome.anon.Dictionaryformat
import typings.chrome.anon.Homepage
import typings.chrome.anon.Id
import typings.chrome.anon.Keyword
import typings.chrome.anon.Language
import typings.chrome.anon.Managedschema
import typings.chrome.anon.Matches
import typings.chrome.anon.Mimetype
import typings.chrome.anon.Naclarch
import typings.chrome.anon.Page
import typings.chrome.anon.Path
import typings.chrome.anon.Voices
import typings.chrome.anon.Whitelist
import typings.chrome.anon.`3D`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest
  extends /* key */ StringDictionary[js.Any] {
  // Optional
  var author: js.UndefOr[js.Any] = js.undefined
  var automation: js.UndefOr[js.Any] = js.undefined
  var background: js.UndefOr[Page] = js.undefined
  var background_page: js.UndefOr[String] = js.undefined
  // Pick one (or none)
  var browser_action: js.UndefOr[ManifestAction] = js.undefined
  var chrome_settings_overrides: js.UndefOr[Homepage] = js.undefined
  var chrome_ui_overrides: js.UndefOr[Bookmarksui] = js.undefined
  var chrome_url_overrides: js.UndefOr[Bookmarks] = js.undefined
  var commands: js.UndefOr[StringDictionary[Description]] = js.undefined
  var content_capabilities: js.UndefOr[Matches] = js.undefined
  var content_scripts: js.UndefOr[js.Array[Allframes]] = js.undefined
  var content_security_policy: js.UndefOr[String] = js.undefined
  var converted_from_user_script: js.UndefOr[Boolean] = js.undefined
  var copresence: js.UndefOr[js.Any] = js.undefined
  var current_locale: js.UndefOr[String] = js.undefined
  // Recommended
  var default_locale: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var devtools_page: js.UndefOr[String] = js.undefined
  var event_rules: js.UndefOr[js.Array[Actions]] = js.undefined
  var export: js.UndefOr[Whitelist] = js.undefined
  var externally_connectable: js.UndefOr[Acceptstlschannelid] = js.undefined
  var file_browser_handlers: js.UndefOr[js.Array[Defaulttitle]] = js.undefined
  var file_system_provider_capabilities: js.UndefOr[Configurable] = js.undefined
  var homepage_url: js.UndefOr[String] = js.undefined
  var icons: js.UndefOr[ManifestIcons] = js.undefined
  var `import`: js.UndefOr[js.Array[Id]] = js.undefined
  var incognito: js.UndefOr[String] = js.undefined
  var input_components: js.UndefOr[js.Array[Language]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  // Required
  var manifest_version: Double
  var minimum_chrome_version: js.UndefOr[String] = js.undefined
  var nacl_modules: js.UndefOr[js.Array[Mimetype]] = js.undefined
  var name: String
  var oauth2: js.UndefOr[Clientid] = js.undefined
  var offline_enabled: js.UndefOr[Boolean] = js.undefined
  var omnibox: js.UndefOr[Keyword] = js.undefined
  var optional_permissions: js.UndefOr[js.Array[String]] = js.undefined
  var options_page: js.UndefOr[String] = js.undefined
  var options_ui: js.UndefOr[Chromestyle] = js.undefined
  var page_action: js.UndefOr[ManifestAction] = js.undefined
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
  var platforms: js.UndefOr[js.Array[Naclarch]] = js.undefined
  var plugins: js.UndefOr[js.Array[Path]] = js.undefined
  var requirements: js.UndefOr[`3D`] = js.undefined
  var sandbox: js.UndefOr[Contentsecuritypolicy] = js.undefined
  var short_name: js.UndefOr[String] = js.undefined
  var signature: js.UndefOr[js.Any] = js.undefined
  var spellcheck: js.UndefOr[Dictionaryformat] = js.undefined
  var storage: js.UndefOr[Managedschema] = js.undefined
  var system_indicator: js.UndefOr[js.Any] = js.undefined
  var tts_engine: js.UndefOr[Voices] = js.undefined
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    author: js.Any = null,
    automation: js.Any = null,
    background: Page = null,
    background_page: String = null,
    browser_action: ManifestAction = null,
    chrome_settings_overrides: Homepage = null,
    chrome_ui_overrides: Bookmarksui = null,
    chrome_url_overrides: Bookmarks = null,
    commands: StringDictionary[Description] = null,
    content_capabilities: Matches = null,
    content_scripts: js.Array[Allframes] = null,
    content_security_policy: String = null,
    converted_from_user_script: js.UndefOr[Boolean] = js.undefined,
    copresence: js.Any = null,
    current_locale: String = null,
    default_locale: String = null,
    description: String = null,
    devtools_page: String = null,
    event_rules: js.Array[Actions] = null,
    export: Whitelist = null,
    externally_connectable: Acceptstlschannelid = null,
    file_browser_handlers: js.Array[Defaulttitle] = null,
    file_system_provider_capabilities: Configurable = null,
    homepage_url: String = null,
    icons: ManifestIcons = null,
    `import`: js.Array[Id] = null,
    incognito: String = null,
    input_components: js.Array[Language] = null,
    key: String = null,
    minimum_chrome_version: String = null,
    nacl_modules: js.Array[Mimetype] = null,
    oauth2: Clientid = null,
    offline_enabled: js.UndefOr[Boolean] = js.undefined,
    omnibox: Keyword = null,
    optional_permissions: js.Array[String] = null,
    options_page: String = null,
    options_ui: Chromestyle = null,
    page_action: ManifestAction = null,
    permissions: js.Array[String] = null,
    platforms: js.Array[Naclarch] = null,
    plugins: js.Array[Path] = null,
    requirements: `3D` = null,
    sandbox: Contentsecuritypolicy = null,
    short_name: String = null,
    signature: js.Any = null,
    spellcheck: Dictionaryformat = null,
    storage: Managedschema = null,
    system_indicator: js.Any = null,
    tts_engine: Voices = null,
    update_url: String = null,
    version_name: String = null,
    web_accessible_resources: js.Array[String] = null
  ): Manifest = {
    val __obj = js.Dynamic.literal(manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (automation != null) __obj.updateDynamic("automation")(automation.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (background_page != null) __obj.updateDynamic("background_page")(background_page.asInstanceOf[js.Any])
    if (browser_action != null) __obj.updateDynamic("browser_action")(browser_action.asInstanceOf[js.Any])
    if (chrome_settings_overrides != null) __obj.updateDynamic("chrome_settings_overrides")(chrome_settings_overrides.asInstanceOf[js.Any])
    if (chrome_ui_overrides != null) __obj.updateDynamic("chrome_ui_overrides")(chrome_ui_overrides.asInstanceOf[js.Any])
    if (chrome_url_overrides != null) __obj.updateDynamic("chrome_url_overrides")(chrome_url_overrides.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (content_capabilities != null) __obj.updateDynamic("content_capabilities")(content_capabilities.asInstanceOf[js.Any])
    if (content_scripts != null) __obj.updateDynamic("content_scripts")(content_scripts.asInstanceOf[js.Any])
    if (content_security_policy != null) __obj.updateDynamic("content_security_policy")(content_security_policy.asInstanceOf[js.Any])
    if (!js.isUndefined(converted_from_user_script)) __obj.updateDynamic("converted_from_user_script")(converted_from_user_script.get.asInstanceOf[js.Any])
    if (copresence != null) __obj.updateDynamic("copresence")(copresence.asInstanceOf[js.Any])
    if (current_locale != null) __obj.updateDynamic("current_locale")(current_locale.asInstanceOf[js.Any])
    if (default_locale != null) __obj.updateDynamic("default_locale")(default_locale.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (devtools_page != null) __obj.updateDynamic("devtools_page")(devtools_page.asInstanceOf[js.Any])
    if (event_rules != null) __obj.updateDynamic("event_rules")(event_rules.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (externally_connectable != null) __obj.updateDynamic("externally_connectable")(externally_connectable.asInstanceOf[js.Any])
    if (file_browser_handlers != null) __obj.updateDynamic("file_browser_handlers")(file_browser_handlers.asInstanceOf[js.Any])
    if (file_system_provider_capabilities != null) __obj.updateDynamic("file_system_provider_capabilities")(file_system_provider_capabilities.asInstanceOf[js.Any])
    if (homepage_url != null) __obj.updateDynamic("homepage_url")(homepage_url.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (`import` != null) __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    if (incognito != null) __obj.updateDynamic("incognito")(incognito.asInstanceOf[js.Any])
    if (input_components != null) __obj.updateDynamic("input_components")(input_components.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (minimum_chrome_version != null) __obj.updateDynamic("minimum_chrome_version")(minimum_chrome_version.asInstanceOf[js.Any])
    if (nacl_modules != null) __obj.updateDynamic("nacl_modules")(nacl_modules.asInstanceOf[js.Any])
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2.asInstanceOf[js.Any])
    if (!js.isUndefined(offline_enabled)) __obj.updateDynamic("offline_enabled")(offline_enabled.get.asInstanceOf[js.Any])
    if (omnibox != null) __obj.updateDynamic("omnibox")(omnibox.asInstanceOf[js.Any])
    if (optional_permissions != null) __obj.updateDynamic("optional_permissions")(optional_permissions.asInstanceOf[js.Any])
    if (options_page != null) __obj.updateDynamic("options_page")(options_page.asInstanceOf[js.Any])
    if (options_ui != null) __obj.updateDynamic("options_ui")(options_ui.asInstanceOf[js.Any])
    if (page_action != null) __obj.updateDynamic("page_action")(page_action.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (platforms != null) __obj.updateDynamic("platforms")(platforms.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (requirements != null) __obj.updateDynamic("requirements")(requirements.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (short_name != null) __obj.updateDynamic("short_name")(short_name.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (spellcheck != null) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (system_indicator != null) __obj.updateDynamic("system_indicator")(system_indicator.asInstanceOf[js.Any])
    if (tts_engine != null) __obj.updateDynamic("tts_engine")(tts_engine.asInstanceOf[js.Any])
    if (update_url != null) __obj.updateDynamic("update_url")(update_url.asInstanceOf[js.Any])
    if (version_name != null) __obj.updateDynamic("version_name")(version_name.asInstanceOf[js.Any])
    if (web_accessible_resources != null) __obj.updateDynamic("web_accessible_resources")(web_accessible_resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
}

