package typings.chayns.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    sealed trait CANCEL extends buttonText
    
    @js.native
    sealed trait NO extends buttonText
    
    @js.native
    sealed trait OK extends buttonText
    
    @js.native
    sealed trait YES extends buttonText
  }
  
  @js.native
  sealed trait buttonType extends StObject
  @JSGlobal("chayns.dialog.buttonType")
  @js.native
  object buttonType extends StObject {
    
    @js.native
    sealed trait CANCEL extends buttonType
    
    @js.native
    sealed trait NEGATIVE extends buttonType
    
    @js.native
    sealed trait POSITIVE extends buttonType
  }
  
  @js.native
  sealed trait dateType extends StObject
  @JSGlobal("chayns.dialog.dateType")
  @js.native
  object dateType extends StObject {
    
    @js.native
    sealed trait DATE extends dateType
    
    @js.native
    sealed trait DATE_TIME extends dateType
    
    @js.native
    sealed trait TIME extends dateType
  }
  
  @js.native
  sealed trait inputType extends StObject
  @JSGlobal("chayns.dialog.inputType")
  @js.native
  object inputType extends StObject {
    
    @js.native
    sealed trait DEFAULT extends inputType
    
    @js.native
    sealed trait PASSWORD extends inputType
  }
}
