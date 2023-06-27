package typings.codemirrorLegacyModes

import typings.codemirrorLanguage.mod.StreamParser
import typings.codemirrorLegacyModes.anon.AccessTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modeAsn1Mod {
  
  @JSImport("@codemirror/legacy-modes/mode/asn1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asn1(conf: AccessTypes): StreamParser[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("asn1")(conf.asInstanceOf[js.Any]).asInstanceOf[StreamParser[Any]]
}
