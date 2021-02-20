package typings.ckeditorCkeditor5Engine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object view {
  
  @scala.inline
  def BR_FILLER(): scala.Unit = typings.ckeditorCkeditor5Engine.mod.view.^.asInstanceOf[js.Dynamic].applyDynamic("BR_FILLER")().asInstanceOf[scala.Unit]
  
  // engine/view/elementdefinition
  type ElementDefinition = java.lang.String | typings.ckeditorCkeditor5Engine.anon.Attributes
  
  @scala.inline
  def INLINE_FILLER: java.lang.String = typings.ckeditorCkeditor5Engine.mod.view.^.asInstanceOf[js.Dynamic].selectDynamic("INLINE_FILLER").asInstanceOf[java.lang.String]
  
  // engine/view/filler
  @scala.inline
  def INLINE_FILLER_LENGTH: scala.Double = typings.ckeditorCkeditor5Engine.mod.view.^.asInstanceOf[js.Dynamic].selectDynamic("INLINE_FILLER_LENGTH").asInstanceOf[scala.Double]
  
  type MatcherPattern = (js.Function1[
    /* element */ typings.ckeditorCkeditor5Engine.mod.view.Element, 
    scala.Null | typings.ckeditorCkeditor5Engine.anon.Attribute
  ]) | java.lang.String | typings.std.RegExp | typings.ckeditorCkeditor5Engine.anon.Classes
  
  @scala.inline
  def NBSP_FILLER(): scala.Unit = typings.ckeditorCkeditor5Engine.mod.view.^.asInstanceOf[js.Dynamic].applyDynamic("NBSP_FILLER")().asInstanceOf[scala.Unit]
  
  // engine/view/placeholder
  @scala.inline
  def attachPlaceholder(
    view: typings.ckeditorCkeditor5Engine.mod.view.View,
    element: typings.ckeditorCkeditor5Engine.mod.view.Element,
    placeholderText: java.lang.String
  ): scala.Unit = (typings.ckeditorCkeditor5Engine.mod.view.^.asInstanceOf[js.Dynamic].applyDynamic("attachPlaceholder")(view.asInstanceOf[js.Any], element.asInstanceOf[js.Any], placeholderText.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def attachPlaceholder(
    view: typings.ckeditorCkeditor5Engine.mod.view.View,
    element: typings.ckeditorCkeditor5Engine.mod.view.Element,
    placeholderText: java.lang.String,
    checkFunction: js.Function
  ): scala.Unit = (typings.ckeditorCkeditor5Engine.mod.view.^.asInstanceOf[js.Dynamic].applyDynamic("attachPlaceholder")(view.asInstanceOf[js.Any], element.asInstanceOf[js.Any], placeholderText.asInstanceOf[js.Any], checkFunction.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def detachPlaceholder(
    view: typings.ckeditorCkeditor5Engine.mod.view.View,
    element: typings.ckeditorCkeditor5Engine.mod.view.Element
  ): scala.Unit = (typings.ckeditorCkeditor5Engine.mod.view.^.asInstanceOf[js.Dynamic].applyDynamic("detachPlaceholder")(view.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getDataWithoutFiller(domText: typings.ckeditorCkeditor5Engine.mod.view.Text): java.lang.String = typings.ckeditorCkeditor5Engine.mod.view.^.asInstanceOf[js.Dynamic].applyDynamic("getDataWithoutFiller")(domText.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def injectQuirksHandling(view: typings.ckeditorCkeditor5Engine.mod.view.View): scala.Unit = typings.ckeditorCkeditor5Engine.mod.view.^.asInstanceOf[js.Dynamic].applyDynamic("injectQuirksHandling")(view.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def isBlockFiller(domNode: /*TODO globals.*/ typings.ckeditorCkeditor5Engine.mod.view.Node, blockFiller: js.Function): scala.Boolean = (typings.ckeditorCkeditor5Engine.mod.view.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockFiller")(domNode.asInstanceOf[js.Any], blockFiller.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isInlineFiller(domText: /*TODO globals.*/ typings.ckeditorCkeditor5Engine.mod.view.Text): scala.Boolean = typings.ckeditorCkeditor5Engine.mod.view.^.asInstanceOf[js.Dynamic].applyDynamic("isInlineFiller")(domText.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def startsWithFiller(domNode: /*TODO globals.*/ typings.ckeditorCkeditor5Engine.mod.view.Text): scala.Boolean = typings.ckeditorCkeditor5Engine.mod.view.^.asInstanceOf[js.Dynamic].applyDynamic("startsWithFiller")(domNode.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
