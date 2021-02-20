package typings.chui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChUIEventInterface extends StObject {
  
  var doubletap: String = js.native
  
  var eventCancel: String = js.native
  
  var eventEnd: String = js.native
  
  var eventMove: String = js.native
  
  var eventStart: String = js.native
  
  var longtap: String = js.native
  
  var singletap: String = js.native
  
  var swipe: String = js.native
  
  var swipedown: String = js.native
  
  var swipeleft: String = js.native
  
  var swiperight: String = js.native
  
  var swipeup: String = js.native
  
  var tap: String = js.native
}
object ChUIEventInterface {
  
  @scala.inline
  def apply(
    doubletap: String,
    eventCancel: String,
    eventEnd: String,
    eventMove: String,
    eventStart: String,
    longtap: String,
    singletap: String,
    swipe: String,
    swipedown: String,
    swipeleft: String,
    swiperight: String,
    swipeup: String,
    tap: String
  ): ChUIEventInterface = {
    val __obj = js.Dynamic.literal(doubletap = doubletap.asInstanceOf[js.Any], eventCancel = eventCancel.asInstanceOf[js.Any], eventEnd = eventEnd.asInstanceOf[js.Any], eventMove = eventMove.asInstanceOf[js.Any], eventStart = eventStart.asInstanceOf[js.Any], longtap = longtap.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], swipedown = swipedown.asInstanceOf[js.Any], swipeleft = swipeleft.asInstanceOf[js.Any], swiperight = swiperight.asInstanceOf[js.Any], swipeup = swipeup.asInstanceOf[js.Any], tap = tap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChUIEventInterface]
  }
  
  @scala.inline
  implicit class ChUIEventInterfaceMutableBuilder[Self <: ChUIEventInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoubletap(value: String): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCancel(value: String): Self = StObject.set(x, "eventCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEnd(value: String): Self = StObject.set(x, "eventEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventMove(value: String): Self = StObject.set(x, "eventMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventStart(value: String): Self = StObject.set(x, "eventStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongtap(value: String): Self = StObject.set(x, "longtap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: String): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: String): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipedown(value: String): Self = StObject.set(x, "swipedown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeleft(value: String): Self = StObject.set(x, "swipeleft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwiperight(value: String): Self = StObject.set(x, "swiperight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeup(value: String): Self = StObject.set(x, "swipeup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTap(value: String): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
  }
}
