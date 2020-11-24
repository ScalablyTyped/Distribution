package typings.conventionalRecommendedBump.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("conventional-recommended-bump", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * @param options  `options` is an object with the following properties:
    *
    *                 * `ignoreReverted`
    *                 * `preset`
    *                 * `config`
    *                 * `whatBump`
    * @param callback
    */
  def apply(options: Options, callback: Callback): Unit = js.native
  /**
    *
    * @param options    `options` is an object with the following properties:
    *
    *                   * `ignoreReverted`
    *                   * `preset`
    *                   * `config`
    *                   * `whatBump`
    * @param parserOpts See the [conventional-commits-parser](https://github.com/conventional-changelog/conventional-commits-parser)
    *                   documentation for available options.
    * @param callback
    */
  def apply(options: Options, parserOpts: typings.conventionalCommitsParser.mod.Options, callback: Callback): Unit = js.native
}
