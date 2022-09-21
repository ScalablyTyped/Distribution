package typings.canvg

import typings.canvg.documentMod.Document
import typings.canvg.documentMod.Element
import typings.canvg.propertyMod.Property
import typings.canvg.transformTransformMod.ITransformConstructor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod {
  
  @JSImport("canvg/dist/Transform", "Matrix")
  @js.native
  open class Matrix protected ()
    extends typings.canvg.matrixMod.Matrix {
    def this(
      _underscore: Document,
      matrix: String,
      transformOrigin: js.Tuple2[Property[String], Property[String]]
    ) = this()
  }
  
  @JSImport("canvg/dist/Transform", "Rotate")
  @js.native
  open class Rotate protected ()
    extends typings.canvg.rotateMod.Rotate {
    def this(document: Document, rotate: String, transformOrigin: js.Tuple2[Property[String], Property[String]]) = this()
  }
  
  @JSImport("canvg/dist/Transform", "Scale")
  @js.native
  open class Scale protected ()
    extends typings.canvg.scaleMod.Scale {
    def this(
      _underscore: Document,
      scale: String,
      transformOrigin: js.Tuple2[Property[String], Property[String]]
    ) = this()
  }
  
  @JSImport("canvg/dist/Transform", "Skew")
  @js.native
  open class Skew protected ()
    extends typings.canvg.skewMod.Skew {
    def this(document: Document, skew: String, transformOrigin: js.Tuple2[Property[String], Property[String]]) = this()
  }
  
  @JSImport("canvg/dist/Transform", "SkewX")
  @js.native
  open class SkewX protected ()
    extends typings.canvg.skewXMod.SkewX {
    def this(document: Document, skew: String, transformOrigin: js.Tuple2[Property[String], Property[String]]) = this()
  }
  
  @JSImport("canvg/dist/Transform", "SkewY")
  @js.native
  open class SkewY protected ()
    extends typings.canvg.skewYMod.SkewY {
    def this(document: Document, skew: String, transformOrigin: js.Tuple2[Property[String], Property[String]]) = this()
  }
  
  @JSImport("canvg/dist/Transform", "Transform")
  @js.native
  open class Transform protected ()
    extends typings.canvg.transformTransformMod.Transform {
    def this(
      document: Document,
      transform: String,
      transformOrigin: js.Tuple2[Property[String], Property[String]]
    ) = this()
  }
  /* static members */
  object Transform {
    
    @JSImport("canvg/dist/Transform", "Transform")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromElement(document: Document, element: Element): typings.canvg.transformTransformMod.Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(document.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.canvg.transformTransformMod.Transform]
    
    @JSImport("canvg/dist/Transform", "Transform.transformTypes")
    @js.native
    def transformTypes: Record[String, ITransformConstructor] = js.native
    inline def transformTypes_=(x: Record[String, ITransformConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("canvg/dist/Transform", "Translate")
  @js.native
  open class Translate protected ()
    extends typings.canvg.translateMod.Translate {
    def this(_underscore: Document, point: String) = this()
  }
}
