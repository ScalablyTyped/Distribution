package typings.chartjsPluginAnnotation

import org.scalablytyped.runtime.Instantiable1
import typings.chartjsPluginAnnotation.mod.AnnotationElementOptions
import typings.chartjsPluginAnnotation.mod.BoxAnnotation
import typings.chartjsPluginAnnotation.mod.BoxAnnotationOptions
import typings.chartjsPluginAnnotation.mod.LineAnnotation
import typings.chartjsPluginAnnotation.mod.LineAnnotationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Box extends StObject {
    
    var box: Instantiable1[/* options */ AnnotationElementOptions[BoxAnnotationOptions], BoxAnnotation] = js.native
    
    var line: Instantiable1[/* options */ AnnotationElementOptions[LineAnnotationOptions], LineAnnotation] = js.native
  }
  object Box {
    
    @scala.inline
    def apply(
      box: Instantiable1[/* options */ AnnotationElementOptions[BoxAnnotationOptions], BoxAnnotation],
      line: Instantiable1[/* options */ AnnotationElementOptions[LineAnnotationOptions], LineAnnotation]
    ): Box = {
      val __obj = js.Dynamic.literal(box = box.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Box]
    }
    
    @scala.inline
    implicit class BoxMutableBuilder[Self <: Box] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBox(value: Instantiable1[/* options */ AnnotationElementOptions[BoxAnnotationOptions], BoxAnnotation]): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(
        value: Instantiable1[/* options */ AnnotationElementOptions[LineAnnotationOptions], LineAnnotation]
      ): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
