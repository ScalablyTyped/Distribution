package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportLensOutput extends StObject {
  
  /**
    * The ARN for the lens.
    */
  var LensArn: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensArn] = js.undefined
  
  /**
    * The status of the imported lens.
    */
  var Status: js.UndefOr[ImportLensStatus] = js.undefined
}
object ImportLensOutput {
  
  inline def apply(): ImportLensOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportLensOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportLensOutput] (val x: Self) extends AnyVal {
    
    inline def setLensArn(value: LensArn): Self = StObject.set(x, "LensArn", value.asInstanceOf[js.Any])
    
    inline def setLensArnUndefined: Self = StObject.set(x, "LensArn", js.undefined)
    
    inline def setStatus(value: ImportLensStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
