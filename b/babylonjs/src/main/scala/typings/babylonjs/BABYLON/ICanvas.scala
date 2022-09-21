package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICanvas extends StObject {
  
  /**
    * returns a drawing context on the canvas.
    * @param contextType context identifier.
    * @param contextAttributes context attributes.
    * @returns ICanvasRenderingContext object.
    */
  def getContext(contextType: String): ICanvasRenderingContext = js.native
  def getContext(contextType: String, contextAttributes: Any): ICanvasRenderingContext = js.native
  
  /**
    * Canvas height.
    */
  var height: Double = js.native
  
  /**
    * returns a data URI containing a representation of the image in the format specified by the type parameter.
    * @param mime the image format.
    * @returns string containing the requested data URI.
    */
  def toDataURL(mime: String): String = js.native
  
  /**
    * Canvas width.
    */
  var width: Double = js.native
}
