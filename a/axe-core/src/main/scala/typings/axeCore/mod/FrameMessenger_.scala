package typings.axeCore.mod

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// axe.frameMessenger
trait FrameMessenger_ extends StObject {
  
  def open(topicHandler: TopicHandler): Close | Unit
  
  def post(frameWindow: Window, data: TopicData, replyHandler: ReplyHandler): Boolean | Unit
}
object FrameMessenger_ {
  
  inline def apply(open: TopicHandler => Close | Unit, post: (Window, TopicData, ReplyHandler) => Boolean | Unit): FrameMessenger_ = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction1(open), post = js.Any.fromFunction3(post))
    __obj.asInstanceOf[FrameMessenger_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameMessenger_] (val x: Self) extends AnyVal {
    
    inline def setOpen(value: TopicHandler => Close | Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setPost(value: (Window, TopicData, ReplyHandler) => Boolean | Unit): Self = StObject.set(x, "post", js.Any.fromFunction3(value))
  }
}
