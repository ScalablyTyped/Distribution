package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.carbonComponentsReactStrings.end
import typings.carbonComponentsReact.carbonComponentsReactStrings.start
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Accordion/Accordion.Skeleton", JSImport.Default)
  @js.native
  val default: FC[AccordionSkeletonProps] = js.native
  
  trait AccordionSkeletonProps
    extends StObject
       with HTMLAttributes[HTMLUListElement] {
    
    var align: js.UndefOr[end | start] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated
      */
    var uid: js.UndefOr[js.Any] = js.undefined
  }
  object AccordionSkeletonProps {
    
    @scala.inline
    def apply(): AccordionSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionSkeletonProps]
    }
    
    @scala.inline
    implicit class AccordionSkeletonPropsMutableBuilder[Self <: AccordionSkeletonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: end | start): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setUid(value: js.Any): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  type _To = FC[AccordionSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `accordionSkeletonMod.foo` */
  override def _to: FC[AccordionSkeletonProps] = default
}
