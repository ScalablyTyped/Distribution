package typings.chayns.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UI Functions
  * chayns.dialog
  */
@JSGlobal("chayns.dialog")
@js.native
object dialog extends js.Object {
  
  @js.native
  sealed trait buttonText extends js.Object
  @js.native
  object buttonText extends js.Object {
    
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
  sealed trait buttonType extends js.Object
  @js.native
  object buttonType extends js.Object {
    
    @js.native
    sealed trait CANCEL extends buttonType
    
    @js.native
    sealed trait NEGATIVE extends buttonType
    
    @js.native
    sealed trait POSITIVE extends buttonType
  }
  
  @js.native
  sealed trait dateType extends js.Object
  @js.native
  object dateType extends js.Object {
    
    @js.native
    sealed trait DATE extends dateType
    
    @js.native
    sealed trait DATE_TIME extends dateType
    
    @js.native
    sealed trait TIME extends dateType
  }
  
  @js.native
  sealed trait inputType extends js.Object
  @js.native
  object inputType extends js.Object {
    
    @js.native
    sealed trait DEFAULT extends inputType
    
    @js.native
    sealed trait PASSWORD extends inputType
  }
}
