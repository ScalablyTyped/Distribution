package typings.babelPluginTester

import typings.babelPluginTester.anon.Config
import typings.babelPluginTester.mod.PluginTesterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pureMod {
  
  @JSImport("babel-plugin-tester/pure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: PluginTesterOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def prettierFormatter(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prettierFormatter")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def prettierFormatter(code: String, options: Config): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prettierFormatter")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object unstringSnapshotSerializer {
    
    @JSImport("babel-plugin-tester/pure", "unstringSnapshotSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def print(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def test(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  }
}
