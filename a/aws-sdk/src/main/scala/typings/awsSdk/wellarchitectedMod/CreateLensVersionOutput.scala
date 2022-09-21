package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLensVersionOutput extends StObject {
  
  /**
    * The ARN for the lens.
    */
  var LensArn: js.UndefOr[typings.awsSdk.wellarchitectedMod.LensArn] = js.undefined
  
  /**
    * The version of the lens.
    */
  var LensVersion: js.UndefOr[typings.awsSdk.wellarchitectedMod.LensVersion] = js.undefined
}
object CreateLensVersionOutput {
  
  inline def apply(): CreateLensVersionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLensVersionOutput]
  }
  
  extension [Self <: CreateLensVersionOutput](x: Self) {
    
    inline def setLensArn(value: LensArn): Self = StObject.set(x, "LensArn", value.asInstanceOf[js.Any])
    
    inline def setLensArnUndefined: Self = StObject.set(x, "LensArn", js.undefined)
    
    inline def setLensVersion(value: LensVersion): Self = StObject.set(x, "LensVersion", value.asInstanceOf[js.Any])
    
    inline def setLensVersionUndefined: Self = StObject.set(x, "LensVersion", js.undefined)
  }
}
