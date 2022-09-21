package typings.classicLevel

import typings.abstractLevel.abstractChainedBatchMod.AbstractChainedBatchWriteOptions
import typings.abstractLevel.abstractIteratorMod.AbstractIteratorOptions
import typings.abstractLevel.abstractIteratorMod.AbstractKeyIteratorOptions
import typings.abstractLevel.abstractIteratorMod.AbstractValueIteratorOptions
import typings.abstractLevel.abstractLevelMod.AbstractBatchOperation
import typings.abstractLevel.abstractLevelMod.AbstractBatchOptions
import typings.abstractLevel.abstractLevelMod.AbstractDelOptions
import typings.abstractLevel.abstractLevelMod.AbstractGetManyOptions
import typings.abstractLevel.abstractLevelMod.AbstractGetOptions
import typings.abstractLevel.abstractLevelMod.AbstractOpenOptions
import typings.abstractLevel.abstractLevelMod.AbstractPutOptions
import typings.abstractLevel.interfacesMod.NodeCallback
import typings.abstractLevel.mod.AbstractChainedBatch
import typings.abstractLevel.mod.AbstractIterator
import typings.abstractLevel.mod.AbstractKeyIterator
import typings.abstractLevel.mod.AbstractLevel
import typings.abstractLevel.mod.AbstractValueIterator
import typings.levelTranscoder.encodingMod.PartialEncoder
import typings.levelTranscoder.encodingMod.PartialEncoding
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("classic-level", "ChainedBatch")
  @js.native
  open class ChainedBatch[TDatabase, KDefault, VDefault] protected () extends AbstractChainedBatch[TDatabase, KDefault, VDefault] {
    def this(db: TDatabase) = this()
    
    def write(options: ChainedBatchWriteOptions): js.Promise[Unit] = js.native
    def write(options: ChainedBatchWriteOptions, callback: NodeCallback[Unit]): Unit = js.native
  }
  
  trait AdditionalIteratorOptions extends StObject {
    
    /**
      * If set to `true`, LevelDB will fill its in-memory
      * [LRU](http://en.wikipedia.org/wiki/Least_Recently_Used) cache with data
      * that was read.
      *
      * @defaultValue `false`
      */
    var fillCache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Limit the amount of data that the iterator will hold in memory.
      */
    var highWaterMarkBytes: js.UndefOr[Double] = js.undefined
  }
  object AdditionalIteratorOptions {
    
    inline def apply(): AdditionalIteratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalIteratorOptions]
    }
    
    extension [Self <: AdditionalIteratorOptions](x: Self) {
      
      inline def setFillCache(value: Boolean): Self = StObject.set(x, "fillCache", value.asInstanceOf[js.Any])
      
      inline def setFillCacheUndefined: Self = StObject.set(x, "fillCache", js.undefined)
      
      inline def setHighWaterMarkBytes(value: Double): Self = StObject.set(x, "highWaterMarkBytes", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkBytesUndefined: Self = StObject.set(x, "highWaterMarkBytes", js.undefined)
    }
  }
  
  type BatchOperation[TDatabase, K, V] = AbstractBatchOperation[TDatabase, K, V]
  
  trait BatchOptions[K, V]
    extends StObject
       with AbstractBatchOptions[K, V]
       with WriteOptions
  object BatchOptions {
    
    inline def apply[K, V](): BatchOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchOptions[K, V]]
    }
  }
  
  trait ChainedBatchWriteOptions
    extends StObject
       with AbstractChainedBatchWriteOptions
       with WriteOptions
  object ChainedBatchWriteOptions {
    
    inline def apply(): ChainedBatchWriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChainedBatchWriteOptions]
    }
  }
  
  /**
    * An {@link AbstractLevel} database backed by
    * [LevelDB](https://github.com/google/leveldb).
    *
    * @template KDefault The default type of keys if not overridden on operations.
    * @template VDefault The default type of values if not overridden on operations.
    */
  @js.native
  trait ClassicLevel[KDefault, VDefault] extends AbstractLevel[String | Buffer, KDefault, VDefault] {
    
    /**
      * Get the approximate number of bytes of file system space used by the range
      * `[start..end)`.
      */
    def approximateSize(start: KDefault, end: KDefault): js.Promise[Double] = js.native
    def approximateSize(start: KDefault, end: KDefault, callback: NodeCallback[Double]): Unit = js.native
    def approximateSize[K](start: K, end: K, options: StartEndOptions[K]): js.Promise[Double] = js.native
    def approximateSize[K](start: K, end: K, options: StartEndOptions[K], callback: NodeCallback[Double]): Unit = js.native
    
    def batch[K, V](
      operations: js.Array[
          BatchOperation[
            /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
            K, 
            V
          ]
        ],
      options: BatchOptions[K, V]
    ): js.Promise[Unit] = js.native
    def batch[K, V](
      operations: js.Array[
          BatchOperation[
            /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
            K, 
            V
          ]
        ],
      options: BatchOptions[K, V],
      callback: NodeCallback[Unit]
    ): Unit = js.native
    
    /**
      * Manually trigger a database compaction in the range `[start..end)`.
      */
    def compactRange(start: KDefault, end: KDefault): js.Promise[Unit] = js.native
    def compactRange(start: KDefault, end: KDefault, callback: NodeCallback[Unit]): Unit = js.native
    def compactRange[K](start: K, end: K, options: StartEndOptions[K]): js.Promise[Unit] = js.native
    def compactRange[K](start: K, end: K, options: StartEndOptions[K], callback: NodeCallback[Unit]): Unit = js.native
    
    def del[K](key: K, options: DelOptions[K]): js.Promise[Unit] = js.native
    def del[K](key: K, options: DelOptions[K], callback: NodeCallback[Unit]): Unit = js.native
    
    def get[K, V](key: K, options: GetOptions[K, V]): js.Promise[V] = js.native
    def get[K, V](key: K, options: GetOptions[K, V], callback: NodeCallback[V]): Unit = js.native
    
    def getMany[K, V](keys: js.Array[K], options: GetManyOptions[K, V]): js.Promise[js.Array[V]] = js.native
    def getMany[K, V](keys: js.Array[K], options: GetManyOptions[K, V], callback: NodeCallback[js.Array[V]]): Unit = js.native
    
    /**
      * Get internal details from LevelDB.
      */
    def getProperty(property: String): String = js.native
    
    def iterator[K, V](options: IteratorOptions[K, V]): Iterator[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
        K, 
        V
      ] = js.native
    
    def keys[K](options: KeyIteratorOptions[K]): KeyIterator[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
        K
      ] = js.native
    
    /**
      * Location that was passed to the constructor.
      */
    def location: String = js.native
    
    def open(options: OpenOptions): js.Promise[Unit] = js.native
    def open(options: OpenOptions, callback: NodeCallback[Unit]): Unit = js.native
    
    def put[K, V](key: K, value: V, options: PutOptions[K, V]): js.Promise[Unit] = js.native
    def put[K, V](key: K, value: V, options: PutOptions[K, V], callback: NodeCallback[Unit]): Unit = js.native
    
    def values[K, V](options: ValueIteratorOptions[K, V]): ValueIterator[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
        K, 
        V
      ] = js.native
  }
  
  /* Inlined parent abstract-level.abstract-level.AbstractDatabaseOptions<K, V> */
  /* Inlined parent std.Omit<classic-level.classic-level.OpenOptions, 'passive'> */
  trait DatabaseOptions[K, V] extends StObject {
    
    var blockRestartInterval: js.UndefOr[Double] = js.undefined
    
    var blockSize: js.UndefOr[Double] = js.undefined
    
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    var compression: js.UndefOr[Boolean] = js.undefined
    
    var createIfMissing: js.UndefOr[Boolean] = js.undefined
    
    var errorIfExists: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Encoding to use for keys.
      * @defaultValue `'utf8'`
      */
    var keyEncoding: js.UndefOr[String | (PartialEncoding[K, K])] = js.undefined
    
    var maxFileSize: js.UndefOr[Double] = js.undefined
    
    var maxOpenFiles: js.UndefOr[Double] = js.undefined
    
    /**
      * Encoding to use for values.
      * @defaultValue `'utf8'`
      */
    var valueEncoding: js.UndefOr[String | (PartialEncoding[V, V])] = js.undefined
    
    var writeBufferSize: js.UndefOr[Double] = js.undefined
  }
  object DatabaseOptions {
    
    inline def apply[K, V](): DatabaseOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatabaseOptions[K, V]]
    }
    
    extension [Self <: DatabaseOptions[?, ?], K, V](x: Self & (DatabaseOptions[K, V])) {
      
      inline def setBlockRestartInterval(value: Double): Self = StObject.set(x, "blockRestartInterval", value.asInstanceOf[js.Any])
      
      inline def setBlockRestartIntervalUndefined: Self = StObject.set(x, "blockRestartInterval", js.undefined)
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setCreateIfMissing(value: Boolean): Self = StObject.set(x, "createIfMissing", value.asInstanceOf[js.Any])
      
      inline def setCreateIfMissingUndefined: Self = StObject.set(x, "createIfMissing", js.undefined)
      
      inline def setErrorIfExists(value: Boolean): Self = StObject.set(x, "errorIfExists", value.asInstanceOf[js.Any])
      
      inline def setErrorIfExistsUndefined: Self = StObject.set(x, "errorIfExists", js.undefined)
      
      inline def setKeyEncoding(value: String | (PartialEncoding[K, K])): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      inline def setMaxOpenFiles(value: Double): Self = StObject.set(x, "maxOpenFiles", value.asInstanceOf[js.Any])
      
      inline def setMaxOpenFilesUndefined: Self = StObject.set(x, "maxOpenFiles", js.undefined)
      
      inline def setValueEncoding(value: String | (PartialEncoding[V, V])): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
      
      inline def setValueEncodingUndefined: Self = StObject.set(x, "valueEncoding", js.undefined)
      
      inline def setWriteBufferSize(value: Double): Self = StObject.set(x, "writeBufferSize", value.asInstanceOf[js.Any])
      
      inline def setWriteBufferSizeUndefined: Self = StObject.set(x, "writeBufferSize", js.undefined)
    }
  }
  
  trait DelOptions[K]
    extends StObject
       with AbstractDelOptions[K]
       with WriteOptions
  object DelOptions {
    
    inline def apply[K](): DelOptions[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DelOptions[K]]
    }
  }
  
  trait GetManyOptions[K, V]
    extends StObject
       with AbstractGetManyOptions[K, V]
       with ReadOptions
  object GetManyOptions {
    
    inline def apply[K, V](): GetManyOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetManyOptions[K, V]]
    }
  }
  
  trait GetOptions[K, V]
    extends StObject
       with AbstractGetOptions[K, V]
       with ReadOptions
  object GetOptions {
    
    inline def apply[K, V](): GetOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOptions[K, V]]
    }
  }
  
  type Iterator[TDatabase, K, V] = AbstractIterator[TDatabase, K, V]
  
  trait IteratorOptions[K, V]
    extends StObject
       with AbstractIteratorOptions[K, V]
       with AdditionalIteratorOptions
  object IteratorOptions {
    
    inline def apply[K, V](): IteratorOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IteratorOptions[K, V]]
    }
  }
  
  type KeyIterator[TDatabase, K] = AbstractKeyIterator[TDatabase, K]
  
  trait KeyIteratorOptions[K]
    extends StObject
       with AbstractKeyIteratorOptions[K]
       with AdditionalIteratorOptions
  object KeyIteratorOptions {
    
    inline def apply[K](): KeyIteratorOptions[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyIteratorOptions[K]]
    }
  }
  
  trait OpenOptions
    extends StObject
       with AbstractOpenOptions {
    
    /**
      * The number of entries before restarting the "delta encoding" of keys
      * within blocks. Each "restart" point stores the full key for the entry,
      * between restarts, the common prefix of the keys for those entries is
      * omitted. Restarts are similar to the concept of keyframes in video
      * encoding and are used to minimise the amount of space required to store
      * keys. This is particularly helpful when using deep namespacing / prefixing
      * in your keys.
      *
      * @defaultValue `16`
      */
    var blockRestartInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * The _approximate_ size of the blocks that make up the table files. The
      * size relates to uncompressed data (hence "approximate"). Blocks are
      * indexed in the table file and entry-lookups involve reading an entire
      * block and parsing to discover the required entry.
      *
      * @defaultValue `4096`
      */
    var blockSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The size (in bytes) of the in-memory
      * [LRU](http://en.wikipedia.org/wiki/Least_Recently_Used)
      * cache with frequently used uncompressed block contents.
      *
      * @defaultValue `8 * 1024 * 1024`
      */
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Unless set to `false`, all _compressible_ data will be run through the
      * Snappy compression algorithm before being stored. Snappy is very fast so
      * leave this on unless you have good reason to turn it off.
      *
      * @defaultValue `true`
      */
    var compression: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum amount of bytes to write to a file before switching to a new
      * one. From LevelDB documentation:
      *
      * > If your filesystem is more efficient with larger files, you could
      * > consider increasing the value. The downside will be longer compactions
      * > and hence longer latency / performance hiccups. Another reason to
      * > increase this parameter might be when you are initially populating a
      * > large database.
      *
      * @defaultValue `2 * 1024 * 1024`
      */
    var maxFileSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of files that LevelDB is allowed to have open at a
      * time. If your database is likely to have a large working set, you may
      * increase this value to prevent file descriptor churn. To calculate the
      * number of files required for your working set, divide your total data size
      * by `maxFileSize`.
      *
      * @defaultValue 1000
      */
    var maxOpenFiles: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum size (in bytes) of the log (in memory and stored in the `.log`
      * file on disk). Beyond this size, LevelDB will convert the log data to the
      * first level of sorted table files. From LevelDB documentation:
      *
      * > Larger values increase performance, especially during bulk loads. Up to
      * > two write buffers may be held in memory at the same time, so you may
      * > wish to adjust this parameter to control memory usage. Also, a larger
      * > write buffer will result in a longer recovery time the next time the
      * > database is opened.
      *
      * @defaultValue `4 * 1024 * 1024`
      */
    var writeBufferSize: js.UndefOr[Double] = js.undefined
  }
  object OpenOptions {
    
    inline def apply(): OpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenOptions]
    }
    
    extension [Self <: OpenOptions](x: Self) {
      
      inline def setBlockRestartInterval(value: Double): Self = StObject.set(x, "blockRestartInterval", value.asInstanceOf[js.Any])
      
      inline def setBlockRestartIntervalUndefined: Self = StObject.set(x, "blockRestartInterval", js.undefined)
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      inline def setMaxOpenFiles(value: Double): Self = StObject.set(x, "maxOpenFiles", value.asInstanceOf[js.Any])
      
      inline def setMaxOpenFilesUndefined: Self = StObject.set(x, "maxOpenFiles", js.undefined)
      
      inline def setWriteBufferSize(value: Double): Self = StObject.set(x, "writeBufferSize", value.asInstanceOf[js.Any])
      
      inline def setWriteBufferSizeUndefined: Self = StObject.set(x, "writeBufferSize", js.undefined)
    }
  }
  
  trait PutOptions[K, V]
    extends StObject
       with AbstractPutOptions[K, V]
       with WriteOptions
  object PutOptions {
    
    inline def apply[K, V](): PutOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutOptions[K, V]]
    }
  }
  
  /**
    * Additional options for the {@link ClassicLevel.get} and {@link ClassicLevel.getMany}
    * methods.
    */
  trait ReadOptions extends StObject {
    
    /**
      * Unless set to `false`, LevelDB will fill its in-memory
      * [LRU](http://en.wikipedia.org/wiki/Least_Recently_Used) cache with data
      * that was read.
      *
      * @defaultValue `true`
      */
    var fillCache: js.UndefOr[Boolean] = js.undefined
  }
  object ReadOptions {
    
    inline def apply(): ReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadOptions]
    }
    
    extension [Self <: ReadOptions](x: Self) {
      
      inline def setFillCache(value: Boolean): Self = StObject.set(x, "fillCache", value.asInstanceOf[js.Any])
      
      inline def setFillCacheUndefined: Self = StObject.set(x, "fillCache", js.undefined)
    }
  }
  
  trait StartEndOptions[K] extends StObject {
    
    /**
      * Custom key encoding for this operation, used to encode `start` and `end`.
      */
    var keyEncoding: js.UndefOr[String | PartialEncoder[K]] = js.undefined
  }
  object StartEndOptions {
    
    inline def apply[K](): StartEndOptions[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartEndOptions[K]]
    }
    
    extension [Self <: StartEndOptions[?], K](x: Self & StartEndOptions[K]) {
      
      inline def setKeyEncoding(value: String | PartialEncoder[K]): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
    }
  }
  
  type ValueIterator[TDatabase, K, V] = AbstractValueIterator[TDatabase, K, V]
  
  trait ValueIteratorOptions[K, V]
    extends StObject
       with AbstractValueIteratorOptions[K, V]
       with AdditionalIteratorOptions
  object ValueIteratorOptions {
    
    inline def apply[K, V](): ValueIteratorOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueIteratorOptions[K, V]]
    }
  }
  
  /**
    * Additional options for the {@link ClassicLevel.put}, {@link ClassicLevel.del}
    * and {@link ClassicLevel.batch} methods.
    */
  trait WriteOptions extends StObject {
    
    /**
      * If set to `true`, LevelDB will perform a synchronous write of the data
      * although the operation will be asynchronous as far as Node.js or Electron
      * is concerned. Normally, LevelDB passes the data to the operating system
      * for writing and returns immediately. In contrast, a synchronous write will
      * use [`fsync()`](https://man7.org/linux/man-pages/man2/fsync.2.html) or
      * equivalent, so the operation will not complete until the data is actually
      * on disk. Synchronous writes are significantly slower than asynchronous
      * writes.
      *
      * @defaultValue `false`
      */
    var sync: js.UndefOr[Boolean] = js.undefined
  }
  object WriteOptions {
    
    inline def apply(): WriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteOptions]
    }
    
    extension [Self <: WriteOptions](x: Self) {
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
}
