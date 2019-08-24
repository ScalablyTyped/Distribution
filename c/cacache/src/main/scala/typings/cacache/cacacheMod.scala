package typings.cacache

import typings.cacache.cacacheNumbers.`false`
import typings.cacache.enMod.CacheObject
import typings.cacache.enMod.getNs.HasContentObject
import typings.cacache.enMod.getNs.Options
import typings.cacache.enMod.lsNs.Cache
import typings.cacache.enMod.tmpNs.Callback
import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import typings.std.Date
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache", JSImport.Namespace)
@js.native
object cacacheMod extends js.Object {
  def clearMemoized(): Record[String, CacheObject] = js.native
  def get(cachePath: String, key: String): js.Promise[CacheObject] = js.native
  def get(cachePath: String, key: String, options: Options): js.Promise[CacheObject] = js.native
  def ls(cachePath: String): js.Promise[Cache] = js.native
  def put(cachePath: String, key: String, data: js.Any): js.Promise[String] = js.native
  def put(cachePath: String, key: String, data: js.Any, opts: typings.cacache.enMod.putNs.Options): js.Promise[String] = js.native
  def rm(cachePath: String, key: String): js.Promise[_] = js.native
  def setLocale(locale: String): js.Any = js.native
  def verify(cachePath: String): js.Promise[_] = js.native
  def verify(cachePath: String, opts: typings.cacache.enMod.verifyNs.Options): js.Promise[_] = js.native
  @JSName("get")
  @js.native
  object getNs extends js.Object {
    def byDigest(cachePath: String, hash: String): js.Promise[String] = js.native
    def byDigest(cachePath: String, hash: String, opts: Options): js.Promise[String] = js.native
    def copy(cachePath: String, key: String, dest: String): js.Promise[CacheObject] = js.native
    def copy(cachePath: String, key: String, dest: String, opts: Options): js.Promise[CacheObject] = js.native
    /**
      * Looks up a Subresource Integrity hash in the cache. If content exists
      * for this `integrity`, it will return an object, with the specific single
      * integrity hash that was found in sri key, and the size of the found
      * content as size. If no content exists for this integrity, it will return
      * `false`.
      */
    def hasContent(cachePath: String, hash: String): js.Promise[HasContentObject | `false`] = js.native
    def hasContentnc(cachePath: String, hash: String): HasContentObject | `false` = js.native
    /**
      * Looks up `key` in the cache index, returning information about the entry
      * if one exists.
      */
    def info(cachePath: String, key: String): js.Promise[CacheObject] = js.native
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
    def stream(cachePath: String, key: String): ReadableStream = js.native
    def stream(cachePath: String, key: String, opts: Options): ReadableStream = js.native
    def sync(cachePath: String, key: String): CacheObject = js.native
    def sync(cachePath: String, key: String, opts: Options): CacheObject = js.native
    def syncDigest(cachePath: String, key: String): CacheObject = js.native
    def syncDigest(cachePath: String, key: String, opts: Options): CacheObject = js.native
    @JSName("copy")
    @js.native
    object copyNs extends js.Object {
      def byDigest(cachePath: String, hash: String, dest: String): js.Promise[String] = js.native
      def byDigest(cachePath: String, hash: String, dest: String, opts: Options): js.Promise[String] = js.native
    }
    
    @JSName("stream")
    @js.native
    object streamNs extends js.Object {
      def byDigest(cachePath: String, hash: String): ReadableStream = js.native
      def byDigest(cachePath: String, hash: String, opts: Options): ReadableStream = js.native
    }
    
  }
  
  @JSName("ls")
  @js.native
  object lsNs extends js.Object {
    /**
      * Lists info for all entries currently in the cache as a single large
      * object.
      *
      * This works just like `ls`, except `get.info` entries are returned as
      * `'data'` events on the returned stream.
      */
    def stream(cachePath: String): ReadableStream = js.native
  }
  
  @JSName("put")
  @js.native
  object putNs extends js.Object {
    /**
      * Returns a Writable Stream that inserts data written to it into the cache.
      * Emits an `integrity` event with the digest of written contents when it
      * succeeds.
      */
    def stream(cachePath: String, key: String): WritableStream = js.native
    def stream(cachePath: String, key: String, opts: typings.cacache.enMod.putNs.Options): WritableStream = js.native
  }
  
  @JSName("rm")
  @js.native
  object rmNs extends js.Object {
    /**
      * Clears the entire cache. Mainly by blowing away the cache directory
      * itself.
      */
    def all(cachePath: String): js.Promise[Unit] = js.native
    /**
      * Removes the content identified by `integrity`. Any index entries
      * referring to it will not be usable again until the content is re-added
      * to the cache with an identical digest.
      */
    def content(cachePath: String, hash: String): js.Promise[Boolean] = js.native
    /**
      * Removes the index entry for `key`. Content will still be accessible if
      * requested directly by content address (`get.stream.byDigest`).
      *
      * To remove the content itself (which might still be used by other
      * entries), use `rm.content`. Or, to safely vacuum any unused content,
      * use `verify`.
      */
    def entry(cachePath: String, key: String): js.Promise[CacheObject] = js.native
  }
  
  @JSName("tmp")
  @js.native
  object tmpNs extends js.Object {
    /**
      * Sets the `uid` and `gid` properties on all files and folders within the
      * tmp folder to match the rest of the cache.
      *
      * Use this after manually writing files into `tmp.mkdir` or `tmp.withTmp`.
      */
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
    def mkdir(cachePath: String): js.Promise[String] = js.native
    def mkdir(cachePath: String, opts: typings.cacache.enMod.tmpNs.Options): js.Promise[String] = js.native
    def withTmp(cachePath: String, cb: Callback): Unit = js.native
    /**
      * Creates a temporary directory with `tmp.mkdir()` and calls `cb` with it.
      * The created temporary directory will be removed when the return value of
      * `cb()` resolves -- that is, if you return a Promise from `cb()`, the tmp
      * directory will be automatically deleted once that promise completes.
      *
      * The same caveats apply when it comes to managing permissions for the tmp dir's contents.
      */
    def withTmp(cachePath: String, opts: typings.cacache.enMod.tmpNs.Options, cb: Callback): Unit = js.native
  }
  
  @JSName("verify")
  @js.native
  object verifyNs extends js.Object {
    /**
      * Returns a Date representing the last time `cacache.verify` was run on
      * `cache`.
      */
    def lastRun(cachePath: String): js.Promise[Date] = js.native
  }
  
}

