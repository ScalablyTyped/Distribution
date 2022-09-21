package typings.cucumberMessages

import typings.cucumberMessages.messagesMod.Envelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseEnvelopeMod {
  
  @JSImport("@cucumber/messages/dist/cjs/src/parseEnvelope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseEnvelope(json: String): Envelope = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEnvelope")(json.asInstanceOf[js.Any]).asInstanceOf[Envelope]
}
