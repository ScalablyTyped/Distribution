package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStudioOutput extends StObject {
  
  /**
    * The Amazon EMR Studio details.
    */
  var Studio: js.UndefOr[typings.awsSdk.emrMod.Studio] = js.undefined
}
object DescribeStudioOutput {
  
  inline def apply(): DescribeStudioOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStudioOutput]
  }
  
  extension [Self <: DescribeStudioOutput](x: Self) {
    
    inline def setStudio(value: Studio): Self = StObject.set(x, "Studio", value.asInstanceOf[js.Any])
    
    inline def setStudioUndefined: Self = StObject.set(x, "Studio", js.undefined)
  }
}
