package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see https://docs.com/ckeditor4/latest/api/CKEDITOR_scriptLoader.html
@JSGlobal("CKEDITOR.scriptLoader")
@js.native
object scriptLoaderNs extends js.Object {
  def load(
    scriptUrls: java.lang.String,
    callback: js.Function2[
      /* succeededUrls */ scala.Boolean | js.Array[java.lang.String], 
      /* failedUrls */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def load(
    scriptUrls: java.lang.String,
    callback: js.Function2[
      /* succeededUrls */ scala.Boolean | js.Array[java.lang.String], 
      /* failedUrls */ js.Array[java.lang.String], 
      scala.Unit
    ],
    scope: js.Any
  ): scala.Unit = js.native
  def load(
    scriptUrls: java.lang.String,
    callback: js.Function2[
      /* succeededUrls */ scala.Boolean | js.Array[java.lang.String], 
      /* failedUrls */ js.Array[java.lang.String], 
      scala.Unit
    ],
    scope: js.Any,
    showBusy: scala.Boolean
  ): scala.Unit = js.native
  def load(
    scriptUrls: js.Array[java.lang.String],
    callback: js.Function2[
      /* succeededUrls */ scala.Boolean | js.Array[java.lang.String], 
      /* failedUrls */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def load(
    scriptUrls: js.Array[java.lang.String],
    callback: js.Function2[
      /* succeededUrls */ scala.Boolean | js.Array[java.lang.String], 
      /* failedUrls */ js.Array[java.lang.String], 
      scala.Unit
    ],
    scope: js.Any
  ): scala.Unit = js.native
  def load(
    scriptUrls: js.Array[java.lang.String],
    callback: js.Function2[
      /* succeededUrls */ scala.Boolean | js.Array[java.lang.String], 
      /* failedUrls */ js.Array[java.lang.String], 
      scala.Unit
    ],
    scope: js.Any,
    showBusy: scala.Boolean
  ): scala.Unit = js.native
  def queue(scriptUrl: java.lang.String): scala.Unit = js.native
  def queue(scriptUrl: java.lang.String, callback: js.Function1[/* succeeded */ scala.Boolean, scala.Unit]): scala.Unit = js.native
}

