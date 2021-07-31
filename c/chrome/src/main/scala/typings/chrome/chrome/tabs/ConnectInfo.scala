package typings.chrome.chrome.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectInfo extends StObject {
  
  /**
    * Open a port to a specific frame identified by frameId instead of all frames in the tab.
    * @since Chrome 41.
    */
  var frameId: js.UndefOr[Double] = js.undefined
  
  /** Optional. Will be passed into onConnect for content scripts that are listening for the connection event. */
  var name: js.UndefOr[String] = js.undefined
}
object ConnectInfo {
  
  @scala.inline
  def apply(): ConnectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectInfo]
  }
  
  @scala.inline
  implicit class ConnectInfoMutableBuilder[Self <: ConnectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
