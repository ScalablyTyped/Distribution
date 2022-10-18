package typings.datastoreCore

import typings.interfaceDatastore.mod.Key
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  type Await[T] = js.Promise[T] | T
  
  type AwaitIterable[T] = js.Iterable[T] | AsyncIterable[T]
  
  trait KeyTransform extends StObject {
    
    def convert(key: Key): Key
    
    def invert(key: Key): Key
  }
  object KeyTransform {
    
    inline def apply(convert: Key => Key, invert: Key => Key): KeyTransform = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), invert = js.Any.fromFunction1(invert))
      __obj.asInstanceOf[KeyTransform]
    }
    
    extension [Self <: KeyTransform](x: Self) {
      
      inline def setConvert(value: Key => Key): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
      
      inline def setInvert(value: Key => Key): Self = StObject.set(x, "invert", js.Any.fromFunction1(value))
    }
  }
  
  trait Shard extends StObject {
    
    val _padding: String
    
    def fun(s: String): String
    
    var name: String
    
    var param: Double
  }
  object Shard {
    
    inline def apply(_padding: String, fun: String => String, name: String, param: Double): Shard = {
      val __obj = js.Dynamic.literal(_padding = _padding.asInstanceOf[js.Any], fun = js.Any.fromFunction1(fun), name = name.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shard]
    }
    
    extension [Self <: Shard](x: Self) {
      
      inline def setFun(value: String => String): Self = StObject.set(x, "fun", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParam(value: Double): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def set_padding(value: String): Self = StObject.set(x, "_padding", value.asInstanceOf[js.Any])
    }
  }
}
