package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.modelMod.Model
import typings.ckeditorCkeditor5Engine.rangeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionPostFixerMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/utils/selection-post-fixer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def injectSelectionPostFixer(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectSelectionPostFixer")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def mergeIntersectingRanges(ranges: js.Array[default]): js.Array[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeIntersectingRanges")(ranges.asInstanceOf[js.Any]).asInstanceOf[js.Array[default]]
}
