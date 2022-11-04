package typings.cssnanoPresetDefault

import typings.browserslist.mod.Stats
import typings.cssnanoPresetDefault.cssnanoPresetDefaultBooleans.`false`
import typings.cssnanoPresetDefault.cssnanoPresetDefaultBooleans.`true`
import typings.cssnanoPresetDefault.cssnanoPresetDefaultStrings.double
import typings.cssnanoPresetDefault.cssnanoPresetDefaultStrings.http
import typings.cssnanoPresetDefault.cssnanoPresetDefaultStrings.https
import typings.cssnanoPresetDefault.cssnanoPresetDefaultStrings.single
import typings.postcss.mod.PluginCreator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exclude extends StObject {
    
    var exclude: js.UndefOr[`true`] = js.undefined
  }
  object Exclude {
    
    inline def apply(): Exclude = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exclude]
    }
    
    extension [Self <: Exclude](x: Self) {
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    }
  }
  
  /* Inlined postcss-discard-comments.postcss-discard-comments.Options & {  exclude :true | undefined} */
  trait Optionsexcludetrueundefin extends StObject {
    
    var exclude: js.UndefOr[`true`] = js.undefined
    
    var remove: js.UndefOr[js.Function1[/* s */ String, Boolean]] = js.undefined
    
    var removeAll: js.UndefOr[Boolean] = js.undefined
    
    var removeAllButFirst: js.UndefOr[Boolean] = js.undefined
  }
  object Optionsexcludetrueundefin {
    
    inline def apply(): Optionsexcludetrueundefin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsexcludetrueundefin]
    }
    
    extension [Self <: Optionsexcludetrueundefin](x: Self) {
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setRemove(value: /* s */ String => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveAll(value: Boolean): Self = StObject.set(x, "removeAll", value.asInstanceOf[js.Any])
      
      inline def setRemoveAllButFirst(value: Boolean): Self = StObject.set(x, "removeAllButFirst", value.asInstanceOf[js.Any])
      
      inline def setRemoveAllButFirstUndefined: Self = StObject.set(x, "removeAllButFirst", js.undefined)
      
      inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    }
  }
  
  /* Inlined postcss-normalize-charset.postcss-normalize-charset.Options & {  exclude :true | undefined} */
  trait OptionsexcludetrueundefinAdd extends StObject {
    
    var add: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[`true`] = js.undefined
  }
  object OptionsexcludetrueundefinAdd {
    
    inline def apply(): OptionsexcludetrueundefinAdd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsexcludetrueundefinAdd]
    }
    
    extension [Self <: OptionsexcludetrueundefinAdd](x: Self) {
      
      inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    }
  }
  
  /* Inlined postcss-convert-values.postcss-convert-values.Options & {  exclude :true | undefined} */
  trait OptionsexcludetrueundefinAngle extends StObject {
    
    var angle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Path to config file with queries.
      */
    var config: js.UndefOr[String] = js.undefined
    
    /**
      * Disable security checks for extend query.
      */
    var dangerousExtend: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Processing environment. It will be used to take right queries
      * from config file.
      */
    var env: js.UndefOr[String] = js.undefined
    
    var exclude: js.UndefOr[`true`] = js.undefined
    
    /**
      * Do not throw on unknown version in direct query.
      */
    var ignoreUnknownVersions: js.UndefOr[Boolean] = js.undefined
    
    var length: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias mobile browsers to the desktop version when Can I Use
      * doesn’t have data about the specified version.
      */
    var mobileToDesktop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Path to processed file. It will be used to find config files.
      */
    var path: js.UndefOr[String | `false`] = js.undefined
    
    var precision: Boolean | Double
    
    /**
      * Custom browser usage statistics for "> 1% in my stats" query.
      */
    var stats: js.UndefOr[Stats | String] = js.undefined
    
    /**
      * Throw an error if env is not found.
      */
    var throwOnMissing: js.UndefOr[Boolean] = js.undefined
    
    var time: js.UndefOr[Boolean] = js.undefined
  }
  object OptionsexcludetrueundefinAngle {
    
    inline def apply(precision: Boolean | Double): OptionsexcludetrueundefinAngle = {
      val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsexcludetrueundefinAngle]
    }
    
    extension [Self <: OptionsexcludetrueundefinAngle](x: Self) {
      
      inline def setAngle(value: Boolean): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDangerousExtend(value: Boolean): Self = StObject.set(x, "dangerousExtend", value.asInstanceOf[js.Any])
      
      inline def setDangerousExtendUndefined: Self = StObject.set(x, "dangerousExtend", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setIgnoreUnknownVersions(value: Boolean): Self = StObject.set(x, "ignoreUnknownVersions", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnknownVersionsUndefined: Self = StObject.set(x, "ignoreUnknownVersions", js.undefined)
      
      inline def setLength(value: Boolean): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMobileToDesktop(value: Boolean): Self = StObject.set(x, "mobileToDesktop", value.asInstanceOf[js.Any])
      
      inline def setMobileToDesktopUndefined: Self = StObject.set(x, "mobileToDesktop", js.undefined)
      
      inline def setPath(value: String | `false`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPrecision(value: Boolean | Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Stats | String): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setThrowOnMissing(value: Boolean): Self = StObject.set(x, "throwOnMissing", value.asInstanceOf[js.Any])
      
      inline def setThrowOnMissingUndefined: Self = StObject.set(x, "throwOnMissing", js.undefined)
      
      inline def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  /* Inlined postcss-normalize-url.postcss-normalize-url.Options & {  exclude :true | undefined} */
  trait OptionsexcludetrueundefinDefaultProtocol extends StObject {
    
    /**
    	@default 'http'
    	*/
    val defaultProtocol: js.UndefOr[https | http] = js.undefined
    
    var exclude: js.UndefOr[`true`] = js.undefined
    
    /**
    	Normalizes HTTPS URLs to HTTP.
    	@default false
    	@example
    	```
    	normalizeUrl('https://sindresorhus.com');
    	//=> 'https://sindresorhus.com'
    	normalizeUrl('https://sindresorhus.com', {forceHttp: true});
    	//=> 'http://sindresorhus.com'
    	```
    	*/
    val forceHttp: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Normalizes HTTP URLs to HTTPS.
    	This option cannot be used with the `forceHttp` option at the same time.
    	@default false
    	@example
    	```
    	normalizeUrl('http://sindresorhus.com');
    	//=> 'http://sindresorhus.com'
    	normalizeUrl('http://sindresorhus.com', {forceHttps: true});
    	//=> 'https://sindresorhus.com'
    	```
    	*/
    val forceHttps: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Keeps only query parameters that matches any of the provided strings or regexes.
    	__Note__: It overrides the `removeQueryParameters` option.
    	@default undefined
    	@example
    	```
    	normalizeUrl('https://sindresorhus.com?foo=bar&ref=unicorn', {
    		keepQueryParameters: ['ref']
    	});
    	//=> 'https://sindresorhus.com/?ref=unicorn'
    	```
    	*/
    val keepQueryParameters: js.UndefOr[js.Array[js.RegExp | String]] = js.undefined
    
    /**
    	Prepends `defaultProtocol` to the URL if it's protocol-relative.
    	@default true
    	@example
    	```
    	normalizeUrl('//sindresorhus.com');
    	//=> 'http://sindresorhus.com'
    	normalizeUrl('//sindresorhus.com', {normalizeProtocol: false});
    	//=> '//sindresorhus.com'
    	```
    	*/
    val normalizeProtocol: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Removes the default directory index file from path that matches any of the provided strings or regexes.
    	When `true`, the regex `/^index\.[a-z]+$/` is used.
    	@default false
    	@example
    	```
    	normalizeUrl('www.sindresorhus.com/foo/default.php', {
    		removeDirectoryIndex: [/^default\.[a-z]+$/]
    	});
    	//=> 'http://sindresorhus.com/foo'
    	```
    	*/
    val removeDirectoryIndex: js.UndefOr[Boolean | (js.Array[js.RegExp | String])] = js.undefined
    
    /**
    	Removes an explicit port number from the URL.
    	Port 443 is always removed from HTTPS URLs and 80 is always removed from HTTP URLs regardless of this option.
    	@default false
    	@example
    	```
    	normalizeUrl('sindresorhus.com:123', {
    		removeExplicitPort: true
    	});
    	//=> 'http://sindresorhus.com'
    	```
    	*/
    val removeExplicitPort: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Removes query parameters that matches any of the provided strings or regexes.
    	@default [/^utm_\w+/i]
    	@example
    	```
    	normalizeUrl('www.sindresorhus.com?foo=bar&ref=test_ref', {
    		removeQueryParameters: ['ref']
    	});
    	//=> 'http://sindresorhus.com/?foo=bar'
    	```
    	If a boolean is provided, `true` will remove all the query parameters.
    	```
    	normalizeUrl('www.sindresorhus.com?foo=bar', {
    		removeQueryParameters: true
    	});
    	//=> 'http://sindresorhus.com'
    	```
    	`false` will not remove any query parameter.
    	```
    	normalizeUrl('www.sindresorhus.com?foo=bar&utm_medium=test&ref=test_ref', {
    		removeQueryParameters: false
    	});
    	//=> 'http://www.sindresorhus.com/?foo=bar&ref=test_ref&utm_medium=test'
    	```
    	*/
    val removeQueryParameters: js.UndefOr[(js.Array[js.RegExp | String]) | Boolean] = js.undefined
    
    /**
    	Remove a sole `/` pathname in the output. This option is independent of `removeTrailingSlash`.
    	@default true
    	@example
    	```
    	normalizeUrl('https://sindresorhus.com/');
    	//=> 'https://sindresorhus.com'
    	normalizeUrl('https://sindresorhus.com/', {removeSingleSlash: false});
    	//=> 'https://sindresorhus.com/'
    	```
    	*/
    val removeSingleSlash: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Removes trailing slash.
    	__Note__: Trailing slash is always removed if the URL doesn't have a pathname unless the `removeSingleSlash` option is set to `false`.
    	@default true
    	@example
    	```
    	normalizeUrl('http://sindresorhus.com/redirect/');
    	//=> 'http://sindresorhus.com/redirect'
    	normalizeUrl('http://sindresorhus.com/redirect/', {removeTrailingSlash: false});
    	//=> 'http://sindresorhus.com/redirect/'
    	normalizeUrl('http://sindresorhus.com/', {removeTrailingSlash: false});
    	//=> 'http://sindresorhus.com'
    	```
    	*/
    val removeTrailingSlash: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Sorts the query parameters alphabetically by key.
    	@default true
    	@example
    	```
    	normalizeUrl('www.sindresorhus.com?b=two&a=one&c=three', {
    		sortQueryParameters: false
    	});
    	//=> 'http://sindresorhus.com/?b=two&a=one&c=three'
    	```
    	*/
    val sortQueryParameters: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Strip the [authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) part of a URL.
    	@default true
    	@example
    	```
    	normalizeUrl('user:password@sindresorhus.com');
    	//=> 'https://sindresorhus.com'
    	normalizeUrl('user:password@sindresorhus.com', {stripAuthentication: false});
    	//=> 'https://user:password@sindresorhus.com'
    	```
    	*/
    val stripAuthentication: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Removes hash from the URL.
    	@default false
    	@example
    	```
    	normalizeUrl('sindresorhus.com/about.html#contact');
    	//=> 'http://sindresorhus.com/about.html#contact'
    	normalizeUrl('sindresorhus.com/about.html#contact', {stripHash: true});
    	//=> 'http://sindresorhus.com/about.html'
    	```
    	*/
    val stripHash: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Remove the protocol from the URL: `http://sindresorhus.com` → `sindresorhus.com`.
    	It will only remove `https://` and `http://` protocols.
    	@default false
    	@example
    	```
    	normalizeUrl('https://sindresorhus.com');
    	//=> 'https://sindresorhus.com'
    	normalizeUrl('sindresorhus.com', {stripProtocol: true});
    	//=> 'sindresorhus.com'
    	```
    	*/
    val stripProtocol: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Strip the [text fragment](https://web.dev/text-fragments/) part of the URL
    	__Note:__ The text fragment will always be removed if the `stripHash` option is set to `true`, as the hash contains the text fragment.
    	@default true
    	@example
    	```
    	normalizeUrl('http://sindresorhus.com/about.html#:~:text=hello');
    	//=> 'http://sindresorhus.com/about.html#'
    	normalizeUrl('http://sindresorhus.com/about.html#section:~:text=hello');
    	//=> 'http://sindresorhus.com/about.html#section'
    	normalizeUrl('http://sindresorhus.com/about.html#:~:text=hello', {stripTextFragment: false});
    	//=> 'http://sindresorhus.com/about.html#:~:text=hello'
    	normalizeUrl('http://sindresorhus.com/about.html#section:~:text=hello', {stripTextFragment: false});
    	//=> 'http://sindresorhus.com/about.html#section:~:text=hello'
    	```
    	*/
    val stripTextFragment: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Removes `www.` from the URL.
    	@default true
    	@example
    	```
    	normalizeUrl('http://www.sindresorhus.com');
    	//=> 'http://sindresorhus.com'
    	normalizeUrl('http://www.sindresorhus.com', {stripWWW: false});
    	//=> 'http://www.sindresorhus.com'
    	```
    	*/
    val stripWWW: js.UndefOr[Boolean] = js.undefined
  }
  object OptionsexcludetrueundefinDefaultProtocol {
    
    inline def apply(): OptionsexcludetrueundefinDefaultProtocol = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsexcludetrueundefinDefaultProtocol]
    }
    
    extension [Self <: OptionsexcludetrueundefinDefaultProtocol](x: Self) {
      
      inline def setDefaultProtocol(value: https | http): Self = StObject.set(x, "defaultProtocol", value.asInstanceOf[js.Any])
      
      inline def setDefaultProtocolUndefined: Self = StObject.set(x, "defaultProtocol", js.undefined)
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setForceHttp(value: Boolean): Self = StObject.set(x, "forceHttp", value.asInstanceOf[js.Any])
      
      inline def setForceHttpUndefined: Self = StObject.set(x, "forceHttp", js.undefined)
      
      inline def setForceHttps(value: Boolean): Self = StObject.set(x, "forceHttps", value.asInstanceOf[js.Any])
      
      inline def setForceHttpsUndefined: Self = StObject.set(x, "forceHttps", js.undefined)
      
      inline def setKeepQueryParameters(value: js.Array[js.RegExp | String]): Self = StObject.set(x, "keepQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setKeepQueryParametersUndefined: Self = StObject.set(x, "keepQueryParameters", js.undefined)
      
      inline def setKeepQueryParametersVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "keepQueryParameters", js.Array(value*))
      
      inline def setNormalizeProtocol(value: Boolean): Self = StObject.set(x, "normalizeProtocol", value.asInstanceOf[js.Any])
      
      inline def setNormalizeProtocolUndefined: Self = StObject.set(x, "normalizeProtocol", js.undefined)
      
      inline def setRemoveDirectoryIndex(value: Boolean | (js.Array[js.RegExp | String])): Self = StObject.set(x, "removeDirectoryIndex", value.asInstanceOf[js.Any])
      
      inline def setRemoveDirectoryIndexUndefined: Self = StObject.set(x, "removeDirectoryIndex", js.undefined)
      
      inline def setRemoveDirectoryIndexVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "removeDirectoryIndex", js.Array(value*))
      
      inline def setRemoveExplicitPort(value: Boolean): Self = StObject.set(x, "removeExplicitPort", value.asInstanceOf[js.Any])
      
      inline def setRemoveExplicitPortUndefined: Self = StObject.set(x, "removeExplicitPort", js.undefined)
      
      inline def setRemoveQueryParameters(value: (js.Array[js.RegExp | String]) | Boolean): Self = StObject.set(x, "removeQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setRemoveQueryParametersUndefined: Self = StObject.set(x, "removeQueryParameters", js.undefined)
      
      inline def setRemoveQueryParametersVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "removeQueryParameters", js.Array(value*))
      
      inline def setRemoveSingleSlash(value: Boolean): Self = StObject.set(x, "removeSingleSlash", value.asInstanceOf[js.Any])
      
      inline def setRemoveSingleSlashUndefined: Self = StObject.set(x, "removeSingleSlash", js.undefined)
      
      inline def setRemoveTrailingSlash(value: Boolean): Self = StObject.set(x, "removeTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setRemoveTrailingSlashUndefined: Self = StObject.set(x, "removeTrailingSlash", js.undefined)
      
      inline def setSortQueryParameters(value: Boolean): Self = StObject.set(x, "sortQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setSortQueryParametersUndefined: Self = StObject.set(x, "sortQueryParameters", js.undefined)
      
      inline def setStripAuthentication(value: Boolean): Self = StObject.set(x, "stripAuthentication", value.asInstanceOf[js.Any])
      
      inline def setStripAuthenticationUndefined: Self = StObject.set(x, "stripAuthentication", js.undefined)
      
      inline def setStripHash(value: Boolean): Self = StObject.set(x, "stripHash", value.asInstanceOf[js.Any])
      
      inline def setStripHashUndefined: Self = StObject.set(x, "stripHash", js.undefined)
      
      inline def setStripProtocol(value: Boolean): Self = StObject.set(x, "stripProtocol", value.asInstanceOf[js.Any])
      
      inline def setStripProtocolUndefined: Self = StObject.set(x, "stripProtocol", js.undefined)
      
      inline def setStripTextFragment(value: Boolean): Self = StObject.set(x, "stripTextFragment", value.asInstanceOf[js.Any])
      
      inline def setStripTextFragmentUndefined: Self = StObject.set(x, "stripTextFragment", js.undefined)
      
      inline def setStripWWW(value: Boolean): Self = StObject.set(x, "stripWWW", value.asInstanceOf[js.Any])
      
      inline def setStripWWWUndefined: Self = StObject.set(x, "stripWWW", js.undefined)
    }
  }
  
  /* Inlined postcss-svgo.postcss-svgo.Options & {  exclude :true | undefined} */
  trait OptionsexcludetrueundefinEncode extends StObject {
    
    var encode: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[`true`] = js.undefined
    
    var plugins: js.UndefOr[js.Array[js.Object]] = js.undefined
  }
  object OptionsexcludetrueundefinEncode {
    
    inline def apply(): OptionsexcludetrueundefinEncode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsexcludetrueundefinEncode]
    }
    
    extension [Self <: OptionsexcludetrueundefinEncode](x: Self) {
      
      inline def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setPlugins(value: js.Array[js.Object]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: js.Object*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
  
  /* Inlined postcss-minify-font-values.postcss-minify-font-values.Options & {  exclude :true | undefined} */
  trait OptionsexcludetrueundefinExclude extends StObject {
    
    var exclude: js.UndefOr[`true`] = js.undefined
    
    var removeAfterKeyword: js.UndefOr[Boolean] = js.undefined
    
    var removeDuplicates: js.UndefOr[Boolean] = js.undefined
    
    var removeQuotes: js.UndefOr[Boolean] = js.undefined
  }
  object OptionsexcludetrueundefinExclude {
    
    inline def apply(): OptionsexcludetrueundefinExclude = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsexcludetrueundefinExclude]
    }
    
    extension [Self <: OptionsexcludetrueundefinExclude](x: Self) {
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setRemoveAfterKeyword(value: Boolean): Self = StObject.set(x, "removeAfterKeyword", value.asInstanceOf[js.Any])
      
      inline def setRemoveAfterKeywordUndefined: Self = StObject.set(x, "removeAfterKeyword", js.undefined)
      
      inline def setRemoveDuplicates(value: Boolean): Self = StObject.set(x, "removeDuplicates", value.asInstanceOf[js.Any])
      
      inline def setRemoveDuplicatesUndefined: Self = StObject.set(x, "removeDuplicates", js.undefined)
      
      inline def setRemoveQuotes(value: Boolean): Self = StObject.set(x, "removeQuotes", value.asInstanceOf[js.Any])
      
      inline def setRemoveQuotesUndefined: Self = StObject.set(x, "removeQuotes", js.undefined)
    }
  }
  
  /* Inlined postcss-normalize-string.postcss-normalize-string.Options & {  exclude :true | undefined} */
  trait OptionsexcludetrueundefinPreferredQuote extends StObject {
    
    var exclude: js.UndefOr[`true`] = js.undefined
    
    var preferredQuote: js.UndefOr[double | single] = js.undefined
  }
  object OptionsexcludetrueundefinPreferredQuote {
    
    inline def apply(): OptionsexcludetrueundefinPreferredQuote = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsexcludetrueundefinPreferredQuote]
    }
    
    extension [Self <: OptionsexcludetrueundefinPreferredQuote](x: Self) {
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setPreferredQuote(value: double | single): Self = StObject.set(x, "preferredQuote", value.asInstanceOf[js.Any])
      
      inline def setPreferredQuoteUndefined: Self = StObject.set(x, "preferredQuote", js.undefined)
    }
  }
  
  trait Plugins extends StObject {
    
    var plugins: js.Array[js.Tuple2[PluginCreator[Any], js.UndefOr[Boolean | (Record[String, Any])]]]
  }
  object Plugins {
    
    inline def apply(plugins: js.Array[js.Tuple2[PluginCreator[Any], js.UndefOr[Boolean | (Record[String, Any])]]]): Plugins = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugins]
    }
    
    extension [Self <: Plugins](x: Self) {
      
      inline def setPlugins(value: js.Array[js.Tuple2[PluginCreator[Any], js.UndefOr[Boolean | (Record[String, Any])]]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: (js.Tuple2[PluginCreator[Any], js.UndefOr[Boolean | (Record[String, Any])]])*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
  
  /* Inlined postcss-calc.postcss-calc.PostCssCalcOptions & {  exclude :true | undefined} */
  trait PostCssCalcOptionsexclude extends StObject {
    
    var exclude: js.UndefOr[`true`] = js.undefined
    
    var mediaQueries: js.UndefOr[Boolean] = js.undefined
    
    var precision: js.UndefOr[Double | `false`] = js.undefined
    
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    var selectors: js.UndefOr[Boolean] = js.undefined
    
    var warnWhenCannotResolve: js.UndefOr[Boolean] = js.undefined
  }
  object PostCssCalcOptionsexclude {
    
    inline def apply(): PostCssCalcOptionsexclude = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostCssCalcOptionsexclude]
    }
    
    extension [Self <: PostCssCalcOptionsexclude](x: Self) {
      
      inline def setExclude(value: `true`): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setMediaQueries(value: Boolean): Self = StObject.set(x, "mediaQueries", value.asInstanceOf[js.Any])
      
      inline def setMediaQueriesUndefined: Self = StObject.set(x, "mediaQueries", js.undefined)
      
      inline def setPrecision(value: Double | `false`): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      inline def setSelectors(value: Boolean): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      inline def setWarnWhenCannotResolve(value: Boolean): Self = StObject.set(x, "warnWhenCannotResolve", value.asInstanceOf[js.Any])
      
      inline def setWarnWhenCannotResolveUndefined: Self = StObject.set(x, "warnWhenCannotResolve", js.undefined)
    }
  }
}
