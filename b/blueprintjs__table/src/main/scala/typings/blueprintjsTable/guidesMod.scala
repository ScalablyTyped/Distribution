package typings.blueprintjsTable

import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guidesMod {
  
  @JSImport("@blueprintjs/table/lib/esm/layers/guides", "GuideLayer")
  @js.native
  class GuideLayer protected ()
    extends Component[IGuideLayerProps, js.Object, js.Any] {
    def this(props: IGuideLayerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IGuideLayerProps, context: js.Any) = this()
    
    /* private */ var renderHorizontalGuide: js.Any = js.native
    
    /* private */ var renderVerticalGuide: js.Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MGuideLayer(nextProps: IGuideLayerProps): Boolean = js.native
  }
  
  trait IGuideLayerProps
    extends StObject
       with IProps {
    
    /**
      *  The top-offset location of the horizontal guides
      */
    var horizontalGuides: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      *  The left-offset location of the vertical guides
      */
    var verticalGuides: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object IGuideLayerProps {
    
    inline def apply(): IGuideLayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGuideLayerProps]
    }
    
    extension [Self <: IGuideLayerProps](x: Self) {
      
      inline def setHorizontalGuides(value: js.Array[Double]): Self = StObject.set(x, "horizontalGuides", value.asInstanceOf[js.Any])
      
      inline def setHorizontalGuidesUndefined: Self = StObject.set(x, "horizontalGuides", js.undefined)
      
      inline def setHorizontalGuidesVarargs(value: Double*): Self = StObject.set(x, "horizontalGuides", js.Array(value :_*))
      
      inline def setVerticalGuides(value: js.Array[Double]): Self = StObject.set(x, "verticalGuides", value.asInstanceOf[js.Any])
      
      inline def setVerticalGuidesUndefined: Self = StObject.set(x, "verticalGuides", js.undefined)
      
      inline def setVerticalGuidesVarargs(value: Double*): Self = StObject.set(x, "verticalGuides", js.Array(value :_*))
    }
  }
}
