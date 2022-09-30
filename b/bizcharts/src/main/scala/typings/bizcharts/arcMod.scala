package typings.bizcharts

import typings.antvG2.libInterfaceMod.AnnotationPosition
import typings.bizcharts.baseMod.IAnnotationBaseProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcMod {
  
  @JSImport("bizcharts/lib/components/Annotation/arc", JSImport.Default)
  @js.native
  open class default () extends Arc
  
  trait AnnotationArcProps
    extends StObject
       with IAnnotationBaseProps {
    
    /** 结束位置 */
    val end: AnnotationPosition
    
    /** 起始位置 */
    val start: AnnotationPosition
  }
  object AnnotationArcProps {
    
    inline def apply(end: AnnotationPosition, start: AnnotationPosition): AnnotationArcProps = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationArcProps]
    }
    
    extension [Self <: AnnotationArcProps](x: Self) {
      
      inline def setEnd(value: AnnotationPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndFunction2(
        value: (/* xScales */ (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]) | (Record[
              String, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]), /* yScales */ (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]) | (Record[
              String, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ])) => js.Tuple2[Double | String, Double | String]
      ): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      inline def setStart(value: AnnotationPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartFunction2(
        value: (/* xScales */ (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]) | (Record[
              String, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]), /* yScales */ (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]) | (Record[
              String, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ])) => js.Tuple2[Double | String, Double | String]
      ): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Arc
    extends typings.bizcharts.baseMod.default[AnnotationArcProps]
}
