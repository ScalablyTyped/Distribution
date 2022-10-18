package typings.cssGenerator

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("css-generator", "Generator")
  @js.native
  open class Generator () extends StObject {
    
    def addRaw(input: String): Unit = js.native
    
    def addRule(selectors: String, declarationList: Record[String, String]): Unit = js.native
    def addRule(selectors: js.Array[String], declarationList: Record[String, String]): Unit = js.native
    
    def closeBlock(): Unit = js.native
    
    def closeBlocks(): Unit = js.native
    
    def getOutput(): String = js.native
    
    def openBlock(`type`: String): Unit = js.native
    def openBlock(`type`: String, props: String): Unit = js.native
  }
  
  inline def create(): Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Generator]
  inline def create(options: Options): Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Generator]
  
  trait Options extends StObject {
    
    var indentation: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIndentation(value: String): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
      
      inline def setIndentationUndefined: Self = StObject.set(x, "indentation", js.undefined)
    }
  }
}
