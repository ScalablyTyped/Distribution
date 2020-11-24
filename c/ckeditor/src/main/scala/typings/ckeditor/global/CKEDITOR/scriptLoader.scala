package typings.ckeditor.global.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://docs.com/ckeditor4/latest/api/CKEDITOR_scriptLoader.html
@JSGlobal("CKEDITOR.scriptLoader")
@js.native
object scriptLoader extends js.Object {
  
  def load(
    scriptUrls: String,
    callback: js.Function2[
      /* succeededUrls */ Boolean | js.Array[String], 
      /* failedUrls */ js.Array[String], 
      Unit
    ]
  ): Unit = js.native
  def load(
    scriptUrls: String,
    callback: js.Function2[
      /* succeededUrls */ Boolean | js.Array[String], 
      /* failedUrls */ js.Array[String], 
      Unit
    ],
    scope: js.UndefOr[scala.Nothing],
    showBusy: Boolean
  ): Unit = js.native
  def load(
    scriptUrls: String,
    callback: js.Function2[
      /* succeededUrls */ Boolean | js.Array[String], 
      /* failedUrls */ js.Array[String], 
      Unit
    ],
    scope: js.Any
  ): Unit = js.native
  def load(
    scriptUrls: String,
    callback: js.Function2[
      /* succeededUrls */ Boolean | js.Array[String], 
      /* failedUrls */ js.Array[String], 
      Unit
    ],
    scope: js.Any,
    showBusy: Boolean
  ): Unit = js.native
  def load(
    scriptUrls: js.Array[String],
    callback: js.Function2[
      /* succeededUrls */ Boolean | js.Array[String], 
      /* failedUrls */ js.Array[String], 
      Unit
    ]
  ): Unit = js.native
  def load(
    scriptUrls: js.Array[String],
    callback: js.Function2[
      /* succeededUrls */ Boolean | js.Array[String], 
      /* failedUrls */ js.Array[String], 
      Unit
    ],
    scope: js.UndefOr[scala.Nothing],
    showBusy: Boolean
  ): Unit = js.native
  def load(
    scriptUrls: js.Array[String],
    callback: js.Function2[
      /* succeededUrls */ Boolean | js.Array[String], 
      /* failedUrls */ js.Array[String], 
      Unit
    ],
    scope: js.Any
  ): Unit = js.native
  def load(
    scriptUrls: js.Array[String],
    callback: js.Function2[
      /* succeededUrls */ Boolean | js.Array[String], 
      /* failedUrls */ js.Array[String], 
      Unit
    ],
    scope: js.Any,
    showBusy: Boolean
  ): Unit = js.native
  
  def queue(scriptUrl: String): Unit = js.native
  def queue(scriptUrl: String, callback: js.Function1[/* succeeded */ Boolean, Unit]): Unit = js.native
}
