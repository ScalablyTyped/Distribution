package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://docs.com/ckeditor4/latest/api/CKEDITOR_scriptLoader.html
object scriptLoader {
  
  @JSGlobal("CKEDITOR.scriptLoader")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def load(
    scriptUrls: String,
    callback: js.Function2[
      /* succeededUrls */ Boolean | js.Array[String], 
      /* failedUrls */ js.Array[String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(scriptUrls.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def load(
    scriptUrls: String,
    callback: js.Function2[
      /* succeededUrls */ Boolean | js.Array[String], 
      /* failedUrls */ js.Array[String], 
      Unit
    ],
    scope: js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(scriptUrls.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def load(
    scriptUrls: String,
    callback: js.Function2[
      /* succeededUrls */ Boolean | js.Array[String], 
      /* failedUrls */ js.Array[String], 
      Unit
    ],
    scope: js.Any,
    showBusy: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(scriptUrls.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], showBusy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def load(
    scriptUrls: String,
    callback: js.Function2[
      /* succeededUrls */ Boolean | js.Array[String], 
      /* failedUrls */ js.Array[String], 
      Unit
    ],
    scope: Unit,
    showBusy: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(scriptUrls.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], showBusy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def load(
    scriptUrls: js.Array[String],
    callback: js.Function2[
      /* succeededUrls */ Boolean | js.Array[String], 
      /* failedUrls */ js.Array[String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(scriptUrls.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def load(
    scriptUrls: js.Array[String],
    callback: js.Function2[
      /* succeededUrls */ Boolean | js.Array[String], 
      /* failedUrls */ js.Array[String], 
      Unit
    ],
    scope: js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(scriptUrls.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def load(
    scriptUrls: js.Array[String],
    callback: js.Function2[
      /* succeededUrls */ Boolean | js.Array[String], 
      /* failedUrls */ js.Array[String], 
      Unit
    ],
    scope: js.Any,
    showBusy: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(scriptUrls.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], showBusy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def load(
    scriptUrls: js.Array[String],
    callback: js.Function2[
      /* succeededUrls */ Boolean | js.Array[String], 
      /* failedUrls */ js.Array[String], 
      Unit
    ],
    scope: Unit,
    showBusy: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(scriptUrls.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], showBusy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def queue(scriptUrl: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("queue")(scriptUrl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def queue(scriptUrl: String, callback: js.Function1[/* succeeded */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("queue")(scriptUrl.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
