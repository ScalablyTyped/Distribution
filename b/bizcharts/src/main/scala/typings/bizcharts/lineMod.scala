package typings.bizcharts

import typings.antvG2.libInterfaceMod.AnnotationPosition
import typings.antvG2.libInterfaceMod.LineOption
import typings.bizcharts.baseMod.IAnnotationBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineMod {
  
  @JSImport("bizcharts/lib/components/Annotation/line", JSImport.Default)
  @js.native
  open class default () extends Line
  
  trait AnnotationLineProps
    extends StObject
       with LineOption
       with IAnnotationBaseProps
  object AnnotationLineProps {
    
    inline def apply(end: AnnotationPosition, start: AnnotationPosition): AnnotationLineProps = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationLineProps]
    }
  }
  
  @js.native
  trait Line
    extends typings.bizcharts.baseMod.default[AnnotationLineProps]
}
