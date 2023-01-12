package typings.collections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BranchDown extends StObject {
    
    var branchDown: String
    
    var branchUp: String
    
    var fromAbove: String
    
    var fromBelow: String
    
    var fromBoth: String
    
    var intersection: String
    
    var strafe: String
    
    var through: String
  }
  object BranchDown {
    
    inline def apply(
      branchDown: String,
      branchUp: String,
      fromAbove: String,
      fromBelow: String,
      fromBoth: String,
      intersection: String,
      strafe: String,
      through: String
    ): BranchDown = {
      val __obj = js.Dynamic.literal(branchDown = branchDown.asInstanceOf[js.Any], branchUp = branchUp.asInstanceOf[js.Any], fromAbove = fromAbove.asInstanceOf[js.Any], fromBelow = fromBelow.asInstanceOf[js.Any], fromBoth = fromBoth.asInstanceOf[js.Any], intersection = intersection.asInstanceOf[js.Any], strafe = strafe.asInstanceOf[js.Any], through = through.asInstanceOf[js.Any])
      __obj.asInstanceOf[BranchDown]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BranchDown] (val x: Self) extends AnyVal {
      
      inline def setBranchDown(value: String): Self = StObject.set(x, "branchDown", value.asInstanceOf[js.Any])
      
      inline def setBranchUp(value: String): Self = StObject.set(x, "branchUp", value.asInstanceOf[js.Any])
      
      inline def setFromAbove(value: String): Self = StObject.set(x, "fromAbove", value.asInstanceOf[js.Any])
      
      inline def setFromBelow(value: String): Self = StObject.set(x, "fromBelow", value.asInstanceOf[js.Any])
      
      inline def setFromBoth(value: String): Self = StObject.set(x, "fromBoth", value.asInstanceOf[js.Any])
      
      inline def setIntersection(value: String): Self = StObject.set(x, "intersection", value.asInstanceOf[js.Any])
      
      inline def setStrafe(value: String): Self = StObject.set(x, "strafe", value.asInstanceOf[js.Any])
      
      inline def setThrough(value: String): Self = StObject.set(x, "through", value.asInstanceOf[js.Any])
    }
  }
  
  trait Done[T] extends StObject {
    
    var done: Boolean
    
    var value: js.UndefOr[T] = js.undefined
  }
  object Done {
    
    inline def apply[T](done: Boolean): Done[T] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Done[?], T] (val x: Self & Done[T]) extends AnyVal {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
