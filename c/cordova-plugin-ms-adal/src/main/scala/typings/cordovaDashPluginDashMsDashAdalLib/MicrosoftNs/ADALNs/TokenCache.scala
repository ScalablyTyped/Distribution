package typings
package cordovaDashPluginDashMsDashAdalLib.MicrosoftNs.ADALNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ADAL.TokenCache")
@js.native
class TokenCache () extends js.Object {
  var contextAuthority: java.lang.String = js.native
  /**
    * Clears the cache by deleting all the items.
    *
    * @returns {Promise} Promise either fulfilled when operation is completed or rejected with error.
    */
  def clear(): Promise = js.native
  /**
    * Deletes cached item.
    *
    * @param   {TokenCacheItem}  item Cached item to delete from cache
    *
    * @returns {Promise} Promise either fulfilled when operation is completed or rejected with error.
    */
  def deleteItem(item: TokenCacheItem): Promise = js.native
  /**
    * Gets all cached items.
    *
    * @returns {Promise} Promise either fulfilled with array of cached items or rejected with error.
    */
  def readItems(): PromiseTokenCacheItems = js.native
}

