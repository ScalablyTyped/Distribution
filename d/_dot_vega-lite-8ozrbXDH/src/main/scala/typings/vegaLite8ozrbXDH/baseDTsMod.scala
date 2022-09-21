package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.arc
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.area
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.group
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.image
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.line
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.path
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.rect
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.rule
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.shape
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.symbol
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.text
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.trail
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgEncodeEntry
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgPostEncodingTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseDTsMod {
  
  trait MarkCompiler extends StObject {
    
    def encodeEntry(model: UnitModel): VgEncodeEntry
    
    /**
      * Transform on a mark after render, used for layout and projections
      */
    var postEncodingTransform: js.UndefOr[js.Function1[/* model */ UnitModel, js.Array[VgPostEncodingTransform]]] = js.undefined
    
    /**
      * Underlying Vega Mark type for the Vega-Lite mark.
      */
    var vgMark: arc | area | image | group | line | path | rect | rule | shape | symbol | text | trail
  }
  object MarkCompiler {
    
    inline def apply(
      encodeEntry: UnitModel => VgEncodeEntry,
      vgMark: arc | area | image | group | line | path | rect | rule | shape | symbol | text | trail
    ): MarkCompiler = {
      val __obj = js.Dynamic.literal(encodeEntry = js.Any.fromFunction1(encodeEntry), vgMark = vgMark.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkCompiler]
    }
    
    extension [Self <: MarkCompiler](x: Self) {
      
      inline def setEncodeEntry(value: UnitModel => VgEncodeEntry): Self = StObject.set(x, "encodeEntry", js.Any.fromFunction1(value))
      
      inline def setPostEncodingTransform(value: /* model */ UnitModel => js.Array[VgPostEncodingTransform]): Self = StObject.set(x, "postEncodingTransform", js.Any.fromFunction1(value))
      
      inline def setPostEncodingTransformUndefined: Self = StObject.set(x, "postEncodingTransform", js.undefined)
      
      inline def setVgMark(value: arc | area | image | group | line | path | rect | rule | shape | symbol | text | trail): Self = StObject.set(x, "vgMark", value.asInstanceOf[js.Any])
    }
  }
}
