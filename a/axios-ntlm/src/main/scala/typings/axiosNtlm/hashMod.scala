package typings.axiosNtlm

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashMod {
  
  @JSImport("axios-ntlm/lib/hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLMHash(password: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createLMHash")(password.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createLMResponse(challenge: Any, lmhash: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createLMResponse")(challenge.asInstanceOf[js.Any], lmhash.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def createLMv2Response(type2message: Any, username: Any, ntlmhash: Any, nonce: Any, targetName: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createLMv2Response")(type2message.asInstanceOf[js.Any], username.asInstanceOf[js.Any], ntlmhash.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], targetName.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def createNTLMHash(password: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createNTLMHash")(password.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def createNTLMResponse(challenge: Any, ntlmhash: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createNTLMResponse")(challenge.asInstanceOf[js.Any], ntlmhash.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def createNTLMv2Response(type2message: Any, username: Any, ntlmhash: Any, nonce: Any, targetName: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createNTLMv2Response")(type2message.asInstanceOf[js.Any], username.asInstanceOf[js.Any], ntlmhash.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], targetName.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def createPseudoRandomValue(length: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createPseudoRandomValue")(length.asInstanceOf[js.Any]).asInstanceOf[String]
}
