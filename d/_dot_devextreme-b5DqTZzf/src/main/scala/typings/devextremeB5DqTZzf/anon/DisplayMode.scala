package typings.devextremeB5DqTZzf.anon

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
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.containers
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.cross
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.custom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.data
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.database
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.decision
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.delay
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.diamond
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.display
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.document
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.ellipse
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.flowchart
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.general
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.hardDisk
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.heart
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.hexagon
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.horizontalContainer
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.icons
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.internalStorage
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.manualInput
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.manualOperation
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.merge_
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.multipleDocuments
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.octagon
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.or
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.orgChart
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
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.texts
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.triangle
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.verticalContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayMode extends StObject {
  
  /**
    * Specifies the category of shapes that are displayed in the group.
    */
  var category: js.UndefOr[general | flowchart | orgChart | containers | custom | String] = js.undefined
  
  /**
    * Specifies how shapes are displayed in the toolbox.
    */
  var displayMode: js.UndefOr[icons | texts] = js.undefined
  
  /**
    * Specifies whether the group is expanded.
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Lists the shapes in the group. The built-in shape types are shown in the Shape Types section.
    */
  var shapes: js.UndefOr[
    js.Array[
      text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | hexagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge_ | connector | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
    ]
  ] = js.undefined
  
  /**
    * Specifies the group title in the toolbox.
    */
  var title: js.UndefOr[String] = js.undefined
}
object DisplayMode {
  
  inline def apply(): DisplayMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayMode]
  }
  
  extension [Self <: DisplayMode](x: Self) {
    
    inline def setCategory(value: general | flowchart | orgChart | containers | custom | String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDisplayMode(value: icons | texts): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setShapes(
      value: js.Array[
          text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | hexagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge_ | connector | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
        ]
    ): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    inline def setShapesVarargs(
      value: (text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | hexagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge_ | connector | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String)*
    ): Self = StObject.set(x, "shapes", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
