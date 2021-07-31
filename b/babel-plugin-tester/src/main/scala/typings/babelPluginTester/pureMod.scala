package typings.babelPluginTester

import typings.babelPluginTester.mod.PluginTesterOptions
import typings.prettier.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pureMod {
  
  @JSImport("babel-plugin-tester/pure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(options: PluginTesterOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def prettierFormatter(code: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prettierFormatter")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object unstringSnapshotSerializer {
    
    @JSImport("babel-plugin-tester/pure", "unstringSnapshotSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def print(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def test(value: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  }
}
