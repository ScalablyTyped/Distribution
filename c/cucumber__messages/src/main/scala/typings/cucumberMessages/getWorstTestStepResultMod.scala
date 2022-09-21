package typings.cucumberMessages

import typings.cucumberMessages.messagesMod.TestStepResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getWorstTestStepResultMod {
  
  @JSImport("@cucumber/messages/dist/cjs/src/getWorstTestStepResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWorstTestStepResult(testStepResults: js.Array[TestStepResult]): TestStepResult = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorstTestStepResult")(testStepResults.asInstanceOf[js.Any]).asInstanceOf[TestStepResult]
}
