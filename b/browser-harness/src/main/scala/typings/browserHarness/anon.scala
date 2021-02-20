package typings.browserHarness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Args extends StObject {
    
    var args: js.UndefOr[js.Array[_]] = js.native
    
    var func: js.Function = js.native
  }
  object Args {
    
    @scala.inline
    def apply(func: js.Function): Args = {
      val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setFunc(value: js.Function): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Condition extends StObject {
    
    var condition: js.Function = js.native
    
    var exec: js.UndefOr[js.Function] = js.native
    
    var timeoutMS: js.UndefOr[Double] = js.native
  }
  object Condition {
    
    @scala.inline
    def apply(condition: js.Function): Condition = {
      val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
      __obj.asInstanceOf[Condition]
    }
    
    @scala.inline
    implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCondition(value: js.Function): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExec(value: js.Function): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      @scala.inline
      def setTimeoutMS(value: Double): Self = StObject.set(x, "timeoutMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutMSUndefined: Self = StObject.set(x, "timeoutMS", js.undefined)
    }
  }
  
  @js.native
  trait Location extends StObject {
    
    var args: js.UndefOr[js.Any] = js.native
    
    var location: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
  }
  object Location {
    
    @scala.inline
    def apply(`type`: String): Location = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
