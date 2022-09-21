package typings.concatWithSourcemaps

import typings.node.bufferMod.global.Buffer
import typings.sourceMap.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("concat-with-sourcemaps", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Concat {
    def this(generateSourceMap: Boolean, fileName: String) = this()
    def this(generateSourceMap: Boolean, fileName: String, separator: String) = this()
  }
  
  @js.native
  trait Concat extends StObject {
    
    def add(filePath: String, content: String): Unit = js.native
    def add(filePath: String, content: String, sourceMap: String): Unit = js.native
    def add(filePath: String, content: String, sourceMap: RawSourceMap): Unit = js.native
    def add(filePath: String, content: Buffer): Unit = js.native
    def add(filePath: String, content: Buffer, sourceMap: String): Unit = js.native
    def add(filePath: String, content: Buffer, sourceMap: RawSourceMap): Unit = js.native
    def add(filePath: Null, content: String): Unit = js.native
    def add(filePath: Null, content: String, sourceMap: String): Unit = js.native
    def add(filePath: Null, content: String, sourceMap: RawSourceMap): Unit = js.native
    def add(filePath: Null, content: Buffer): Unit = js.native
    def add(filePath: Null, content: Buffer, sourceMap: String): Unit = js.native
    def add(filePath: Null, content: Buffer, sourceMap: RawSourceMap): Unit = js.native
    
    val content: Buffer = js.native
    
    val sourceMap: js.UndefOr[String] = js.native
  }
}
