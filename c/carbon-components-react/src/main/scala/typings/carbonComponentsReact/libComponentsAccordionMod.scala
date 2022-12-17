package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsAccordionAccordionDotSkeletonMod.AccordionSkeletonProps
import typings.carbonComponentsReact.libComponentsAccordionAccordionMod.AccordionProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsAccordionMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Accordion", JSImport.Default)
  @js.native
  val default: FC[AccordionProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Accordion", "AccordingItem")
  @js.native
  open class AccordingItem ()
    extends typings.carbonComponentsReact.libComponentsAccordionAccordionItemMod.default
  
  @JSImport("carbon-components-react/lib/components/Accordion", "AccordionSkeleton")
  @js.native
  val AccordionSkeleton: FC[AccordionSkeletonProps] = js.native
  
  type _To = FC[AccordionProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsAccordionMod.foo` */
  override def _to: FC[AccordionProps] = default
}
