package typings.cjsModuleLexer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cjs-module-lexer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[js.Promise[Unit]]
  
  inline def parse(source: String): Exports = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[Exports]
  inline def parse(source: String, name: String): Exports = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Exports]
  
  trait Exports extends StObject {
    
    var exports: js.Array[String]
    
    var reexports: js.Array[String]
  }
  object Exports {
    
    inline def apply(exports: js.Array[String], reexports: js.Array[String]): Exports = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], reexports = reexports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exports]
    }
    
    extension [Self <: Exports](x: Self) {
      
      inline def setExports(value: js.Array[String]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setExportsVarargs(value: String*): Self = StObject.set(x, "exports", js.Array(value*))
      
      inline def setReexports(value: js.Array[String]): Self = StObject.set(x, "reexports", value.asInstanceOf[js.Any])
      
      inline def setReexportsVarargs(value: String*): Self = StObject.set(x, "reexports", js.Array(value*))
    }
  }
}
