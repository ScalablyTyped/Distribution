package typings.axiosNtlm

import typings.axiosNtlm.anon.Challenge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ntlmMod {
  
  @JSImport("axios-ntlm/lib/ntlm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createType1Message(workstation: Any, target: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createType1Message")(workstation.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createType3Message(type2Message: Any, username: Any, password: Any, workstation: Any, target: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createType3Message")(type2Message.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], workstation.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodeType2Message(str: Any): Challenge = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeType2Message")(str.asInstanceOf[js.Any]).asInstanceOf[Challenge]
}
