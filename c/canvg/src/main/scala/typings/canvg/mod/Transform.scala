package typings.canvg.mod

import typings.canvg.transformTransformMod.ITransformConstructor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg", "Transform")
@js.native
open class Transform protected ()
  extends typings.canvg.transformMod.Transform {
  def this(
    document: typings.canvg.documentMod.Document,
    transform: String,
    transformOrigin: js.Tuple2[
        typings.canvg.propertyMod.Property[String], 
        typings.canvg.propertyMod.Property[String]
      ]
  ) = this()
}
/* static members */
object Transform {
  
  @JSImport("canvg", "Transform")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromElement(document: typings.canvg.documentMod.Document, element: typings.canvg.documentMod.Element): typings.canvg.transformTransformMod.Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(document.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.canvg.transformTransformMod.Transform]
  
  @JSImport("canvg", "Transform.transformTypes")
  @js.native
  def transformTypes: Record[String, ITransformConstructor] = js.native
  inline def transformTypes_=(x: Record[String, ITransformConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformTypes")(x.asInstanceOf[js.Any])
}
