package typings.awsSdkUtilBase64Universal

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-base64-universal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromBase64(input: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(input.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  @scala.inline
  def toBase64(input: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
