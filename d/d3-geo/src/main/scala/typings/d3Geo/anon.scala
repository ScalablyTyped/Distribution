package typings.d3Geo

import typings.d3Geo.mod.GeoStream_
import typings.d3Geo.mod.GeoTransformPrototype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`[T /* <: GeoTransformPrototype */] extends StObject {
    
    def stream(s: GeoStream_): T with GeoStream_ = js.native
  }
  object `0` {
    
    @scala.inline
    def apply[T /* <: GeoTransformPrototype */](stream: GeoStream_ => T with GeoStream_): `0`[T] = {
      val __obj = js.Dynamic.literal(stream = js.Any.fromFunction1(stream))
      __obj.asInstanceOf[`0`[T]]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`[_], T /* <: GeoTransformPrototype */] (val x: Self with `0`[T]) extends AnyVal {
      
      @scala.inline
      def setStream(value: GeoStream_ => T with GeoStream_): Self = StObject.set(x, "stream", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Properties extends StObject {
    
    var properties: js.Any = js.native
    
    var `type`: String = js.native
  }
  object Properties {
    
    @scala.inline
    def apply(properties: js.Any, `type`: String): Properties = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Properties]
    }
    
    @scala.inline
    implicit class PropertiesMutableBuilder[Self <: Properties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Stream extends StObject {
    
    var stream: GeoStream_ = js.native
  }
  object Stream {
    
    @scala.inline
    def apply(stream: GeoStream_): Stream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stream]
    }
    
    @scala.inline
    implicit class StreamMutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStream(value: GeoStream_): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
