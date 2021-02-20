package typings.babelTemplate

import typings.babelTemplate.mod.TemplateBuilderOptions
import typings.babelTypes.mod.Statement
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(tpl: String): Statement | js.Array[Statement] = js.native
    def apply(tpl: String, opts: TemplateBuilderOptions): Statement | js.Array[Statement] = js.native
    def apply(tpl: TemplateStringsArray, args: js.Any*): Statement | js.Array[Statement] = js.native
  }
}
