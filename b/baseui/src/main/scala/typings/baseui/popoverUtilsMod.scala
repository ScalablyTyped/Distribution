package typings.baseui

import org.scalablytyped.runtime.StringDictionary
import typings.baseui.popoverTypesMod.Offset
import typings.baseui.popoverTypesMod.PopoverPlacement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverUtilsMod {
  
  @JSImport("baseui/popover/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fromPopperPlacement(placement: String): PopoverPlacement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPopperPlacement")(placement.asInstanceOf[js.Any]).asInstanceOf[PopoverPlacement | Null]
  
  inline def getArrowPositionStyles(offsets: Offset, placement: PopoverPlacement): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrowPositionStyles")(offsets.asInstanceOf[js.Any], placement.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
  
  inline def getEndPosition(offset: Offset): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndPosition")(offset.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getOppositePosition(position: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOppositePosition")(position.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPopoverMarginStyles(arrowSize: Double, placement: PopoverPlacement, popoverMargin: Double): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPopoverMarginStyles")(arrowSize.asInstanceOf[js.Any], placement.asInstanceOf[js.Any], popoverMargin.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
  
  inline def getStartPosition(offset: Offset, placement: PopoverPlacement, arrowSize: Double, popoverMargin: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStartPosition")(offset.asInstanceOf[js.Any], placement.asInstanceOf[js.Any], arrowSize.asInstanceOf[js.Any], popoverMargin.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isVerticalPosition(position: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVerticalPosition")(position.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def splitPlacement(placement: PopoverPlacement): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitPlacement")(placement.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
