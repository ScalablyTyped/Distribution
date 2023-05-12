package typings.awsSdkProtocolHttp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFieldPositionMod {
  
  @js.native
  sealed trait FieldPosition extends StObject
  @JSImport("@aws-sdk/protocol-http/dist-types/FieldPosition", "FieldPosition")
  @js.native
  object FieldPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FieldPosition & Double] = js.native
    
    @js.native
    sealed trait HEADER
      extends StObject
         with FieldPosition
    /* 0 */ val HEADER: typings.awsSdkProtocolHttp.distTypesFieldPositionMod.FieldPosition.HEADER & Double = js.native
    
    @js.native
    sealed trait TRAILER
      extends StObject
         with FieldPosition
    /* 1 */ val TRAILER: typings.awsSdkProtocolHttp.distTypesFieldPositionMod.FieldPosition.TRAILER & Double = js.native
  }
}
