package typings.co

import typings.co.coBooleans.`false`
import typings.co.coBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var done: `false` = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(done: `false`): `0` = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `1` extends StObject {
    
    def next(): `0` = js.native
  }
  object `1` {
    
    @scala.inline
    def apply(next: () => `0`): `1` = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: () => `0`): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait `2` extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[`1`] = js.native
  }
  
  @js.native
  trait `3` extends StObject {
    
    def next(): Value = js.native
  }
  object `3` {
    
    @scala.inline
    def apply(next: () => Value): `3` = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[`3`]
    }
    
    @scala.inline
    implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: () => Value): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
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
    var iterator: js.Function0[_] = js.native
  }
  
  @js.native
  trait Done extends StObject {
    
    var done: `true` = js.native
    
    var value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any = js.native
  }
  object Done {
    
    @scala.inline
    def apply(
      done: `true`,
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
    ): Done = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done]
    }
    
    @scala.inline
    implicit class DoneMutableBuilder[Self <: Done] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Iterator extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Next] = js.native
  }
  
  @js.native
  trait Next extends StObject {
    
    def next(): Done = js.native
  }
  object Next {
    
    @scala.inline
    def apply(next: () => Done): Next = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[Next]
    }
    
    @scala.inline
    implicit class NextMutableBuilder[Self <: Next] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: () => Done): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any = js.native
  }
  object Value {
    
    @scala.inline
    def apply(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
