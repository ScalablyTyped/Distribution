package typings.broFs

import typings.broFs.anon.Create
import typings.broFs.anon.Deep
import typings.broFs.anon.Type
import typings.broFs.anon.`0`
import typings.broFs.anon.`1`
import typings.broFs.anon.`2`
import typings.filesystem.DirectoryEntry
import typings.filesystem.FileEntry
import typings.filesystem.FileSystem
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Date
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bro-fs", "appendFile")
  @js.native
  def appendFile(path: String, data: String): js.Promise[FileSystem] = js.native
  @JSImport("bro-fs", "appendFile")
  @js.native
  def appendFile(path: String, data: ArrayBuffer): js.Promise[FileSystem] = js.native
  @JSImport("bro-fs", "appendFile")
  @js.native
  def appendFile(path: String, data: Blob): js.Promise[FileSystem] = js.native
  @JSImport("bro-fs", "appendFile")
  @js.native
  def appendFile(path: String, data: File): js.Promise[FileSystem] = js.native
  @JSImport("bro-fs", "appendFile")
  @js.native
  def appendFile(path: FileEntry, data: String): js.Promise[FileSystem] = js.native
  @JSImport("bro-fs", "appendFile")
  @js.native
  def appendFile(path: FileEntry, data: ArrayBuffer): js.Promise[FileSystem] = js.native
  @JSImport("bro-fs", "appendFile")
  @js.native
  def appendFile(path: FileEntry, data: Blob): js.Promise[FileSystem] = js.native
  @JSImport("bro-fs", "appendFile")
  @js.native
  def appendFile(path: FileEntry, data: File): js.Promise[FileSystem] = js.native
  
  @JSImport("bro-fs", "clear")
  @js.native
  def clear(): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
  
  @JSImport("bro-fs", "copy")
  @js.native
  def copy(oldPath: String, newPath: String): js.Promise[FileEntry] = js.native
  @JSImport("bro-fs", "copy")
  @js.native
  def copy(oldPath: String, newPath: String, options: Create): js.Promise[FileEntry] = js.native
  @JSImport("bro-fs", "copy")
  @js.native
  def copy(oldPath: FileEntry, newPath: String): js.Promise[FileEntry] = js.native
  @JSImport("bro-fs", "copy")
  @js.native
  def copy(oldPath: FileEntry, newPath: String, options: Create): js.Promise[FileEntry] = js.native
  
  @JSImport("bro-fs", "exists")
  @js.native
  def exists(path: String): js.Promise[Boolean] = js.native
  
  @JSImport("bro-fs", "getEntry")
  @js.native
  def getEntry(path: FileEntry): js.Promise[FileEntry] = js.native
  
  @JSImport("bro-fs", "getRoot")
  @js.native
  def getRoot(): js.Promise[DirectoryEntry] = js.native
  
  @JSImport("bro-fs", "getUrl")
  @js.native
  def getUrl(path: String): js.Promise[String] = js.native
  @JSImport("bro-fs", "getUrl")
  @js.native
  def getUrl(path: FileEntry): js.Promise[String] = js.native
  
  @JSImport("bro-fs", "init")
  @js.native
  def init(): js.Promise[FileSystem] = js.native
  @JSImport("bro-fs", "init")
  @js.native
  def init(options: FSOptions): js.Promise[FileSystem] = js.native
  
  @JSImport("bro-fs", "isSupported")
  @js.native
  def isSupported(): Boolean = js.native
  
  @JSImport("bro-fs", "mkdir")
  @js.native
  def mkdir(path: String): js.Promise[DirectoryEntry] = js.native
  
  @JSImport("bro-fs", "readFile")
  @js.native
  def readFile(path: String): js.Promise[String] = js.native
  @JSImport("bro-fs", "readFile")
  @js.native
  def readFile(path: String, options: Type): js.Promise[ArrayBuffer] = js.native
  @JSImport("bro-fs", "readFile")
  @js.native
  def readFile(path: String, options: `0`): js.Promise[Blob] = js.native
  @JSImport("bro-fs", "readFile")
  @js.native
  def readFile(path: String, options: `1`): js.Promise[File] = js.native
  @JSImport("bro-fs", "readFile")
  @js.native
  def readFile(path: String, options: `2`): js.Promise[String] = js.native
  @JSImport("bro-fs", "readFile")
  @js.native
  def readFile(path: FileEntry): js.Promise[String] = js.native
  @JSImport("bro-fs", "readFile")
  @js.native
  def readFile(path: FileEntry, options: Type): js.Promise[ArrayBuffer] = js.native
  @JSImport("bro-fs", "readFile")
  @js.native
  def readFile(path: FileEntry, options: `0`): js.Promise[Blob] = js.native
  @JSImport("bro-fs", "readFile")
  @js.native
  def readFile(path: FileEntry, options: `1`): js.Promise[File] = js.native
  @JSImport("bro-fs", "readFile")
  @js.native
  def readFile(path: FileEntry, options: `2`): js.Promise[String] = js.native
  
  @JSImport("bro-fs", "readdir")
  @js.native
  def readdir(path: String): js.Promise[js.Array[FileEntry]] = js.native
  @JSImport("bro-fs", "readdir")
  @js.native
  def readdir(path: String, options: Deep): js.Promise[js.Array[FileEntry]] = js.native
  @JSImport("bro-fs", "readdir")
  @js.native
  def readdir(path: DirectoryEntry): js.Promise[js.Array[FileEntry]] = js.native
  @JSImport("bro-fs", "readdir")
  @js.native
  def readdir(path: DirectoryEntry, options: Deep): js.Promise[js.Array[FileEntry]] = js.native
  
  @JSImport("bro-fs", "rename")
  @js.native
  def rename(oldPath: String, newPath: String): js.Promise[FileEntry] = js.native
  @JSImport("bro-fs", "rename")
  @js.native
  def rename(oldPath: String, newPath: String, options: Create): js.Promise[FileEntry] = js.native
  @JSImport("bro-fs", "rename")
  @js.native
  def rename(oldPath: FileEntry, newPath: String): js.Promise[FileEntry] = js.native
  @JSImport("bro-fs", "rename")
  @js.native
  def rename(oldPath: FileEntry, newPath: String, options: Create): js.Promise[FileEntry] = js.native
  
  @JSImport("bro-fs", "rmdir")
  @js.native
  def rmdir(path: String): js.Promise[Boolean] = js.native
  @JSImport("bro-fs", "rmdir")
  @js.native
  def rmdir(path: DirectoryEntry): js.Promise[Boolean] = js.native
  
  @JSImport("bro-fs", "stat")
  @js.native
  def stat(path: String): js.Promise[StatObject] = js.native
  @JSImport("bro-fs", "stat")
  @js.native
  def stat(path: FileEntry): js.Promise[StatObject] = js.native
  
  @JSImport("bro-fs", "unlink")
  @js.native
  def unlink(path: String): js.Promise[Boolean] = js.native
  @JSImport("bro-fs", "unlink")
  @js.native
  def unlink(path: FileEntry): js.Promise[Boolean] = js.native
  
  @JSImport("bro-fs", "usage")
  @js.native
  def usage(): js.Promise[UsageObject] = js.native
  
  @JSImport("bro-fs", "writeFile")
  @js.native
  def writeFile(path: String, data: String): js.Promise[FileEntry] = js.native
  @JSImport("bro-fs", "writeFile")
  @js.native
  def writeFile(path: String, data: ArrayBuffer): js.Promise[FileEntry] = js.native
  @JSImport("bro-fs", "writeFile")
  @js.native
  def writeFile(path: String, data: Blob): js.Promise[FileEntry] = js.native
  @JSImport("bro-fs", "writeFile")
  @js.native
  def writeFile(path: String, data: File): js.Promise[FileEntry] = js.native
  
  @js.native
  trait FSOptions extends StObject {
    
    var bytes: js.UndefOr[Double] = js.native
    
    /**
      * show request quota popup for PERSISTENT type
      * (for Chrome extensions with `unlimitedStorage` permission it is useful to pass `options.requestQuota = false`)
      */
    var requestQuota: js.UndefOr[Boolean] = js.native
    
    /** `window.PERSISTENT` | `window.TEMPORARY` */
    var `type`: js.UndefOr[Double] = js.native
  }
  object FSOptions {
    
    @scala.inline
    def apply(): FSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FSOptions]
    }
    
    @scala.inline
    implicit class FSOptionsMutableBuilder[Self <: FSOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
      
      @scala.inline
      def setRequestQuota(value: Boolean): Self = StObject.set(x, "requestQuota", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestQuotaUndefined: Self = StObject.set(x, "requestQuota", js.undefined)
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait StatObject extends StObject {
    
    var fullPath: String = js.native
    
    var isDirectory: Boolean = js.native
    
    var isFile: Boolean = js.native
    
    var modificationTime: Date = js.native
    
    var name: String = js.native
    
    var size: Double = js.native
  }
  object StatObject {
    
    @scala.inline
    def apply(
      fullPath: String,
      isDirectory: Boolean,
      isFile: Boolean,
      modificationTime: Date,
      name: String,
      size: Double
    ): StatObject = {
      val __obj = js.Dynamic.literal(fullPath = fullPath.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatObject]
    }
    
    @scala.inline
    implicit class StatObjectMutableBuilder[Self <: StatObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModificationTime(value: Date): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.broFs.broFsStrings.Text
    - typings.broFs.broFsStrings.BinaryString
    - typings.broFs.broFsStrings.DataURL
  */
  trait TextType extends StObject
  object TextType {
    
    @scala.inline
    def BinaryString: typings.broFs.broFsStrings.BinaryString = "BinaryString".asInstanceOf[typings.broFs.broFsStrings.BinaryString]
    
    @scala.inline
    def DataURL: typings.broFs.broFsStrings.DataURL = "DataURL".asInstanceOf[typings.broFs.broFsStrings.DataURL]
    
    @scala.inline
    def Text: typings.broFs.broFsStrings.Text = "Text".asInstanceOf[typings.broFs.broFsStrings.Text]
  }
  
  @js.native
  trait UsageObject extends StObject {
    
    var grantedBytes: Double = js.native
    
    var usedBytes: Double = js.native
  }
  object UsageObject {
    
    @scala.inline
    def apply(grantedBytes: Double, usedBytes: Double): UsageObject = {
      val __obj = js.Dynamic.literal(grantedBytes = grantedBytes.asInstanceOf[js.Any], usedBytes = usedBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsageObject]
    }
    
    @scala.inline
    implicit class UsageObjectMutableBuilder[Self <: UsageObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrantedBytes(value: Double): Self = StObject.set(x, "grantedBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsedBytes(value: Double): Self = StObject.set(x, "usedBytes", value.asInstanceOf[js.Any])
    }
  }
}
