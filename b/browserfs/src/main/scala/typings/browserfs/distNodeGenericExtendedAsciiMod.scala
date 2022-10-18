package typings.browserfs

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeGenericExtendedAsciiMod {
  
  @JSImport("browserfs/dist/node/generic/extended_ascii", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ExtendedASCII
  /* static members */
  object default {
    
    @JSImport("browserfs/dist/node/generic/extended_ascii", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def byte2str(buff: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("byte2str")(buff.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def byteLength(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("browserfs/dist/node/generic/extended_ascii", "default.extendedChars")
    @js.native
    def extendedChars: Any = js.native
    inline def extendedChars_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extendedChars")(x.asInstanceOf[js.Any])
    
    inline def str2byte(str: String, buf: Buffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("str2byte")(str.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  trait ExtendedASCII extends StObject
}
