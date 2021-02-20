package typings.collections

import typings.collections.collectionsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Done[T] extends StObject {
    
    var done: `true` = js.native
    
    var value: js.UndefOr[T | Null] = js.native
  }
  object Done {
    
    @scala.inline
    def apply[T](done: `true`): Done[T] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done[T]]
    }
    
    @scala.inline
    implicit class DoneMutableBuilder[Self <: Done[_], T] (val x: Self with Done[T]) extends AnyVal {
      
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
