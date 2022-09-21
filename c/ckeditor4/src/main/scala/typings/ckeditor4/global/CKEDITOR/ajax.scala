package typings.ckeditor4.global.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajax {
  
  @JSGlobal("CKEDITOR.ajax")
  @js.native
  val ^ : js.Any = js.native
  
  inline def load(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def load(url: String, callback: js.Function1[/* data */ Any, Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def loadXml(url: String): typings.ckeditor4.CKEDITOR.xml = ^.asInstanceOf[js.Dynamic].applyDynamic("loadXml")(url.asInstanceOf[js.Any]).asInstanceOf[typings.ckeditor4.CKEDITOR.xml]
  inline def loadXml(url: String, callback: js.Function1[/* data */ Any, Unit]): typings.ckeditor4.CKEDITOR.xml = (^.asInstanceOf[js.Dynamic].applyDynamic("loadXml")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor4.CKEDITOR.xml]
  
  inline def post(url: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def post(url: String, data: Any, contentType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def post(url: String, data: Any, contentType: String, callback: js.Function1[/* data */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def post(url: String, data: Any, contentType: Unit, callback: js.Function1[/* data */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
