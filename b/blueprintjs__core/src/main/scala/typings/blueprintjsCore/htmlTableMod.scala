package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IElementRefProps
import typings.react.mod.TableHTMLAttributes
import typings.std.HTMLTableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlTableMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/html-table/htmlTable", "HTMLTable")
  @js.native
  class HTMLTable protected ()
    extends AbstractPureComponent2[IHTMLTableProps, js.Object, js.Object] {
    def this(props: IHTMLTableProps) = this()
    def this(props: IHTMLTableProps, context: js.Any) = this()
  }
  
  trait IHTMLTableProps
    extends StObject
       with TableHTMLAttributes[HTMLTableElement]
       with IElementRefProps[HTMLTableElement] {
    
    /** Enables borders between rows and cells. */
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    /** Use small, condensed appearance. */
    var condensed: js.UndefOr[Boolean] = js.undefined
    
    /** Enables hover styles on row. */
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use small, condensed appearance for this element and all child elements.
      * @deprecated
      */
    var small: js.UndefOr[Boolean] = js.undefined
    
    /** Use an alternate background color on odd rows. */
    var striped: js.UndefOr[Boolean] = js.undefined
  }
  object IHTMLTableProps {
    
    @scala.inline
    def apply(): IHTMLTableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHTMLTableProps]
    }
    
    @scala.inline
    implicit class IHTMLTablePropsMutableBuilder[Self <: IHTMLTableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setCondensed(value: Boolean): Self = StObject.set(x, "condensed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCondensedUndefined: Self = StObject.set(x, "condensed", js.undefined)
      
      @scala.inline
      def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      @scala.inline
      def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      @scala.inline
      def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
    }
  }
}
