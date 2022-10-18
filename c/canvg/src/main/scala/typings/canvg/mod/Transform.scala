package typings.canvg.mod

import typings.canvg.distTransformTransformMod.ITransformConstructor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg", "Transform")
@js.native
open class Transform protected ()
  extends typings.canvg.distTransformMod.Transform {
  def this(
    document: typings.canvg.distDocumentMod.Document,
    transform: String,
    transformOrigin: js.Tuple2[
        typings.canvg.distPropertyMod.Property[String], 
        typings.canvg.distPropertyMod.Property[String]
      ]
  ) = this()
}
/* static members */
object Transform {
  
  @JSImport("canvg", "Transform")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromElement(document: typings.canvg.distDocumentMod.Document, element: typings.canvg.distDocumentMod.Element): typings.canvg.distTransformTransformMod.Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(document.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.canvg.distTransformTransformMod.Transform]
  
  @JSImport("canvg", "Transform.transformTypes")
  @js.native
  def transformTypes: Record[String, ITransformConstructor] = js.native
  inline def transformTypes_=(x: Record[String, ITransformConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformTypes")(x.asInstanceOf[js.Any])
}
