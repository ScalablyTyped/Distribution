package typings.browserfs

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendedAsciiMod {
  
  @JSImport("browserfs/dist/node/generic/extended_ascii", JSImport.Default)
  @js.native
  class default () extends ExtendedASCII
  /* static members */
  object default {
    
    @JSImport("browserfs/dist/node/generic/extended_ascii", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("browserfs/dist/node/generic/extended_ascii", "default.byte2str")
    @js.native
    def byte2str(buff: Buffer): String = js.native
    
    @JSImport("browserfs/dist/node/generic/extended_ascii", "default.byteLength")
    @js.native
    def byteLength(str: String): Double = js.native
    
    @JSImport("browserfs/dist/node/generic/extended_ascii", "default.extendedChars")
    @js.native
    def extendedChars: js.Any = js.native
    @scala.inline
    def extendedChars_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extendedChars")(x.asInstanceOf[js.Any])
    
    @JSImport("browserfs/dist/node/generic/extended_ascii", "default.str2byte")
    @js.native
    def str2byte(str: String, buf: Buffer): Double = js.native
  }
  
  @js.native
  trait ExtendedASCII extends StObject
}
