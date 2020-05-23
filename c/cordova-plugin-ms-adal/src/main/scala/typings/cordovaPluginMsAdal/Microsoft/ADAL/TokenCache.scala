package typings.cordovaPluginMsAdal.Microsoft.ADAL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenCache extends js.Object {
  var contextAuthority: String
  /**
    * Clears the cache by deleting all the items.
    *
    * @returns {Promise} Promise either fulfilled when operation is completed or rejected with error.
    */
  def clear(): Promise
  /**
    * Deletes cached item.
    *
    * @param   {TokenCacheItem}  item Cached item to delete from cache
    *
    * @returns {Promise} Promise either fulfilled when operation is completed or rejected with error.
    */
  def deleteItem(item: TokenCacheItem): Promise
  /**
    * Gets all cached items.
    *
    * @returns {Promise} Promise either fulfilled with array of cached items or rejected with error.
    */
  def readItems(): PromiseTokenCacheItems
}

object TokenCache {
  @scala.inline
  def apply(
    clear: () => Promise,
    contextAuthority: String,
    deleteItem: TokenCacheItem => Promise,
    readItems: () => PromiseTokenCacheItems
  ): TokenCache = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), contextAuthority = contextAuthority.asInstanceOf[js.Any], deleteItem = js.Any.fromFunction1(deleteItem), readItems = js.Any.fromFunction0(readItems))
    __obj.asInstanceOf[TokenCache]
  }
}

