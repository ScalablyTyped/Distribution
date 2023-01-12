package typings.clamscan

import typings.clamscan.anon.Active
import typings.clamscan.anon.BypassTest
import typings.clamscan.anon.Isinfected
import typings.clamscan.anon.ReadonlyOptions
import typings.clamscan.anon.ResponsefilestringisInfec
import typings.clamscan.anon.ResponsefilestringisInfecFile
import typings.clamscan.anon.ResponsegoodFilesArraystr
import typings.clamscan.anon.ResponsepathstringisInfec
import typings.clamscan.anon.Viruses
import typings.clamscan.clamscanStrings.`node-clam`
import typings.clamscan.clamscanStrings.clamdscan
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clamscan", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with NodeClam
  
  @js.native
  trait NodeClam extends StObject {
    
    /* private */ var _buildClamArgs: Any = js.native
    
    /* private */ var _buildClamFlags: Any = js.native
    
    /* private */ var _initSocket: Any = js.native
    
    /* private */ var _isClamavBinary: Any = js.native
    
    /* private */ var _isLocalHost: Any = js.native
    
    /* private */ var _isReadableStream: Any = js.native
    
    /* private */ var _ping: Any = js.native
    
    /* private */ var _processResult: Any = js.native
    
    val debugLabel: `node-clam` = js.native
    
    val defaultScanner: clamdscan = js.native
    
    val defaults: ReadonlyOptions = js.native
    
    /**
      * This method allows you to determine the version of ClamAV you are
      * interfacing with. It supports a callback and Promise API. If no callback
      * is supplied, a Promise will be returned.
      *
      * @see {@link https://github.com/kylefarris/clamscan#getversioncallback}
      */
    def getVersion(): js.Promise[String] = js.native
    def getVersion(cb: js.Function2[/* err */ NodeClamError | Null, /* version */ String, Unit]): Unit = js.native
    
    def init(options: Options): js.Promise[this.type] = js.native
    def init(options: Options, cb: js.Function2[/* err */ js.Error | Null, /* instance */ this.type, Unit]): Unit = js.native
    
    val initialized: Boolean = js.native
    
    def isInfected(): Unit = js.native
    def isInfected(file: String): Unit = js.native
    def isInfected(
      file: String,
      cb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* file */ String, 
          /* isInfected */ Boolean | Null, 
          /* viruses */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    def isInfected(
      file: Unit,
      cb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* file */ String, 
          /* isInfected */ Boolean | Null, 
          /* viruses */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    /**
      * This method allows you to scan a single file. It supports a callback and
      * Promise API. If no callback is supplied, a Promise will be returned. This
      * method will likely be the most common use-case for this module.
      *
      * @see {@link https://github.com/kylefarris/clamscan#isinfectedfile_pathcallback}
      */
    @JSName("isInfected")
    def isInfected_Promise(): js.Promise[ResponsefilestringisInfec] = js.native
    @JSName("isInfected")
    def isInfected_Promise(file: String): js.Promise[ResponsefilestringisInfec] = js.native
    
    /**
      * @see {@link https://github.com/kylefarris/clamscan#passthrough}
      */
    def passthrough(): Transform = js.native
    
    def reset(): Unit = js.native
    def reset(options: Unit, cb: js.Function2[/* err */ NodeClamError | Null, /* clam */ this.type, Unit]): Unit = js.native
    def reset(options: Options): Unit = js.native
    def reset(options: Options, cb: js.Function2[/* err */ NodeClamError | Null, /* clam */ this.type, Unit]): Unit = js.native
    /**
      * Allows one to create a new instances of clamscan with new options.
      *
      * @see {@link https://github.com/kylefarris/clamscan/blob/master/index.js#L358}
      */
    @JSName("reset")
    def reset_Promise(): js.Promise[NodeClam] = js.native
    @JSName("reset")
    def reset_Promise(options: Options): js.Promise[NodeClam] = js.native
    
    def scanDir(): Unit = js.native
    def scanDir(path: String): Unit = js.native
    def scanDir(
      path: String,
      endCb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* goodFiles */ js.Array[String], 
          /* badFiles */ js.Array[String], 
          /* viruses */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    def scanDir(
      path: String,
      endCb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* goodFiles */ js.Array[String], 
          /* badFiles */ js.Array[String], 
          /* viruses */ js.Array[String], 
          Unit
        ],
      fileCb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* file */ String, 
          /* isInfected */ Boolean, 
          /* viruses */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    def scanDir(
      path: String,
      endCb: Unit,
      fileCb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* file */ String, 
          /* isInfected */ Boolean, 
          /* viruses */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    def scanDir(
      path: Unit,
      endCb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* goodFiles */ js.Array[String], 
          /* badFiles */ js.Array[String], 
          /* viruses */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    def scanDir(
      path: Unit,
      endCb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* goodFiles */ js.Array[String], 
          /* badFiles */ js.Array[String], 
          /* viruses */ js.Array[String], 
          Unit
        ],
      fileCb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* file */ String, 
          /* isInfected */ Boolean, 
          /* viruses */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    def scanDir(
      path: Unit,
      endCb: Unit,
      fileCb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* file */ String, 
          /* isInfected */ Boolean, 
          /* viruses */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    /**
      * Allows you to scan an entire directory for infected files. This obeys
      * your recursive option even for clamdscan which does not have a native way
      * to turn this feature off. If you have multiple paths, send them in an
      * array to scanFiles.
      *
      * @see {@link https://github.com/kylefarris/clamscan#scandirdir_pathend_callbackfile_callback}
      */
    @JSName("scanDir")
    def scanDir_Promise(): js.Promise[ResponsepathstringisInfec] = js.native
    @JSName("scanDir")
    def scanDir_Promise(path: String): js.Promise[ResponsepathstringisInfec] = js.native
    
    def scanFile(): Unit = js.native
    def scanFile(file: String): Unit = js.native
    def scanFile(
      file: String,
      cb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* file */ String, 
          /* isInfected */ Boolean, 
          /* viruses */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    def scanFile(
      file: Unit,
      cb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* file */ String, 
          /* isInfected */ Boolean, 
          /* viruses */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    /**
      * Just an alias to `isInfected`. See docs for that for usage examples.
      *
      * @see {@link https://github.com/kylefarris/clamscan/blob/master/index.js#L1405}
      */
    @JSName("scanFile")
    def scanFile_Promise(): js.Promise[ResponsefilestringisInfecFile] = js.native
    @JSName("scanFile")
    def scanFile_Promise(file: String): js.Promise[ResponsefilestringisInfecFile] = js.native
    
    def scanFiles(): Unit = js.native
    def scanFiles(files: js.Array[String]): Unit = js.native
    def scanFiles(
      files: js.Array[String],
      endCb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* goodFiles */ js.Array[String], 
          /* badFiles */ js.Array[String], 
          /* viruses */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    def scanFiles(
      files: js.Array[String],
      endCb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* goodFiles */ js.Array[String], 
          /* badFiles */ js.Array[String], 
          /* viruses */ js.Array[String], 
          Unit
        ],
      fileCb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* file */ String, 
          /* isInfected */ Boolean, 
          /* viruses */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    def scanFiles(
      files: js.Array[String],
      endCb: Unit,
      fileCb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* file */ String, 
          /* isInfected */ Boolean, 
          /* viruses */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    def scanFiles(
      files: Unit,
      endCb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* goodFiles */ js.Array[String], 
          /* badFiles */ js.Array[String], 
          /* viruses */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    def scanFiles(
      files: Unit,
      endCb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* goodFiles */ js.Array[String], 
          /* badFiles */ js.Array[String], 
          /* viruses */ js.Array[String], 
          Unit
        ],
      fileCb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* file */ String, 
          /* isInfected */ Boolean, 
          /* viruses */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    def scanFiles(
      files: Unit,
      endCb: Unit,
      fileCb: js.Function4[
          /* err */ NodeClamError | Null, 
          /* file */ String, 
          /* isInfected */ Boolean, 
          /* viruses */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    /**
      * This allows you to scan many files that might be in different
      * directories or maybe only certain files of a single directory. This
      * is essentially a wrapper for isInfected that simplifies the process
      * of scanning many files or directories.
      *
      * @see {@link https://github.com/kylefarris/clamscan#scanfilesfilesend_callbackfile_callback}
      */
    @JSName("scanFiles")
    def scanFiles_Promise(): js.Promise[ResponsegoodFilesArraystr] = js.native
    @JSName("scanFiles")
    def scanFiles_Promise(files: js.Array[String]): js.Promise[ResponsegoodFilesArraystr] = js.native
    
    def scanStream(stream: Readable): Unit = js.native
    def scanStream(stream: Readable, cb: js.Function2[/* err */ NodeClamError | Null, /* isInfected */ Boolean, Unit]): Unit = js.native
    /**
      * This method allows you to scan a binary stream. NOTE: This method will
      * only work if you've configured the module to allow the use of a TCP or
      * UNIX Domain socket. In other words, this will not work if you only have
      * access to a local ClamAV binary.
      *
      * @see {@link https://github.com/kylefarris/clamscan#scanstreamstreamcallback}
      */
    @JSName("scanStream")
    def scanStream_Promise(stream: Readable): js.Promise[ResponsefilestringisInfecFile] = js.native
    
    val settings: ReadonlyOptions = js.native
  }
  
  trait NodeClamError
    extends StObject
       with Error {
    
    var data: Isinfected
    
    var date: js.Date
  }
  object NodeClamError {
    
    inline def apply(data: Isinfected, date: js.Date, message: String, name: String): NodeClamError = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeClamError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeClamError] (val x: Self) extends AnyVal {
      
      inline def setData(value: Isinfected): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var clamdscan: js.UndefOr[BypassTest] = js.undefined
    
    var clamscan: js.UndefOr[Active] = js.undefined
    
    /** Whether to log info/debug/error msg to the console */
    var debugMode: js.UndefOr[Boolean] = js.undefined
    
    /** path to file containing list of files to scan (for scanFiles method) */
    var fileList: js.UndefOr[String] = js.undefined
    
    /** If clamdscan is found and active, it will be used by default */
    var preference: js.UndefOr[Any] = js.undefined
    
    /** False: Don't quarantine, Path: Moves files to this place. */
    var quarantineInfected: js.UndefOr[Boolean | String] = js.undefined
    
    /** If true, removes infected files */
    var removeInfected: js.UndefOr[Boolean] = js.undefined
    
    /** Path to a writeable log file to write scan results into */
    var scanLog: js.UndefOr[String] = js.undefined
    
    /** If true, deep scan folders recursively */
    var scanRecursively: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setClamdscan(value: BypassTest): Self = StObject.set(x, "clamdscan", value.asInstanceOf[js.Any])
      
      inline def setClamdscanUndefined: Self = StObject.set(x, "clamdscan", js.undefined)
      
      inline def setClamscan(value: Active): Self = StObject.set(x, "clamscan", value.asInstanceOf[js.Any])
      
      inline def setClamscanUndefined: Self = StObject.set(x, "clamscan", js.undefined)
      
      inline def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
      
      inline def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
      
      inline def setFileList(value: String): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      inline def setFileListUndefined: Self = StObject.set(x, "fileList", js.undefined)
      
      inline def setPreference(value: Any): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
      
      inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
      
      inline def setQuarantineInfected(value: Boolean | String): Self = StObject.set(x, "quarantineInfected", value.asInstanceOf[js.Any])
      
      inline def setQuarantineInfectedUndefined: Self = StObject.set(x, "quarantineInfected", js.undefined)
      
      inline def setRemoveInfected(value: Boolean): Self = StObject.set(x, "removeInfected", value.asInstanceOf[js.Any])
      
      inline def setRemoveInfectedUndefined: Self = StObject.set(x, "removeInfected", js.undefined)
      
      inline def setScanLog(value: String): Self = StObject.set(x, "scanLog", value.asInstanceOf[js.Any])
      
      inline def setScanLogUndefined: Self = StObject.set(x, "scanLog", js.undefined)
      
      inline def setScanRecursively(value: Boolean): Self = StObject.set(x, "scanRecursively", value.asInstanceOf[js.Any])
      
      inline def setScanRecursivelyUndefined: Self = StObject.set(x, "scanRecursively", js.undefined)
    }
  }
  
  type Response[T] = T & Viruses
}
