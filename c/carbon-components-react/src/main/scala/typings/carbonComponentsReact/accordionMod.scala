package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.accordionAccordionMod.AccordionProps
import typings.carbonComponentsReact.accordionSkeletonMod.AccordionSkeletonProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Accordion", JSImport.Default)
  @js.native
  val default: FC[AccordionProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Accordion", "AccordingItem")
  @js.native
  class AccordingItem ()
    extends typings.carbonComponentsReact.accordionItemMod.default
  
  @JSImport("carbon-components-react/lib/components/Accordion", "AccordionSkeleton")
  @js.native
  val AccordionSkeleton: FC[AccordionSkeletonProps] = js.native
  
  type _To = FC[AccordionProps]
  
  /* This means you don't have to write `default`, but can instead just say `accordionMod.foo` */
  override def _to: FC[AccordionProps] = default
}
