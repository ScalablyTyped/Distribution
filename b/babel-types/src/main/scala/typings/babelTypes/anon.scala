package typings.babelTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Column {
    
    @scala.inline
    def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cooked extends StObject {
    
    var cooked: js.UndefOr[String] = js.undefined
    
    var raw: js.UndefOr[String] = js.undefined
  }
  object Cooked {
    
    @scala.inline
    def apply(): Cooked = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cooked]
    }
    
    @scala.inline
    implicit class CookedMutableBuilder[Self <: Cooked] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCooked(value: String): Self = StObject.set(x, "cooked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookedUndefined: Self = StObject.set(x, "cooked", js.undefined)
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  trait Raw extends StObject {
    
    var cooked: String
    
    var raw: String
  }
  object Raw {
    
    @scala.inline
    def apply(cooked: String, raw: String): Raw = {
      val __obj = js.Dynamic.literal(cooked = cooked.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Raw]
    }
    
    @scala.inline
    implicit class RawMutableBuilder[Self <: Raw] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCooked(value: String): Self = StObject.set(x, "cooked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
}
