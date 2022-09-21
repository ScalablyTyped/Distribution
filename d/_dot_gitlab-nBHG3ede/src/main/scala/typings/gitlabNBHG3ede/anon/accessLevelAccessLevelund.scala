package typings.gitlabNBHG3ede.anon

import typings.gitlabNBHG3ede.resourceAccessRequestsDTsMod.AccessLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  accessLevel :.gitlab-nBHG3ede..gitlab-nBHG3ede/dist/types/core/templates/ResourceAccessRequests.d.ts.AccessLevel | undefined} & .gitlab-nBHG3ede..gitlab-nBHG3ede/dist/types/core/infrastructure/index.d.ts.Sudo */
trait accessLevelAccessLevelund extends StObject {
  
  var accessLevel: js.UndefOr[AccessLevel] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object accessLevelAccessLevelund {
  
  inline def apply(): accessLevelAccessLevelund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[accessLevelAccessLevelund]
  }
  
  extension [Self <: accessLevelAccessLevelund](x: Self) {
    
    inline def setAccessLevel(value: AccessLevel): Self = StObject.set(x, "accessLevel", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelUndefined: Self = StObject.set(x, "accessLevel", js.undefined)
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
