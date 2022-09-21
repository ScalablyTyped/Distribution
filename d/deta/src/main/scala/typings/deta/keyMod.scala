package typings.deta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyMod {
  
  @js.native
  sealed trait KeyType extends StObject
  @JSImport("deta/dist/types/types/key", "KeyType")
  @js.native
  object KeyType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[KeyType & Double] = js.native
    
    @js.native
    sealed trait AuthToken
      extends StObject
         with KeyType
    /* 0 */ val AuthToken: typings.deta.keyMod.KeyType.AuthToken & Double = js.native
    
    @js.native
    sealed trait ProjectKey
      extends StObject
         with KeyType
    /* 1 */ val ProjectKey: typings.deta.keyMod.KeyType.ProjectKey & Double = js.native
  }
}
