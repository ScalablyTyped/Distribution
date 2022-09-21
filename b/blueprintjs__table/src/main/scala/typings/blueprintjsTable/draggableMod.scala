package typings.blueprintjsTable

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.anon.PreventDefault
import typings.blueprintjsTable.dragTypesMod.IDragHandler
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draggableMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/draggable", "Draggable")
  @js.native
  open class Draggable protected ()
    extends PureComponent[IDraggableProps, js.Object, Any] {
    def this(props: IDraggableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IDraggableProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MDraggable(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDraggable(prevProps: IDraggableProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDraggable(): Unit = js.native
    
    /* private */ var events: Any = js.native
  }
  /* static members */
  object Draggable {
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/draggable", "Draggable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/draggable", "Draggable.defaultProps")
    @js.native
    def defaultProps: PreventDefault = js.native
    inline def defaultProps_=(x: PreventDefault): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IDraggableProps
    extends StObject
       with IProps
       with IDragHandler {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object IDraggableProps {
    
    inline def apply(): IDraggableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDraggableProps]
    }
    
    extension [Self <: IDraggableProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
