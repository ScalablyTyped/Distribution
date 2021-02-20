package typings.blueprintjsTable

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.blueprintjsTable.tableQuadrantMod.QuadrantType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regionsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/layers/regions", "RegionLayer")
  @js.native
  class RegionLayer protected ()
    extends Component[IRegionLayerProps, js.Object, js.Any] {
    def this(props: IRegionLayerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IRegionLayerProps, context: js.Any) = this()
    
    var renderRegion: js.Any = js.native
    
    var renderRegionChildren: js.Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MRegionLayer(nextProps: IRegionLayerProps): Boolean = js.native
  }
  
  @js.native
  trait IRegionLayerProps extends IProps {
    
    /**
      * The array of CSS styles to apply to each region. The ith style object in this array will be
      * applied to the ith region in `regions`.
      */
    var regionStyles: js.UndefOr[js.Array[CSSProperties]] = js.native
    
    /**
      * The array of regions to render.
      */
    var regions: js.UndefOr[js.Array[IRegion]] = js.native
  }
  object IRegionLayerProps {
    
    @scala.inline
    def apply(): IRegionLayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRegionLayerProps]
    }
    
    @scala.inline
    implicit class IRegionLayerPropsMutableBuilder[Self <: IRegionLayerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegionStyles(value: js.Array[CSSProperties]): Self = StObject.set(x, "regionStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionStylesUndefined: Self = StObject.set(x, "regionStyles", js.undefined)
      
      @scala.inline
      def setRegionStylesVarargs(value: CSSProperties*): Self = StObject.set(x, "regionStyles", js.Array(value :_*))
      
      @scala.inline
      def setRegions(value: js.Array[IRegion]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
      
      @scala.inline
      def setRegionsVarargs(value: IRegion*): Self = StObject.set(x, "regions", js.Array(value :_*))
    }
  }
  
  type IRegionStyler = js.Function2[/* region */ IRegion, /* quadrantType */ js.UndefOr[QuadrantType], CSSProperties]
}
