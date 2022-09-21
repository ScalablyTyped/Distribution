package typings.terserMCwkxx7L

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Record
import typings.terserMCwkxx7L.mod.ASTNode
import typings.terserMCwkxx7L.terserMCwkxx7LStrings.comment1
import typings.terserMCwkxx7L.terserMCwkxx7LStrings.comment2
import typings.terserMCwkxx7L.terserMCwkxx7LStrings.comment3
import typings.terserMCwkxx7L.terserMCwkxx7LStrings.comment4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Col extends StObject {
    
    var col: Double
    
    var line: Double
    
    var pos: Double
    
    var `type`: comment1 | comment2 | comment3 | comment4
    
    var value: String
  }
  object Col {
    
    inline def apply(
      col: Double,
      line: Double,
      pos: Double,
      `type`: comment1 | comment2 | comment3 | comment4,
      value: String
    ): Col = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Col]
    }
    
    extension [Self <: Col](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setType(value: comment1 | comment2 | comment3 | comment4): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Flags extends StObject {
    
    var flags: String
    
    var source: String
  }
  object Flags {
    
    inline def apply(flags: String, source: String): Flags = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flags]
    }
    
    extension [Self <: Flags](x: Self) {
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofASTNode
    extends StObject
       with Instantiable0[ASTNode]
       with Instantiable1[/* props */ js.Object, ASTNode] {
    
    var BASE: js.UndefOr[ASTNode] = js.native
    
    var PROPS: js.Array[String] = js.native
    
    var SELF_PROPS: js.Array[String] = js.native
    
    var SUBCLASSES: js.Array[ASTNode] = js.native
    
    var documentation: String = js.native
    
    var expressions: js.UndefOr[js.Array[ASTNode]] = js.native
    
    var from_mozilla_ast: js.UndefOr[js.Function1[/* node */ this.type, Any]] = js.native
    
    var propdoc: js.UndefOr[Record[String, String]] = js.native
    
    var warn: js.UndefOr[js.Function2[/* text */ String, /* props */ Any, Unit]] = js.native
  }
}
