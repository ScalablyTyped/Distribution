package typings.babelCore.mod

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigAPI extends js.Object {
  /**
    * @see https://babeljs.io/docs/en/next/config-files#apicache
    */
  var cache: SimpleCacheConfigurator = js.native
  /**
    * @see https://babeljs.io/docs/en/next/config-files#apienv
    */
  @JSName("env")
  var env_Original: EnvFunction = js.native
  /**
    * The version string for the Babel version that is loading the config file.
    *
    * @see https://babeljs.io/docs/en/next/config-files#apiversion
    */
  var version: String = js.native
  def assertVersion(versionRange: String): Boolean = js.native
  /**
    * While `api.version` can be useful in general, it's sometimes nice to just declare your version.
    * This API exposes a simple way to do that with:
    *
    * @example
    * api.assertVersion(7) // major version only
    * api.assertVersion("^7.2")
    *
    * @see https://babeljs.io/docs/en/next/config-files#apiassertversionrange
    */
  def assertVersion(versionRange: Double): Boolean = js.native
  // undocumented; currently hardcoded to return 'false'
  // async(): boolean
  /**
    * This API is used as a way to access the `caller` data that has been passed to Babel.
    * Since many instances of Babel may be running in the same process with different `caller` values,
    * this API is designed to automatically configure `api.cache`, the same way `api.env()` does.
    *
    * The `caller` value is available as the first parameter of the callback function.
    * It is best used with something like this to toggle configuration behavior
    * based on a specific environment:
    *
    * @example
    * function isBabelRegister(caller?: { name: string }) {
    *   return !!(caller && caller.name === "@babel/register")
    * }
    * api.caller(isBabelRegister)
    *
    * @see https://babeljs.io/docs/en/next/config-files#apicallercb
    */
  def caller[T /* <: SimpleCacheKey */](callerCallback: js.Function1[/* caller */ js.UndefOr[TransformCaller], T]): T = js.native
  /**
    * @returns the current `envName` string
    */
  /**
    * @see https://babeljs.io/docs/en/next/config-files#apienv
    */
  def env(): String = js.native
  /**
    * @returns `true` if the `envName` is `===` any of the given strings
    */
  /**
    * @see https://babeljs.io/docs/en/next/config-files#apienv
    */
  def env(envName: String): Boolean = js.native
  def env(envName: js.Array[String]): Boolean = js.native
  // the official documentation is misleading for this one...
  // this just passes the callback to `cache.using` but with an additional argument.
  // it returns its result instead of necessarily returning a boolean.
  /**
    * @see https://babeljs.io/docs/en/next/config-files#apienv
    */
  def env[T /* <: SimpleCacheKey */](envCallback: js.Function1[/* envName */ NonNullable[js.UndefOr[String]], T]): T = js.native
}

