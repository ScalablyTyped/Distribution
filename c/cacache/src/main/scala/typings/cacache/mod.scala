package typings.cacache

import typings.cacache.cacacheBooleans.`false`
import typings.cacache.enMod.CacheObject
import typings.cacache.enMod.GetCacheObject
import typings.cacache.enMod.get.HasContentObject
import typings.cacache.enMod.get.Options
import typings.cacache.enMod.ls.Cache
import typings.cacache.enMod.tmp.Callback
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.std.Date
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cacache", "clearMemoized")
  @js.native
  def clearMemoized(): Record[String, CacheObject] = js.native
  
  object get {
    
    @JSImport("cacache", "get")
    @js.native
    def apply(cachePath: String, key: String): js.Promise[GetCacheObject] = js.native
    @JSImport("cacache", "get")
    @js.native
    def apply(cachePath: String, key: String, options: Options): js.Promise[GetCacheObject] = js.native
    
    @JSImport("cacache", "get.byDigest")
    @js.native
    def byDigest(cachePath: String, hash: String): js.Promise[String] = js.native
    @JSImport("cacache", "get.byDigest")
    @js.native
    def byDigest(cachePath: String, hash: String, opts: Options): js.Promise[String] = js.native
    
    object copy {
      
      @JSImport("cacache", "get.copy")
      @js.native
      def apply(cachePath: String, key: String, dest: String): js.Promise[CacheObject] = js.native
      @JSImport("cacache", "get.copy")
      @js.native
      def apply(cachePath: String, key: String, dest: String, opts: Options): js.Promise[CacheObject] = js.native
      
      @JSImport("cacache", "get.copy.byDigest")
      @js.native
      def byDigest(cachePath: String, hash: String, dest: String): js.Promise[String] = js.native
      @JSImport("cacache", "get.copy.byDigest")
      @js.native
      def byDigest(cachePath: String, hash: String, dest: String, opts: Options): js.Promise[String] = js.native
    }
    
    /**
      * Looks up a Subresource Integrity hash in the cache. If content exists
      * for this `integrity`, it will return an object, with the specific single
      * integrity hash that was found in sri key, and the size of the found
      * content as size. If no content exists for this integrity, it will return
      * `false`.
      */
    @JSImport("cacache", "get.hasContent")
    @js.native
    def hasContent(cachePath: String, hash: String): js.Promise[HasContentObject | `false`] = js.native
    
    @JSImport("cacache", "get.hasContentnc")
    @js.native
    def hasContentnc(cachePath: String, hash: String): HasContentObject | `false` = js.native
    
    /**
      * Looks up `key` in the cache index, returning information about the entry
      * if one exists.
      */
    @JSImport("cacache", "get.info")
    @js.native
    def info(cachePath: String, key: String): js.Promise[CacheObject] = js.native
    
    object stream {
      
      /**
        * Returns a Readable Stream of the cached data identified by `key`.
        *
        * If there is no content identified by `key`, or if the locally-stored data
        * does not pass the validity checksum, an error will be emitted.
        *
        * `metadata` and `integrity` events will be emitted before the stream
        * closes, if you need to collect that extra data about the cached entry.
        *
        * A sub-function, `get.stream.byDigest` may be used for identical behavior,
        * except lookup will happen by integrity hash, bypassing the index
        * entirely. This version does not emit the `metadata` and `integrity`
        * events at all.
        */
      @JSImport("cacache", "get.stream")
      @js.native
      def apply(cachePath: String, key: String): ReadableStream = js.native
      @JSImport("cacache", "get.stream")
      @js.native
      def apply(cachePath: String, key: String, opts: Options): ReadableStream = js.native
      
      @JSImport("cacache", "get.stream.byDigest")
      @js.native
      def byDigest(cachePath: String, hash: String): ReadableStream = js.native
      @JSImport("cacache", "get.stream.byDigest")
      @js.native
      def byDigest(cachePath: String, hash: String, opts: Options): ReadableStream = js.native
    }
    
    @JSImport("cacache", "get.sync")
    @js.native
    def sync(cachePath: String, key: String): CacheObject = js.native
    @JSImport("cacache", "get.sync")
    @js.native
    def sync(cachePath: String, key: String, opts: Options): CacheObject = js.native
    
    @JSImport("cacache", "get.syncDigest")
    @js.native
    def syncDigest(cachePath: String, key: String): CacheObject = js.native
    @JSImport("cacache", "get.syncDigest")
    @js.native
    def syncDigest(cachePath: String, key: String, opts: Options): CacheObject = js.native
  }
  
  object ls {
    
    @JSImport("cacache", "ls")
    @js.native
    def apply(cachePath: String): js.Promise[Cache] = js.native
    
    /**
      * Lists info for all entries currently in the cache as a single large
      * object.
      *
      * This works just like `ls`, except `get.info` entries are returned as
      * `'data'` events on the returned stream.
      */
    @JSImport("cacache", "ls.stream")
    @js.native
    def stream(cachePath: String): ReadableStream = js.native
  }
  
  object put {
    
    @JSImport("cacache", "put")
    @js.native
    def apply(cachePath: String, key: String, data: js.Any): js.Promise[String] = js.native
    @JSImport("cacache", "put")
    @js.native
    def apply(cachePath: String, key: String, data: js.Any, opts: typings.cacache.enMod.put.Options): js.Promise[String] = js.native
    
    /**
      * Returns a Writable Stream that inserts data written to it into the cache.
      * Emits an `integrity` event with the digest of written contents when it
      * succeeds.
      */
    @JSImport("cacache", "put.stream")
    @js.native
    def stream(cachePath: String, key: String): WritableStream = js.native
    @JSImport("cacache", "put.stream")
    @js.native
    def stream(cachePath: String, key: String, opts: typings.cacache.enMod.put.Options): WritableStream = js.native
  }
  
  object rm {
    
    @JSImport("cacache", "rm")
    @js.native
    def apply(cachePath: String, key: String): js.Promise[_] = js.native
    
    /**
      * Clears the entire cache. Mainly by blowing away the cache directory
      * itself.
      */
    @JSImport("cacache", "rm.all")
    @js.native
    def all(cachePath: String): js.Promise[Unit] = js.native
    
    /**
      * Removes the content identified by `integrity`. Any index entries
      * referring to it will not be usable again until the content is re-added
      * to the cache with an identical digest.
      */
    @JSImport("cacache", "rm.content")
    @js.native
    def content(cachePath: String, hash: String): js.Promise[Boolean] = js.native
    
    /**
      * Removes the index entry for `key`. Content will still be accessible if
      * requested directly by content address (`get.stream.byDigest`).
      *
      * To remove the content itself (which might still be used by other
      * entries), use `rm.content`. Or, to safely vacuum any unused content,
      * use `verify`.
      */
    @JSImport("cacache", "rm.entry")
    @js.native
    def entry(cachePath: String, key: String): js.Promise[CacheObject] = js.native
  }
  
  @JSImport("cacache", "setLocale")
  @js.native
  def setLocale(locale: String): js.Any = js.native
  
  object tmp {
    
    /**
      * Sets the `uid` and `gid` properties on all files and folders within the
      * tmp folder to match the rest of the cache.
      *
      * Use this after manually writing files into `tmp.mkdir` or `tmp.withTmp`.
      */
    @JSImport("cacache", "tmp.fix")
    @js.native
    def fix(cachePath: String): js.Promise[Unit] = js.native
    
    /**
      * Returns a unique temporary directory inside the cache's `tmp` dir. This
      * directory will use the same safe user assignment that all the other stuff
      * use.
      *
      * Once the directory is made, it's the user's responsibility that all files
      * within are given the appropriate `gid`/`uid` ownership settings to match
      * the rest of the cache. If not, you can ask cacache to do it for you by
      * calling `tmp.fix()`, which will fix all tmp directory permissions.
      *
      * If you want automatic cleanup of this directory, use `tmp.withTmp()`
      */
    @JSImport("cacache", "tmp.mkdir")
    @js.native
    def mkdir(cachePath: String): js.Promise[String] = js.native
    @JSImport("cacache", "tmp.mkdir")
    @js.native
    def mkdir(cachePath: String, opts: typings.cacache.enMod.tmp.Options): js.Promise[String] = js.native
    
    @JSImport("cacache", "tmp.withTmp")
    @js.native
    def withTmp(cachePath: String, cb: Callback): Unit = js.native
    /**
      * Creates a temporary directory with `tmp.mkdir()` and calls `cb` with it.
      * The created temporary directory will be removed when the return value of
      * `cb()` resolves -- that is, if you return a Promise from `cb()`, the tmp
      * directory will be automatically deleted once that promise completes.
      *
      * The same caveats apply when it comes to managing permissions for the tmp dir's contents.
      */
    @JSImport("cacache", "tmp.withTmp")
    @js.native
    def withTmp(cachePath: String, opts: typings.cacache.enMod.tmp.Options, cb: Callback): Unit = js.native
  }
  
  object verify {
    
    @JSImport("cacache", "verify")
    @js.native
    def apply(cachePath: String): js.Promise[_] = js.native
    @JSImport("cacache", "verify")
    @js.native
    def apply(cachePath: String, opts: typings.cacache.enMod.verify.Options): js.Promise[_] = js.native
    
    /**
      * Returns a Date representing the last time `cacache.verify` was run on
      * `cache`.
      */
    @JSImport("cacache", "verify.lastRun")
    @js.native
    def lastRun(cachePath: String): js.Promise[Date] = js.native
  }
}
