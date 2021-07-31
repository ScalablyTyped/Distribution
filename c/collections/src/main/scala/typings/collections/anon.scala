package typings.collections

import typings.collections.collectionsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Done[T] extends StObject {
    
    var done: `true`
    
    var value: js.UndefOr[T | Null] = js.undefined
  }
  object Done {
    
    @scala.inline
    def apply[T](): Done[T] = {
      val __obj = js.Dynamic.literal(done = true)
      __obj.asInstanceOf[Done[T]]
    }
    
    @scala.inline
    implicit class DoneMutableBuilder[Self <: Done[?], T] (val x: Self & Done[T]) extends AnyVal {
      
      @scala.inline
      def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
