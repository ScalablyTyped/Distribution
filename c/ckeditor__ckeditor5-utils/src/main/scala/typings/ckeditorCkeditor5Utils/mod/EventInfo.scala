package typings.ckeditorCkeditor5Utils.mod

import typings.ckeditorCkeditor5Utils.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ckeditor/ckeditor5-utils", "EventInfo")
@js.native
class EventInfo[T] protected () extends StObject {
  def this(source: T, name: String) = this()
  
  val name: String = js.native
  
  def off(): Unit = js.native
  @JSName("off")
  var off_Original: Call = js.native
  
  val path: js.Array[js.Object] = js.native
  
  var `return`: js.Any = js.native
  
  val source: T = js.native
  
  def stop(): Unit = js.native
  @JSName("stop")
  var stop_Original: Call = js.native
}
