package typings.protobufjsEQaYEpP4.lightDTsMod

import typings.protobufjsEQaYEpP4.mod.ITokenizerHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenize {
  
  inline def apply(source: String, alternateCommentMode: Boolean): ITokenizerHandle = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], alternateCommentMode.asInstanceOf[js.Any])).asInstanceOf[ITokenizerHandle]
  
  @JSImport(".protobufjs-eQaYEpP4/light.d.ts", "tokenize")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Unescapes a string.
    * @param str String to unescape
    * @returns Unescaped string
    */
  inline def unescape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
