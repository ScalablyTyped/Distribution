package typings.cssTree

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Atrules extends StObject {
    
    var atrules: js.UndefOr[Record[String, String]] = js.undefined
    
    var properties: js.UndefOr[Record[String, String]] = js.undefined
    
    var types: js.UndefOr[Record[String, String]] = js.undefined
  }
  object Atrules {
    
    inline def apply(): Atrules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Atrules]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Atrules] (val x: Self) extends AnyVal {
      
      inline def setAtrules(value: Record[String, String]): Self = StObject.set(x, "atrules", value.asInstanceOf[js.Any])
      
      inline def setAtrulesUndefined: Self = StObject.set(x, "atrules", js.undefined)
      
      inline def setProperties(value: Record[String, String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTypes(value: Record[String, String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    }
  }
  
  trait Column extends StObject {
    
    var column: Double
    
    var line: Double
    
    var offset: Double
  }
  object Column {
    
    inline def apply(column: Double, line: Double, offset: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: Column
    
    var source: String
    
    var start: Column
  }
  object End {
    
    inline def apply(end: Column, source: String, start: Column): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Column): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Column): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Lexer extends StObject {
    
    var lexer: typings.cssTree.mod.Lexer
  }
  object Lexer {
    
    inline def apply(lexer: typings.cssTree.mod.Lexer): Lexer = {
      val __obj = js.Dynamic.literal(lexer = lexer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lexer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lexer] (val x: Self) extends AnyVal {
      
      inline def setLexer(value: typings.cssTree.mod.Lexer): Self = StObject.set(x, "lexer", value.asInstanceOf[js.Any])
    }
  }
}
