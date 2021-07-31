package typings.cacache

import typings.cacache.anon.Algorithm
import typings.cacache.anon.CacheObjectsizenumber
import typings.cacache.cacacheBooleans.`false`
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.std.Date
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enMod {
  
  @JSImport("cacache/en", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clearMemoized(): Record[String, CacheObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearMemoized")().asInstanceOf[Record[String, CacheObject]]
  
  object get {
    
    @scala.inline
    def apply(cachePath: String, key: String): js.Promise[GetCacheObject] = (^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCacheObject]]
    @scala.inline
    def apply(cachePath: String, key: String, options: Options): js.Promise[GetCacheObject] = (^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCacheObject]]
    
    @JSImport("cacache/en", "get")
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
      
      @JSImport("cacache/en", "get.copy")
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
      
      @JSImport("cacache/en", "get.stream")
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
    
    trait HasContentObject extends StObject {
      
      var size: Double
      
      var sri: Algorithm
    }
    object HasContentObject {
      
      @scala.inline
      def apply(size: Double, sri: Algorithm): HasContentObject = {
        val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], sri = sri.asInstanceOf[js.Any])
        __obj.asInstanceOf[HasContentObject]
      }
      
      @scala.inline
      implicit class HasContentObjectMutableBuilder[Self <: HasContentObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSri(value: Algorithm): Self = StObject.set(x, "sri", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
      var integrity: js.UndefOr[String] = js.undefined
      
      var memoize: js.UndefOr[Boolean] = js.undefined
      
      var size: js.UndefOr[Double] = js.undefined
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
        
        @scala.inline
        def setMemoize(value: Boolean): Self = StObject.set(x, "memoize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMemoizeUndefined: Self = StObject.set(x, "memoize", js.undefined)
        
        @scala.inline
        def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      }
    }
  }
  
  object ls {
    
    @scala.inline
    def apply(cachePath: String): js.Promise[Cache] = ^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cache]]
    
    @JSImport("cacache/en", "ls")
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
    
    type Cache = Record[String, CacheObjectsizenumber]
  }
  
  object put {
    
    @scala.inline
    def apply(cachePath: String, key: String, data: js.Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def apply(cachePath: String, key: String, data: js.Any, opts: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    @JSImport("cacache/en", "put")
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
    def stream(cachePath: String, key: String, opts: Options): WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[WritableStream]
    
    trait Options extends StObject {
      
      /**
        * Default: `['sha512']`
        *
        * Hashing algorithms to use when calculating the subresource integrity
        * digest for inserted data. Can use any algorithm listed in
        * `crypto.getHashes()` or `'omakase'`/`'お任せします'` to pick a random
        * hash algorithm on each insertion. You may also use any anagram of
        * `'modnar'` to use this feature.
        *
        * Currently only supports one algorithm at a time (i.e., an array
        * length of exactly `1`). Has no effect if `opts.integrity` is present.
        */
      var algorithms: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * If present, the pre-calculated digest for the inserted content. If
        * this option if provided and does not match the post-insertion digest,
        * insertion will fail with an `EINTEGRITY` error.
        *
        * `algorithms` has no effect if this option is present.
        */
      var integrity: js.UndefOr[String] = js.undefined
      
      /**
        * Default: `null`
        *
        * If provided, cacache will memoize the given cache insertion in
        * memory, bypassing any filesystem checks for that key or digest in
        * future cache fetches. Nothing will be written to the in-memory cache
        * unless this option is explicitly truthy.
        *
        * If `opts.memoize` is an object or a `Map`-like (that is, an object
        * with `get` and `set` methods), it will be written to instead of the
        * global memoization cache.
        *
        * Reading from disk data can be forced by explicitly passing
        * `memoize: false` to the reader functions, but their default will be
        * to read from memory.
        */
      var memoize: js.UndefOr[Null | Boolean] = js.undefined
      
      /** Arbitrary metadata to be attached to the inserted key. */
      var metadata: js.UndefOr[js.Any] = js.undefined
      
      /**
        * If provided, the data stream will be verified to check that enough
        * data was passed through. If there's more or less data than expected,
        * insertion will fail with an `EBADSIZE` error.
        */
      var size: js.UndefOr[Double] = js.undefined
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
        
        @scala.inline
        def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
        
        @scala.inline
        def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
        
        @scala.inline
        def setMemoize(value: Boolean): Self = StObject.set(x, "memoize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMemoizeNull: Self = StObject.set(x, "memoize", null)
        
        @scala.inline
        def setMemoizeUndefined: Self = StObject.set(x, "memoize", js.undefined)
        
        @scala.inline
        def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      }
    }
  }
  
  object rm {
    
    @scala.inline
    def apply(cachePath: String, key: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    @JSImport("cacache/en", "rm")
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
    
    @JSImport("cacache/en", "tmp")
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
    def mkdir(cachePath: String, opts: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(cachePath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
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
    def withTmp(cachePath: String, opts: Options, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("withTmp")(cachePath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    type Callback = js.Function1[/* dir */ String, Unit]
    
    trait Options extends StObject {
      
      var tmpPrefix: js.UndefOr[String] = js.undefined
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTmpPrefix(value: String): Self = StObject.set(x, "tmpPrefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTmpPrefixUndefined: Self = StObject.set(x, "tmpPrefix", js.undefined)
      }
    }
  }
  
  object verify {
    
    @scala.inline
    def apply(cachePath: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
    @scala.inline
    def apply(cachePath: String, opts: Options): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].apply(cachePath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    @JSImport("cacache/en", "verify")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a Date representing the last time `cacache.verify` was run on
      * `cache`.
      */
    @scala.inline
    def lastRun(cachePath: String): js.Promise[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastRun")(cachePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Date]]
    
    trait Options extends StObject {
      
      /**
        * Receives a formatted entry. Return false to remove it.
        * Note: might be called more than once on the same entry.
        */
      var filter: `false` | String
    }
    object Options {
      
      @scala.inline
      def apply(filter: `false` | String): Options = {
        val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilter(value: `false` | String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait CacheObject extends StObject {
    
    /** Subresource Integrity hash for the content this entry refers to. */
    var integrity: String
    
    /** Key the entry was looked up under. Matches the key argument. */
    var key: String
    
    /** User-assigned metadata associated with the entry/content. */
    var metadata: js.UndefOr[js.Any] = js.undefined
    
    /** Filesystem path where content is stored, joined with cache argument. */
    var path: String
    
    /** Timestamp the entry was first added on. */
    var time: Double
  }
  object CacheObject {
    
    @scala.inline
    def apply(integrity: String, key: String, path: String, time: Double): CacheObject = {
      val __obj = js.Dynamic.literal(integrity = integrity.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheObject]
    }
    
    @scala.inline
    implicit class CacheObjectMutableBuilder[Self <: CacheObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetCacheObject extends StObject {
    
    var data: Buffer
    
    var integrity: String
    
    var metadata: js.UndefOr[js.Any] = js.undefined
    
    var size: Double
  }
  object GetCacheObject {
    
    @scala.inline
    def apply(data: Buffer, integrity: String, size: Double): GetCacheObject = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCacheObject]
    }
    
    @scala.inline
    implicit class GetCacheObjectMutableBuilder[Self <: GetCacheObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
