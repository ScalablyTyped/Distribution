package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajax {
  
  @JSGlobal("CKEDITOR.ajax")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def load(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def load(url: String, callback: js.Function1[/* data */ js.Any, Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def loadXml(url: String): typings.ckeditor.CKEDITOR.xml = ^.asInstanceOf[js.Dynamic].applyDynamic("loadXml")(url.asInstanceOf[js.Any]).asInstanceOf[typings.ckeditor.CKEDITOR.xml]
  @scala.inline
  def loadXml(url: String, callback: js.Function1[/* data */ js.Any, Unit]): typings.ckeditor.CKEDITOR.xml = (^.asInstanceOf[js.Dynamic].applyDynamic("loadXml")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor.CKEDITOR.xml]
  
  @scala.inline
  def post(url: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def post(url: String, data: js.Any, contentType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def post(url: String, data: js.Any, contentType: String, callback: js.Function1[/* data */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def post(url: String, data: js.Any, contentType: Unit, callback: js.Function1[/* data */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
