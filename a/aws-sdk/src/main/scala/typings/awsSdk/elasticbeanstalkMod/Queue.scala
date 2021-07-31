package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Queue extends StObject {
  
  /**
    * The name of the queue.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the queue.
    */
  var URL: js.UndefOr[String] = js.undefined
}
object Queue {
  
  @scala.inline
  def apply(): Queue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Queue]
  }
  
  @scala.inline
  implicit class QueueMutableBuilder[Self <: Queue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
  }
}
