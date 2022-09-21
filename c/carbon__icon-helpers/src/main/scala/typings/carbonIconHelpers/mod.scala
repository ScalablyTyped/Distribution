package typings.carbonIconHelpers

import typings.carbonIconHelpers.anon.Focusable
import typings.carbonIconHelpers.anon.Height
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@carbon/icon-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object defaultAttributes {
    
    @JSImport("@carbon/icon-helpers", "defaultAttributes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@carbon/icon-helpers", "defaultAttributes.focusable")
    @js.native
    def focusable: String = js.native
    inline def focusable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusable")(x.asInstanceOf[js.Any])
    
    @JSImport("@carbon/icon-helpers", "defaultAttributes.preserveAspectRatio")
    @js.native
    def preserveAspectRatio: String = js.native
    inline def preserveAspectRatio_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preserveAspectRatio")(x.asInstanceOf[js.Any])
  }
  
  inline def formatAttributes(attrs: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatAttributes")(attrs.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getAttributes(): Focusable = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttributes")().asInstanceOf[Focusable]
  inline def getAttributes(hasWidthHeightViewBoxAttributes: Height): Focusable = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttributes")(hasWidthHeightViewBoxAttributes.asInstanceOf[js.Any]).asInstanceOf[Focusable]
  
  inline def toSVG(descriptor: Any): SVGSVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("toSVG")(descriptor.asInstanceOf[js.Any]).asInstanceOf[SVGSVGElement]
  
  inline def toString_(descriptor: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(descriptor.asInstanceOf[js.Any]).asInstanceOf[String]
}
