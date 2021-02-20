package typings.babelPluginTester

import typings.babelPluginTester.mod.PluginTesterOptions
import typings.prettier.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pureMod {
  
  @JSImport("babel-plugin-tester/pure", JSImport.Default)
  @js.native
  def default(options: PluginTesterOptions): Unit = js.native
  
  @JSImport("babel-plugin-tester/pure", "prettierFormatter")
  @js.native
  def prettierFormatter(code: String, options: Options): String = js.native
  
  object unstringSnapshotSerializer {
    
    @JSImport("babel-plugin-tester/pure", "unstringSnapshotSerializer.print")
    @js.native
    def print(value: String): String = js.native
    
    @JSImport("babel-plugin-tester/pure", "unstringSnapshotSerializer.test")
    @js.native
    def test(value: js.Any): /* is string */ Boolean = js.native
  }
}
