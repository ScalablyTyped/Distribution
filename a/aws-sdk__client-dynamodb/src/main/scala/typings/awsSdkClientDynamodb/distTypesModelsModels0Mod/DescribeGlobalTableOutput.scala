package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGlobalTableOutput extends StObject {
  
  /**
    * <p>Contains the details of the global table.</p>
    */
  var GlobalTableDescription: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.GlobalTableDescription] = js.undefined
}
object DescribeGlobalTableOutput {
  
  inline def apply(): DescribeGlobalTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalTableOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGlobalTableOutput] (val x: Self) extends AnyVal {
    
    inline def setGlobalTableDescription(value: GlobalTableDescription): Self = StObject.set(x, "GlobalTableDescription", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableDescriptionUndefined: Self = StObject.set(x, "GlobalTableDescription", js.undefined)
  }
}
