package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputSource extends StObject {
  
  /**
    * The ID of the output source, for example the URL of an S3 bucket.
    */
  var OutputSourceId: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.OutputSourceId] = js.undefined
  
  /**
    * The type of source where the association execution details are stored, for example, Amazon S3.
    */
  var OutputSourceType: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.OutputSourceType] = js.undefined
}
object OutputSource {
  
  inline def apply(): OutputSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputSource] (val x: Self) extends AnyVal {
    
    inline def setOutputSourceId(value: OutputSourceId): Self = StObject.set(x, "OutputSourceId", value.asInstanceOf[js.Any])
    
    inline def setOutputSourceIdUndefined: Self = StObject.set(x, "OutputSourceId", js.undefined)
    
    inline def setOutputSourceType(value: OutputSourceType): Self = StObject.set(x, "OutputSourceType", value.asInstanceOf[js.Any])
    
    inline def setOutputSourceTypeUndefined: Self = StObject.set(x, "OutputSourceType", js.undefined)
  }
}
