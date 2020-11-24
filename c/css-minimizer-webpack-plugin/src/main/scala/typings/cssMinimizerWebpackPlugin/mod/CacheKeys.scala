package typings.cssMinimizerWebpackPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheKeys
  extends DefaultCacheKeys
     with /* key */ StringDictionary[String]
object CacheKeys {
  
  @scala.inline
  def apply(
    `css-minimizer-webpack-plugin`: String,
    `css-minimizer-webpack-plugin-options`: String,
    cssMinimizer: String,
    hash: String,
    path: String
  ): CacheKeys = {
    val __obj = js.Dynamic.literal(cssMinimizer = cssMinimizer.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("css-minimizer-webpack-plugin")(`css-minimizer-webpack-plugin`.asInstanceOf[js.Any])
    __obj.updateDynamic("css-minimizer-webpack-plugin-options")(`css-minimizer-webpack-plugin-options`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheKeys]
  }
}
