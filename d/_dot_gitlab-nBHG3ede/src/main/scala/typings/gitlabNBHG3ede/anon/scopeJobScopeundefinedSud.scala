package typings.gitlabNBHG3ede.anon

import typings.gitlabNBHG3ede.jobsDTsMod.JobScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  scope :.gitlab-nBHG3ede..gitlab-nBHG3ede/dist/types/core/services/Jobs.d.ts.JobScope | undefined} & .gitlab-nBHG3ede..gitlab-nBHG3ede/dist/types/core/infrastructure/index.d.ts.Sudo */
trait scopeJobScopeundefinedSud extends StObject {
  
  var scope: js.UndefOr[JobScope] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object scopeJobScopeundefinedSud {
  
  inline def apply(): scopeJobScopeundefinedSud = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[scopeJobScopeundefinedSud]
  }
  
  extension [Self <: scopeJobScopeundefinedSud](x: Self) {
    
    inline def setScope(value: JobScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
