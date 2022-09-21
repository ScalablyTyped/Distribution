package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.anon.HeightWidth
import typings.devextremeB5DqTZzf.anon.Y
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.arrowBottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.arrowEastWest
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.arrowLeft
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.arrowNorthSouth
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.arrowRight
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.arrowTop
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.cardWithImageOnLeft
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.cardWithImageOnRight
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.cardWithImageOnTop
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.connector
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.cross
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.data
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.database
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.decision
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.delay
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.diamond
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.display
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.document
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.ellipse
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.hardDisk
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.heart
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.hexagon
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.horizontalContainer
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.internalStorage
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.manualInput
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.manualOperation
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.merge_
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.multipleDocuments
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.octagon
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.or
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.paperTape
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.pentagon
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.predefinedProcess
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.preparation
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.process
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rectangle
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.star
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.storedData
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.summingJunction
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.terminator
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.text
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.triangle
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.verticalContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramShape
  extends StObject
     with dxDiagramItem {
  
  /**
    * Gets an array of attached connector identifiers.
    */
  var attachedConnectorIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Gets identifiers of shapes stored in the container.
    */
  var containerChildItemIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Gets whether the container is expanded.
    */
  var containerExpanded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the identifier of the container that stores the shape.
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the position of the top left shape corner relative to the top left corner of the diagram work area.
    */
  var position: js.UndefOr[Y] = js.undefined
  
  /**
    * Specifies the shape size.
    */
  var size: js.UndefOr[HeightWidth] = js.undefined
  
  /**
    * Specifies the shape&apos;s text.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the shape type. The built-in shape types are shown in the Shape Types section.
    */
  var `type`: js.UndefOr[
    text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | hexagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge_ | connector | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
  ] = js.undefined
}
object dxDiagramShape {
  
  inline def apply(): dxDiagramShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramShape]
  }
  
  extension [Self <: dxDiagramShape](x: Self) {
    
    inline def setAttachedConnectorIds(value: js.Array[String]): Self = StObject.set(x, "attachedConnectorIds", value.asInstanceOf[js.Any])
    
    inline def setAttachedConnectorIdsUndefined: Self = StObject.set(x, "attachedConnectorIds", js.undefined)
    
    inline def setAttachedConnectorIdsVarargs(value: String*): Self = StObject.set(x, "attachedConnectorIds", js.Array(value*))
    
    inline def setContainerChildItemIds(value: js.Array[String]): Self = StObject.set(x, "containerChildItemIds", value.asInstanceOf[js.Any])
    
    inline def setContainerChildItemIdsUndefined: Self = StObject.set(x, "containerChildItemIds", js.undefined)
    
    inline def setContainerChildItemIdsVarargs(value: String*): Self = StObject.set(x, "containerChildItemIds", js.Array(value*))
    
    inline def setContainerExpanded(value: Boolean): Self = StObject.set(x, "containerExpanded", value.asInstanceOf[js.Any])
    
    inline def setContainerExpandedUndefined: Self = StObject.set(x, "containerExpanded", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setPosition(value: Y): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSize(value: HeightWidth): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(
      value: text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | hexagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge_ | connector | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
