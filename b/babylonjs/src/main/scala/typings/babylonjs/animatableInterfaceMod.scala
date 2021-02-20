package typings.babylonjs

import typings.babylonjs.animationMod.Animation
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animatableInterfaceMod {
  
  @js.native
  trait IAnimatable extends StObject {
    
    /**
      * Array of animations
      */
    var animations: Nullable[js.Array[Animation]] = js.native
  }
  object IAnimatable {
    
    @scala.inline
    def apply(): IAnimatable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnimatable]
    }
    
    @scala.inline
    implicit class IAnimatableMutableBuilder[Self <: IAnimatable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimations(value: Nullable[js.Array[Animation]]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationsNull: Self = StObject.set(x, "animations", null)
      
      @scala.inline
      def setAnimationsVarargs(value: Animation*): Self = StObject.set(x, "animations", js.Array(value :_*))
    }
  }
}
