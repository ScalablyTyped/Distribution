package typings.ckeditorCkeditor5Engine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewContainerelementMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/containerelement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ckeditorCkeditor5Engine.srcViewSelectionMod._Selectable because Already inherited
  - typings.ckeditorCkeditor5Engine.srcViewItemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/view/containerelement", JSImport.Default)
  @js.native
  open class default ()
    extends typings.ckeditorCkeditor5Engine.srcViewElementMod.default
  
  inline def getFillerOffset(): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFillerOffset")().asInstanceOf[Double | Null]
  
  type ContainerElement = typings.ckeditorCkeditor5Engine.srcViewElementMod.default
}
