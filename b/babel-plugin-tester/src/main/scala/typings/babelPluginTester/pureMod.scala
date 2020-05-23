package typings.babelPluginTester

import typings.babelPluginTester.mod.PluginTesterOptions
import typings.prettier.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-plugin-tester/pure", JSImport.Namespace)
@js.native
object pureMod extends js.Object {
  def default(options: PluginTesterOptions): Unit = js.native
  def prettierFormatter(code: String, options: Options): String = js.native
  @js.native
  object unstringSnapshotSerializer extends js.Object {
    def print(value: String): String = js.native
    def test(value: js.Any): /* is string */ Boolean = js.native
  }
  
}

