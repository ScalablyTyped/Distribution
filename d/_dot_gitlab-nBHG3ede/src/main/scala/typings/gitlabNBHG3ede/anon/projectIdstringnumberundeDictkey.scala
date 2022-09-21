package typings.gitlabNBHG3ede.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  projectId :string | number | undefined} & .gitlab-nBHG3ede..gitlab-nBHG3ede/dist/types/core/infrastructure/index.d.ts.BaseRequestOptions */
trait projectIdstringnumberundeDictkey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var projectId: js.UndefOr[String | Double] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object projectIdstringnumberundeDictkey {
  
  inline def apply(): projectIdstringnumberundeDictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[projectIdstringnumberundeDictkey]
  }
  
  extension [Self <: projectIdstringnumberundeDictkey](x: Self) {
    
    inline def setProjectId(value: String | Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
