package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInfoboxOptions extends StObject {
  
  /**
    * @deprecated Use HTML buttons and links in description instead.
    */
  var actions: js.UndefOr[js.Array[IInfoboxActions]] = js.native
  
  /** The number of milliseconds to wait before closing an infobox when the visible option is changed from true to false. Default: 0 */
  var closeDelayTime: js.UndefOr[Double] = js.native
  
  /** The string displayed inside the infobox. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * TThe HTML that represents the infobox. Note that some infobox options are ignored if custom HTML is set
    * (title, description, maxHeight, maxWidth, actions, showCloseButton, showPoint).
    * Also, if custom HTML is used to represent the infobox, the infobox is anchored at the top-left corner.
    */
  var htmlContent: js.UndefOr[String] = js.native
  
  /** The location on the map where the infobox’s anchor is attached. */
  var location: js.UndefOr[Location] = js.native
  
  /** The maximium size that the infobox height can expand to based on it’s content. Default: 126 **/
  var maxHeight: js.UndefOr[Double] = js.native
  
  /** The maximium size that the infobox width can expand to based on it’s content. Default: 256 **/
  var maxWidth: js.UndefOr[Double] = js.native
  
  /**
    * The amount the infobox pointer is shifted from the location of the infobox, or if showPointer is false, then it is the amount the info box bottom
    * left edge is shifted from the location of the infobox. If custom HTML is set, it is the amount the top-left corner of the infobox is shifted from
    * its location. The default offset value is (0,0), which means there is no offset.
    */
  var offset: js.UndefOr[Point] = js.native
  
  /**
    * A boolean indicating whether to show the close dialog button on the infobox. The default value is true. By default, the close button is displayed
    * as an X in the top right corner of the infobox. This property is ignored if custom HTML is used to represent the infobox.
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean indicating whether to display the infobox with a pointer. The default value is true. In this case the infobox is anchored at the bottom
    * point of the pointer. If this property is set to false, the infobox is anchored at the bottom left corner. This property is ignored if custom HTML
    * is used to represent the infobox.
    */
  var showPointer: js.UndefOr[Boolean] = js.native
  
  /** The title of the infobox. */
  var title: js.UndefOr[String] = js.native
  
  /**
    * A boolean indicating whether to show or hide the infobox. The default value is true. A value of false indicates that the infobox is hidden,
    * although it is still an entity on the map.
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /** The z-index of the infobox with respect to other items on the map. */
  var zIndex: js.UndefOr[Double] = js.native
}
object IInfoboxOptions {
  
  @scala.inline
  def apply(): IInfoboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInfoboxOptions]
  }
  
  @scala.inline
  implicit class IInfoboxOptionsMutableBuilder[Self <: IInfoboxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[IInfoboxActions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: IInfoboxActions*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setCloseDelayTime(value: Double): Self = StObject.set(x, "closeDelayTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseDelayTimeUndefined: Self = StObject.set(x, "closeDelayTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHtmlContent(value: String): Self = StObject.set(x, "htmlContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlContentUndefined: Self = StObject.set(x, "htmlContent", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setOffset(value: Point): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
    
    @scala.inline
    def setShowPointer(value: Boolean): Self = StObject.set(x, "showPointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPointerUndefined: Self = StObject.set(x, "showPointer", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
