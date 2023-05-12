package typings.babelPluginEmberTemplateCompilation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcScopeLocalsMod {
  
  @JSImport("babel-plugin-ember-template-compilation/src/scope-locals", "ScopeLocals")
  @js.native
  open class ScopeLocals () extends StObject {
    
    def add(key: String): Unit = js.native
    def add(key: String, value: String): Unit = js.native
    
    def entries(): js.Array[js.Tuple2[String, String]] = js.native
    
    def get(key: String): String = js.native
    
    def has(key: String): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def locals: js.Array[String] = js.native
    
    def needsRemapping(): Boolean = js.native
    
    /* private */ var `private`: Any = js.native
  }
}
