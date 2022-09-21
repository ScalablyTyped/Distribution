package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveComponentCandidatesRequest extends StObject {
  
  /**
    * The list of components to resolve.
    */
  var componentCandidates: js.UndefOr[ComponentCandidateList] = js.undefined
  
  /**
    * The platform to use to resolve compatible components.
    */
  var platform: js.UndefOr[ComponentPlatform] = js.undefined
}
object ResolveComponentCandidatesRequest {
  
  inline def apply(): ResolveComponentCandidatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveComponentCandidatesRequest]
  }
  
  extension [Self <: ResolveComponentCandidatesRequest](x: Self) {
    
    inline def setComponentCandidates(value: ComponentCandidateList): Self = StObject.set(x, "componentCandidates", value.asInstanceOf[js.Any])
    
    inline def setComponentCandidatesUndefined: Self = StObject.set(x, "componentCandidates", js.undefined)
    
    inline def setComponentCandidatesVarargs(value: ComponentCandidate*): Self = StObject.set(x, "componentCandidates", js.Array(value*))
    
    inline def setPlatform(value: ComponentPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
  }
}
