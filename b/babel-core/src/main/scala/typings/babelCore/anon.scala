package typings.babelCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Exported extends StObject {
    
    var exported: js.Array[js.Object] = js.native
    
    var specifiers: js.Array[js.Object] = js.native
  }
  object Exported {
    
    @scala.inline
    def apply(exported: js.Array[js.Object], specifiers: js.Array[js.Object]): Exported = {
      val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exported]
    }
    
    @scala.inline
    implicit class ExportedMutableBuilder[Self <: Exported] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExported(value: js.Array[js.Object]): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportedVarargs(value: js.Object*): Self = StObject.set(x, "exported", js.Array(value :_*))
      
      @scala.inline
      def setSpecifiers(value: js.Array[js.Object]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecifiersVarargs(value: js.Object*): Self = StObject.set(x, "specifiers", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Loc extends StObject {
    
    var loc: js.Object = js.native
    
    var message: String = js.native
    
    var `type`: String = js.native
  }
  object Loc {
    
    @scala.inline
    def apply(loc: js.Object, message: String, `type`: String): Loc = {
      val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Loc]
    }
    
    @scala.inline
    implicit class LocMutableBuilder[Self <: Loc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoc(value: js.Object): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
