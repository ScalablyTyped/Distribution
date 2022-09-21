package typings.blackEngine

import typings.blackEngine.capsStyleMod.CapsStyle
import typings.blackEngine.fillRuleMod.FillRule
import typings.blackEngine.jointStyleMod.JointStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bvgstyleMod {
  
  @JSImport("black-engine/parsers/BVGStyle", "BVGStyle")
  @js.native
  open class BVGStyle () extends StObject {
    
    /* private */ var F: Any = js.native
    
    /* private */ var L: Any = js.native
    
    /* private */ var a: Any = js.native
    
    /* private */ var c: Any = js.native
    
    def compute(): Unit = js.native
    
    /* private */ var d: Any = js.native
    
    /* private */ var f: Any = js.native
    
    var fillAlpha: Double = js.native
    
    var fillColor: Double = js.native
    
    var fillRule: FillRule = js.native
    
    /* private */ var j: Any = js.native
    
    /* private */ var l: Any = js.native
    
    var lineAlpha: Double = js.native
    
    var lineCap: CapsStyle = js.native
    
    var lineColor: Double = js.native
    
    var lineDash: js.Array[Double] = js.native
    
    var lineJoin: JointStyle = js.native
    
    var lineWidth: Double = js.native
    
    /* private */ var m: Any = js.native
    
    def merge(style: BVGStyle): Unit = js.native
    
    var miterLimit: Double = js.native
    
    var needsFill: Boolean = js.native
    
    var needsStroke: Boolean = js.native
    
    /* private */ var r: Any = js.native
    
    /* private */ var w: Any = js.native
  }
}
