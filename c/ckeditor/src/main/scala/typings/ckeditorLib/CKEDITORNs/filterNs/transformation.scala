package typings
package ckeditorLib.CKEDITORNs.filterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait transformation extends js.Object {
  var check: js.UndefOr[java.lang.String] = js.native
  var element: js.UndefOr[java.lang.String | ckeditorLib.CKEDITORNs.style] = js.native
  var left: js.UndefOr[
    js.Function1[
      /* element */ ckeditorLib.CKEDITORNs.htmlParserNs.element | ckeditorLib.CKEDITORNs.style, 
      scala.Boolean
    ]
  ] = js.native
  def right(element: ckeditorLib.CKEDITORNs.htmlParserNs.element, tools: transformationTools): scala.Boolean = js.native
  def right(element: ckeditorLib.CKEDITORNs.htmlParserNs.element, tools: java.lang.String): scala.Boolean = js.native
}

