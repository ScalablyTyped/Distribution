package typings.crc32Stream

import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("crc32-stream", "CRC32Stream")
  @js.native
  open class CRC32Stream () extends Transform {
    
    def digest(): Buffer = js.native
    def digest(encoding: BufferEncoding): String = js.native
    
    def hex(): String = js.native
    
    def size(): Double = js.native
  }
  
  @JSImport("crc32-stream", "DeflateCRC32Stream")
  @js.native
  open class DeflateCRC32Stream () extends Transform {
    
    def digest(): Buffer = js.native
    def digest(encoding: BufferEncoding): String = js.native
    
    def hex(): String = js.native
    
    def size(): Double = js.native
    def size(compressed: Boolean): Double = js.native
  }
}
