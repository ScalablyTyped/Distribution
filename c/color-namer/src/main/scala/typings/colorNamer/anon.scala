package typings.colorNamer

import typings.colorNamer.mod.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Omit[T /* <: Palette */] extends StObject {
    
    var omit: js.Array[T]
  }
  object Omit {
    
    @scala.inline
    def apply[T /* <: Palette */](omit: js.Array[T]): Omit[T] = {
      val __obj = js.Dynamic.literal(omit = omit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Omit[T]]
    }
    
    @scala.inline
    implicit class OmitMutableBuilder[Self <: Omit[?], T /* <: Palette */] (val x: Self & Omit[T]) extends AnyVal {
      
      @scala.inline
      def setOmit(value: js.Array[T]): Self = StObject.set(x, "omit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOmitVarargs(value: T*): Self = StObject.set(x, "omit", js.Array(value :_*))
    }
  }
  
  trait Pick[T /* <: Palette */] extends StObject {
    
    var pick: js.Array[T]
  }
  object Pick {
    
    @scala.inline
    def apply[T /* <: Palette */](pick: js.Array[T]): Pick[T] = {
      val __obj = js.Dynamic.literal(pick = pick.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pick[T]]
    }
    
    @scala.inline
    implicit class PickMutableBuilder[Self <: Pick[?], T /* <: Palette */] (val x: Self & Pick[T]) extends AnyVal {
      
      @scala.inline
      def setPick(value: js.Array[T]): Self = StObject.set(x, "pick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickVarargs(value: T*): Self = StObject.set(x, "pick", js.Array(value :_*))
    }
  }
}
