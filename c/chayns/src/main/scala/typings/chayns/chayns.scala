package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chayns {
  
  /**
    * UI Functions
    * chayns.dialog
    */
  object dialog {
    
    @js.native
    sealed trait buttonText extends StObject
    @JSGlobal("chayns.dialog.buttonText")
    @js.native
    object buttonText extends StObject {
      
      @js.native
      sealed trait CANCEL
        extends StObject
           with buttonText
      
      @js.native
      sealed trait NO
        extends StObject
           with buttonText
      
      @js.native
      sealed trait OK
        extends StObject
           with buttonText
      
      @js.native
      sealed trait YES
        extends StObject
           with buttonText
    }
    
    @js.native
    sealed trait buttonType extends StObject
    @JSGlobal("chayns.dialog.buttonType")
    @js.native
    object buttonType extends StObject {
      
      @js.native
      sealed trait CANCEL
        extends StObject
           with buttonType
      
      @js.native
      sealed trait NEGATIVE
        extends StObject
           with buttonType
      
      @js.native
      sealed trait POSITIVE
        extends StObject
           with buttonType
    }
    
    @js.native
    sealed trait dateType extends StObject
    @JSGlobal("chayns.dialog.dateType")
    @js.native
    object dateType extends StObject {
      
      @js.native
      sealed trait DATE
        extends StObject
           with dateType
      
      @js.native
      sealed trait DATE_TIME
        extends StObject
           with dateType
      
      @js.native
      sealed trait TIME
        extends StObject
           with dateType
    }
    
    @js.native
    sealed trait inputType extends StObject
    @JSGlobal("chayns.dialog.inputType")
    @js.native
    object inputType extends StObject {
      
      @js.native
      sealed trait DEFAULT
        extends StObject
           with inputType
      
      @js.native
      sealed trait PASSWORD
        extends StObject
           with inputType
    }
  }
  
  /**
    * chayns.storage
    */
  object storage {
    
    @js.native
    sealed trait accessMode extends StObject
    @JSGlobal("chayns.storage.accessMode")
    @js.native
    object accessMode extends StObject {
      
      @js.native
      sealed trait PRIVATE
        extends StObject
           with accessMode
      
      @js.native
      sealed trait PROTECTED
        extends StObject
           with accessMode
      
      @js.native
      sealed trait PUBLIC
        extends StObject
           with accessMode
    }
  }
}
