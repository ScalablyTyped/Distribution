package typings.bizcharts

import typings.bizcharts.arcMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object annotationMod {
  
  @JSImport("bizcharts/lib/components/Annotation", "Arc")
  @js.native
  open class Arc () extends default
  
  @JSImport("bizcharts/lib/components/Annotation", "Base")
  @js.native
  abstract class Base[PropsI] ()
    extends typings.bizcharts.baseMod.default[PropsI]
  object Base {
    
    @JSImport("bizcharts/lib/components/Annotation", "Base")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("bizcharts/lib/components/Annotation", "Base.contextType")
    @js.native
    def contextType: Any = js.native
    inline def contextType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("bizcharts/lib/components/Annotation", "DataMarker")
  @js.native
  open class DataMarker ()
    extends typings.bizcharts.dataMarkerMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "DataRegion")
  @js.native
  open class DataRegion ()
    extends typings.bizcharts.dataRegionMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "Html")
  @js.native
  open class Html ()
    extends typings.bizcharts.htmlMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "Image")
  @js.native
  open class Image ()
    extends typings.bizcharts.imageMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "Line")
  @js.native
  open class Line ()
    extends typings.bizcharts.lineMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "ReactElement")
  @js.native
  open class ReactElement ()
    extends typings.bizcharts.reactElementMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "Region")
  @js.native
  open class Region ()
    extends typings.bizcharts.regionMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "RegionFilter")
  @js.native
  open class RegionFilter ()
    extends typings.bizcharts.regionFilterMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "Text")
  @js.native
  open class Text ()
    extends typings.bizcharts.textMod.default
}
