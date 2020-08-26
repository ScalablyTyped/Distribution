package typings.chartjsPluginAnnotation.anon

import org.scalablytyped.runtime.Instantiable1
import typings.chartjsPluginAnnotation.mod.AnnotationElementOptions
import typings.chartjsPluginAnnotation.mod.BoxAnnotation
import typings.chartjsPluginAnnotation.mod.BoxAnnotationOptions
import typings.chartjsPluginAnnotation.mod.LineAnnotation
import typings.chartjsPluginAnnotation.mod.LineAnnotationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Box extends js.Object {
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
  implicit class BoxOps[Self <: Box] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBox(value: Instantiable1[/* options */ AnnotationElementOptions[BoxAnnotationOptions], BoxAnnotation]): Self = this.set("box", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(
      value: Instantiable1[/* options */ AnnotationElementOptions[LineAnnotationOptions], LineAnnotation]
    ): Self = this.set("line", value.asInstanceOf[js.Any])
  }
  
}

