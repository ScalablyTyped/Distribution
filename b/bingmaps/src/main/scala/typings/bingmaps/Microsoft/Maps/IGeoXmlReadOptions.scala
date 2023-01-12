package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoXmlReadOptions extends StObject {
  
  /** Specifies if KML ScreenOverlays should be read or ignored. Default: true */
  var allowKmlScreenOverlays: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies wether the individual waypoint data of a GPX Route or Track should be captured.
    * If set to true, the shape will have a metadata.waypoints property that is an array of
    * pushpins that contains the details of each waypoint along the track. Default: false
    */
  var captureGpxPathWaypoints: js.UndefOr[Boolean] = js.undefined
  
  /** The default styles to apply to shapes that don't have a defined style in the XML. */
  var defaultStyles: js.UndefOr[IStylesOptions] = js.undefined
  
  /**
    * A callback function that is triggered when an error occurs when reading an XML document.
    */
  var error: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  
  /** Specifies if shapes visible tags should be used to set the visible property of it's equivalent Bing Maps shape. Default: true */
  var ignoreVisibility: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximium depth of network links in a KML file. Default: 3
    * Example: when set to 3; file1 links to file2 which links to file3 but won't open links in file3.
    */
  var maxNetworkLinkDepth: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximium number of network links that a single KML file can have. Default: 10.
    */
  var maxNetworkLinks: js.UndefOr[Double] = js.undefined
  
  /** Indicates if the pushpin title should be displayed on the map if a valid title or name value exits in the shapes metadata. Default: true */
  var setPushpinTitles: js.UndefOr[Boolean] = js.undefined
}
object IGeoXmlReadOptions {
  
  inline def apply(): IGeoXmlReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoXmlReadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGeoXmlReadOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowKmlScreenOverlays(value: Boolean): Self = StObject.set(x, "allowKmlScreenOverlays", value.asInstanceOf[js.Any])
    
    inline def setAllowKmlScreenOverlaysUndefined: Self = StObject.set(x, "allowKmlScreenOverlays", js.undefined)
    
    inline def setCaptureGpxPathWaypoints(value: Boolean): Self = StObject.set(x, "captureGpxPathWaypoints", value.asInstanceOf[js.Any])
    
    inline def setCaptureGpxPathWaypointsUndefined: Self = StObject.set(x, "captureGpxPathWaypoints", js.undefined)
    
    inline def setDefaultStyles(value: IStylesOptions): Self = StObject.set(x, "defaultStyles", value.asInstanceOf[js.Any])
    
    inline def setDefaultStylesUndefined: Self = StObject.set(x, "defaultStyles", js.undefined)
    
    inline def setError(value: /* msg */ String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setIgnoreVisibility(value: Boolean): Self = StObject.set(x, "ignoreVisibility", value.asInstanceOf[js.Any])
    
    inline def setIgnoreVisibilityUndefined: Self = StObject.set(x, "ignoreVisibility", js.undefined)
    
    inline def setMaxNetworkLinkDepth(value: Double): Self = StObject.set(x, "maxNetworkLinkDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxNetworkLinkDepthUndefined: Self = StObject.set(x, "maxNetworkLinkDepth", js.undefined)
    
    inline def setMaxNetworkLinks(value: Double): Self = StObject.set(x, "maxNetworkLinks", value.asInstanceOf[js.Any])
    
    inline def setMaxNetworkLinksUndefined: Self = StObject.set(x, "maxNetworkLinks", js.undefined)
    
    inline def setSetPushpinTitles(value: Boolean): Self = StObject.set(x, "setPushpinTitles", value.asInstanceOf[js.Any])
    
    inline def setSetPushpinTitlesUndefined: Self = StObject.set(x, "setPushpinTitles", js.undefined)
  }
}
