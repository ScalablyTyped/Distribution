package typings.browserfsH4gEcI12.zipFSDTsMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport(".browserfs-H4gEcI12/dist/node/backend/ZipFS.d.ts", "FileHeader")
@js.native
open class FileHeader protected () extends StObject {
  def this(data: Buffer) = this()
  
  def compressionMethod(): CompressionMethod = js.native
  
  def crc32(): Double = js.native
  
  /* private */ var data: Any = js.native
  
  def extraField(): Buffer = js.native
  
  def extraFieldLength(): Double = js.native
  
  def fileName(): String = js.native
  
  /**
    * These two values are COMPLETELY USELESS.
    *
    * Section 4.4.9:
    *   If bit 3 of the general purpose bit flag is set,
    *   these fields are set to zero in the local header and the
    *   correct values are put in the data descriptor and
    *   in the central directory.
    *
    * So we'll just use the central directory's values.
    */
  def fileNameLength(): Double = js.native
  
  def flags(): Double = js.native
  
  def lastModFileTime(): js.Date = js.native
  
  def rawLastModFileTime(): Double = js.native
  
  def totalSize(): Double = js.native
  
  def useUTF8(): Boolean = js.native
  
  def versionNeeded(): Double = js.native
}
