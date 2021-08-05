package typings.co

import typings.co.coBooleans.`false`
import typings.co.coBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var done: `false`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(done = false)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    def next(): `0`
  }
  object `1` {
    
    inline def apply(next: () => `0`): `1` = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setNext(value: () => `0`): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait `2` extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[`1`] = js.native
  }
  
  trait `3` extends StObject {
    
    def next(): Value
  }
  object `3` {
    
    inline def apply(next: () => Value): `3` = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[`3`]
    }
    
    extension [Self <: `3`](x: Self) {
      
      inline def setNext(value: () => Value): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait `4` extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[`3`] = js.native
  }
  
  @js.native
  trait `5` extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[js.Any] = js.native
  }
  
  trait Done extends StObject {
    
    var done: `true`
    
    var value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  }
  object Done {
    
    inline def apply(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Done = {
      val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done]
    }
    
    extension [Self <: Done](x: Self) {
      
      inline def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Iterator extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Next] = js.native
  }
  
  trait Next extends StObject {
    
    def next(): Done
  }
  object Next {
    
    inline def apply(next: () => Done): Next = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[Next]
    }
    
    extension [Self <: Next](x: Self) {
      
      inline def setNext(value: () => Done): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  trait Value extends StObject {
    
    var value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  }
  object Value {
    
    inline def apply(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
