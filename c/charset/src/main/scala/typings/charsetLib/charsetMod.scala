package typings
package charsetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("charset", JSImport.Namespace)
@js.native
object charsetMod extends js.Object {
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
  // tslint:disable-next-line strict-export-declare-modifiers
  def apply(obj: java.lang.String | nodeLib.httpMod.IncomingHttpHeaders | nodeLib.httpMod.IncomingMessage): java.lang.String | scala.Null = js.native
  def apply(
    obj: java.lang.String | nodeLib.httpMod.IncomingHttpHeaders | nodeLib.httpMod.IncomingMessage,
    data: nodeLib.Buffer
  ): java.lang.String | scala.Null = js.native
  def apply(
    obj: java.lang.String | nodeLib.httpMod.IncomingHttpHeaders | nodeLib.httpMod.IncomingMessage,
    data: nodeLib.Buffer,
    peekSize: scala.Double
  ): java.lang.String | scala.Null = js.native
}

