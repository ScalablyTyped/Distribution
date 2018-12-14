package typings
package ckeditorLib.CKEDITORNs.pluginsNs.condesnippetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.condesnippet.highlighter")
@js.native
class highlighter () extends js.Object {
  var languages: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  val queue: js.Array[
    js.Function3[
      /* code */ java.lang.String, 
      /* lang */ java.lang.String, 
      /* callback */ js.Function1[/* highlightedCode */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ] = js.native
  val ready: scala.Boolean = js.native
  def highlight(
    code: java.lang.String,
    lang: java.lang.String,
    callback: js.Function1[/* highlightedCode */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def highlighter(
    code: java.lang.String,
    lang: java.lang.String,
    callback: js.Function1[/* highlightedCode */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def init(ready: js.Function0[scala.Unit]): scala.Unit = js.native
}

