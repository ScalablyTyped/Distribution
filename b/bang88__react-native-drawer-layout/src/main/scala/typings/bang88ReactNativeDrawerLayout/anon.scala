package typings.bang88ReactNativeDrawerLayout

import typings.bang88ReactNativeDrawerLayout.bang88ReactNativeDrawerLayoutStrings.left
import typings.bang88ReactNativeDrawerLayout.bang88ReactNativeDrawerLayoutStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Left extends StObject {
    
    var Left: left = js.native
    
    var Right: right = js.native
  }
  object Left {
    
    @scala.inline
    def apply(Left: left, Right: right): Left = {
      val __obj = js.Dynamic.literal(Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: left): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: right): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Offset extends StObject {
    
    var offset: Double = js.native
  }
  object Offset {
    
    @scala.inline
    def apply(offset: Double): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
