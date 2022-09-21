package typings.gitlabNBHG3ede.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  projectId :string | number | undefined,   groupId :string | number | undefined} & .gitlab-nBHG3ede..gitlab-nBHG3ede/dist/types/core/infrastructure/index.d.ts.BaseRequestOptions */
trait projectIdstringnumberundeGroupId
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var groupId: js.UndefOr[String | Double] = js.undefined
  
  var projectId: js.UndefOr[String | Double] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object projectIdstringnumberundeGroupId {
  
  inline def apply(): projectIdstringnumberundeGroupId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[projectIdstringnumberundeGroupId]
  }
  
  extension [Self <: projectIdstringnumberundeGroupId](x: Self) {
    
    inline def setGroupId(value: String | Double): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setProjectId(value: String | Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
