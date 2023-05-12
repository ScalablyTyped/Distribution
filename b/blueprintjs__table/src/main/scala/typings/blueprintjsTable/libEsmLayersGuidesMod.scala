package typings.blueprintjsTable

import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmLayersGuidesMod {
  
  @JSImport("@blueprintjs/table/lib/esm/layers/guides", "GuideLayer")
  @js.native
  open class GuideLayer protected ()
    extends Component[IGuideLayerProps, js.Object, Any] {
    def this(props: IGuideLayerProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: IGuideLayerProps, context: Any) = this()
    
    /* private */ var renderHorizontalGuide: Any = js.native
    
    /* private */ var renderVerticalGuide: Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MGuideLayer(nextProps: IGuideLayerProps): Boolean = js.native
  }
  
  trait IGuideLayerProps
    extends StObject
       with IProps {
    
    /**
      *  The top-offset location of the horizontal guides
      */
    var horizontalGuides: js.Array[Double]
    
    /**
      *  The left-offset location of the vertical guides
      */
    var verticalGuides: js.Array[Double]
  }
  object IGuideLayerProps {
    
    inline def apply(horizontalGuides: js.Array[Double], verticalGuides: js.Array[Double]): IGuideLayerProps = {
      val __obj = js.Dynamic.literal(horizontalGuides = horizontalGuides.asInstanceOf[js.Any], verticalGuides = verticalGuides.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGuideLayerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGuideLayerProps] (val x: Self) extends AnyVal {
      
      inline def setHorizontalGuides(value: js.Array[Double]): Self = StObject.set(x, "horizontalGuides", value.asInstanceOf[js.Any])
      
      inline def setHorizontalGuidesVarargs(value: Double*): Self = StObject.set(x, "horizontalGuides", js.Array(value*))
      
      inline def setVerticalGuides(value: js.Array[Double]): Self = StObject.set(x, "verticalGuides", value.asInstanceOf[js.Any])
      
      inline def setVerticalGuidesVarargs(value: Double*): Self = StObject.set(x, "verticalGuides", js.Array(value*))
    }
  }
}
