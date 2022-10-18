package typings.blueprintjsTable

import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType
import typings.blueprintjsTable.libEsmRegionsMod.Region
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmLayersRegionsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/layers/regions", "RegionLayer")
  @js.native
  open class RegionLayer protected ()
    extends Component[RegionLayerProps, js.Object, Any] {
    def this(props: RegionLayerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RegionLayerProps, context: Any) = this()
    
    /* private */ var renderRegion: Any = js.native
    
    /* private */ var renderRegionChildren: Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MRegionLayer(nextProps: RegionLayerProps): Boolean = js.native
  }
  
  trait RegionLayerProps
    extends StObject
       with IProps {
    
    /**
      * The array of CSS styles to apply to each region. The ith style object in this array will be
      * applied to the ith region in `regions`.
      */
    var regionStyles: js.UndefOr[js.Array[CSSProperties]] = js.undefined
    
    /**
      * The array of regions to render.
      */
    var regions: js.UndefOr[js.Array[Region]] = js.undefined
  }
  object RegionLayerProps {
    
    inline def apply(): RegionLayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegionLayerProps]
    }
    
    extension [Self <: RegionLayerProps](x: Self) {
      
      inline def setRegionStyles(value: js.Array[CSSProperties]): Self = StObject.set(x, "regionStyles", value.asInstanceOf[js.Any])
      
      inline def setRegionStylesUndefined: Self = StObject.set(x, "regionStyles", js.undefined)
      
      inline def setRegionStylesVarargs(value: CSSProperties*): Self = StObject.set(x, "regionStyles", js.Array(value*))
      
      inline def setRegions(value: js.Array[Region]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
      
      inline def setRegionsVarargs(value: Region*): Self = StObject.set(x, "regions", js.Array(value*))
    }
  }
  
  type RegionStyler = js.Function2[/* region */ Region, /* quadrantType */ js.UndefOr[QuadrantType], CSSProperties]
}
