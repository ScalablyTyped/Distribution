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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cacache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clearMemoized(): Record[String, CacheObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearMemoized")().asInstanceOf[Record[String, CacheObject]]
  
  object get {
    
    @scala.inline
    def apply(cachePath: String, key: String): js.Promise[GetCacheObject] = (^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCacheObject]]
    @scala.inline
    def apply(cachePath: String, key: String, options: Options): js.Promise[GetCacheObject] = (^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCacheObject]]
    
    @JSImport("cacache", "get")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def byDigest(cachePath: String, hash: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("byDigest")(cachePath.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def byDigest(cachePath: String, hash: String, opts: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("byDigest")(cachePath.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    object copy {
      
      @scala.inline
      def apply(cachePath: String, key: String, dest: String): js.Promise[CacheObject] = (^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CacheObject]]
      @scala.inline
      def apply(cachePath: String, key: String, dest: String, opts: Options): js.Promise[CacheObject] = (^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CacheObject]]
      
      @JSImport("cacache", "get.copy")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def byDigest(cachePath: String, hash: String, dest: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("byDigest")(cachePath.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      @scala.inline
      def byDigest(cachePath: String, hash: String, dest: String, opts: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("byDigest")(cachePath.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    }
    
    /**
      * Looks up a Subresource Integrity hash in the cache. If content exists
      * for this `integrity`, it will return an object, with the specific single
      * integrity hash that was found in sri key, and the size of the found
      * content as size. If no content exists for this integrity, it will return
      * `false`.
      */
    @scala.inline
    def hasContent(cachePath: String, hash: String): js.Promise[HasContentObject | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("hasContent")(cachePath.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HasContentObject | `false`]]
    
    @scala.inline
    def hasContentnc(cachePath: String, hash: String): HasContentObject | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("hasContentnc")(cachePath.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[HasContentObject | `false`]
    
    /**
      * Looks up `key` in the cache index, returning information about the entry
      * if one exists.
      */
    @scala.inline
    def info(cachePath: String, key: String): js.Promise[CacheObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CacheObject]]
    
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
      @scala.inline
      def apply(cachePath: String, key: String): ReadableStream = (^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
      @scala.inline
      def apply(cachePath: String, key: String, opts: Options): ReadableStream = (^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
      
      @JSImport("cacache", "get.stream")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def byDigest(cachePath: String, hash: String): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("byDigest")(cachePath.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
      @scala.inline
      def byDigest(cachePath: String, hash: String, opts: Options): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("byDigest")(cachePath.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
    }
    
    @scala.inline
    def sync(cachePath: String, key: String): CacheObject = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[CacheObject]
    @scala.inline
    def sync(cachePath: String, key: String, opts: Options): CacheObject = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[CacheObject]
    
    @scala.inline
    def syncDigest(cachePath: String, key: String): CacheObject = (^.asInstanceOf[js.Dynamic].applyDynamic("syncDigest")(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[CacheObject]
    @scala.inline
    def syncDigest(cachePath: String, key: String, opts: Options): CacheObject = (^.asInstanceOf[js.Dynamic].applyDynamic("syncDigest")(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[CacheObject]
  }
  
  object ls {
    
    @scala.inline
    def apply(cachePath: String): js.Promise[Cache] = ^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cache]]
    
    @JSImport("cacache", "ls")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Lists info for all entries currently in the cache as a single large
      * object.
      *
      * This works just like `ls`, except `get.info` entries are returned as
      * `'data'` events on the returned stream.
      */
    @scala.inline
    def stream(cachePath: String): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(cachePath.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  }
  
  object put {
    
    @scala.inline
    def apply(cachePath: String, key: String, data: js.Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def apply(cachePath: String, key: String, data: js.Any, opts: typings.cacache.enMod.put.Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    @JSImport("cacache", "put")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a Writable Stream that inserts data written to it into the cache.
      * Emits an `integrity` event with the digest of written contents when it
      * succeeds.
      */
    @scala.inline
    def stream(cachePath: String, key: String): WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[WritableStream]
    @scala.inline
    def stream(cachePath: String, key: String, opts: typings.cacache.enMod.put.Options): WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[WritableStream]
  }
  
  object rm {
    
    @scala.inline
    def apply(cachePath: String, key: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    @JSImport("cacache", "rm")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Clears the entire cache. Mainly by blowing away the cache directory
      * itself.
      */
    @scala.inline
    def all(cachePath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(cachePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Removes the content identified by `integrity`. Any index entries
      * referring to it will not be usable again until the content is re-added
      * to the cache with an identical digest.
      */
    @scala.inline
    def content(cachePath: String, hash: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("content")(cachePath.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Removes the index entry for `key`. Content will still be accessible if
      * requested directly by content address (`get.stream.byDigest`).
      *
      * To remove the content itself (which might still be used by other
      * entries), use `rm.content`. Or, to safely vacuum any unused content,
      * use `verify`.
      */
    @scala.inline
    def entry(cachePath: String, key: String): js.Promise[CacheObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("entry")(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CacheObject]]
  }
  
  @scala.inline
  def setLocale(locale: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  object tmp {
    
    @JSImport("cacache", "tmp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Sets the `uid` and `gid` properties on all files and folders within the
      * tmp folder to match the rest of the cache.
      *
      * Use this after manually writing files into `tmp.mkdir` or `tmp.withTmp`.
      */
    @scala.inline
    def fix(cachePath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fix")(cachePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
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
    @scala.inline
    def mkdir(cachePath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(cachePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    @scala.inline
    def mkdir(cachePath: String, opts: typings.cacache.enMod.tmp.Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(cachePath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    @scala.inline
    def withTmp(cachePath: String, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("withTmp")(cachePath.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Creates a temporary directory with `tmp.mkdir()` and calls `cb` with it.
      * The created temporary directory will be removed when the return value of
      * `cb()` resolves -- that is, if you return a Promise from `cb()`, the tmp
      * directory will be automatically deleted once that promise completes.
      *
      * The same caveats apply when it comes to managing permissions for the tmp dir's contents.
      */
    @scala.inline
    def withTmp(cachePath: String, opts: typings.cacache.enMod.tmp.Options, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("withTmp")(cachePath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object verify {
    
    @scala.inline
    def apply(cachePath: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
    @scala.inline
    def apply(cachePath: String, opts: typings.cacache.enMod.verify.Options): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    @JSImport("cacache", "verify")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a Date representing the last time `cacache.verify` was run on
      * `cache`.
      */
    @scala.inline
    def lastRun(cachePath: String): js.Promise[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastRun")(cachePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Date]]
  }
}
