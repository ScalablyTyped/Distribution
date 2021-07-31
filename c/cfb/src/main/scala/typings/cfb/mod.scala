package typings.cfb

import typings.cfb.anon.Header
import typings.cfb.cfbStrings.array
import typings.cfb.cfbStrings.base64
import typings.cfb.cfbStrings.binary
import typings.cfb.cfbStrings.buffer
import typings.cfb.cfbStrings.file
import typings.cfb.cfbStrings.mad
import typings.cfb.cfbStrings.zip
import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cfb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait CFBEntryType extends StObject
  @JSImport("cfb", "CFB$EntryType")
  @js.native
  object CFBEntryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CFBEntryType & Double] = js.native
    
    @js.native
    sealed trait lockbytes
      extends StObject
         with CFBEntryType
    /* 3 */ val lockbytes: typings.cfb.mod.CFBEntryType.lockbytes & Double = js.native
    
    @js.native
    sealed trait property
      extends StObject
         with CFBEntryType
    /* 4 */ val property: typings.cfb.mod.CFBEntryType.property & Double = js.native
    
    @js.native
    sealed trait root
      extends StObject
         with CFBEntryType
    /* 5 */ val root: typings.cfb.mod.CFBEntryType.root & Double = js.native
    
    @js.native
    sealed trait storage
      extends StObject
         with CFBEntryType
    /* 1 */ val storage: typings.cfb.mod.CFBEntryType.storage & Double = js.native
    
    @js.native
    sealed trait stream
      extends StObject
         with CFBEntryType
    /* 2 */ val stream: typings.cfb.mod.CFBEntryType.stream & Double = js.native
    
    @js.native
    sealed trait unknown
      extends StObject
         with CFBEntryType
    /* 0 */ val unknown: typings.cfb.mod.CFBEntryType.unknown & Double = js.native
  }
  
  @js.native
  sealed trait CFBStorageType extends StObject
  @JSImport("cfb", "CFB$StorageType")
  @js.native
  object CFBStorageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CFBStorageType & Double] = js.native
    
    @js.native
    sealed trait fat
      extends StObject
         with CFBStorageType
    /* 0 */ val fat: typings.cfb.mod.CFBStorageType.fat & Double = js.native
    
    @js.native
    sealed trait minifat
      extends StObject
         with CFBStorageType
    /* 1 */ val minifat: typings.cfb.mod.CFBStorageType.minifat & Double = js.native
  }
  
  @scala.inline
  def find(cfb: CFBContainer, path: String): CFBEntry | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(cfb.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[CFBEntry | Null]
  
  @scala.inline
  def parse(f: CFBBlob): CFBContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(f.asInstanceOf[js.Any]).asInstanceOf[CFBContainer]
  @scala.inline
  def parse(f: CFBBlob, options: CFBParsingOptions): CFBContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(f.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CFBContainer]
  
  @scala.inline
  def read(f: String): CFBContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(f.asInstanceOf[js.Any]).asInstanceOf[CFBContainer]
  @scala.inline
  def read(f: String, options: CFBParsingOptions): CFBContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(f.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CFBContainer]
  @scala.inline
  def read(f: CFBBlob): CFBContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(f.asInstanceOf[js.Any]).asInstanceOf[CFBContainer]
  @scala.inline
  def read(f: CFBBlob, options: CFBParsingOptions): CFBContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(f.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CFBContainer]
  
  @JSImport("cfb", "utils")
  @js.native
  val utils: CFBUtils = js.native
  
  @JSImport("cfb", "version")
  @js.native
  val version: String = js.native
  
  @scala.inline
  def write(cfb: CFBContainer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(cfb.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def write(cfb: CFBContainer, options: CFBWritingOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(cfb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def writeFile(cfb: CFBContainer, filename: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(cfb.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def writeFile(cfb: CFBContainer, filename: String, options: CFBWritingOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(cfb.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  trait CFBAddOpts extends StObject {
    
    /** Skip existence and safety checks (best for bulk write operations) */
    var unsafe: js.UndefOr[Boolean] = js.undefined
  }
  object CFBAddOpts {
    
    @scala.inline
    def apply(): CFBAddOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CFBAddOpts]
    }
    
    @scala.inline
    implicit class CFBAddOptsMutableBuilder[Self <: CFBAddOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnsafe(value: Boolean): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
    }
  }
  
  type CFBBlob = js.Array[Double] | Uint8Array
  
  trait CFBCommonOptions extends StObject {
    
    /** If true, throw errors when features are not understood */
    var WTF: js.UndefOr[Boolean] = js.undefined
    
    /** Data encoding */
    var `type`: js.UndefOr[base64 | binary | buffer | file | array] = js.undefined
  }
  object CFBCommonOptions {
    
    @scala.inline
    def apply(): CFBCommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CFBCommonOptions]
    }
    
    @scala.inline
    implicit class CFBCommonOptionsMutableBuilder[Self <: CFBCommonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: base64 | binary | buffer | file | array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWTF(value: Boolean): Self = StObject.set(x, "WTF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWTFUndefined: Self = StObject.set(x, "WTF", js.undefined)
    }
  }
  
  trait CFBContainer extends StObject {
    
    /* Array of entries in the same order as FullPaths */
    var FileIndex: js.Array[CFBEntry]
    
    /* List of streams and storages */
    var FullPaths: js.Array[String]
    
    /* Raw Content, in chunks (Buffer when available, Array of bytes otherwise) */
    var raw: js.UndefOr[Header] = js.undefined
  }
  object CFBContainer {
    
    @scala.inline
    def apply(FileIndex: js.Array[CFBEntry], FullPaths: js.Array[String]): CFBContainer = {
      val __obj = js.Dynamic.literal(FileIndex = FileIndex.asInstanceOf[js.Any], FullPaths = FullPaths.asInstanceOf[js.Any])
      __obj.asInstanceOf[CFBContainer]
    }
    
    @scala.inline
    implicit class CFBContainerMutableBuilder[Self <: CFBContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileIndex(value: js.Array[CFBEntry]): Self = StObject.set(x, "FileIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileIndexVarargs(value: CFBEntry*): Self = StObject.set(x, "FileIndex", js.Array(value :_*))
      
      @scala.inline
      def setFullPaths(value: js.Array[String]): Self = StObject.set(x, "FullPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullPathsVarargs(value: String*): Self = StObject.set(x, "FullPaths", js.Array(value :_*))
      
      @scala.inline
      def setRaw(value: Header): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  trait CFBEntry extends StObject {
    
    /** Class ID represented as hex string */
    var clsid: String
    
    /** Red/Black Tree color: 0 = red, 1 = black */
    var color: Double
    
    /** Raw Content (Buffer when available, Array of bytes otherwise) */
    var content: CFBBlob
    
    /** Creation Time */
    var ct: js.UndefOr[Date] = js.undefined
    
    /** Content Type (used for MAD) */
    var ctype: js.UndefOr[String] = js.undefined
    
    /** Modification Time */
    var mt: js.UndefOr[Date] = js.undefined
    
    /** Case-sensitive internal name */
    var name: String
    
    /** Data Size */
    var size: Double
    
    /** Starting Sector */
    var start: Double
    
    /** User-Defined State Bits */
    var state: Double
    
    /** Storage location -- see CFB$StorageType */
    var storage: js.UndefOr[String] = js.undefined
    
    /** CFB type (salient types: stream, storage) -- see CFB$EntryType */
    var `type`: Double
  }
  object CFBEntry {
    
    @scala.inline
    def apply(
      clsid: String,
      color: Double,
      content: CFBBlob,
      name: String,
      size: Double,
      start: Double,
      state: Double,
      `type`: Double
    ): CFBEntry = {
      val __obj = js.Dynamic.literal(clsid = clsid.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CFBEntry]
    }
    
    @scala.inline
    implicit class CFBEntryMutableBuilder[Self <: CFBEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClsid(value: String): Self = StObject.set(x, "clsid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: CFBBlob): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentVarargs(value: Double*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setCt(value: Date): Self = StObject.set(x, "ct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtUndefined: Self = StObject.set(x, "ct", js.undefined)
      
      @scala.inline
      def setCtype(value: String): Self = StObject.set(x, "ctype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtypeUndefined: Self = StObject.set(x, "ctype", js.undefined)
      
      @scala.inline
      def setMt(value: Date): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CFBParsingOptions
    extends StObject
       with CFBCommonOptions {
    
    /** If true, include raw data in output */
    var raw: js.UndefOr[Boolean] = js.undefined
  }
  object CFBParsingOptions {
    
    @scala.inline
    def apply(): CFBParsingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CFBParsingOptions]
    }
    
    @scala.inline
    implicit class CFBParsingOptionsMutableBuilder[Self <: CFBParsingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  @js.native
  trait CFBUtils extends StObject {
    
    def CheckField(hexstr: String): Unit = js.native
    def CheckField(hexstr: String, fld: String): Unit = js.native
    
    def ReadShift(size: Double): Double | String = js.native
    def ReadShift(size: Double, t: String): Double | String = js.native
    
    def WarnField(hexstr: String): Unit = js.native
    def WarnField(hexstr: String, fld: String): Unit = js.native
    
    def bconcat(bufs: js.Array[js.Any]): js.Any = js.native
    
    def cfb_add(cfb: CFBContainer, name: String, content: js.Any): CFBEntry = js.native
    def cfb_add(cfb: CFBContainer, name: String, content: js.Any, opts: CFBAddOpts): CFBEntry = js.native
    
    def cfb_del(cfb: CFBContainer, name: String): Boolean = js.native
    
    def cfb_gc(cfb: CFBContainer): Unit = js.native
    
    def cfb_mov(cfb: CFBContainer, old_name: String, new_name: String): Boolean = js.native
    
    def cfb_new(): CFBContainer = js.native
    def cfb_new(opts: js.Any): CFBContainer = js.native
    
    def prep_blob(blob: js.Any): CFBBlob = js.native
    def prep_blob(blob: js.Any, pos: Double): CFBBlob = js.native
  }
  
  trait CFBWritingOptions
    extends StObject
       with CFBCommonOptions {
    
    /** Enable compression (ZIP only) */
    var compression: js.UndefOr[Boolean] = js.undefined
    
    /** Output file type */
    var fileType: js.UndefOr[typings.cfb.cfbStrings.cfb | zip | mad] = js.undefined
    
    /** Override default root entry name (CFB only) */
    var root: js.UndefOr[String] = js.undefined
  }
  object CFBWritingOptions {
    
    @scala.inline
    def apply(): CFBWritingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CFBWritingOptions]
    }
    
    @scala.inline
    implicit class CFBWritingOptionsMutableBuilder[Self <: CFBWritingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setFileType(value: typings.cfb.cfbStrings.cfb | zip | mad): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
