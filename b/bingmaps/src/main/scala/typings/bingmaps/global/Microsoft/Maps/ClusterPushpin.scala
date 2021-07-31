package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IPrimitiveOptions
import typings.bingmaps.Microsoft.Maps.IPushpinOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.ClusterPushpin")
@js.native
class ClusterPushpin ()
  extends StObject
     with typings.bingmaps.Microsoft.Maps.ClusterPushpin {
  
  /** An array of all the pushpins that are in the cluster. */
  /* CompleteClass */
  var containedPushpins: js.Array[typings.bingmaps.Microsoft.Maps.Pushpin] = js.native
  
  /**
    * Gets the point on the Pushpin icon which is anchored to the pushpin location.
    * An anchor of (0,0) is the top left corner of the icon.
    * @returns The point on the Pushpin icon which is anchored to the pushpin location.
    */
  /* CompleteClass */
  override def getAnchor(): typings.bingmaps.Microsoft.Maps.Point = js.native
  
  /**
    * Gets whether the pushpin clicked style is enabled
    * @returns Whether the pushpin clicked style is enabled.
    */
  /* CompleteClass */
  override def getClickedStyleEnabled(): Boolean = js.native
  
  /**
    * Gets the color option of the pushpin.
    * @returns The color option of the pushpin.
    */
  /* CompleteClass */
  override def getColor(): String | typings.bingmaps.Microsoft.Maps.Color = js.native
  
  /**
    * Gets the css cursor value when the primitive has events on it.
    * @returns css cursor string when primitive has events on it.
    */
  /* CompleteClass */
  override def getCursor(): String = js.native
  
  /**
    * Gets a boolean indicating if the pushpin is draggable or not.
    * @returns A boolean indicating if the pushpin is draggable or not.
    */
  /* CompleteClass */
  override def getDraggable(): Boolean = js.native
  
  /**
    * Gets whether the pushpin hover style is enabled
    * @returns Whether the pushpin hover style is enabled.
    */
  /* CompleteClass */
  override def getHoverStyleEnabled(): Boolean = js.native
  
  /**
    * Gets the custom Pushpin source icon string which can be a url to an image or SVG, inline SVG string, or data URI.
    * @returns the custom Pushpin icon source string, which can be a url to an image or SVG, inline SVG string, or data URI.
    */
  /* CompleteClass */
  override def getIcon(): String = js.native
  
  /**
    * Returns the location of the pushpin.
    * @returns The location of the pushpin.
    */
  /* CompleteClass */
  override def getLocation(): typings.bingmaps.Microsoft.Maps.Location = js.native
  
  /**
    * Returns whether the clickable area of the pushpin is an ellipse.
    * @returns A boolean indicating whether the clickable area of the pushpin is an ellipse.
    */
  /* CompleteClass */
  override def getRoundClickableArea(): Boolean = js.native
  
  /**
    * Gets the subtitle label of the Pushpin.
    * @returns The subtitle label of the Pushpin.
    */
  /* CompleteClass */
  override def getSubTitle(): String = js.native
  
  /**
    * Gets the text within the Pushpin icon.
    * @returns The text within the Pushpin icon.
    */
  /* CompleteClass */
  override def getText(): String = js.native
  
  /**
    * Gets the amount the text is shifted from the Pushpin icon.
    * @returns the amount the text is shifted from the Pushpin icon.
    */
  /* CompleteClass */
  override def getTextOffset(): typings.bingmaps.Microsoft.Maps.Point = js.native
  
  /**
    * Gets the title label of the Pushpin.
    * @returns the title label of the Pushpin.
    */
  /* CompleteClass */
  override def getTitle(): String = js.native
  
  /**
    * Gets whether the primitive is visible.
    * @returns A boolean indicating whether the primitive is visible or not.
    */
  /* CompleteClass */
  override def getVisible(): Boolean = js.native
  
  /**
    * The grid cell key that can be used retrieve the clustered pushpin(s) from the clustering layer. This is useful when creating a clickable list that
    * link items in the list to clusters or pushpins on the map. Your list just needs to store the gridKey value.
    */
  /* CompleteClass */
  var gridKey: Double = js.native
  
  /**
    * Sets the location of the Pushpin.
    * @param location The location of the Pushpin.
    */
  /* CompleteClass */
  override def setLocation(location: typings.bingmaps.Microsoft.Maps.Location): Unit = js.native
  
  /**
    * Sets the options for customizing the IPrimitive.
    * @param options The options for customizing the IPrimitive.
    */
  /* CompleteClass */
  override def setOptions(options: IPrimitiveOptions): Unit = js.native
  /**
    * Sets the properties for the pushpin.
    * @param options The IPushpinOptions object containing the options to customize the pushpin.
    */
  /* CompleteClass */
  override def setOptions(options: IPushpinOptions): Unit = js.native
}
