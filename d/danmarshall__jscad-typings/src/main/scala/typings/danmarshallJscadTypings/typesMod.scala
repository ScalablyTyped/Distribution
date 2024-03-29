package typings.danmarshallJscadTypings

import org.scalablytyped.runtime.NumberDictionary
import typings.danmarshallJscadTypings.typesCsgMod.CSG.IArcOptions
import typings.danmarshallJscadTypings.typesCsgMod.CSG.ICircleOptions
import typings.danmarshallJscadTypings.typesCsgMod.CSG.Vector2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("@danmarshall/jscad-typings/types", "CAG")
  @js.native
  open class CAG ()
    extends typings.danmarshallJscadTypings.typesCsgMod.CAG
  /* static members */
  object CAG {
    
    @JSImport("@danmarshall/jscad-typings/types", "CAG")
    @js.native
    val ^ : js.Any = js.native
    
    inline def circle(options: ICircleOptions): typings.danmarshallJscadTypings.typesCsgMod.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("circle")(options.asInstanceOf[js.Any]).asInstanceOf[typings.danmarshallJscadTypings.typesCsgMod.CAG]
    
    inline def fromPoints(points: js.Array[NumberDictionary[Double] | Vector2D]): typings.danmarshallJscadTypings.typesCsgMod.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(points.asInstanceOf[js.Any]).asInstanceOf[typings.danmarshallJscadTypings.typesCsgMod.CAG]
  }
  
  @JSImport("@danmarshall/jscad-typings/types", "CSG")
  @js.native
  open class CSG ()
    extends typings.danmarshallJscadTypings.typesCsgMod.CSG
  object CSG {
    
    @JSImport("@danmarshall/jscad-typings/types", "CSG.Path2D")
    @js.native
    open class Path2D ()
      extends typings.danmarshallJscadTypings.typesCsgMod.CSG.Path2D
    object Path2D {
      
      @JSImport("@danmarshall/jscad-typings/types", "CSG.Path2D")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def arc(options: IArcOptions): typings.danmarshallJscadTypings.typesCsgMod.CSG.Path2D = ^.asInstanceOf[js.Dynamic].applyDynamic("arc")(options.asInstanceOf[js.Any]).asInstanceOf[typings.danmarshallJscadTypings.typesCsgMod.CSG.Path2D]
    }
    
    @JSImport("@danmarshall/jscad-typings/types", "CSG.Polygon")
    @js.native
    open class Polygon ()
      extends typings.danmarshallJscadTypings.typesCsgMod.CSG.Polygon
    
    @JSImport("@danmarshall/jscad-typings/types", "CSG.Vector2D")
    @js.native
    open class Vector2D ()
      extends typings.danmarshallJscadTypings.typesCsgMod.CSG.Vector2D
  }
  
  @JSImport("@danmarshall/jscad-typings/types", "CxG")
  @js.native
  open class CxG ()
    extends typings.danmarshallJscadTypings.typesCsgMod.CxG
}
