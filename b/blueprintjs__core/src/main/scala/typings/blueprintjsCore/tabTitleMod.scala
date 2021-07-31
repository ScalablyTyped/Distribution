package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.tabMod.ITabProps
import typings.blueprintjsCore.tabMod.TabId
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabTitleMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabTitle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabTitle", "TabTitle")
  @js.native
  class TabTitle protected ()
    extends AbstractPureComponent2[ITabTitleProps, js.Object, js.Object] {
    def this(props: ITabTitleProps) = this()
    def this(props: ITabTitleProps, context: js.Any) = this()
    
    var handleClick: js.Any = js.native
  }
  /* static members */
  object TabTitle {
    
    @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabTitle", "TabTitle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabTitle", "TabTitle.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def generateTabPanelId(parentId: TabId, tabId: TabId): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTabPanelId")(parentId.asInstanceOf[js.Any], tabId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def generateTabTitleId(parentId: TabId, tabId: TabId): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTabTitleId")(parentId.asInstanceOf[js.Any], tabId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ITabTitleProps
    extends StObject
       with ITabProps {
    
    /** Handler invoked when this tab is clicked. */
    def onClick(id: TabId, event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
    
    /** ID of the parent `Tabs` to which this tab belongs. Used to generate ID for ARIA attributes. */
    var parentId: TabId
    
    /** Whether the tab is currently selected. */
    var selected: Boolean
  }
  object ITabTitleProps {
    
    @scala.inline
    def apply(
      id: TabId,
      onClick: (TabId, MouseEvent[HTMLElement, NativeMouseEvent]) => Unit,
      parentId: TabId,
      selected: Boolean
    ): ITabTitleProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), parentId = parentId.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITabTitleProps]
    }
    
    @scala.inline
    implicit class ITabTitlePropsMutableBuilder[Self <: ITabTitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: (TabId, MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParentId(value: TabId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
