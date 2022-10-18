package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LensReviewReport extends StObject {
  
  var Base64String: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.Base64String] = js.undefined
  
  var LensAlias: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensAlias] = js.undefined
  
  /**
    * The ARN for the lens.
    */
  var LensArn: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensArn] = js.undefined
}
object LensReviewReport {
  
  inline def apply(): LensReviewReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LensReviewReport]
  }
  
  extension [Self <: LensReviewReport](x: Self) {
    
    inline def setBase64String(value: Base64String): Self = StObject.set(x, "Base64String", value.asInstanceOf[js.Any])
    
    inline def setBase64StringUndefined: Self = StObject.set(x, "Base64String", js.undefined)
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setLensAliasUndefined: Self = StObject.set(x, "LensAlias", js.undefined)
    
    inline def setLensArn(value: LensArn): Self = StObject.set(x, "LensArn", value.asInstanceOf[js.Any])
    
    inline def setLensArnUndefined: Self = StObject.set(x, "LensArn", js.undefined)
  }
}
