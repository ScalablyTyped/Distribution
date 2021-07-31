package typings.awsSdkUtilUtf8Browser

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pureJsMod {
  
  @JSImport("@aws-sdk/util-utf8-browser/dist/cjs/pureJs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromUtf8(input: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUtf8")(input.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  @scala.inline
  def toUtf8(input: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
