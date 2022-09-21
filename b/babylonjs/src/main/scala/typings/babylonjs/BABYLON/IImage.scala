package typings.babylonjs.BABYLON

import typings.std.Event
import typings.std.GlobalEventHandlers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IImage extends StObject {
  
  /**
    * provides support for CORS, defining how the element handles crossorigin requests,
    * thereby enabling the configuration of the CORS requests for the element's fetched data.
    */
  var crossOrigin: String | Null
  
  /**
    * Image height.
    */
  val height: Double
  
  /**
    * The original height of the image resource before sizing.
    */
  val naturalHeight: Double
  
  /**
    * The original width of the image resource before sizing.
    */
  val naturalWidth: Double
  
  /**
    * Error callback.
    */
  var onerror: (js.ThisFunction1[/* this */ GlobalEventHandlers, /* ev */ Event, Any]) | Null
  
  /**
    * onload callback.
    */
  var onload: (js.ThisFunction1[/* this */ GlobalEventHandlers, /* ev */ Event, Any]) | Null
  
  /**
    * provides support for referrer policy on xhr load request,
    * it is used to control the request header.
    */
  var referrerPolicy: String
  
  /**
    * Image source.
    */
  var src: String
  
  /**
    * Image width.
    */
  val width: Double
}
object IImage {
  
  inline def apply(
    height: Double,
    naturalHeight: Double,
    naturalWidth: Double,
    referrerPolicy: String,
    src: String,
    width: Double
  ): IImage = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], crossOrigin = null, onerror = null, onload = null)
    __obj.asInstanceOf[IImage]
  }
  
  extension [Self <: IImage](x: Self) {
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setNaturalHeight(value: Double): Self = StObject.set(x, "naturalHeight", value.asInstanceOf[js.Any])
    
    inline def setNaturalWidth(value: Double): Self = StObject.set(x, "naturalWidth", value.asInstanceOf[js.Any])
    
    inline def setOnerror(value: js.ThisFunction1[/* this */ GlobalEventHandlers, /* ev */ Event, Any]): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    inline def setOnerrorNull: Self = StObject.set(x, "onerror", null)
    
    inline def setOnload(value: js.ThisFunction1[/* this */ GlobalEventHandlers, /* ev */ Event, Any]): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
    
    inline def setOnloadNull: Self = StObject.set(x, "onload", null)
    
    inline def setReferrerPolicy(value: String): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
