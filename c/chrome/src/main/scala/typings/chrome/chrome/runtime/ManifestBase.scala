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
import typings.chrome.anon.Indicator
import typings.chrome.anon.Keyword
import typings.chrome.anon.Managedschema
import typings.chrome.anon.Matches
import typings.chrome.anon.Mimetype
import typings.chrome.anon.Naclarch
import typings.chrome.anon.Path
import typings.chrome.anon.Voices
import typings.chrome.anon.Whitelist
import typings.chrome.anon.`3D`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestBase
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  // Optional
  var author: js.UndefOr[String] = js.undefined
  
  var background_page: js.UndefOr[String] = js.undefined
  
  var chrome_settings_overrides: js.UndefOr[Homepage] = js.undefined
  
  var chrome_ui_overrides: js.UndefOr[Bookmarksui] = js.undefined
  
  var chrome_url_overrides: js.UndefOr[Bookmarks] = js.undefined
  
  var commands: js.UndefOr[StringDictionary[Description]] = js.undefined
  
  var content_capabilities: js.UndefOr[Matches] = js.undefined
  
  var content_scripts: js.UndefOr[js.Array[Allframes]] = js.undefined
  
  var converted_from_user_script: js.UndefOr[Boolean] = js.undefined
  
  var current_locale: js.UndefOr[String] = js.undefined
  
  // Recommended
  var default_locale: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var devtools_page: js.UndefOr[String] = js.undefined
  
  var event_rules: js.UndefOr[js.Array[Actions]] = js.undefined
  
  var `export`: js.UndefOr[Whitelist] = js.undefined
  
  var externally_connectable: js.UndefOr[Acceptstlschannelid] = js.undefined
  
  var file_browser_handlers: js.UndefOr[js.Array[Defaulttitle]] = js.undefined
  
  var file_system_provider_capabilities: js.UndefOr[Configurable] = js.undefined
  
  var homepage_url: js.UndefOr[String] = js.undefined
  
  var icons: js.UndefOr[ManifestIcons] = js.undefined
  
  var `import`: js.UndefOr[js.Array[Id]] = js.undefined
  
  var incognito: js.UndefOr[String] = js.undefined
  
  var input_components: js.UndefOr[js.Array[Indicator]] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  // Required
  var manifest_version: Double
  
  var minimum_chrome_version: js.UndefOr[String] = js.undefined
  
  var nacl_modules: js.UndefOr[js.Array[Mimetype]] = js.undefined
  
  var name: String
  
  var oauth2: js.UndefOr[Clientid] = js.undefined
  
  var offline_enabled: js.UndefOr[Boolean] = js.undefined
  
  var omnibox: js.UndefOr[Keyword] = js.undefined
  
  var options_page: js.UndefOr[String] = js.undefined
  
  var options_ui: js.UndefOr[Chromestyle] = js.undefined
  
  var platforms: js.UndefOr[js.Array[Naclarch]] = js.undefined
  
  var plugins: js.UndefOr[js.Array[Path]] = js.undefined
  
  var requirements: js.UndefOr[`3D`] = js.undefined
  
  var sandbox: js.UndefOr[Contentsecuritypolicy] = js.undefined
  
  var short_name: js.UndefOr[String] = js.undefined
  
  var spellcheck: js.UndefOr[Dictionaryformat] = js.undefined
  
  var storage: js.UndefOr[Managedschema] = js.undefined
  
  var tts_engine: js.UndefOr[Voices] = js.undefined
  
  var update_url: js.UndefOr[String] = js.undefined
  
  var version: String
  
  var version_name: js.UndefOr[String] = js.undefined
}
object ManifestBase {
  
  inline def apply(manifest_version: Double, name: String, version: String): ManifestBase = {
    val __obj = js.Dynamic.literal(manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestBase]
  }
  
  extension [Self <: ManifestBase](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setBackground_page(value: String): Self = StObject.set(x, "background_page", value.asInstanceOf[js.Any])
    
    inline def setBackground_pageUndefined: Self = StObject.set(x, "background_page", js.undefined)
    
    inline def setChrome_settings_overrides(value: Homepage): Self = StObject.set(x, "chrome_settings_overrides", value.asInstanceOf[js.Any])
    
    inline def setChrome_settings_overridesUndefined: Self = StObject.set(x, "chrome_settings_overrides", js.undefined)
    
    inline def setChrome_ui_overrides(value: Bookmarksui): Self = StObject.set(x, "chrome_ui_overrides", value.asInstanceOf[js.Any])
    
    inline def setChrome_ui_overridesUndefined: Self = StObject.set(x, "chrome_ui_overrides", js.undefined)
    
    inline def setChrome_url_overrides(value: Bookmarks): Self = StObject.set(x, "chrome_url_overrides", value.asInstanceOf[js.Any])
    
    inline def setChrome_url_overridesUndefined: Self = StObject.set(x, "chrome_url_overrides", js.undefined)
    
    inline def setCommands(value: StringDictionary[Description]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setContent_capabilities(value: Matches): Self = StObject.set(x, "content_capabilities", value.asInstanceOf[js.Any])
    
    inline def setContent_capabilitiesUndefined: Self = StObject.set(x, "content_capabilities", js.undefined)
    
    inline def setContent_scripts(value: js.Array[Allframes]): Self = StObject.set(x, "content_scripts", value.asInstanceOf[js.Any])
    
    inline def setContent_scriptsUndefined: Self = StObject.set(x, "content_scripts", js.undefined)
    
    inline def setContent_scriptsVarargs(value: Allframes*): Self = StObject.set(x, "content_scripts", js.Array(value*))
    
    inline def setConverted_from_user_script(value: Boolean): Self = StObject.set(x, "converted_from_user_script", value.asInstanceOf[js.Any])
    
    inline def setConverted_from_user_scriptUndefined: Self = StObject.set(x, "converted_from_user_script", js.undefined)
    
    inline def setCurrent_locale(value: String): Self = StObject.set(x, "current_locale", value.asInstanceOf[js.Any])
    
    inline def setCurrent_localeUndefined: Self = StObject.set(x, "current_locale", js.undefined)
    
    inline def setDefault_locale(value: String): Self = StObject.set(x, "default_locale", value.asInstanceOf[js.Any])
    
    inline def setDefault_localeUndefined: Self = StObject.set(x, "default_locale", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDevtools_page(value: String): Self = StObject.set(x, "devtools_page", value.asInstanceOf[js.Any])
    
    inline def setDevtools_pageUndefined: Self = StObject.set(x, "devtools_page", js.undefined)
    
    inline def setEvent_rules(value: js.Array[Actions]): Self = StObject.set(x, "event_rules", value.asInstanceOf[js.Any])
    
    inline def setEvent_rulesUndefined: Self = StObject.set(x, "event_rules", js.undefined)
    
    inline def setEvent_rulesVarargs(value: Actions*): Self = StObject.set(x, "event_rules", js.Array(value*))
    
    inline def setExport(value: Whitelist): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setExternally_connectable(value: Acceptstlschannelid): Self = StObject.set(x, "externally_connectable", value.asInstanceOf[js.Any])
    
    inline def setExternally_connectableUndefined: Self = StObject.set(x, "externally_connectable", js.undefined)
    
    inline def setFile_browser_handlers(value: js.Array[Defaulttitle]): Self = StObject.set(x, "file_browser_handlers", value.asInstanceOf[js.Any])
    
    inline def setFile_browser_handlersUndefined: Self = StObject.set(x, "file_browser_handlers", js.undefined)
    
    inline def setFile_browser_handlersVarargs(value: Defaulttitle*): Self = StObject.set(x, "file_browser_handlers", js.Array(value*))
    
    inline def setFile_system_provider_capabilities(value: Configurable): Self = StObject.set(x, "file_system_provider_capabilities", value.asInstanceOf[js.Any])
    
    inline def setFile_system_provider_capabilitiesUndefined: Self = StObject.set(x, "file_system_provider_capabilities", js.undefined)
    
    inline def setHomepage_url(value: String): Self = StObject.set(x, "homepage_url", value.asInstanceOf[js.Any])
    
    inline def setHomepage_urlUndefined: Self = StObject.set(x, "homepage_url", js.undefined)
    
    inline def setIcons(value: ManifestIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setImport(value: js.Array[Id]): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
    
    inline def setImportVarargs(value: Id*): Self = StObject.set(x, "import", js.Array(value*))
    
    inline def setIncognito(value: String): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
    
    inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
    
    inline def setInput_components(value: js.Array[Indicator]): Self = StObject.set(x, "input_components", value.asInstanceOf[js.Any])
    
    inline def setInput_componentsUndefined: Self = StObject.set(x, "input_components", js.undefined)
    
    inline def setInput_componentsVarargs(value: Indicator*): Self = StObject.set(x, "input_components", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setManifest_version(value: Double): Self = StObject.set(x, "manifest_version", value.asInstanceOf[js.Any])
    
    inline def setMinimum_chrome_version(value: String): Self = StObject.set(x, "minimum_chrome_version", value.asInstanceOf[js.Any])
    
    inline def setMinimum_chrome_versionUndefined: Self = StObject.set(x, "minimum_chrome_version", js.undefined)
    
    inline def setNacl_modules(value: js.Array[Mimetype]): Self = StObject.set(x, "nacl_modules", value.asInstanceOf[js.Any])
    
    inline def setNacl_modulesUndefined: Self = StObject.set(x, "nacl_modules", js.undefined)
    
    inline def setNacl_modulesVarargs(value: Mimetype*): Self = StObject.set(x, "nacl_modules", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOauth2(value: Clientid): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
    
    inline def setOauth2Undefined: Self = StObject.set(x, "oauth2", js.undefined)
    
    inline def setOffline_enabled(value: Boolean): Self = StObject.set(x, "offline_enabled", value.asInstanceOf[js.Any])
    
    inline def setOffline_enabledUndefined: Self = StObject.set(x, "offline_enabled", js.undefined)
    
    inline def setOmnibox(value: Keyword): Self = StObject.set(x, "omnibox", value.asInstanceOf[js.Any])
    
    inline def setOmniboxUndefined: Self = StObject.set(x, "omnibox", js.undefined)
    
    inline def setOptions_page(value: String): Self = StObject.set(x, "options_page", value.asInstanceOf[js.Any])
    
    inline def setOptions_pageUndefined: Self = StObject.set(x, "options_page", js.undefined)
    
    inline def setOptions_ui(value: Chromestyle): Self = StObject.set(x, "options_ui", value.asInstanceOf[js.Any])
    
    inline def setOptions_uiUndefined: Self = StObject.set(x, "options_ui", js.undefined)
    
    inline def setPlatforms(value: js.Array[Naclarch]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: Naclarch*): Self = StObject.set(x, "platforms", js.Array(value*))
    
    inline def setPlugins(value: js.Array[Path]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: Path*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setRequirements(value: `3D`): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setSandbox(value: Contentsecuritypolicy): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    inline def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    inline def setShort_nameUndefined: Self = StObject.set(x, "short_name", js.undefined)
    
    inline def setSpellcheck(value: Dictionaryformat): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
    
    inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
    
    inline def setStorage(value: Managedschema): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    inline def setTts_engine(value: Voices): Self = StObject.set(x, "tts_engine", value.asInstanceOf[js.Any])
    
    inline def setTts_engineUndefined: Self = StObject.set(x, "tts_engine", js.undefined)
    
    inline def setUpdate_url(value: String): Self = StObject.set(x, "update_url", value.asInstanceOf[js.Any])
    
    inline def setUpdate_urlUndefined: Self = StObject.set(x, "update_url", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersion_name(value: String): Self = StObject.set(x, "version_name", value.asInstanceOf[js.Any])
    
    inline def setVersion_nameUndefined: Self = StObject.set(x, "version_name", js.undefined)
  }
}
