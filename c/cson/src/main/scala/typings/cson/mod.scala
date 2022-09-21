package typings.cson

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cson", JSImport.Namespace)
  @js.native
  val ^ : CSON = js.native
  
  @js.native
  trait CSON extends StObject {
    
    def createCSONString(data: Any): String = js.native
    def createCSONString(data: Any, opts: js.Object): String = js.native
    def createCSONString(data: Any, opts: js.Object, next: Any): String = js.native
    def createCSONString(data: Any, opts: Unit, next: Any): String = js.native
    
    def createJSONString(data: Any): String = js.native
    def createJSONString(data: Any, opts: js.Object): String = js.native
    def createJSONString(data: Any, opts: js.Object, next: Any): String = js.native
    def createJSONString(data: Any, opts: Unit, next: Any): String = js.native
    
    def createString(data: Any): String = js.native
    def createString(data: Any, opts: js.Object): String = js.native
    def createString(data: Any, opts: js.Object, next: Any): String = js.native
    def createString(data: Any, opts: Unit, next: Any): String = js.native
    
    // Parse Files
    def load(filePath: String): Any = js.native
    def load(filePath: String, opts: js.Object): Any = js.native
    def load(filePath: String, opts: js.Object, next: Any): Any = js.native
    def load(filePath: String, opts: Unit, next: Any): Any = js.native
    
    // Parse Strings
    def parse(data: String): Any = js.native
    def parse(data: String, opts: js.Object): Any = js.native
    def parse(data: String, opts: js.Object, next: Any): Any = js.native
    def parse(data: String, opts: Unit, next: Any): Any = js.native
    
    def parseCSFile(filePath: String): Any = js.native
    def parseCSFile(filePath: String, opts: js.Object): Any = js.native
    def parseCSFile(filePath: String, opts: js.Object, next: Any): Any = js.native
    def parseCSFile(filePath: String, opts: Unit, next: Any): Any = js.native
    
    def parseCSONFile(filePath: String): Any = js.native
    def parseCSONFile(filePath: String, opts: js.Object): Any = js.native
    def parseCSONFile(filePath: String, opts: js.Object, next: Any): Any = js.native
    def parseCSONFile(filePath: String, opts: Unit, next: Any): Any = js.native
    
    def parseCSONString(data: String): Any = js.native
    def parseCSONString(data: String, opts: js.Object): Any = js.native
    def parseCSONString(data: String, opts: js.Object, next: Any): Any = js.native
    def parseCSONString(data: String, opts: Unit, next: Any): Any = js.native
    
    def parseCSString(data: String): Any = js.native
    def parseCSString(data: String, opts: js.Object): Any = js.native
    def parseCSString(data: String, opts: js.Object, next: Any): Any = js.native
    def parseCSString(data: String, opts: Unit, next: Any): Any = js.native
    
    def parseJSFile(filePath: String): Any = js.native
    def parseJSFile(filePath: String, opts: js.Object): Any = js.native
    def parseJSFile(filePath: String, opts: js.Object, next: Any): Any = js.native
    def parseJSFile(filePath: String, opts: Unit, next: Any): Any = js.native
    
    def parseJSONFile(filePath: String): Any = js.native
    def parseJSONFile(filePath: String, opts: js.Object): Any = js.native
    def parseJSONFile(filePath: String, opts: js.Object, next: Any): Any = js.native
    def parseJSONFile(filePath: String, opts: Unit, next: Any): Any = js.native
    
    def parseJSONString(data: String): Any = js.native
    def parseJSONString(data: String, opts: js.Object): Any = js.native
    def parseJSONString(data: String, opts: js.Object, next: Any): Any = js.native
    def parseJSONString(data: String, opts: Unit, next: Any): Any = js.native
    
    def parseJSString(data: String): Any = js.native
    def parseJSString(data: String, opts: js.Object): Any = js.native
    def parseJSString(data: String, opts: js.Object, next: Any): Any = js.native
    def parseJSString(data: String, opts: Unit, next: Any): Any = js.native
    
    def parseString(data: String): Any = js.native
    def parseString(data: String, opts: js.Object): Any = js.native
    def parseString(data: String, opts: js.Object, next: Any): Any = js.native
    def parseString(data: String, opts: Unit, next: Any): Any = js.native
    
    // Require Files
    def requireCSFile(filePath: String): Any = js.native
    def requireCSFile(filePath: String, opts: js.Object): Any = js.native
    def requireCSFile(filePath: String, opts: js.Object, next: Any): Any = js.native
    def requireCSFile(filePath: String, opts: Unit, next: Any): Any = js.native
    
    def requireFile(filePath: String): Any = js.native
    def requireFile(filePath: String, opts: js.Object): Any = js.native
    def requireFile(filePath: String, opts: js.Object, next: Any): Any = js.native
    def requireFile(filePath: String, opts: Unit, next: Any): Any = js.native
    
    def requireJSFile(filePath: String): Any = js.native
    def requireJSFile(filePath: String, opts: js.Object): Any = js.native
    def requireJSFile(filePath: String, opts: js.Object, next: Any): Any = js.native
    def requireJSFile(filePath: String, opts: Unit, next: Any): Any = js.native
    
    // Create Strings
    def stringify(data: Any): String = js.native
    def stringify(data: Any, opts: js.Object): String = js.native
    def stringify(data: Any, opts: js.Object, indent: Any): String = js.native
    def stringify(data: Any, opts: Unit, indent: Any): String = js.native
  }
  
  type _To = CSON
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CSON = ^
}
