package typings.chayns.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
