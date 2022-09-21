package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSiteOutput extends StObject {
  
  var Site: js.UndefOr[typings.awsSdk.outpostsMod.Site] = js.undefined
}
object CreateSiteOutput {
  
  inline def apply(): CreateSiteOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSiteOutput]
  }
  
  extension [Self <: CreateSiteOutput](x: Self) {
    
    inline def setSite(value: Site): Self = StObject.set(x, "Site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "Site", js.undefined)
  }
}
