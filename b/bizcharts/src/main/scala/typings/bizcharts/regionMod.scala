package typings.bizcharts

import typings.antvG2.libInterfaceMod.AnnotationPosition
import typings.antvG2.libInterfaceMod.RegionPositionBaseOption
import typings.bizcharts.baseMod.IAnnotationBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regionMod {
  
  @JSImport("bizcharts/lib/components/Annotation/region", JSImport.Default)
  @js.native
  open class default () extends Region
  
  trait AnnotationRegionProps
    extends StObject
       with RegionPositionBaseOption
       with IAnnotationBaseProps
  object AnnotationRegionProps {
    
    inline def apply(end: AnnotationPosition, start: AnnotationPosition): AnnotationRegionProps = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationRegionProps]
    }
  }
  
  @js.native
  trait Region
    extends typings.bizcharts.baseMod.default[AnnotationRegionProps]
}
