package typings.baseui

import typings.baseui.tabsMotionTypesMod.Fill
import typings.baseui.tabsMotionTypesMod.Orientation
import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMotionUtilsMod {
  
  @JSImport("baseui/tabs-motion/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTabId(uid: String, key: Key): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTabId")(uid.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTabPanelId(uid: String, key: Key): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTabPanelId")(uid.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isFixed(fill: Fill): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixed")(fill.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHorizontal(orientation: Orientation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHorizontal")(orientation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIntrinsic(fill: Fill): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntrinsic")(fill.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRTL(direction: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRTL")(direction.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isVertical(orientation: Orientation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVertical")(orientation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
