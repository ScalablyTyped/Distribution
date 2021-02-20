package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLVideoElement extends StObject {
  
  var mozSrcObject: js.Any = js.native
}
object HTMLVideoElement {
  
  @scala.inline
  def apply(mozSrcObject: js.Any): HTMLVideoElement = {
    val __obj = js.Dynamic.literal(mozSrcObject = mozSrcObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLVideoElement]
  }
  
  @scala.inline
  implicit class HTMLVideoElementMutableBuilder[Self <: HTMLVideoElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMozSrcObject(value: js.Any): Self = StObject.set(x, "mozSrcObject", value.asInstanceOf[js.Any])
  }
}
