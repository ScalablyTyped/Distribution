package typings.carbonIconHelpers

import typings.carbonIconHelpers.anon.Focusable
import typings.carbonIconHelpers.anon.Height
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object defaultAttributes {
    
    @JSImport("@carbon/icon-helpers", "defaultAttributes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@carbon/icon-helpers", "defaultAttributes.focusable")
    @js.native
    def focusable: String = js.native
    @scala.inline
    def focusable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusable")(x.asInstanceOf[js.Any])
    
    @JSImport("@carbon/icon-helpers", "defaultAttributes.preserveAspectRatio")
    @js.native
    def preserveAspectRatio: String = js.native
    @scala.inline
    def preserveAspectRatio_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preserveAspectRatio")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@carbon/icon-helpers", "formatAttributes")
  @js.native
  def formatAttributes(attrs: js.Any): String = js.native
  
  @JSImport("@carbon/icon-helpers", "getAttributes")
  @js.native
  def getAttributes(): Focusable = js.native
  @JSImport("@carbon/icon-helpers", "getAttributes")
  @js.native
  def getAttributes(hasWidthHeightViewBoxAttributes: Height): Focusable = js.native
  
  @JSImport("@carbon/icon-helpers", "toSVG")
  @js.native
  def toSVG(descriptor: js.Any): SVGSVGElement = js.native
  
  @JSImport("@carbon/icon-helpers", "toString")
  @js.native
  def toString_(descriptor: js.Any): String = js.native
}
