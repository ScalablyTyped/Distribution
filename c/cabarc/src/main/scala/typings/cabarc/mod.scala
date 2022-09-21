package typings.cabarc

import typings.cabarc.cabarcNumbers.`8`
import typings.cabarc.mod.Cabinet.COMPRESSION
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cabarc", "Archive")
  @js.native
  open class Archive () extends StObject {
    
    def close(callback: Callback[Unit]): Unit = js.native
    
    def createReadStream(filename: Any, options: Any): scala.Nothing = js.native
    
    var fd: Double = js.native
    
    var files: js.Array[CFFile] = js.native
    
    var flags: String = js.native
    
    var folders: js.Array[CFFolder] = js.native
    
    var header: Header = js.native
    
    var mode: Double = js.native
    
    def open(fileName: String, callback: Callback[Unit]): Archive = js.native
    
    var path: String = js.native
    
    def readFile(fileName: String, callback: Callback[Buffer]): Unit = js.native
    
    def readFileList(callback: Callback[js.Array[CFFile]]): Unit = js.native
    
    def readFolder(folderIndex: Double, callback: Callback[CFFolder]): Unit = js.native
    
    def readHeader(callback: Callback[Header]): Unit = js.native
  }
  
  @JSImport("cabarc", "CFFile")
  @js.native
  open class CFFile () extends StObject {
    
    var arch: Double = js.native
    
    var attributes: Double = js.native
    
    var date: Double = js.native
    
    def encodingLength(): Double = js.native
    
    var exec: Double = js.native
    
    var flags: Double = js.native
    
    var folderIndex: Double = js.native
    
    def getFlag(mask: Double): Double = js.native
    
    var hidden: Double = js.native
    
    var name: String = js.native
    
    var nameLength: Double = js.native
    
    var offset: Double = js.native
    
    def parse(buffer: Buffer): CFFile = js.native
    def parse(buffer: Buffer, offset: Double): CFFile = js.native
    
    var readOnly: Double = js.native
    
    def setFlag(mask: Double, value: Double): Double = js.native
    
    var size: Double = js.native
    
    var system: Double = js.native
    
    var time: Double = js.native
    
    var utfName: Double = js.native
    
    def write(): scala.Nothing = js.native
    def write(buffer: Unit, offset: Double): scala.Nothing = js.native
    def write(buffer: Buffer): scala.Nothing = js.native
    def write(buffer: Buffer, offset: Double): scala.Nothing = js.native
  }
  /* static members */
  object CFFile {
    
    @JSImport("cabarc", "CFFile")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cabarc", "CFFile.ARCH")
    @js.native
    val ARCH: /* 0x20 */ Double = js.native
    
    @JSImport("cabarc", "CFFile.EXEC")
    @js.native
    val EXEC: /* 0x40 */ Double = js.native
    
    @JSImport("cabarc", "CFFile.HIDDEN")
    @js.native
    val HIDDEN: /* 0x02 */ Double = js.native
    
    @JSImport("cabarc", "CFFile.INDEX_CONTINUED_FROM_PREV")
    @js.native
    val INDEX_CONTINUED_FROM_PREV: /* 0xFFFD */ Double = js.native
    
    @JSImport("cabarc", "CFFile.INDEX_CONTINUED_PREV_AND_NEXT")
    @js.native
    val INDEX_CONTINUED_PREV_AND_NEXT: /* 0xFFFF */ Double = js.native
    
    @JSImport("cabarc", "CFFile.INDEX_CONTINUED_TO_NEXT")
    @js.native
    val INDEX_CONTINUED_TO_NEXT: /* 0xFFFE */ Double = js.native
    
    @JSImport("cabarc", "CFFile.MAX_SIZE")
    @js.native
    val MAX_SIZE: Double = js.native
    
    @JSImport("cabarc", "CFFile.RDONLY")
    @js.native
    val RDONLY: /* 0x01 */ Double = js.native
    
    @JSImport("cabarc", "CFFile.SIZE")
    @js.native
    val SIZE: /* 16 */ Double = js.native
    
    @JSImport("cabarc", "CFFile.SYSTEM")
    @js.native
    val SYSTEM: /* 0x04 */ Double = js.native
    
    @JSImport("cabarc", "CFFile.UNICODE")
    @js.native
    val UNICODE: /* 0x80 */ Double = js.native
    
    inline def parse(buffer: Buffer): CFFile = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buffer.asInstanceOf[js.Any]).asInstanceOf[CFFile]
    inline def parse(buffer: Buffer, offset: Double): CFFile = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[CFFile]
  }
  
  @JSImport("cabarc", "CFFolder")
  @js.native
  open class CFFolder () extends StObject {
    
    var appData: Any = js.native
    
    var blockCount: Double = js.native
    
    var compressionType: COMPRESSION = js.native
    
    var dataOffset: Double = js.native
    
    def parse(buffer: Buffer): CFFolder = js.native
    def parse(buffer: Buffer, offset: Double): CFFolder = js.native
    
    var reserved: Buffer = js.native
    
    def write(): scala.Nothing = js.native
    def write(buffer: Unit, offset: Double): scala.Nothing = js.native
    def write(buffer: Buffer): scala.Nothing = js.native
    def write(buffer: Buffer, offset: Double): scala.Nothing = js.native
  }
  /* static members */
  object CFFolder {
    
    @JSImport("cabarc", "CFFolder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cabarc", "CFFolder.SIZE")
    @js.native
    val SIZE: `8` = js.native
    
    inline def parse(buffer: Buffer): CFFolder = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buffer.asInstanceOf[js.Any]).asInstanceOf[CFFolder]
    inline def parse(buffer: Buffer, offset: Double): CFFolder = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[CFFolder]
  }
  
  object Cabinet {
    
    @js.native
    sealed trait COMPRESSION extends StObject
    @JSImport("cabarc", "Cabinet.COMPRESSION")
    @js.native
    object COMPRESSION extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[COMPRESSION & Double] = js.native
      
      @js.native
      sealed trait LZX
        extends StObject
           with COMPRESSION
      /* 0x0300 */ val LZX: typings.cabarc.mod.Cabinet.COMPRESSION.LZX & Double = js.native
      
      @js.native
      sealed trait MSZIP
        extends StObject
           with COMPRESSION
      /* 0x0100 */ val MSZIP: typings.cabarc.mod.Cabinet.COMPRESSION.MSZIP & Double = js.native
      
      @js.native
      sealed trait NONE
        extends StObject
           with COMPRESSION
      /* 0x0000 */ val NONE: typings.cabarc.mod.Cabinet.COMPRESSION.NONE & Double = js.native
      
      @js.native
      sealed trait QUANTUM
        extends StObject
           with COMPRESSION
      /* 0x0200 */ val QUANTUM: typings.cabarc.mod.Cabinet.COMPRESSION.QUANTUM & Double = js.native
    }
    
    @JSImport("cabarc", "Cabinet.MSZIP_SIGNATURE")
    @js.native
    val MSZIP_SIGNATURE: /* 0x4B43 */ Double = js.native
    
    @JSImport("cabarc", "Cabinet.SIGNATURE")
    @js.native
    val SIGNATURE: /* 0x4643534D */ Double = js.native
  }
  
  @JSImport("cabarc", "Header")
  @js.native
  open class Header () extends StObject {
    
    var archiveSize: Double = js.native
    
    var blockData: Double = js.native
    
    var byteLength: Double = js.native
    
    var data: Buffer = js.native
    
    def encodingLength(): Double = js.native
    
    var fileCount: Double = js.native
    
    var fileOffset: Double = js.native
    
    var flags: Double = js.native
    
    var folderCount: Double = js.native
    
    var folderData: Double = js.native
    
    var headerData: Double = js.native
    
    var next: String = js.native
    
    var nextDisk: String = js.native
    
    var number: Double = js.native
    
    def parse(buffer: Buffer): Header = js.native
    def parse(buffer: Buffer, offset: Double): Header = js.native
    
    var previous: String = js.native
    
    var previousDisk: String = js.native
    
    var reserved1: Double = js.native
    
    var reserved2: Double = js.native
    
    var reserved3: Double = js.native
    
    var setId: Double = js.native
    
    val signature: /* 0x4643534D */ Double = js.native
    
    var versionMajor: Double = js.native
    
    var versionMinor: Double = js.native
    
    def write(): Buffer = js.native
    def write(buffer: Unit, offset: Double): Buffer = js.native
    def write(buffer: Buffer): Buffer = js.native
    def write(buffer: Buffer, offset: Double): Buffer = js.native
  }
  /* static members */
  object Header {
    
    @JSImport("cabarc", "Header")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cabarc", "Header.MAX_SIZE")
    @js.native
    val MAX_SIZE: Double = js.native
    
    @JSImport("cabarc", "Header.NEXT_CABINET")
    @js.native
    val NEXT_CABINET: /* 0x0002 */ Double = js.native
    
    @JSImport("cabarc", "Header.PREV_CABINET")
    @js.native
    val PREV_CABINET: /* 0x0001 */ Double = js.native
    
    @JSImport("cabarc", "Header.RESERVE_PRESENT")
    @js.native
    val RESERVE_PRESENT: /* 0x0004 */ Double = js.native
    
    inline def parse(buffer: Buffer): Header = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buffer.asInstanceOf[js.Any]).asInstanceOf[Header]
    inline def parse(buffer: Buffer, offset: Double): Header = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Header]
    
    @JSImport("cabarc", "Header.size")
    @js.native
    val size: /* 36 */ Double = js.native
  }
  
  type Callback[Result] = js.Function2[/* error */ Any, /* result */ Result, Unit]
}
