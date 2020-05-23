package typings.chayns.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * chayns.storage
  */
@JSGlobal("chayns.storage")
@js.native
object storage extends js.Object {
  @js.native
  sealed trait accessMode extends js.Object
  
  @js.native
  object accessMode extends js.Object {
    @js.native
    sealed trait PRIVATE extends accessMode
    
    @js.native
    sealed trait PROTECTED extends accessMode
    
    @js.native
    sealed trait PUBLIC extends accessMode
    
  }
  
}

