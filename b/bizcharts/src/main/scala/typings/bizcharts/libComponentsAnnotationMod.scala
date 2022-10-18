package typings.bizcharts

import typings.bizcharts.libComponentsAnnotationArcMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsAnnotationMod {
  
  @JSImport("bizcharts/lib/components/Annotation", "Arc")
  @js.native
  open class Arc () extends default
  
  /* note: abstract class */ @JSImport("bizcharts/lib/components/Annotation", "Base")
  @js.native
  open class Base[PropsI] ()
    extends typings.bizcharts.libComponentsAnnotationBaseMod.default[PropsI]
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
    extends typings.bizcharts.libComponentsAnnotationDataMarkerMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "DataRegion")
  @js.native
  open class DataRegion ()
    extends typings.bizcharts.libComponentsAnnotationDataRegionMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "Html")
  @js.native
  open class Html ()
    extends typings.bizcharts.libComponentsAnnotationHtmlMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "Image")
  @js.native
  open class Image ()
    extends typings.bizcharts.libComponentsAnnotationImageMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "Line")
  @js.native
  open class Line ()
    extends typings.bizcharts.libComponentsAnnotationLineMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "ReactElement")
  @js.native
  open class ReactElement ()
    extends typings.bizcharts.libComponentsAnnotationReactElementMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "Region")
  @js.native
  open class Region ()
    extends typings.bizcharts.libComponentsAnnotationRegionMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "RegionFilter")
  @js.native
  open class RegionFilter ()
    extends typings.bizcharts.libComponentsAnnotationRegionFilterMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "Text")
  @js.native
  open class Text ()
    extends typings.bizcharts.libComponentsAnnotationTextMod.default
}
