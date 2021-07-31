package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOwnerMod {
  
  trait Owner extends StObject {
    
    /**
      * _DisplayName shape
      */
    var DisplayName: js.UndefOr[String] = js.undefined
    
    /**
      * _ID shape
      */
    var ID: js.UndefOr[String] = js.undefined
  }
  object Owner {
    
    @scala.inline
    def apply(): Owner = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Owner]
    }
    
    @scala.inline
    implicit class OwnerMutableBuilder[Self <: Owner] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
      
      @scala.inline
      def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
    }
  }
  
  type UnmarshalledOwner = Owner
}
