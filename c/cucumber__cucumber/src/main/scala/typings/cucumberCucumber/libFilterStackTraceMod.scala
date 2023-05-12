package typings.cucumberCucumber

import typings.errorStackParser.mod.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFilterStackTraceMod {
  
  @JSImport("@cucumber/cucumber/lib/filter_stack_trace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterStackTrace(frames: js.Array[StackFrame]): js.Array[StackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterStackTrace")(frames.asInstanceOf[js.Any]).asInstanceOf[js.Array[StackFrame]]
  
  inline def isFileNameInCucumber(fileName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileNameInCucumber")(fileName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
