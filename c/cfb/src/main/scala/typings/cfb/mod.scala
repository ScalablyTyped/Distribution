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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait CFBEntryType extends StObject
  @JSImport("cfb", "CFB$EntryType")
  @js.native
  object CFBEntryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CFBEntryType with Double] = js.native
    
    @js.native
    sealed trait lockbytes extends CFBEntryType
    /* 3 */ val lockbytes: typings.cfb.mod.CFBEntryType.lockbytes with Double = js.native
    
    @js.native
    sealed trait property extends CFBEntryType
    /* 4 */ val property: typings.cfb.mod.CFBEntryType.property with Double = js.native
    
    @js.native
    sealed trait root extends CFBEntryType
    /* 5 */ val root: typings.cfb.mod.CFBEntryType.root with Double = js.native
    
    @js.native
    sealed trait storage extends CFBEntryType
    /* 1 */ val storage: typings.cfb.mod.CFBEntryType.storage with Double = js.native
    
    @js.native
    sealed trait stream extends CFBEntryType
    /* 2 */ val stream: typings.cfb.mod.CFBEntryType.stream with Double = js.native
    
    @js.native
    sealed trait unknown extends CFBEntryType
    /* 0 */ val unknown: typings.cfb.mod.CFBEntryType.unknown with Double = js.native
  }
  
  @js.native
  sealed trait CFBStorageType extends StObject
  @JSImport("cfb", "CFB$StorageType")
  @js.native
  object CFBStorageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CFBStorageType with Double] = js.native
    
    @js.native
    sealed trait fat extends CFBStorageType
    /* 0 */ val fat: typings.cfb.mod.CFBStorageType.fat with Double = js.native
    
    @js.native
    sealed trait minifat extends CFBStorageType
    /* 1 */ val minifat: typings.cfb.mod.CFBStorageType.minifat with Double = js.native
  }
  
  @JSImport("cfb", "find")
  @js.native
  def find(cfb: CFBContainer, path: String): CFBEntry | Null = js.native
  
  @JSImport("cfb", "parse")
  @js.native
  def parse(f: CFBBlob): CFBContainer = js.native
  @JSImport("cfb", "parse")
  @js.native
  def parse(f: CFBBlob, options: CFBParsingOptions): CFBContainer = js.native
  
  @JSImport("cfb", "read")
  @js.native
  def read(f: String): CFBContainer = js.native
  @JSImport("cfb", "read")
  @js.native
  def read(f: String, options: CFBParsingOptions): CFBContainer = js.native
  @JSImport("cfb", "read")
  @js.native
  def read(f: CFBBlob): CFBContainer = js.native
  @JSImport("cfb", "read")
  @js.native
  def read(f: CFBBlob, options: CFBParsingOptions): CFBContainer = js.native
  
  @JSImport("cfb", "utils")
  @js.native
  val utils: CFBUtils = js.native
  
  @JSImport("cfb", "version")
  @js.native
  val version: String = js.native
  
  @JSImport("cfb", "write")
  @js.native
  def write(cfb: CFBContainer): js.Any = js.native
  @JSImport("cfb", "write")
  @js.native
  def write(cfb: CFBContainer, options: CFBWritingOptions): js.Any = js.native
  
  @JSImport("cfb", "writeFile")
  @js.native
  def writeFile(cfb: CFBContainer, filename: String): js.Any = js.native
  @JSImport("cfb", "writeFile")
  @js.native
  def writeFile(cfb: CFBContainer, filename: String, options: CFBWritingOptions): js.Any = js.native
  
  @js.native
  trait CFBAddOpts extends StObject {
    
    /** Skip existence and safety checks (best for bulk write operations) */
    var unsafe: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait CFBCommonOptions extends StObject {
    
    /** If true, throw errors when features are not understood */
    var WTF: js.UndefOr[Boolean] = js.native
    
    /** Data encoding */
    var `type`: js.UndefOr[base64 | binary | buffer | file | array] = js.native
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
  
  @js.native
  trait CFBContainer extends StObject {
    
    /* Array of entries in the same order as FullPaths */
    var FileIndex: js.Array[CFBEntry] = js.native
    
    /* List of streams and storages */
    var FullPaths: js.Array[String] = js.native
    
    /* Raw Content, in chunks (Buffer when available, Array of bytes otherwise) */
    var raw: js.UndefOr[Header] = js.native
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
  
  @js.native
  trait CFBEntry extends StObject {
    
    /** Class ID represented as hex string */
    var clsid: String = js.native
    
    /** Red/Black Tree color: 0 = red, 1 = black */
    var color: Double = js.native
    
    /** Raw Content (Buffer when available, Array of bytes otherwise) */
    var content: CFBBlob = js.native
    
    /** Creation Time */
    var ct: js.UndefOr[Date] = js.native
    
    /** Content Type (used for MAD) */
    var ctype: js.UndefOr[String] = js.native
    
    /** Modification Time */
    var mt: js.UndefOr[Date] = js.native
    
    /** Case-sensitive internal name */
    var name: String = js.native
    
    /** Data Size */
    var size: Double = js.native
    
    /** Starting Sector */
    var start: Double = js.native
    
    /** User-Defined State Bits */
    var state: Double = js.native
    
    /** Storage location -- see CFB$StorageType */
    var storage: js.UndefOr[String] = js.native
    
    /** CFB type (salient types: stream, storage) -- see CFB$EntryType */
    var `type`: Double = js.native
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
  
  @js.native
  trait CFBParsingOptions extends CFBCommonOptions {
    
    /** If true, include raw data in output */
    var raw: js.UndefOr[Boolean] = js.native
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
    
    def bconcat(bufs: js.Array[_]): js.Any = js.native
    
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
  
  @js.native
  trait CFBWritingOptions extends CFBCommonOptions {
    
    /** Enable compression (ZIP only) */
    var compression: js.UndefOr[Boolean] = js.native
    
    /** Output file type */
    var fileType: js.UndefOr[typings.cfb.cfbStrings.cfb | zip | mad] = js.native
    
    /** Override default root entry name (CFB only) */
    var root: js.UndefOr[String] = js.native
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
