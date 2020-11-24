package typings.charset

import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("charset", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * guess data charset from req.headers, xml, html content-type meta tag
    *
    * headers:
    *
    *    'content-type': 'text/html;charset=gbk'
    *
    * meta tag:
    *
    *    <meta http-equiv="Content-Type" content="text/html; charset=xxxx"/>
    *
    * xml file:
    *
    *    <?xml version="1.0" encoding="UTF-8"?>
    *
    * @param obj `Content-Type` String, or `res.headers`, or `res` Object
    * @param data content buffer
    * @param peekSize max content peek size, default is 512
    * @return charset, lower case, e.g.: utf8, gbk, gb2312, .... If can\'t guess, return null
    */
  def apply(obj: String): String | Null = js.native
  def apply(obj: String, data: js.UndefOr[scala.Nothing], peekSize: Double): String | Null = js.native
  def apply(obj: String, data: Buffer): String | Null = js.native
  def apply(obj: String, data: Buffer, peekSize: Double): String | Null = js.native
  def apply(obj: IncomingHttpHeaders): String | Null = js.native
  def apply(obj: IncomingHttpHeaders, data: js.UndefOr[scala.Nothing], peekSize: Double): String | Null = js.native
  def apply(obj: IncomingHttpHeaders, data: Buffer): String | Null = js.native
  def apply(obj: IncomingHttpHeaders, data: Buffer, peekSize: Double): String | Null = js.native
  def apply(obj: IncomingMessage): String | Null = js.native
  def apply(obj: IncomingMessage, data: js.UndefOr[scala.Nothing], peekSize: Double): String | Null = js.native
  def apply(obj: IncomingMessage, data: Buffer): String | Null = js.native
  def apply(obj: IncomingMessage, data: Buffer, peekSize: Double): String | Null = js.native
}
