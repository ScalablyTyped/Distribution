package typings.browserfs

import typings.browserfs.browserfsStrings.readonly
import typings.browserfs.browserfsStrings.readwrite
import typings.browserfs.distNodeCoreApiErrorMod.ApiError
import typings.browserfs.distNodeCoreFileFlagMod.FileFlag
import typings.browserfs.distNodeCoreFileMod.File
import typings.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileSystemMod.BFSOneArgCallback
import typings.browserfs.distNodeCoreFileSystemMod.BFSThreeArgCallback
import typings.browserfs.distNodeCoreFileSystemMod.BaseFileSystem
import typings.browserfs.distNodeCoreFileSystemMod.SynchronousFileSystem
import typings.browserfs.distNodeGenericPreloadFileMod.default
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeGenericKeyValueFilesystemMod {
  
  @JSImport("browserfs/dist/node/generic/key_value_filesystem", "AsyncKeyValueFile")
  @js.native
  open class AsyncKeyValueFile protected ()
    extends default[AsyncKeyValueFileSystem]
       with File {
    def this(
      _fs: AsyncKeyValueFileSystem,
      _path: String,
      _flag: FileFlag,
      _stat: typings.browserfs.distNodeCoreNodeFsStatsMod.default
    ) = this()
    def this(
      _fs: AsyncKeyValueFileSystem,
      _path: String,
      _flag: FileFlag,
      _stat: typings.browserfs.distNodeCoreNodeFsStatsMod.default,
      contents: Buffer
    ) = this()
    
    /* InferMemberOverrides */
    override def chmod(mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chmodSync(mode: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def chown(uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chownSync(uid: Double, gid: Double): Unit = js.native
    
    /**
      * **Core**: Asynchronous close. Must be implemented by subclasses of this
      * class.
      * @param [Function(BrowserFS.ApiError)] cb
      */
    /* InferMemberOverrides */
    override def close(cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * **Core**: Synchronous close.
      */
    /* InferMemberOverrides */
    override def closeSync(): Unit = js.native
    
    /* InferMemberOverrides */
    override def datasync(cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def datasyncSync(): Unit = js.native
    
    /**
      * Get the current file position.
      *
      * We emulate the following bug mentioned in the Node documentation:
      * > On Linux, positional writes don't work when the file is opened in append
      *   mode. The kernel ignores the position argument and always appends the data
      *   to the end of the file.
      * @return [Number] The current file position.
      */
    /* InferMemberOverrides */
    override def getPos(): Double & js.UndefOr[Double] = js.native
    
    /**
      * Read data from the file.
      * @param [BrowserFS.node.Buffer] buffer The buffer that the data will be
      *   written to.
      * @param [Number] offset The offset within the buffer where writing will
      *   start.
      * @param [Number] length An integer specifying the number of bytes to read.
      * @param [Number] position An integer specifying where to begin reading from
      *   in the file. If position is null, data will be read from the current file
      *   position.
      * @param [Function(BrowserFS.ApiError, Number, BrowserFS.node.Buffer)] cb The
      *   number is the number of bytes read
      */
    /* InferMemberOverrides */
    override def read(
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    
    /**
      * Read data from the file.
      * @param [BrowserFS.node.Buffer] buffer The buffer that the data will be
      *   written to.
      * @param [Number] offset The offset within the buffer where writing will
      *   start.
      * @param [Number] length An integer specifying the number of bytes to read.
      * @param [Number] position An integer specifying where to begin reading from
      *   in the file. If position is null, data will be read from the current file
      *   position.
      * @return [Number]
      */
    /* InferMemberOverrides */
    override def readSync(buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
    
    /**
      * Asynchronous `stat`.
      * @param [Function(BrowserFS.ApiError, BrowserFS.node.fs.Stats)] cb
      */
    /* InferMemberOverrides */
    override def stat(cb: BFSCallback[typings.browserfs.distNodeCoreNodeFsStatsMod.default]): Unit = js.native
    
    /**
      * Synchronous `stat`.
      */
    /* InferMemberOverrides */
    override def statSync(): typings.browserfs.distNodeCoreNodeFsStatsMod.default = js.native
    
    /* InferMemberOverrides */
    override def sync(cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def syncSync(): Unit = js.native
    
    /**
      * Asynchronous truncate.
      * @param [Number] len
      * @param [Function(BrowserFS.ApiError)] cb
      */
    /* InferMemberOverrides */
    override def truncate(len: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous truncate.
      * @param [Number] len
      */
    /* InferMemberOverrides */
    override def truncateSync(len: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimes(atime: js.Date, mtime: js.Date, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimesSync(atime: js.Date, mtime: js.Date): Unit = js.native
    
    /**
      * Write buffer to the file.
      * Note that it is unsafe to use fs.write multiple times on the same file
      * without waiting for the callback.
      * @param [BrowserFS.node.Buffer] buffer Buffer containing the data to write to
      *  the file.
      * @param [Number] offset Offset in the buffer to start reading data from.
      * @param [Number] length The amount of bytes to write to the file.
      * @param [Number] position Offset from the beginning of the file where this
      *   data should be written. If position is null, the data will be written at
      *   the current position.
      * @param [Function(BrowserFS.ApiError, Number, BrowserFS.node.Buffer)]
      *   cb The number specifies the number of bytes written into the file.
      */
    /* InferMemberOverrides */
    override def write(
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    
    /**
      * Write buffer to the file.
      * Note that it is unsafe to use fs.writeSync multiple times on the same file
      * without waiting for the callback.
      * @param [BrowserFS.node.Buffer] buffer Buffer containing the data to write to
      *  the file.
      * @param [Number] offset Offset in the buffer to start reading data from.
      * @param [Number] length The amount of bytes to write to the file.
      * @param [Number] position Offset from the beginning of the file where this
      *   data should be written. If position is null, the data will be written at
      *   the current position.
      * @return [Number]
      */
    /* InferMemberOverrides */
    override def writeSync(buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
  }
  
  @JSImport("browserfs/dist/node/generic/key_value_filesystem", "AsyncKeyValueFileSystem")
  @js.native
  open class AsyncKeyValueFileSystem () extends BaseFileSystem {
    
    /**
      * Helper function for findINode.
      * @param parent The parent directory of the file we are attempting to find.
      * @param filename The filename of the inode we are attempting to find, minus
      *   the parent.
      * @param cb Passed an error or the ID of the file's inode in the file system.
      */
    /* private */ def _findINode(tx: Any, parent: Any, filename: Any, cb: Any): Any = js.native
    
    def _sync(
      p: String,
      data: Buffer,
      stats: typings.browserfs.distNodeCoreNodeFsStatsMod.default,
      cb: BFSOneArgCallback
    ): Unit = js.native
    
    /**
      * Adds a new node under a random ID. Retries 5 times before giving up in
      * the exceedingly unlikely chance that we try to reuse a random GUID.
      * @param cb Passed an error or the GUID that the data was stored under.
      */
    /* private */ def addNewNode(tx: Any, data: Any, cb: Any): Any = js.native
    
    /**
      * Commits a new file (well, a FILE or a DIRECTORY) to the file system with
      * the given mode.
      * Note: This will commit the transaction.
      * @param p The path to the new file.
      * @param type The type of the new file.
      * @param mode The mode to create the new file with.
      * @param data The data to store at the file's data node.
      * @param cb Passed an error or the Inode for the new file.
      */
    /* private */ def commitNewFile(tx: Any, p: Any, `type`: Any, mode: Any, data: Any, cb: Any): Any = js.native
    
    /**
      * Delete all contents stored in the file system.
      */
    def empty(cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Finds the Inode of the given path.
      * @param p The path to look up.
      * @param cb Passed an error or the Inode of the path p.
      * @todo memoize/cache
      */
    /* private */ def findINode(tx: Any, p: Any, cb: Any): Any = js.native
    
    /**
      * Given a path to a directory, retrieves the corresponding INode and
      * directory listing.
      */
    /* private */ def findINodeAndDirListing(tx: Any, p: Any, cb: Any): Any = js.native
    
    /**
      * Given the Inode of a directory, retrieves the corresponding directory
      * listing.
      */
    /* private */ def getDirListing(tx: Any, p: Any, inode: Any, cb: Any): Any = js.native
    
    /**
      * Given the ID of a node, retrieves the corresponding Inode.
      * @param tx The transaction to use.
      * @param p The corresponding path to the file (used for error messages).
      * @param id The ID to look up.
      * @param cb Passed an error or the inode under the given id.
      */
    /* private */ def getINode(tx: Any, p: Any, id: Any, cb: Any): Any = js.native
    
    def getName(): String = js.native
    
    /**
      * Initializes the file system. Typically called by subclasses' async
      * constructors.
      */
    def init(store: AsyncKeyValueStore, cb: BFSOneArgCallback): Unit = js.native
    
    def isReadOnly(): Boolean = js.native
    
    /**
      * Checks if the root directory exists. Creates it if it doesn't.
      */
    /* private */ def makeRootDirectory(cb: Any): Any = js.native
    
    /**
      * Remove all traces of the given path from the file system.
      * @param p The path to remove from the file system.
      * @param isDir Does the path belong to a directory, or a file?
      * @todo Update mtime.
      */
    /* private */ def removeEntry(p: Any, isDir: Any, cb: Any): Any = js.native
    
    /* protected */ var store: AsyncKeyValueStore = js.native
    
    def supportsProps(): Boolean = js.native
    
    def supportsSymlinks(): Boolean = js.native
    
    def supportsSynch(): Boolean = js.native
  }
  /* static members */
  object AsyncKeyValueFileSystem {
    
    @JSImport("browserfs/dist/node/generic/key_value_filesystem", "AsyncKeyValueFileSystem")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @JSImport("browserfs/dist/node/generic/key_value_filesystem", "SimpleSyncRWTransaction")
  @js.native
  open class SimpleSyncRWTransaction protected ()
    extends StObject
       with SyncKeyValueRWTransaction {
    def this(store: SimpleSyncStore) = this()
    
    /**
      * Aborts and rolls back the transaction.
      */
    /* CompleteClass */
    override def abort(): Unit = js.native
    
    /**
      * Commits the transaction.
      */
    /* CompleteClass */
    override def commit(): Unit = js.native
    
    /**
      * Deletes the data at the given key.
      * @param key The key to delete from the store.
      */
    /* CompleteClass */
    override def del(key: String): Unit = js.native
    
    /**
      * Retrieves the data at the given key. Throws an ApiError if an error occurs
      * or if the key does not exist.
      * @param key The key to look under for data.
      * @return The data stored under the key, or undefined if not present.
      */
    /* CompleteClass */
    override def get(key: String): js.UndefOr[Buffer] = js.native
    
    /**
      * Marks the given key as modified, and stashes its value if it has not been
      * stashed already.
      */
    /* private */ def markModified(key: Any): Any = js.native
    
    /**
      * List of keys modified in this transaction, if any.
      */
    /* private */ var modifiedKeys: Any = js.native
    
    /**
      * Stores data in the keys we modify prior to modifying them.
      * Allows us to roll back commits.
      */
    /* private */ var originalData: Any = js.native
    
    /**
      * Adds the data to the store under the given key.
      * @param key The key to add the data under.
      * @param data The data to add to the store.
      * @param overwrite If 'true', overwrite any existing data. If 'false',
      *   avoids storing the data if the key exists.
      * @return True if storage succeeded, false otherwise.
      */
    /* CompleteClass */
    override def put(key: String, data: Buffer, overwrite: Boolean): Boolean = js.native
    
    /**
      * Stashes given key value pair into `originalData` if it doesn't already
      * exist. Allows us to stash values the program is requesting anyway to
      * prevent needless `get` requests if the program modifies the data later
      * on during the transaction.
      */
    /* private */ def stashOldValue(key: Any, value: Any): Any = js.native
    
    /* private */ var store: Any = js.native
  }
  
  @JSImport("browserfs/dist/node/generic/key_value_filesystem", "SyncKeyValueFile")
  @js.native
  open class SyncKeyValueFile protected ()
    extends default[SyncKeyValueFileSystem]
       with File {
    def this(
      _fs: SyncKeyValueFileSystem,
      _path: String,
      _flag: FileFlag,
      _stat: typings.browserfs.distNodeCoreNodeFsStatsMod.default
    ) = this()
    def this(
      _fs: SyncKeyValueFileSystem,
      _path: String,
      _flag: FileFlag,
      _stat: typings.browserfs.distNodeCoreNodeFsStatsMod.default,
      contents: Buffer
    ) = this()
    
    /* InferMemberOverrides */
    override def chmod(mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chmodSync(mode: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def chown(uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chownSync(uid: Double, gid: Double): Unit = js.native
    
    /**
      * **Core**: Asynchronous close. Must be implemented by subclasses of this
      * class.
      * @param [Function(BrowserFS.ApiError)] cb
      */
    /* InferMemberOverrides */
    override def close(cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * **Core**: Synchronous close.
      */
    /* InferMemberOverrides */
    override def closeSync(): Unit = js.native
    
    /* InferMemberOverrides */
    override def datasync(cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def datasyncSync(): Unit = js.native
    
    /**
      * Get the current file position.
      *
      * We emulate the following bug mentioned in the Node documentation:
      * > On Linux, positional writes don't work when the file is opened in append
      *   mode. The kernel ignores the position argument and always appends the data
      *   to the end of the file.
      * @return [Number] The current file position.
      */
    /* InferMemberOverrides */
    override def getPos(): Double & js.UndefOr[Double] = js.native
    
    /**
      * Read data from the file.
      * @param [BrowserFS.node.Buffer] buffer The buffer that the data will be
      *   written to.
      * @param [Number] offset The offset within the buffer where writing will
      *   start.
      * @param [Number] length An integer specifying the number of bytes to read.
      * @param [Number] position An integer specifying where to begin reading from
      *   in the file. If position is null, data will be read from the current file
      *   position.
      * @param [Function(BrowserFS.ApiError, Number, BrowserFS.node.Buffer)] cb The
      *   number is the number of bytes read
      */
    /* InferMemberOverrides */
    override def read(
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    
    /**
      * Read data from the file.
      * @param [BrowserFS.node.Buffer] buffer The buffer that the data will be
      *   written to.
      * @param [Number] offset The offset within the buffer where writing will
      *   start.
      * @param [Number] length An integer specifying the number of bytes to read.
      * @param [Number] position An integer specifying where to begin reading from
      *   in the file. If position is null, data will be read from the current file
      *   position.
      * @return [Number]
      */
    /* InferMemberOverrides */
    override def readSync(buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
    
    /**
      * Asynchronous `stat`.
      * @param [Function(BrowserFS.ApiError, BrowserFS.node.fs.Stats)] cb
      */
    /* InferMemberOverrides */
    override def stat(cb: BFSCallback[typings.browserfs.distNodeCoreNodeFsStatsMod.default]): Unit = js.native
    
    /**
      * Synchronous `stat`.
      */
    /* InferMemberOverrides */
    override def statSync(): typings.browserfs.distNodeCoreNodeFsStatsMod.default = js.native
    
    /* InferMemberOverrides */
    override def sync(cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def syncSync(): Unit = js.native
    
    /**
      * Asynchronous truncate.
      * @param [Number] len
      * @param [Function(BrowserFS.ApiError)] cb
      */
    /* InferMemberOverrides */
    override def truncate(len: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * Synchronous truncate.
      * @param [Number] len
      */
    /* InferMemberOverrides */
    override def truncateSync(len: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimes(atime: js.Date, mtime: js.Date, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimesSync(atime: js.Date, mtime: js.Date): Unit = js.native
    
    /**
      * Write buffer to the file.
      * Note that it is unsafe to use fs.write multiple times on the same file
      * without waiting for the callback.
      * @param [BrowserFS.node.Buffer] buffer Buffer containing the data to write to
      *  the file.
      * @param [Number] offset Offset in the buffer to start reading data from.
      * @param [Number] length The amount of bytes to write to the file.
      * @param [Number] position Offset from the beginning of the file where this
      *   data should be written. If position is null, the data will be written at
      *   the current position.
      * @param [Function(BrowserFS.ApiError, Number, BrowserFS.node.Buffer)]
      *   cb The number specifies the number of bytes written into the file.
      */
    /* InferMemberOverrides */
    override def write(
      buffer: Buffer,
      offset: Double,
      length: Double,
      position: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    
    /**
      * Write buffer to the file.
      * Note that it is unsafe to use fs.writeSync multiple times on the same file
      * without waiting for the callback.
      * @param [BrowserFS.node.Buffer] buffer Buffer containing the data to write to
      *  the file.
      * @param [Number] offset Offset in the buffer to start reading data from.
      * @param [Number] length The amount of bytes to write to the file.
      * @param [Number] position Offset from the beginning of the file where this
      *   data should be written. If position is null, the data will be written at
      *   the current position.
      * @return [Number]
      */
    /* InferMemberOverrides */
    override def writeSync(buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
  }
  
  @JSImport("browserfs/dist/node/generic/key_value_filesystem", "SyncKeyValueFileSystem")
  @js.native
  open class SyncKeyValueFileSystem protected () extends SynchronousFileSystem {
    def this(options: SyncKeyValueFileSystemOptions) = this()
    
    /**
      * Helper function for findINode.
      * @param parent The parent directory of the file we are attempting to find.
      * @param filename The filename of the inode we are attempting to find, minus
      *   the parent.
      * @return string The ID of the file's inode in the file system.
      */
    /* private */ def _findINode(tx: Any, parent: Any, filename: Any): Any = js.native
    
    def _syncSync(p: String, data: Buffer, stats: typings.browserfs.distNodeCoreNodeFsStatsMod.default): Unit = js.native
    
    /**
      * Creates a new node under a random ID. Retries 5 times before giving up in
      * the exceedingly unlikely chance that we try to reuse a random GUID.
      * @return The GUID that the data was stored under.
      */
    /* private */ def addNewNode(tx: Any, data: Any): Any = js.native
    
    /**
      * Commits a new file (well, a FILE or a DIRECTORY) to the file system with
      * the given mode.
      * Note: This will commit the transaction.
      * @param p The path to the new file.
      * @param type The type of the new file.
      * @param mode The mode to create the new file with.
      * @param data The data to store at the file's data node.
      * @return The Inode for the new file.
      */
    /* private */ def commitNewFile(tx: Any, p: Any, `type`: Any, mode: Any, data: Any): Any = js.native
    
    /**
      * Delete all contents stored in the file system.
      */
    def empty(): Unit = js.native
    
    /**
      * Finds the Inode of the given path.
      * @param p The path to look up.
      * @return The Inode of the path p.
      * @todo memoize/cache
      */
    /* private */ def findINode(tx: Any, p: Any): Any = js.native
    
    /**
      * Given the Inode of a directory, retrieves the corresponding directory
      * listing.
      */
    /* private */ def getDirListing(tx: Any, p: Any, inode: Any): Any = js.native
    
    /**
      * Given the ID of a node, retrieves the corresponding Inode.
      * @param tx The transaction to use.
      * @param p The corresponding path to the file (used for error messages).
      * @param id The ID to look up.
      */
    /* private */ def getINode(tx: Any, p: Any, id: Any): Any = js.native
    
    def getName(): String = js.native
    
    def isReadOnly(): Boolean = js.native
    
    /**
      * Checks if the root directory exists. Creates it if it doesn't.
      */
    /* private */ def makeRootDirectory(): Any = js.native
    
    def openFileSync(p: String, flag: FileFlag): File = js.native
    
    /**
      * Remove all traces of the given path from the file system.
      * @param p The path to remove from the file system.
      * @param isDir Does the path belong to a directory, or a file?
      * @todo Update mtime.
      */
    /* private */ def removeEntry(p: Any, isDir: Any): Any = js.native
    
    /* private */ var store: Any = js.native
    
    def supportsProps(): Boolean = js.native
    
    def supportsSymlinks(): Boolean = js.native
  }
  /* static members */
  object SyncKeyValueFileSystem {
    
    @JSImport("browserfs/dist/node/generic/key_value_filesystem", "SyncKeyValueFileSystem")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  trait AsyncKeyValueROTransaction extends StObject {
    
    /**
      * Retrieves the data at the given key.
      * @param key The key to look under for data.
      */
    def get(key: String, cb: BFSCallback[Buffer]): Unit
  }
  object AsyncKeyValueROTransaction {
    
    inline def apply(get: (String, BFSCallback[Buffer]) => Unit): AsyncKeyValueROTransaction = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
      __obj.asInstanceOf[AsyncKeyValueROTransaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncKeyValueROTransaction] (val x: Self) extends AnyVal {
      
      inline def setGet(value: (String, BFSCallback[Buffer]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    }
  }
  
  trait AsyncKeyValueRWTransaction
    extends StObject
       with AsyncKeyValueROTransaction {
    
    /**
      * Aborts and rolls back the transaction.
      */
    def abort(cb: BFSOneArgCallback): Unit
    
    /**
      * Commits the transaction.
      */
    def commit(cb: BFSOneArgCallback): Unit
    
    /**
      * Deletes the data at the given key.
      * @param key The key to delete from the store.
      */
    def del(key: String, cb: BFSOneArgCallback): Unit
    
    /**
      * Adds the data to the store under the given key. Overwrites any existing
      * data.
      * @param key The key to add the data under.
      * @param data The data to add to the store.
      * @param overwrite If 'true', overwrite any existing data. If 'false',
      *   avoids writing the data if the key exists.
      * @param cb Triggered with an error and whether or not the value was
      *   committed.
      */
    def put(
      key: String,
      data: Buffer,
      overwrite: Boolean,
      cb: js.Function2[/* e */ ApiError, /* committed */ js.UndefOr[Boolean], Unit]
    ): Unit
  }
  object AsyncKeyValueRWTransaction {
    
    inline def apply(
      abort: BFSOneArgCallback => Unit,
      commit: BFSOneArgCallback => Unit,
      del: (String, BFSOneArgCallback) => Unit,
      get: (String, BFSCallback[Buffer]) => Unit,
      put: (String, Buffer, Boolean, js.Function2[/* e */ ApiError, /* committed */ js.UndefOr[Boolean], Unit]) => Unit
    ): AsyncKeyValueRWTransaction = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction1(abort), commit = js.Any.fromFunction1(commit), del = js.Any.fromFunction2(del), get = js.Any.fromFunction2(get), put = js.Any.fromFunction4(put))
      __obj.asInstanceOf[AsyncKeyValueRWTransaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncKeyValueRWTransaction] (val x: Self) extends AnyVal {
      
      inline def setAbort(value: BFSOneArgCallback => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction1(value))
      
      inline def setCommit(value: BFSOneArgCallback => Unit): Self = StObject.set(x, "commit", js.Any.fromFunction1(value))
      
      inline def setDel(value: (String, BFSOneArgCallback) => Unit): Self = StObject.set(x, "del", js.Any.fromFunction2(value))
      
      inline def setPut(
        value: (String, Buffer, Boolean, js.Function2[/* e */ ApiError, /* committed */ js.UndefOr[Boolean], Unit]) => Unit
      ): Self = StObject.set(x, "put", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait AsyncKeyValueStore extends StObject {
    
    def beginTransaction(`type`: String): AsyncKeyValueROTransaction = js.native
    /**
      * Begins a read-only transaction.
      */
    @JSName("beginTransaction")
    def beginTransaction_readonly(`type`: readonly): AsyncKeyValueROTransaction = js.native
    /**
      * Begins a read-write transaction.
      */
    @JSName("beginTransaction")
    def beginTransaction_readwrite(`type`: readwrite): AsyncKeyValueRWTransaction = js.native
    
    /**
      * Empties the key-value store completely.
      */
    def clear(cb: BFSOneArgCallback): Unit = js.native
    
    /**
      * The name of the key-value store.
      */
    def name(): String = js.native
  }
  
  trait SimpleSyncStore extends StObject {
    
    def del(key: String): Unit
    
    def get(key: String): js.UndefOr[Buffer]
    
    def put(key: String, data: Buffer, overwrite: Boolean): Boolean
  }
  object SimpleSyncStore {
    
    inline def apply(del: String => Unit, get: String => js.UndefOr[Buffer], put: (String, Buffer, Boolean) => Boolean): SimpleSyncStore = {
      val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), put = js.Any.fromFunction3(put))
      __obj.asInstanceOf[SimpleSyncStore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleSyncStore] (val x: Self) extends AnyVal {
      
      inline def setDel(value: String => Unit): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => js.UndefOr[Buffer]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setPut(value: (String, Buffer, Boolean) => Boolean): Self = StObject.set(x, "put", js.Any.fromFunction3(value))
    }
  }
  
  trait SyncKeyValueFileSystemOptions extends StObject {
    
    /**
      * The actual key-value store to read from/write to.
      */
    var store: SyncKeyValueStore
  }
  object SyncKeyValueFileSystemOptions {
    
    inline def apply(store: SyncKeyValueStore): SyncKeyValueFileSystemOptions = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncKeyValueFileSystemOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncKeyValueFileSystemOptions] (val x: Self) extends AnyVal {
      
      inline def setStore(value: SyncKeyValueStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncKeyValueROTransaction extends StObject {
    
    /**
      * Retrieves the data at the given key. Throws an ApiError if an error occurs
      * or if the key does not exist.
      * @param key The key to look under for data.
      * @return The data stored under the key, or undefined if not present.
      */
    def get(key: String): js.UndefOr[Buffer]
  }
  object SyncKeyValueROTransaction {
    
    inline def apply(get: String => js.UndefOr[Buffer]): SyncKeyValueROTransaction = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[SyncKeyValueROTransaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncKeyValueROTransaction] (val x: Self) extends AnyVal {
      
      inline def setGet(value: String => js.UndefOr[Buffer]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  trait SyncKeyValueRWTransaction
    extends StObject
       with SyncKeyValueROTransaction {
    
    /**
      * Aborts and rolls back the transaction.
      */
    def abort(): Unit
    
    /**
      * Commits the transaction.
      */
    def commit(): Unit
    
    /**
      * Deletes the data at the given key.
      * @param key The key to delete from the store.
      */
    def del(key: String): Unit
    
    /**
      * Adds the data to the store under the given key.
      * @param key The key to add the data under.
      * @param data The data to add to the store.
      * @param overwrite If 'true', overwrite any existing data. If 'false',
      *   avoids storing the data if the key exists.
      * @return True if storage succeeded, false otherwise.
      */
    def put(key: String, data: Buffer, overwrite: Boolean): Boolean
  }
  object SyncKeyValueRWTransaction {
    
    inline def apply(
      abort: () => Unit,
      commit: () => Unit,
      del: String => Unit,
      get: String => js.UndefOr[Buffer],
      put: (String, Buffer, Boolean) => Boolean
    ): SyncKeyValueRWTransaction = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), commit = js.Any.fromFunction0(commit), del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), put = js.Any.fromFunction3(put))
      __obj.asInstanceOf[SyncKeyValueRWTransaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncKeyValueRWTransaction] (val x: Self) extends AnyVal {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setCommit(value: () => Unit): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
      
      inline def setDel(value: String => Unit): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      inline def setPut(value: (String, Buffer, Boolean) => Boolean): Self = StObject.set(x, "put", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait SyncKeyValueStore extends StObject {
    
    def beginTransaction(`type`: String): SyncKeyValueROTransaction = js.native
    /**
      * Begins a new read-only transaction.
      */
    @JSName("beginTransaction")
    def beginTransaction_readonly(`type`: readonly): SyncKeyValueROTransaction = js.native
    /**
      * Begins a new read-write transaction.
      */
    @JSName("beginTransaction")
    def beginTransaction_readwrite(`type`: readwrite): SyncKeyValueRWTransaction = js.native
    
    /**
      * Empties the key-value store completely.
      */
    def clear(): Unit = js.native
    
    /**
      * The name of the key-value store.
      */
    def name(): String = js.native
  }
}
