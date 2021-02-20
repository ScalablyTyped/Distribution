package typings.cjsModuleLexer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cjs-module-lexer", "init")
  @js.native
  def init(): js.Promise[Unit] = js.native
  
  @JSImport("cjs-module-lexer", "parse")
  @js.native
  def parse(source: String): Exports = js.native
  @JSImport("cjs-module-lexer", "parse")
  @js.native
  def parse(source: String, name: String): Exports = js.native
  
  @js.native
  trait Exports extends StObject {
    
    var exports: js.Array[String] = js.native
    
    var reexports: js.Array[String] = js.native
  }
  object Exports {
    
    @scala.inline
    def apply(exports: js.Array[String], reexports: js.Array[String]): Exports = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], reexports = reexports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exports]
    }
    
    @scala.inline
    implicit class ExportsMutableBuilder[Self <: Exports] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExports(value: js.Array[String]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportsVarargs(value: String*): Self = StObject.set(x, "exports", js.Array(value :_*))
      
      @scala.inline
      def setReexports(value: js.Array[String]): Self = StObject.set(x, "reexports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReexportsVarargs(value: String*): Self = StObject.set(x, "reexports", js.Array(value :_*))
    }
  }
}
