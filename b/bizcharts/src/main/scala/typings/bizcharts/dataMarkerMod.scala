package typings.bizcharts

import typings.antvG2.libInterfaceMod.AnnotationPosition
import typings.antvG2.libInterfaceMod.DataMarkerOption
import typings.bizcharts.baseMod.IAnnotationBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMarkerMod {
  
  @JSImport("bizcharts/lib/components/Annotation/dataMarker", JSImport.Default)
  @js.native
  open class default () extends DataMarker
  
  trait AnnotationDataMarkerProps
    extends StObject
       with DataMarkerOption
       with IAnnotationBaseProps
  object AnnotationDataMarkerProps {
    
    inline def apply(position: AnnotationPosition): AnnotationDataMarkerProps = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], text = null)
      __obj.asInstanceOf[AnnotationDataMarkerProps]
    }
  }
  
  @js.native
  trait DataMarker
    extends typings.bizcharts.baseMod.default[AnnotationDataMarkerProps]
}
