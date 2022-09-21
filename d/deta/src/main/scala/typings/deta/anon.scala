package typings.deta

import typings.deta.basicMod.ArrayType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cron extends StObject {
    
    def cron(event: Any): Any
    
    def run(event: Any): Any
  }
  object Cron {
    
    inline def apply(cron: Any => Any, run: Any => Any): Cron = {
      val __obj = js.Dynamic.literal(cron = js.Any.fromFunction1(cron), run = js.Any.fromFunction1(run))
      __obj.asInstanceOf[Cron]
    }
    
    extension [Self <: Cron](x: Self) {
      
      inline def setCron(value: Any => Any): Self = StObject.set(x, "cron", js.Any.fromFunction1(value))
      
      inline def setRun(value: Any => Any): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    }
  }
  
  trait Items extends StObject {
    
    var items: ArrayType
  }
  object Items {
    
    inline def apply(items: ArrayType): Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    extension [Self <: Items](x: Self) {
      
      inline def setItems(value: ArrayType): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    }
  }
  
  trait Last extends StObject {
    
    var last: String
    
    var size: Double
  }
  object Last {
    
    inline def apply(last: String, size: Double): Last = {
      val __obj = js.Dynamic.literal(last = last.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Last]
    }
    
    extension [Self <: Last](x: Self) {
      
      inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
