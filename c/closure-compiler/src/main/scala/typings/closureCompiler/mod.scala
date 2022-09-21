package typings.closureCompiler

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("closure-compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(src: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(src.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compile(src: String, options: StringDictionary[String | js.Array[String]], callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Callback = js.Function3[/* err */ js.Error, /* stdout */ String, /* stderr */ String, Any]
}
