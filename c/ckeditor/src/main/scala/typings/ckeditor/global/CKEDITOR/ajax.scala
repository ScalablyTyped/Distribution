package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajax {
  
  @JSGlobal("CKEDITOR.ajax.load")
  @js.native
  def load(url: String): String = js.native
  @JSGlobal("CKEDITOR.ajax.load")
  @js.native
  def load(url: String, callback: js.Function1[/* data */ js.Any, Unit]): String = js.native
  
  @JSGlobal("CKEDITOR.ajax.loadXml")
  @js.native
  def loadXml(url: String): typings.ckeditor.CKEDITOR.xml = js.native
  @JSGlobal("CKEDITOR.ajax.loadXml")
  @js.native
  def loadXml(url: String, callback: js.Function1[/* data */ js.Any, Unit]): typings.ckeditor.CKEDITOR.xml = js.native
  
  @JSGlobal("CKEDITOR.ajax.post")
  @js.native
  def post(url: String, data: js.Any): Unit = js.native
  @JSGlobal("CKEDITOR.ajax.post")
  @js.native
  def post(
    url: String,
    data: js.Any,
    contentType: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* data */ js.Any, Unit]
  ): Unit = js.native
  @JSGlobal("CKEDITOR.ajax.post")
  @js.native
  def post(url: String, data: js.Any, contentType: String): Unit = js.native
  @JSGlobal("CKEDITOR.ajax.post")
  @js.native
  def post(url: String, data: js.Any, contentType: String, callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
}
