package typings.businessRulesEngine.mod

import typings.businessRulesEngine.anon.Contains
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("business-rules-engine", "MessageLocalization")
@js.native
class MessageLocalization () extends StObject
/* static members */
object MessageLocalization {
  
  @JSImport("business-rules-engine", "MessageLocalization")
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetValidationMessage(validator: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetValidationMessage")(validator.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("business-rules-engine", "MessageLocalization.ValidationMessages")
  @js.native
  def ValidationMessages: Contains = js.native
  inline def ValidationMessages_=(x: Contains): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ValidationMessages")(x.asInstanceOf[js.Any])
  
  @JSImport("business-rules-engine", "MessageLocalization.customMsg")
  @js.native
  def customMsg: String = js.native
  inline def customMsg_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customMsg")(x.asInstanceOf[js.Any])
  
  @JSImport("business-rules-engine", "MessageLocalization.defaultMessages")
  @js.native
  def defaultMessages: Contains = js.native
  inline def defaultMessages_=(x: Contains): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMessages")(x.asInstanceOf[js.Any])
}
