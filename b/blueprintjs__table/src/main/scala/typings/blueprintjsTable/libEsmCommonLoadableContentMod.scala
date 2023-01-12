package typings.blueprintjsTable

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonLoadableContentMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/loadableContent", "LoadableContent")
  @js.native
  open class LoadableContent protected ()
    extends PureComponent[ILoadableContentProps, js.Object, Any] {
    def this(props: ILoadableContentProps) = this()
    
    /* private */ var calculateStyle: Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MLoadableContent(prevProps: ILoadableContentProps): Unit = js.native
    
    /* private */ var style: Any = js.native
  }
  
  trait ILoadableContentProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * If true, render a skeleton. Otherwise render the single, non-string child passed to this
      * component.
      */
    var loading: Boolean
    
    /**
      * If true, show a skeleton of random width (25-75% cell width) when rendering the loading state.
      *
      * @default false
      */
    var variableLength: js.UndefOr[Boolean] = js.undefined
  }
  object ILoadableContentProps {
    
    inline def apply(loading: Boolean): ILoadableContentProps = {
      val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILoadableContentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILoadableContentProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setVariableLength(value: Boolean): Self = StObject.set(x, "variableLength", value.asInstanceOf[js.Any])
      
      inline def setVariableLengthUndefined: Self = StObject.set(x, "variableLength", js.undefined)
    }
  }
}
