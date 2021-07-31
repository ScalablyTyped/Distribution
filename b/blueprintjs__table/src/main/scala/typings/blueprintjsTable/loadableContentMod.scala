package typings.blueprintjsTable

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadableContentMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/loadableContent", "LoadableContent")
  @js.native
  class LoadableContent protected ()
    extends PureComponent[ILoadableContentProps, js.Object, js.Any] {
    def this(props: ILoadableContentProps) = this()
    
    var calculateStyle: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MLoadableContent(prevProps: ILoadableContentProps): Unit = js.native
    
    var style: js.Any = js.native
  }
  
  trait ILoadableContentProps extends StObject {
    
    /**
      * If true, render a skeleton. Otherwise render the single, non-string child passed to this
      * component.
      */
    var loading: Boolean
    
    /**
      * If true, show a skeleton of random width (25-75% cell width) when rendering the loading state.
      * @default false
      */
    var variableLength: js.UndefOr[Boolean] = js.undefined
  }
  object ILoadableContentProps {
    
    @scala.inline
    def apply(loading: Boolean): ILoadableContentProps = {
      val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILoadableContentProps]
    }
    
    @scala.inline
    implicit class ILoadableContentPropsMutableBuilder[Self <: ILoadableContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableLength(value: Boolean): Self = StObject.set(x, "variableLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableLengthUndefined: Self = StObject.set(x, "variableLength", js.undefined)
    }
  }
}
