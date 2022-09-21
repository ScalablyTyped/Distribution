package typings.canvg

import typings.canvg.documentMod.Document
import typings.canvg.propertyMod.Property
import typings.canvg.skewMod.Skew
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skewYMod {
  
  @JSImport("canvg/dist/Transform/SkewY", "SkewY")
  @js.native
  open class SkewY protected () extends Skew {
    def this(document: Document, skew: String, transformOrigin: js.Tuple2[Property[String], Property[String]]) = this()
  }
}
