package typings.ckeditorCkeditor5Utils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object log {
  
  @JSImport("@ckeditor/ckeditor5-utils", "log")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def error(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def error(message: String, data: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def warn(message: String, data: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
