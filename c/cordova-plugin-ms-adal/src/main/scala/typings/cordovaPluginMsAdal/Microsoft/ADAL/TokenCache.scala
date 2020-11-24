package typings.cordovaPluginMsAdal.Microsoft.ADAL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenCache extends js.Object {
  
  /**
    * Clears the cache by deleting all the items.
    *
    * @returns {Promise} Promise either fulfilled when operation is completed or rejected with error.
    */
  def clear(): Promise = js.native
  
  var contextAuthority: String = js.native
  
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
  
  @scala.inline
  implicit class TokenCacheOps[Self <: TokenCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear(value: () => Promise): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContextAuthority(value: String): Self = this.set("contextAuthority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteItem(value: TokenCacheItem => Promise): Self = this.set("deleteItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadItems(value: () => PromiseTokenCacheItems): Self = this.set("readItems", js.Any.fromFunction0(value))
  }
}
