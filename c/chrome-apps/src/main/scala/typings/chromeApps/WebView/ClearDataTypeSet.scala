package typings.chromeApps.WebView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebView element from html
  */
/** A set of data types. Missing properties are interpreted as false. */
@js.native
trait ClearDataTypeSet extends js.Object {
  /** Websites' appcaches. */
  var appcache: js.UndefOr[Boolean] = js.native
  /**
    * The browser's cache. Note: when removing data, this clears the entire cache; it is not limited to the range you specify.
    * @since Chrome 43.
    */
  var cache: js.UndefOr[Boolean] = js.native
  /** The partition's cookies. */
  var cookies: js.UndefOr[Boolean] = js.native
  /** Websites' filesystems. */
  var fileSystems: js.UndefOr[Boolean] = js.native
  /** Websites' IndexedDB data. */
  var indexedDB: js.UndefOr[Boolean] = js.native
  /** Websites' local storage data. */
  var localStorage: js.UndefOr[Boolean] = js.native
  /** The partition's persistent cookies. */
  var persistentCookies: js.UndefOr[Boolean] = js.native
  /** The partition's session cookies. */
  var sessionCookies: js.UndefOr[Boolean] = js.native
  /** Websites' WebSQL data. */
  var webSQL: js.UndefOr[Boolean] = js.native
}

object ClearDataTypeSet {
  @scala.inline
  def apply(): ClearDataTypeSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearDataTypeSet]
  }
  @scala.inline
  implicit class ClearDataTypeSetOps[Self <: ClearDataTypeSet] (val x: Self) extends AnyVal {
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
    def setAppcache(value: Boolean): Self = this.set("appcache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppcache: Self = this.set("appcache", js.undefined)
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCookies(value: Boolean): Self = this.set("cookies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    @scala.inline
    def setFileSystems(value: Boolean): Self = this.set("fileSystems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSystems: Self = this.set("fileSystems", js.undefined)
    @scala.inline
    def setIndexedDB(value: Boolean): Self = this.set("indexedDB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexedDB: Self = this.set("indexedDB", js.undefined)
    @scala.inline
    def setLocalStorage(value: Boolean): Self = this.set("localStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalStorage: Self = this.set("localStorage", js.undefined)
    @scala.inline
    def setPersistentCookies(value: Boolean): Self = this.set("persistentCookies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistentCookies: Self = this.set("persistentCookies", js.undefined)
    @scala.inline
    def setSessionCookies(value: Boolean): Self = this.set("sessionCookies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionCookies: Self = this.set("sessionCookies", js.undefined)
    @scala.inline
    def setWebSQL(value: Boolean): Self = this.set("webSQL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebSQL: Self = this.set("webSQL", js.undefined)
  }
  
}

