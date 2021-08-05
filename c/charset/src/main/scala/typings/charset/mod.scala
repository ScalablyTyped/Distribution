package typings.charset

import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  inline def apply(obj: String): String | Null = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def apply(obj: String, data: Unit, peekSize: Double): String | Null = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], data.asInstanceOf[js.Any], peekSize.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(obj: String, data: Buffer): String | Null = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(obj: String, data: Buffer, peekSize: Double): String | Null = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], data.asInstanceOf[js.Any], peekSize.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(obj: IncomingHttpHeaders): String | Null = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def apply(obj: IncomingHttpHeaders, data: Unit, peekSize: Double): String | Null = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], data.asInstanceOf[js.Any], peekSize.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(obj: IncomingHttpHeaders, data: Buffer): String | Null = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(obj: IncomingHttpHeaders, data: Buffer, peekSize: Double): String | Null = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], data.asInstanceOf[js.Any], peekSize.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(obj: IncomingMessage): String | Null = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def apply(obj: IncomingMessage, data: Unit, peekSize: Double): String | Null = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], data.asInstanceOf[js.Any], peekSize.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(obj: IncomingMessage, data: Buffer): String | Null = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(obj: IncomingMessage, data: Buffer, peekSize: Double): String | Null = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], data.asInstanceOf[js.Any], peekSize.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @JSImport("charset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
